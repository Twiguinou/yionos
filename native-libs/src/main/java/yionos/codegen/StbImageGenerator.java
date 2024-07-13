package yionos.codegen;

import jpgen.LocationProvider;
import jpgen.SourceScopeScanner;
import jpgen.data.CanonicalPackage;
import jpgen.data.Constant;
import jpgen.data.EnumType;
import jpgen.data.HeaderDeclaration;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class StbImageGenerator implements Generator
{
    private static final String STB_IMAGE_DIRECTORY = "stb/image";
    private static final CanonicalPackage STB_IMAGE_PACKAGE = CanonicalPackage.of(STB_IMAGE_DIRECTORY.replaceAll("/", "."));

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
        LocationProvider.ModuleTree moduleTree = LocationProvider.ModuleTree.of(this.m_stbInclude, STB_IMAGE_PACKAGE);

        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("stb_image Generator"), debug, LocationProvider.of(moduleTree)))
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
                    public CanonicalPackage location()
                    {
                        return STB_IMAGE_PACKAGE;
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
