package yionos.ffitools;

import jpgen.ProgramArguments;
import jpgen.SourceScopeScanner;
import jpgen.codegen.FunctionImport;
import jpgen.codegen.HeaderInformation;
import jpgen.codegen.RecordInformation;
import jpgen.codegen.TypeTranslation;
import jpgen.data.ConstantMacro;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;

import static jpgen.codegen.ClassMaker.*;
import static jpgen.codegen.CommonFunctions.*;

public class Main
{
    private static <T> T[] mergeArrays(T[] arr1, T[] arr2, IntFunction<T[]> arraySupplier)
    {
        T[] dest = arraySupplier.apply(arr1.length + arr2.length);
        System.arraycopy(arr1, 0, dest, 0, arr1.length);
        System.arraycopy(arr2, 0, dest, arr1.length, arr2.length);
        return dest;
    }

    private static void vulkanBindings(File outputDirectory, String includeDirectory, String[] clangArgs)
    {
        File filesDest = new File(outputDirectory, "vulkan");
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process(STR."\{includeDirectory}/vulkan/vulkan_core.h", mergeArrays(clangArgs, new String[] {
                    STR."-I\{includeDirectory}"
            }, String[]::new));

            CodeFactory factory = new CodeFactory(scanner, "vulkan", "vulkan-1");
            factory.run(filesDest);
        }
    }

    private static void glfwBindings(File outputDirectory, String glfwIncludeDirectory, String vulkanIncludeDirectory, String[] clangArgs)
    {
        File filesDest = new File(outputDirectory, "glfw3");
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process(STR."\{glfwIncludeDirectory}/glfw3.h", mergeArrays(clangArgs, new String[] {
                    "-DGLFW_INCLUDE_VULKAN",
                    STR."-I\{vulkanIncludeDirectory}"
            }, String[]::new));

            if (filesDest.exists() || filesDest.mkdirs())
            {
                HeaderInformation headerInfo = new HeaderInformation("GLFW3", "glfw3", "gSystemLinker", "gLibLookup");
                Map<Declaration<?>, String> typeNames = scanner.translateDeclarations();
                TypeTranslation translation = new TypeTranslation()
                {
                    @Override
                    public HeaderInformation headerInfo()
                    {
                        return headerInfo;
                    }

                    @Override
                    public RecordInformation recordInfo(TypeManifold type)
                    {
                        return new RecordInformation(typeNames.get((RecordType)flattenType(type)), headerInfo.packageName(), "gStructLayout", "ptr");
                    }
                };

                for (Declaration<?> declaration : scanner.gatherTypeDeclarations())
                {
                    String name = typeNames.get(declaration);
                    if (!name.toLowerCase().startsWith("glfw"))
                    {
                        continue;
                    }

                    Optional<String> code = switch (declaration)
                    {
                        case EnumType enumType -> Optional.of(generateEnum(enumType, translation, headerInfo.packageName(), name));
                        case RecordType recordType ->
                        {
                            try
                            {
                                yield Optional.of(generateRecord(recordType, translation));
                            }
                            catch (Throwable _)
                            {
                                yield Optional.empty();
                            }
                        }
                        case FunctionType.Callback callback -> Optional.of(generateCallback(callback, translation, headerInfo.packageName(), name, "gDescriptor", "gUpcallStub"));
                        default -> Optional.empty();
                    };

                    code.ifPresent(codeString ->
                    {
                        File outputFile = new File(filesDest, STR."\{name}.java");
                        try (FileOutputStream outputStream = new FileOutputStream(outputFile))
                        {
                            outputStream.write(codeString.getBytes(StandardCharsets.UTF_8));
                        }
                        catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });
                }

                File headerFile = new File(filesDest, STR."\{headerInfo.name()}.java");
                try (FileOutputStream outputStream = new FileOutputStream(headerFile))
                {
                    List<FunctionImport> imports = new ArrayList<>();
                    for (FunctionType.Declaration function : scanner.getDeclaredFunctions())
                    {
                        if (function.fname().startsWith("glfw"))
                        {
                            imports.add(() -> function);
                        }
                    }

                    List<ConstantMacro> constants = scanner.getMacroConstants().stream()
                            .filter(macro -> macro.identifier().startsWith("GLFW"))
                            .toList();

                    outputStream.write(generateHeader(translation, "glfw3", imports, constants).getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void vmaBindings(File outputDirectory, String vmaIncludeDirectory, String vulkanIncludeDirectory, String[] clangArgs)
    {
        File filesDest = new File(outputDirectory, "vma");
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process(STR."\{vmaIncludeDirectory}/vk_mem_alloc.h", mergeArrays(clangArgs, new String[] {
                    STR."-I\{vulkanIncludeDirectory}"
            }, String[]::new));

            if (filesDest.exists() || filesDest.mkdirs())
            {
                HeaderInformation headerInfo = new HeaderInformation("VMA", "vma", "gSystemLinker", "gLibLookup");
                Map<Declaration<?>, String> typeNames = scanner.translateDeclarations();
                TypeTranslation translation = new TypeTranslation()
                {
                    @Override
                    public HeaderInformation headerInfo()
                    {
                        return headerInfo;
                    }

                    @Override
                    public RecordInformation recordInfo(TypeManifold type)
                    {
                        return new RecordInformation(typeNames.get((RecordType)flattenType(type)), headerInfo.packageName(), "gStructLayout", "ptr");
                    }
                };

                for (Declaration<?> declaration : scanner.gatherTypeDeclarations())
                {
                    String name = typeNames.get(declaration);
                    if (!name.toLowerCase().startsWith("vma") && !(name.toLowerCase().startsWith("PFN_vma")))
                    {
                        continue;
                    }

                    Optional<String> code = switch (declaration)
                    {
                        case EnumType enumType -> Optional.of(generateEnum(enumType, translation, headerInfo.packageName(), name));
                        case RecordType recordType ->
                        {
                            try
                            {
                                yield Optional.of(generateRecord(recordType, translation));
                            }
                            catch (Throwable _)
                            {
                                yield Optional.empty();
                            }
                        }
                        case FunctionType.Callback callback -> Optional.of(generateCallback(callback, translation, headerInfo.packageName(), name, "gDescriptor", "gUpcallStub"));
                        default -> Optional.empty();
                    };

                    code.ifPresent(codeString ->
                    {
                        File outputFile = new File(filesDest, STR."\{name}.java");
                        try (FileOutputStream outputStream = new FileOutputStream(outputFile))
                        {
                            outputStream.write(codeString.getBytes(StandardCharsets.UTF_8));
                        }
                        catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });
                }

                File headerFile = new File(filesDest, STR."\{headerInfo.name()}.java");
                try (FileOutputStream outputStream = new FileOutputStream(headerFile))
                {
                    List<FunctionImport> imports = new ArrayList<>();
                    for (FunctionType.Declaration function : scanner.getDeclaredFunctions())
                    {
                        if (function.fname().startsWith("vma"))
                        {
                            imports.add(() -> function);
                        }
                    }

                    List<ConstantMacro> constants = scanner.getMacroConstants().stream()
                            .filter(macro -> macro.identifier().startsWith("GLFW"))
                            .toList();

                    outputStream.write(generateHeader(translation, "libvma", imports, constants).getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void shadercBindings(File outputDirectory, String includeDirectory, String[] clangArgs)
    {
        File filesDest = new File(outputDirectory, "shaderc");
        try (SourceScopeScanner scanner = new SourceScopeScanner())
        {
            scanner.process(STR."\{includeDirectory}/shaderc/shaderc.h", mergeArrays(clangArgs, new String[] {
                    STR."-I\{includeDirectory}"
            }, String[]::new));

            if (filesDest.exists() || filesDest.mkdirs())
            {
                HeaderInformation headerInfo = new HeaderInformation("Shaderc", "shaderc", "gSystemLinker", "gLibLookup");
                Map<Declaration<?>, String> typeNames = scanner.translateDeclarations();
                TypeTranslation translation = new TypeTranslation()
                {
                    @Override
                    public HeaderInformation headerInfo()
                    {
                        return headerInfo;
                    }

                    @Override
                    public RecordInformation recordInfo(TypeManifold type)
                    {
                        return new RecordInformation(typeNames.get((RecordType)flattenType(type)), headerInfo.packageName(), "gStructLayout", "ptr");
                    }
                };

                for (Declaration<?> declaration : scanner.gatherTypeDeclarations())
                {
                    String name = typeNames.get(declaration);
                    Optional<String> code = switch (declaration)
                    {
                        case EnumType enumType -> Optional.of(generateEnum(enumType, translation, headerInfo.packageName(), name));
                        case RecordType recordType ->
                        {
                            try
                            {
                                yield Optional.of(generateRecord(recordType, translation));
                            }
                            catch (Throwable _)
                            {
                                yield Optional.empty();
                            }
                        }
                        case FunctionType.Callback callback -> Optional.of(generateCallback(callback, translation, headerInfo.packageName(), name, "gDescriptor", "gUpcallStub"));
                        default -> Optional.empty();
                    };

                    code.ifPresent(codeString ->
                    {
                        File outputFile = new File(filesDest, STR."\{name}.java");
                        try (FileOutputStream outputStream = new FileOutputStream(outputFile))
                        {
                            outputStream.write(codeString.getBytes(StandardCharsets.UTF_8));
                        }
                        catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });
                }

                File headerFile = new File(filesDest, STR."\{headerInfo.name()}.java");
                try (FileOutputStream outputStream = new FileOutputStream(headerFile))
                {
                    List<FunctionImport> imports = new ArrayList<>();
                    for (FunctionType.Declaration function : scanner.getDeclaredFunctions())
                    {
                        imports.add(() -> function);
                    }

                    outputStream.write(generateHeader(translation, "libshaderc_shared", imports, List.of()).getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static String[] getProgramClangArgs(ProgramArguments arguments)
    {
        int numArgs = arguments.getNumValuesOfArg("clang_args");
        if (numArgs < 0)
        {
            return new String[0];
        }

        return arguments.getArgValues("clang_args", new String[numArgs], Function.identity());
    }

    public static void main(String... args)
    {
        ProgramArguments arguments = new ProgramArguments(args);
        File outputDirectory = arguments.getArgValueIndexed("output_directory", 0, File::new)
                .orElseThrow(() -> new IllegalStateException("Missing output_directory argument."));
        String[] clangArgs = getProgramClangArgs(arguments);
        String vulkanInclude = arguments.getArgValueIndexed("vulkan_include", 0, Function.identity()).orElse(null);
        boolean skipVulkan = arguments.getArgValueIndexed("vulkan_skip", 0, Boolean::parseBoolean).orElse(false);
        String glfwInclude = arguments.getArgValueIndexed("glfw_include", 0, Function.identity()).orElse(null);
        String vmaInclude = arguments.getArgValueIndexed("vma_include", 0, Function.identity()).orElse(null);
        String shadercInclude = arguments.getArgValueIndexed("shaderc_include", 0, Function.identity()).orElse(null);

        SourceScopeScanner.configureLog4j();
        if (vulkanInclude != null)
        {
            if (!skipVulkan)
            {
                vulkanBindings(outputDirectory, vulkanInclude, clangArgs);
            }

            if (glfwInclude != null)
            {
                glfwBindings(outputDirectory, glfwInclude, vulkanInclude, clangArgs);
            }

            if (vmaInclude != null)
            {
                vmaBindings(outputDirectory, vmaInclude, vulkanInclude, clangArgs);
            }
        }

        if (shadercInclude != null)
        {
            shadercBindings(outputDirectory, shadercInclude, clangArgs);
        }
    }
}
