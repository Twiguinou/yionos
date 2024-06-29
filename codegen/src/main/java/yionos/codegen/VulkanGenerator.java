package yionos.codegen;

import jpgen.ClassMaker;
import jpgen.PrintingContext;
import jpgen.SourceScopeScanner;
import jpgen.data.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

// diabolical
public class VulkanGenerator implements Generator
{
    private static final String VULKAN_PACKAGE = "vulkan";
    private static final String VULKAN_DIRECTORY = VULKAN_PACKAGE.replaceAll("\\.", "/");

    private static final Set<String> AUTHORIZED_CALLBACKS = Set.of(
            "PFN_vkAllocationFunction",
            "PFN_vkReallocationFunction",
            "PFN_vkFreeFunction",
            "PFN_vkInternalAllocationNotification",
            "PFN_vkInternalFreeNotification",
            "PFN_vkDebugReportCallbackEXT",
            "PFN_vkDebugUtilsMessengerCallbackEXT",
            "PFN_vkDeviceMemoryReportCallbackEXT",
            "PFN_vkGetInstanceProcAddrLUNARG"
    );

    private record DispatchingHandle(SourceScopeScanner.TypeKey typeKey, String parentField, List<SourceScopeScanner.TypeKey> children, FunctionType.Decl addressProvider, List<FunctionType.Decl> functions, List<FunctionType.Decl> indirectFunctions)
    {
        public DispatchingHandle(SourceScopeScanner.TypeKey typeKey, String parentField, List<SourceScopeScanner.TypeKey> children, FunctionType.Decl addressProvider, Iterable<Declaration> declarations)
        {
            this(typeKey, parentField, children, addressProvider,
                    findFunctions(function -> function != addressProvider && isFunctionPrimary(function.descriptorType, typeKey), declarations),
                    findFunctions(function ->
                    {
                        if (function == addressProvider) return false;

                        Iterator<Type> parameterIterator = function.descriptorType.parameterTypes().iterator();
                        if (!parameterIterator.hasNext()) return false;

                        Type firstParameter = parameterIterator.next().discover();
                        for (SourceScopeScanner.TypeKey child : children)
                        {
                            if (child.discover().equals(firstParameter))
                            {
                                return true;
                            }
                        }

                        return false;
                    }, declarations));
        }
    }

    private final Path m_vulkanInclude;

    public VulkanGenerator(Path vulkanInclude)
    {
        this.m_vulkanInclude = vulkanInclude;
    }

    private static SourceScopeScanner.TypeKey findHandleKey(String name, Map<SourceScopeScanner.TypeKey, Type> typeTable)
    {
        return typeTable.entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Type.Alias(_, String identifier) && identifier.equals(name))
                .map(Map.Entry::getKey)
                .findAny()
                .orElseThrow(() -> new IllegalStateException(String.format("Failed to resolve handle type for %s", name)));
    }

    private static List<FunctionType.Decl> findFunctions(Predicate<FunctionType.Decl> predicate, Iterable<Declaration> declarations)
    {
        List<FunctionType.Decl> functions = new ArrayList<>();
        for (Declaration declaration : declarations)
        {
            if (declaration instanceof FunctionType.Decl function && predicate.test(function))
            {
                functions.add(function);
            }
        }

        return functions;
    }

    private static List<DispatchingHandle> createDispatchingHandles(SourceScopeScanner scanner)
    {
        return List.of(
                new DispatchingHandle(findHandleKey("VkInstance", scanner.getTypeTable()), "instance", List.of(
                        findHandleKey("VkPhysicalDevice", scanner.getTypeTable())
                ), findFunctions(function -> function.name().equals("vkGetInstanceProcAddr"), scanner.declarations()).getFirst(), scanner.declarations()),
                new DispatchingHandle(findHandleKey("VkDevice", scanner.getTypeTable()), "device", List.of(
                        findHandleKey("VkQueue", scanner.getTypeTable()),
                        findHandleKey("VkCommandBuffer", scanner.getTypeTable())
                ), findFunctions(function -> function.name().equals("vkGetDeviceProcAddr"), scanner.declarations()).getFirst(), scanner.declarations())
        );
    }

    private static boolean isFunctionPrimary(FunctionType functionType, SourceScopeScanner.TypeKey reference)
    {
        Iterator<Type> parameterIterator = functionType.parameterTypes().iterator();
        if (!parameterIterator.hasNext()) throw new IllegalArgumentException("Invalid function provided.");

        return reference.discover().equals(parameterIterator.next().discover());
    }

    @Override
    public String name()
    {
        return "Vulkan";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Vulkan Generator"), false, VULKAN_PACKAGE))
        {
            List<String> args = new ArrayList<>(List.of(clangArgs));
            args.add(String.format("-I%s", this.m_vulkanInclude.toAbsolutePath()));
            scanner.process(this.m_vulkanInclude.resolve("vulkan/vulkan_core.h"), args.toArray(String[]::new), this.m_vulkanInclude);

            File vulkanOutput = new File(outputDirectory, VULKAN_DIRECTORY);
            if (vulkanOutput.exists() || vulkanOutput.mkdirs())
            {
                List<EnumType.Decl> enums = Generator.gatherEnumDeclarations(scanner.declarations());
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner.declarations());
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner.getTypeTable().values(), VULKAN_PACKAGE).stream()
                        .filter(callback -> AUTHORIZED_CALLBACKS.contains(callback.name()))
                        .toList();

                List<Constant> constants = StreamSupport.stream(scanner.constants().spliterator(), false)
                        .filter(constant -> constant instanceof Constant.StringLiteral)
                        .collect(Collectors.toCollection(ArrayList::new));
                constants.add(new Constant.Int("VK_ATTACHMENT_UNUSED", -1));
                constants.add(new Constant.Int("VK_FALSE", 0));
                constants.add(new Constant.Int("VK_TRUE", 1));
                constants.add(new Constant.Int("VK_QUEUE_FAMILY_IGNORED", -1));
                constants.add(new Constant.Int("VK_REMAINING_ARRAY_LAYERS", -1));
                constants.add(new Constant.Int("VK_REMAINING_MIP_LEVELS", -1));
                constants.add(new Constant.Int("VK_SUBPASS_EXTERNAL", -1));
                constants.add(new Constant.Int("VK_WHOLE_SIZE", -1));
                constants.add(new Constant.Int("VK_MAX_MEMORY_TYPES", 32));
                constants.add(new Constant.Int("VK_MAX_PHYSICAL_DEVICE_NAME_SIZE", 256));
                constants.add(new Constant.Int("VK_UUID_SIZE", 16));
                constants.add(new Constant.Int("VK_MAX_EXTENSION_NAME_SIZE", 256));
                constants.add(new Constant.Int("VK_MAX_DESCRIPTION_SIZE", 256));
                constants.add(new Constant.Int("VK_MAX_MEMORY_HEAPS", 16));

                List<DispatchingHandle> handles = createDispatchingHandles(scanner);

                List<HeaderDeclaration.FunctionSpecifier> functions = findFunctions(
                        function -> handles.stream().allMatch(handle -> function != handle.addressProvider && !handle.functions.contains(function) && !handle.indirectFunctions.contains(function)),
                        scanner.declarations()
                ).stream()
                        .map(HeaderDeclaration.FunctionSpecifier::of)
                        .collect(Collectors.toCollection(ArrayList::new));

                handles.forEach(handle ->
                {
                    String handleName = ((Type.Alias)handle.typeKey.discover()).identifier();
                    try
                    {
                        List<FunctionType.Decl> allFunctions = new ArrayList<>(handle.functions);
                        allFunctions.addAll(handle.indirectFunctions);

                        StringBuilder code = new StringBuilder();
                        PrintingContext context = new PrintingContext(code);

                        context.append("package ").append(VULKAN_PACKAGE).breakLine(';');
                        context.breakLine();

                        context.append("public final class ").breakLine(handleName);
                        context.breakLine('{');
                        context.pushControlFlow();

                        context.breakLine("public final java.lang.foreign.MemorySegment handle;");
                        for (FunctionType.Decl function : allFunctions)
                        {
                            context.append("public final java.lang.foreign.MemorySegment MTD_ADDRESS__").append(function.name()).breakLine(';');
                            context.append("public final java.lang.invoke.MethodHandle MTD__").append(function.name()).breakLine(';');
                        }

                        context.breakLine();
                        context.append("public ").append(handleName).breakLine("(java.lang.foreign.MemorySegment handle)");
                        context.breakLine('{');
                        context.pushControlFlow();
                        context.breakLine("this.handle = handle;");
                        context.breakLine("try (java.lang.foreign.Arena arena = java.lang.foreign.Arena.ofConfined())");
                        context.breakLine('{');
                        context.pushControlFlow();
                        for (FunctionType.Decl function : allFunctions)
                        {
                            context.append("this.MTD_ADDRESS__").append(function.name()).append(" = ").append(VULKAN_PACKAGE).append(".VulkanCore.").append(handle.addressProvider.name()).append("(this.handle, arena.allocateFrom(\"").append(function.name()).breakLine("\"));");
                            context.append("this.MTD__").append(function.name()).append(" = this.MTD_ADDRESS__").append(function.name()).append(".equals(java.lang.foreign.MemorySegment.NULL) ? null : jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__").append(function.name()).append(", ").append(ClassMaker.getFunctionDescriptor(function.descriptorType)).breakLine(");");
                        }
                        context.popControlFlow();
                        context.breakLine('}');
                        context.popControlFlow();
                        context.breakLine('}');

                        context.breakLine();
                        context.breakLine("public java.lang.foreign.MemorySegment handle() {return this.handle;}");

                        context.popControlFlow();
                        context.breakLine('}');

                        Generator.writeToFile(new File(vulkanOutput, String.format("%s.java", handleName)), code.toString().getBytes(StandardCharsets.UTF_8));
                    }
                    catch (IOException e)
                    {
                        throw new RuntimeException(String.format("Failed to generate code for handle %s: %s", handleName, e));
                    }
                });

                handles.forEach(handle ->
                {
                    String mainHandleName = ((Type.Alias)handle.typeKey.discover()).identifier();
                    handle.children.forEach(child ->
                    {
                        String handleName = ((Type.Alias)child.discover()).identifier();
                        try
                        {
                            StringBuilder code = new StringBuilder();
                            PrintingContext context = new PrintingContext(code);

                            context.append("package ").append(VULKAN_PACKAGE).breakLine(';');
                            context.breakLine();

                            context.append("public record ").append(handleName).append("(java.lang.foreign.MemorySegment handle, ").append(VULKAN_PACKAGE).append('.').append(mainHandleName).append(' ').append(handle.parentField).breakLine(") {}");

                            Generator.writeToFile(new File(vulkanOutput, String.format("%s.java", handleName)), code.toString().getBytes(StandardCharsets.UTF_8));
                        }
                        catch (IOException e)
                        {
                            throw new RuntimeException(String.format("Failed to generate code for auxiliary handle %s: %s", handleName, e));
                        }
                    });
                });

                handles.forEach(handle ->
                {
                    FunctionType.Decl oldFunction = handle.addressProvider;
                    FunctionType oldFunctionType = oldFunction.descriptorType;

                    FunctionType.Builder typeBuilder = new FunctionType.Builder(oldFunctionType.returnType(), oldFunctionType.variadic());
                    oldFunctionType.parameterTypes().forEach(type -> typeBuilder.appendParameter(type.flatten()));

                    FunctionType.DeclBuilder declBuilder = new FunctionType.DeclBuilder(oldFunction.linkage, typeBuilder.build(), oldFunction.name());
                    oldFunction.parameterNames.forEach(declBuilder::appendParameterName);

                    functions.add(HeaderDeclaration.FunctionSpecifier.of(declBuilder.build()));
                });

                handles.forEach(handle ->
                {
                    String mainHandlePath = String.format("%s.%s", VULKAN_PACKAGE, ((Type.Alias)handle.typeKey.discover()).identifier());
                    scanner.getTypeTable().put(handle.typeKey, new Type.Pointer(Type.VOID)
                    {
                        @Override
                        public String getWrappedFunctionParameterType()
                        {
                            return mainHandlePath;
                        }

                        @Override
                        public String getUnwrappedFunctionParameter(String name)
                        {
                            return String.format("%s.handle()", name);
                        }
                    });

                    for (SourceScopeScanner.TypeKey child : handle.children)
                    {
                        String handlePath = String.format("%s.%s", VULKAN_PACKAGE, ((Type.Alias)child.discover()).identifier());
                        scanner.getTypeTable().put(child, new Type.Pointer(Type.VOID)
                        {
                            @Override
                            public String getWrappedFunctionParameterType()
                            {
                                return handlePath;
                            }

                            @Override
                            public String getUnwrappedFunctionParameter(String name)
                            {
                                return String.format("%s.handle()", name);
                            }
                        });
                    }
                });

                handles.forEach(handle ->
                {
                    for (FunctionType.Decl function : handle.functions)
                    {
                        String parameter = function.parameterNames.iterator().next();
                        functions.add(new HeaderDeclaration.FunctionSpecifier()
                        {
                            @Override
                            public FunctionType.Decl function()
                            {
                                return function;
                            }

                            @Override
                            public Optional<String> getFunctionHandle()
                            {
                                return Optional.of(String.format("%s.MTD__%s", parameter, function.name()));
                            }
                        });
                    }

                    for (FunctionType.Decl function : handle.indirectFunctions)
                    {
                        String parameter = function.parameterNames.iterator().next();
                        functions.add(new HeaderDeclaration.FunctionSpecifier()
                        {
                            @Override
                            public FunctionType.Decl function()
                            {
                                return function;
                            }

                            @Override
                            public Optional<String> getFunctionHandle()
                            {
                                return Optional.of(String.format("%s.%s().MTD__%s", parameter, handle.parentField, function.name()));
                            }
                        });
                    }
                });

                enums.forEach(enumDeclaration -> Generator.writeDeclaration(enumDeclaration, vulkanOutput));
                records.forEach(record -> Generator.writeDeclaration(record, vulkanOutput));
                callbacks.forEach(callback -> Generator.writeDeclaration(callback, vulkanOutput));

                HeaderDeclaration header = new HeaderDeclaration()
                {
                    @Override
                    public Iterable<FunctionSpecifier> functions()
                    {
                        return functions;
                    }

                    @Override
                    public Iterable<Constant> constants()
                    {
                        return constants;
                    }

                    @Override
                    public String name()
                    {
                        return "VulkanCore";
                    }

                    @Override
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(VULKAN_PACKAGE);
                    }
                };

                Generator.writeDeclaration(header, vulkanOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create Vulkan output directory");
            }
        }
    }
}
