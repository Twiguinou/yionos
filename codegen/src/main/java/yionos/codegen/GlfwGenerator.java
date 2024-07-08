package yionos.codegen;

import jpgen.SourceScopeScanner;
import jpgen.data.CallbackDeclaration;
import jpgen.data.Constant;
import jpgen.data.HeaderDeclaration;
import jpgen.data.RecordType;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class GlfwGenerator implements Generator
{
    private static final String GLFW_PACKAGE = "glfw3";
    private static final String GLFW_DIRECTORY = GLFW_PACKAGE.replaceAll("\\.", "/");

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
    public void generate(File outputDirectory, String[] clangArgs)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("GLFW Generator"), false, GLFW_PACKAGE))
        {
            List<String> args = new ArrayList<>(List.of(clangArgs));
            args.add("-DGLFW_INCLUDE_VULKAN");
            args.add(String.format("-I%s", this.m_vulkanInclude.toAbsolutePath()));
            scanner.process(this.m_glfwInclude.resolve("glfw3.h"), args.toArray(String[]::new), this.m_glfwInclude);

            File glfwOutput = new File(outputDirectory, GLFW_DIRECTORY);
            if (glfwOutput.exists() || glfwOutput.mkdirs())
            {
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner);
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner);
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
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(GLFW_PACKAGE);
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
