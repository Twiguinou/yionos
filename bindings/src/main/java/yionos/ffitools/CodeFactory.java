package yionos.ffitools;

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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static jpgen.codegen.CommonFunctions.*;
import static jpgen.codegen.ClassMaker.*;

public class CodeFactory implements TypeTranslation
{
    private static final Set<String> INSTANCE_HANDLE_NAMES = new HashSet<>(List.of(
            "VkInstance", "VkPhysicalDevice"
    ));
    private static final Set<String> DEVICE_HANDLE_NAMES = new HashSet<>(List.of(
            "VkDevice", "VkQueue", "VkCommandBuffer"
    ));
    private static final String HCLASS_NAME = "VulkanCore";

    private final Map<String, TypeManifold> m_instanceTypesReferences;
    private final Set<TypeManifold> m_instanceHandleTypes;
    private final List<FunctionType.Declaration> m_instanceFunctions;

    private final Map<String, TypeManifold> m_deviceTypesReferences;
    private final Set<TypeManifold> m_deviceHandleTypes;
    private final List<FunctionType.Declaration> m_deviceFunctions;

    private final List<FunctionType.Declaration> m_contextlessFunctions;
    private final Set<String> m_allFunctionNames;

    private final String m_packageName, m_libName;
    private final Map<Declaration<?>, String> m_typeNames;
    private final List<ConstantMacro> m_macros;
    private final List<Declaration<?>> m_typeDeclarations;
    private final HeaderInformation m_headerInfo;

    public CodeFactory(SourceScopeScanner scanner, String packageName, String libName)
    {
        Set<TypeManifold> types = scanner.getTypeSet();

        this.m_instanceHandleTypes = types.stream()
                .filter(type -> type instanceof TypeManifold.Typedef(String alias, _) && INSTANCE_HANDLE_NAMES.contains(alias))
                .collect(Collectors.toUnmodifiableSet());
        this.m_instanceTypesReferences = this.m_instanceHandleTypes.stream()
                .map(type -> (TypeManifold.Typedef) type)
                .collect(Collectors.toMap(TypeManifold.Typedef::alias, TypeManifold.Typedef::underlying));

        this.m_deviceHandleTypes = types.stream()
                .filter(type -> type instanceof TypeManifold.Typedef(String alias, _) && DEVICE_HANDLE_NAMES.contains(alias))
                .collect(Collectors.toUnmodifiableSet());
        this.m_deviceTypesReferences = this.m_deviceHandleTypes.stream()
                .map(type -> (TypeManifold.Typedef) type)
                .collect(Collectors.toMap(TypeManifold.Typedef::alias, TypeManifold.Typedef::underlying));

        this.m_instanceFunctions = scanner.getDeclaredFunctions().stream()
                .filter(function -> function.argNames().length > 0 && !function.fname().equals("vkGetInstanceProcAddr") && this.m_instanceHandleTypes.contains(function.innerType().argTypes()[0]))
                .toList();
        this.m_deviceFunctions = scanner.getDeclaredFunctions().stream()
                .filter(function -> function.argNames().length > 0 && !function.fname().equals("vkGetDeviceProcAddr") && this.m_deviceHandleTypes.contains(function.innerType().argTypes()[0]))
                .toList();
        this.m_contextlessFunctions = scanner.getDeclaredFunctions().stream()
                .filter(function -> function.argNames().length == 0 ||
                        (!this.m_instanceHandleTypes.contains(function.innerType().argTypes()[0]) && !this.m_deviceHandleTypes.contains(function.innerType().argTypes()[0])) ||
                        function.fname().equals("vkGetInstanceProcAddr") || function.fname().equals("vkGetDeviceProcAddr"))
                .toList();

        this.m_packageName = packageName;
        this.m_typeNames = scanner.translateDeclarations();
        this.m_typeDeclarations = scanner.gatherTypeDeclarations();
        this.m_libName = libName;
        this.m_headerInfo = new HeaderInformation(HCLASS_NAME, this.m_packageName, "gSystemLinker", "gLibLookup");

        this.m_allFunctionNames = scanner.getDeclaredFunctions().stream()
                .map(FunctionType.Declaration::fname)
                .collect(Collectors.toUnmodifiableSet());

        this.m_macros = List.of(
                new ConstantMacro("VK_ATTACHMENT_UNUSED", TypeManifold.INTEGER, ~(int)0),
                new ConstantMacro("VK_FALSE", TypeManifold.INTEGER, 0),
                new ConstantMacro("VK_QUEUE_FAMILY_IGNORED", TypeManifold.INTEGER, ~(int)0),
                new ConstantMacro("VK_REMAINING_ARRAY_LAYERS", TypeManifold.INTEGER, ~(int)0),
                new ConstantMacro("VK_REMAINING_MIP_LEVELS", TypeManifold.INTEGER, ~(int)0),
                new ConstantMacro("VK_SUBPASS_EXTERNAL", TypeManifold.INTEGER, ~(int)0),
                new ConstantMacro("VK_TRUE", TypeManifold.INTEGER, 1),
                new ConstantMacro("VK_WHOLE_SIZE", TypeManifold.LONG, ~(long)0),
                new ConstantMacro("VK_MAX_MEMORY_TYPES", TypeManifold.INTEGER, 32),
                new ConstantMacro("VK_MAX_PHYSICAL_DEVICE_NAME_SIZE", TypeManifold.INTEGER, 256),
                new ConstantMacro("VK_UUID_SIZE", TypeManifold.INTEGER, 16),
                new ConstantMacro("VK_MAX_EXTENSION_NAME_SIZE", TypeManifold.INTEGER, 256),
                new ConstantMacro("VK_MAX_DESCRIPTION_SIZE", TypeManifold.INTEGER, 256),
                new ConstantMacro("VK_MAX_MEMORY_HEAPS", TypeManifold.INTEGER, 16)
        );
    }

    private static void withIndent(StringBuilder builder, int indentCount, String string)
    {
        builder.repeat('\t', indentCount);
        builder.append(string);
    }

    private String generateVulkanInstance()
    {
        TypeManifold instanceType = this.m_instanceTypesReferences.get("VkInstance");
        StringBuilder source = new StringBuilder();

        // HEADER
        source.append(STR."package \{this.m_packageName};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."import static \{this.m_packageName}.\{HCLASS_NAME}.gSystemLinker;\{LINE_SEPARATOR}");
        source.append(STR."import static \{this.m_packageName}.\{HCLASS_NAME}.vkGetInstanceProcAddr;\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class VkInstance\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // VARIABLES
        withIndent(source, 1, STR."public final \{javaType(instanceType, this)} handle;\{LINE_SEPARATOR}");
        for (FunctionType.Declaration function : this.m_instanceFunctions)
        {
            withIndent(source, 1, STR."public final \{MEMORY_SEGMENT_CLASSPATH} funcAddress__\{function.fname()};\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."public final \{METHOD_HANDLE_CLASSPATH} funcHandle__\{function.fname()};\{LINE_SEPARATOR}");
        }

        // INSTANCE INIT
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public VkInstance(\{javaType(instanceType, this)} handle)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."this.handle = handle;\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."try (\{ARENA_CLASSPATH} arena = \{ARENA_CLASSPATH}.ofConfined())\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."{\{LINE_SEPARATOR}");
        for (FunctionType.Declaration function : this.m_instanceFunctions)
        {
            String funcAddressReference = STR."this.funcAddress__\{function.fname()}";
            withIndent(source, 3, STR."\{funcAddressReference} = vkGetInstanceProcAddr(this.handle, arena.allocateUtf8String(\"\{function.fname()}\"));\{LINE_SEPARATOR}");
            withIndent(source, 3, STR."this.funcHandle__\{function.fname()} = \{funcAddressReference}.equals(\{MEMORY_SEGMENT_CLASSPATH}.NULL) ? null : gSystemLinker.downcallHandle(\{funcAddressReference}, \{functionDescriptor(function.innerType(), this)});\{LINE_SEPARATOR}");
        }
        withIndent(source, 2, STR."}\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // HANDLE GETTER
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public \{javaType(instanceType, this)} handle() {return this.handle;}\{LINE_SEPARATOR}");

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    private String generateVulkanDevice()
    {
        TypeManifold deviceType = this.m_deviceTypesReferences.get("VkDevice");
        StringBuilder source = new StringBuilder();

        // HEADER
        source.append(STR."package \{this.m_packageName};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."import static \{this.m_packageName}.\{HCLASS_NAME}.gSystemLinker;\{LINE_SEPARATOR}");
        source.append(STR."import static \{this.m_packageName}.\{HCLASS_NAME}.vkGetDeviceProcAddr;\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class VkDevice\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // VARIABLES
        withIndent(source, 1, STR."public final \{javaType(deviceType, this)} handle;\{LINE_SEPARATOR}");
        for (FunctionType.Declaration function : this.m_deviceFunctions)
        {
            withIndent(source, 1, STR."public final \{MEMORY_SEGMENT_CLASSPATH} funcAddress__\{function.fname()};\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."public final \{METHOD_HANDLE_CLASSPATH} funcHandle__\{function.fname()};\{LINE_SEPARATOR}");
        }

        // INSTANCE INIT
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public VkDevice(\{javaType(deviceType, this)} handle)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."this.handle = handle;\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."try (\{ARENA_CLASSPATH} arena = \{ARENA_CLASSPATH}.ofConfined())\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."{\{LINE_SEPARATOR}");
        for (FunctionType.Declaration function : this.m_deviceFunctions)
        {
            String funcAddressReference = STR."this.funcAddress__\{function.fname()}";
            withIndent(source, 3, STR."\{funcAddressReference} = vkGetDeviceProcAddr(this.handle, arena.allocateUtf8String(\"\{function.fname()}\"));\{LINE_SEPARATOR}");
            withIndent(source, 3, STR."this.funcHandle__\{function.fname()} = \{funcAddressReference}.equals(\{MEMORY_SEGMENT_CLASSPATH}.NULL) ? null : gSystemLinker.downcallHandle(\{funcAddressReference}, \{functionDescriptor(function.innerType(), this)});\{LINE_SEPARATOR}");
        }
        withIndent(source, 2, STR."}\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // HANDLE GETTER
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public \{javaType(deviceType, this)} handle() {return this.handle;}\{LINE_SEPARATOR}");

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    private String generateInstanceClass(String name)
    {
        if (name.equals("VkInstance"))
        {
            return this.generateVulkanInstance();
        }

        StringBuilder source = new StringBuilder();
        source.append(STR."package \{this.m_packageName};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public record \{name}(\{MEMORY_SEGMENT_CLASSPATH} handle, VkInstance instance) {}\{LINE_SEPARATOR}");
        return source.toString();
    }

    private String generateDeviceClass(String name)
    {
        if (name.equals("VkDevice"))
        {
            return this.generateVulkanDevice();
        }

        StringBuilder source = new StringBuilder();
        source.append(STR."package \{this.m_packageName};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public record \{name}(\{MEMORY_SEGMENT_CLASSPATH} handle, VkDevice device) {}\{LINE_SEPARATOR}");
        return source.toString();
    }

    private String generateVulkanCore()
    {
        List<FunctionImport> imports = new ArrayList<>();
        for (FunctionType.Declaration function : this.m_contextlessFunctions)
        {
            imports.add(() -> function);
        }

        for (FunctionType.Declaration instanceFunction : this.m_instanceFunctions)
        {
            imports.add(new FunctionImport()
            {
                @Override
                public boolean staticInit()
                {
                    return false;
                }

                @Override
                public FunctionType.Declaration declaration()
                {
                    return instanceFunction;
                }

                @Override
                public String parameterClasspath(int index, String original)
                {
                    return index > 0 ? original : STR."\{CodeFactory.this.m_packageName}.\{((TypeManifold.Typedef)instanceFunction.innerType().argTypes()[index]).alias()}";
                }

                @Override
                public String unwrapParameter(int index, String argName, String original)
                {
                    return index > 0 ? original : STR."\{argName}.handle()";
                }

                @Override
                public Optional<String> handleReference(String[] parameterNames)
                {
                    if (((TypeManifold.Typedef)instanceFunction.innerType().argTypes()[0]).alias().equals("VkInstance"))
                    {
                        return Optional.of(STR."\{parameterNames[0]}.funcHandle__\{instanceFunction.fname()}");
                    }
                    return Optional.of(STR."\{parameterNames[0]}.instance().funcHandle__\{instanceFunction.fname()}");
                }
            });
        }

        for (FunctionType.Declaration deviceFunction : this.m_deviceFunctions)
        {
            imports.add(new FunctionImport()
            {
                @Override
                public boolean staticInit()
                {
                    return false;
                }

                @Override
                public FunctionType.Declaration declaration()
                {
                    return deviceFunction;
                }

                @Override
                public String parameterClasspath(int index, String original)
                {
                    return index > 0 ? original : STR."\{CodeFactory.this.m_packageName}.\{((TypeManifold.Typedef)deviceFunction.innerType().argTypes()[index]).alias()}";
                }

                @Override
                public String unwrapParameter(int index, String argName, String original)
                {
                    return index > 0 ? original : STR."\{argName}.handle()";
                }

                @Override
                public Optional<String> handleReference(String[] parameterNames)
                {
                    if (((TypeManifold.Typedef)deviceFunction.innerType().argTypes()[0]).alias().equals("VkDevice"))
                    {
                        return Optional.of(STR."\{parameterNames[0]}.funcHandle__\{deviceFunction.fname()}");
                    }
                    return Optional.of(STR."\{parameterNames[0]}.device().funcHandle__\{deviceFunction.fname()}");
                }
            });
        }
        return generateHeader(this, this.m_libName, imports, this.m_macros);
    }

    public void run(File outputDirectory)
    {
        if (outputDirectory.exists() || outputDirectory.mkdirs())
        {
            for (Declaration<?> declaration : this.m_typeDeclarations)
            {
                Optional<String> code = switch (declaration)
                {
                    case EnumType enumType -> Optional.of(generateEnum(enumType, this, this.m_packageName, this.m_typeNames.get(enumType)));
                    case RecordType recordType ->
                    {
                        try
                        {
                            yield Optional.of(generateRecord(recordType, this));
                        }
                        catch (Throwable _)
                        {
                            yield Optional.empty();
                        }
                    }
                    case FunctionType.Callback callback when !this.m_allFunctionNames.contains(this.m_typeNames.get(callback).substring(4)) -> Optional.of(generateCallback(callback, this, this.m_packageName, this.m_typeNames.get(callback), "gDescriptor", "gUpcallStub"));
                    default -> Optional.empty();
                };

                code.ifPresent(codeString ->
                {
                    File outputFile = new File(outputDirectory, STR."\{this.m_typeNames.get(declaration)}.java");
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

            for (String instanceTypeName : INSTANCE_HANDLE_NAMES)
            {
                File file = new File(outputDirectory, STR."\{instanceTypeName}.java");
                try (FileOutputStream outputStream = new FileOutputStream(file))
                {
                    outputStream.write(this.generateInstanceClass(instanceTypeName).getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }

            for (String deviceTypeName : DEVICE_HANDLE_NAMES)
            {
                File file = new File(outputDirectory, STR."\{deviceTypeName}.java");
                try (FileOutputStream outputStream = new FileOutputStream(file))
                {
                    outputStream.write(this.generateDeviceClass(deviceTypeName).getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }

            File headerFile = new File(outputDirectory, STR."\{HCLASS_NAME}.java");
            try (FileOutputStream outputStream = new FileOutputStream(headerFile))
            {
                outputStream.write(this.generateVulkanCore().getBytes(StandardCharsets.UTF_8));
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public HeaderInformation headerInfo()
    {
        return this.m_headerInfo;
    }

    @Override
    public RecordInformation recordInfo(TypeManifold type)
    {
        return new RecordInformation(this.m_typeNames.get((RecordType)flattenType(type)), this.m_packageName, "gStructLayout", "ptr");
    }
}
