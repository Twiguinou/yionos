package yionos.codegen;

import jpgen.SourceScopeScanner;
import jpgen.data.Constant;
import jpgen.data.EnumType;
import jpgen.data.HeaderDeclaration;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class StbImageGenerator implements Generator
{
    private static final String STB_IMAGE_PACKAGE = "stb.image";
    private static final String STB_IMAGE_DIRECTORY = STB_IMAGE_PACKAGE.replaceAll("\\.", "/");

    private final Path m_stbInclude;

    public StbImageGenerator(Path stbInclude)
    {
        this.m_stbInclude = stbInclude;
    }

    @Override
    public String name()
    {
        return "stb_image";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs, boolean debug)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("stb_image Generator"), debug, STB_IMAGE_PACKAGE))
        {
            scanner.process(this.m_stbInclude.resolve("stb_image.h"), clangArgs, this.m_stbInclude);

            File stbImageOutput = new File(outputDirectory, STB_IMAGE_DIRECTORY);
            if (stbImageOutput.exists() || stbImageOutput.mkdirs())
            {
                List<Constant> constants = scanner.getTypeTable().values().stream()
                        .filter(type -> type instanceof EnumType)
                        .flatMap(type -> Arrays.stream(((EnumType)type).constants.toArray(EnumType.Constant[]::new)))
                        .map(constant -> (Constant) new Constant.Int(constant.name(), (int)constant.value()))
                        .toList();
                List<HeaderDeclaration.FunctionSpecifier> functions = Generator.gatherFunctions(scanner).stream()
                        .filter(spec -> !spec.function().name().endsWith("_from_callbacks"))
                        .toList();

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
                        return "StbImage";
                    }

                    @Override
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(STB_IMAGE_PACKAGE);
                    }
                };

                Generator.writeDeclaration(header, stbImageOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create stb_image output directory.");
            }
        }
    }
}
