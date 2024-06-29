package yionos.codegen;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public final class Main
{private Main() {}

    static
    {
        System.loadLibrary("libclang");

        try
        {
            InputStream configStream = new ByteArrayInputStream("""
                handlers=java.util.logging.ConsoleHandler
                java.util.logging.SimpleFormatter.format=(%3$s) | %4$s | %5$s\\n
                .level=ALL
                """.getBytes(StandardCharsets.UTF_8));

            LogManager logManager = LogManager.getLogManager();
            logManager.readConfiguration(configStream);
        }
        catch (IOException e)
        {
            System.err.printf("Failed to initialize logging configuration: %s%n", e);
        }
    }

    private static Path resolvePath(ProgramArguments args, String name)
    {
        return args.getArgValueIndexed(name, 0)
                .map(Paths::get)
                .orElseThrow(() -> new IllegalStateException(String.format("Missing %s argument.", name)));
    }

    public static void main(String... rawArgs)
    {
        ProgramArguments args = new ProgramArguments(rawArgs);

        Path vulkanInclude = resolvePath(args, "vulkan_include");
        Path glfwInclude = resolvePath(args, "glfw_include");
        Path shadercInclude = resolvePath(args, "shaderc_include");
        Path vmaInclude = resolvePath(args, "vma_include");
        Path stbInclude = resolvePath(args, "stb_include");
        Path nuklearInclude = resolvePath(args, "nuklear_include");
        Path assimpInclude = resolvePath(args, "assimp_include");

        String[] optionalArgs = args.getArgValues("optional_args").orElse(new String[0]);
        File outputDirectory = args.getArgValueIndexed("output_directory", 0)
                .map(File::new)
                .filter(file -> !file.exists() || file.isDirectory())
                .orElseThrow(() -> new IllegalStateException("Provided output directory is either missing or invalid."));

        List<Generator> generators = List.of(
                new GlfwGenerator(glfwInclude, vulkanInclude),
                new ShadercGenerator(shadercInclude),
                new VmaGenerator(vmaInclude, vulkanInclude),
                new StbImageGenerator(stbInclude),
                new NuklearGenerator(nuklearInclude),
                new AssimpGenerator(assimpInclude),
                new VulkanGenerator(vulkanInclude)
        );

        if (outputDirectory.exists() || outputDirectory.mkdirs())
        {
            Logger globalLogger = Logger.getLogger("Global Logger");

            generators.forEach(generator ->
            {
                globalLogger.info(String.format("Generating bindings for %s", generator.name()));
                generator.generate(outputDirectory, optionalArgs);
                globalLogger.info(String.format("Done generating bindings for %s%n", generator.name()));
            });
        }
        else
        {
            throw new RuntimeException("Could not create output directories.");
        }
    }
}
