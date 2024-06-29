package yionos.codegen;

import jpgen.SourceScopeScanner;
import jpgen.data.*;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class ShadercGenerator implements Generator
{
    private static final String SHADERC_PACKAGE = "shaderc";
    private static final String SHADERC_DIRECTORY = SHADERC_PACKAGE.replaceAll("\\.", "/");

    private final Path m_shadercInclude;

    public ShadercGenerator(Path shadercInclude)
    {
        this.m_shadercInclude = shadercInclude;
    }

    @Override
    public String name()
    {
        return "Shaderc";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Shaderc Generator"), false, SHADERC_PACKAGE))
        {
            scanner.process(this.m_shadercInclude.resolve("shaderc.h"), clangArgs, this.m_shadercInclude);

            File shadercOutput = new File(outputDirectory, SHADERC_DIRECTORY);
            if (shadercOutput.exists() || shadercOutput.mkdirs())
            {
                List<EnumType.Decl> enums = Generator.gatherEnumDeclarations(scanner.declarations());
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner.declarations());
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner.getTypeTable().values(), SHADERC_PACKAGE);
                List<HeaderDeclaration.FunctionSpecifier> functions = Generator.gatherFunctions(scanner.declarations());

                enums.forEach(enumDeclaration -> Generator.writeDeclaration(enumDeclaration, shadercOutput));
                records.forEach(record -> Generator.writeDeclaration(record, shadercOutput));
                callbacks.forEach(callback -> Generator.writeDeclaration(callback, shadercOutput));

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
                        return List.of();
                    }

                    @Override
                    public String name()
                    {
                        return "Shaderc";
                    }

                    @Override
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(SHADERC_PACKAGE);
                    }
                };

                Generator.writeDeclaration(header, shadercOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create shaderc output directory.");
            }
        }
    }
}
