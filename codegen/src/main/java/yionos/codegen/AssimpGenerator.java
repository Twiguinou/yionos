package yionos.codegen;

import jpgen.PrintingContext;
import jpgen.SourceScopeScanner;
import jpgen.data.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class AssimpGenerator implements Generator
{
    private static final String ASSIMP_PACKAGE = "assimp";
    private static final String ASSIMP_DIRECTORY = ASSIMP_PACKAGE.replaceAll("\\.", "/");

    private final Path m_assimpInclude;

    public AssimpGenerator(Path assimpInclude)
    {
        this.m_assimpInclude = assimpInclude;
    }

    private static Path createGlobalIncludeFile()
    {
        try
        {
            File file = Files.createTempFile("assimp-inc", "h").toFile();
            file.deleteOnExit();

            StringBuilder code = new StringBuilder();
            PrintingContext context = new PrintingContext(code);

            context.breakLine("#include <cimport.h>");
            context.breakLine("#include <postprocess.h>");
            context.breakLine("#include <scene.h>");
            context.breakLine("#include <cfileio.h>");

            Generator.writeToFile(file, code.toString().getBytes(StandardCharsets.UTF_8));

            return file.toPath();
        }
        catch (IOException e)
        {
            throw new RuntimeException(String.format("Could not create assimp global include file: %s", e));
        }
    }

    @Override
    public String name()
    {
        return "Assimp";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Assimp Generator"), false, ASSIMP_PACKAGE))
        {
            List<String> args = new ArrayList<>(List.of(clangArgs));
            args.add(String.format("-I%s", this.m_assimpInclude.toAbsolutePath()));
            scanner.process(createGlobalIncludeFile(), args.toArray(String[]::new), this.m_assimpInclude);

            File assimpOutput = new File(outputDirectory, ASSIMP_DIRECTORY);
            if (assimpOutput.exists() || assimpOutput.mkdirs())
            {
                List<EnumType.Decl> enums = Generator.gatherEnumDeclarations(scanner);
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner);
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner);
                List<HeaderDeclaration.FunctionSpecifier> functions = Generator.gatherFunctions(scanner);
                List<Constant> constants = scanner.constants().stream()
                        .sorted(Comparator.comparing(Constant::name))
                        .toList();

                enums.forEach(enumDeclaration -> Generator.writeDeclaration(enumDeclaration, assimpOutput));
                records.forEach(record -> Generator.writeDeclaration(record, assimpOutput));
                callbacks.forEach(callback -> Generator.writeDeclaration(callback, assimpOutput));

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
                        return "Assimp";
                    }

                    @Override
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(ASSIMP_PACKAGE);
                    }
                };

                Generator.writeDeclaration(header, assimpOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create Assimp output directory.");
            }
        }
    }
}
