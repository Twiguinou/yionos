package yionos.codegen;

import jpgen.LocationProvider;
import jpgen.SourceScopeScanner;
import jpgen.data.*;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class GlfwGenerator implements Generator
{
    private static final String GLFW_DIRECTORY = "glfw3";
    private static final CanonicalPackage GLFW_PACKAGE = CanonicalPackage.of(GLFW_DIRECTORY.replaceAll("/", "."));

    private final Path m_glfwInclude;
    private final Path m_vulkanInclude;

    public GlfwGenerator(Path glfwInclude, Path vulkanInclude)
    {
        this.m_glfwInclude = glfwInclude;
        this.m_vulkanInclude = vulkanInclude;
    }

    @Override
    public String name()
    {
        return "GLFW3";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs, boolean debug)
    {
        LocationProvider.ModuleTree moduleTree = LocationProvider.ModuleTree.of(this.m_glfwInclude, GLFW_PACKAGE,
                LocationProvider.ModuleTree.of(this.m_vulkanInclude, VulkanGenerator.VULKAN_PACKAGE));

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("GLFW Generator"), debug, LocationProvider.of(moduleTree)))
        {
            List<String> args = new ArrayList<>(List.of(clangArgs));
            args.add("-DGLFW_INCLUDE_VULKAN");
            args.add(String.format("-I%s", this.m_vulkanInclude.toAbsolutePath()));
            scanner.process(this.m_glfwInclude.resolve("glfw3.h"), args.toArray(String[]::new), this.m_glfwInclude);

            File glfwOutput = new File(outputDirectory, GLFW_DIRECTORY);
            if (glfwOutput.exists() || glfwOutput.mkdirs())
            {
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner, GLFW_PACKAGE);
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner, GLFW_PACKAGE);
                List<HeaderDeclaration.FunctionSpecifier> functions = Generator.gatherFunctions(scanner);
                List<Constant> sortedConstants = scanner.constants().stream()
                        .sorted(Comparator.comparing(Constant::name))
                        .toList();

                records.forEach(record -> Generator.writeDeclaration(record, glfwOutput));
                callbacks.forEach(callback -> Generator.writeDeclaration(callback, glfwOutput));

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
                        return sortedConstants;
                    }

                    @Override
                    public String name()
                    {
                        return "GLFW3";
                    }

                    @Override
                    public CanonicalPackage location()
                    {
                        return GLFW_PACKAGE;
                    }
                };

                Generator.writeDeclaration(header, glfwOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create GLFW3 output directory.");
            }
        }
    }
}
