package yionos.codegen;

import jpgen.SourceScopeScanner;
import jpgen.data.*;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class NuklearGenerator implements Generator
{
    private static final String NUKLEAR_PACKAGE = "nuklear";
    private static final String NUKLEAR_DIRECTORY = NUKLEAR_PACKAGE.replaceAll("\\.", "/");

    private final Path m_nuklearInclude;

    public NuklearGenerator(Path nuklearInclude)
    {
        this.m_nuklearInclude = nuklearInclude;
    }

    // 'nk_font_atlas_init_custom' has one parameter which is named 'transient'.
    private static List<HeaderDeclaration.FunctionSpecifier> incompatibilityFix__1(List<HeaderDeclaration.FunctionSpecifier> functions)
    {
        return functions.stream()
                .map(specifier ->
                {
                    FunctionType.Decl function = specifier.function();
                    if (function.name().equals("nk_font_atlas_init_custom"))
                    {
                        return HeaderDeclaration.FunctionSpecifier.of(new FunctionType.DeclBuilder(function.linkage, function.descriptorType, function.name())
                                .appendParameterName("__arg1")
                                .appendParameterName("persistent")
                                .appendParameterName("_transient")
                                .build());
                    }

                    return specifier;
                })
                .toList();
    }

    @Override
    public String name()
    {
        return "Nuklear";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("Nuklear Generator"), false, NUKLEAR_PACKAGE, "_ptr", "gRecordLayout"))
        {
            List<String> args = new ArrayList<>(List.of(clangArgs));
            args.add("-DNK_INCLUDE_FIXED_TYPES");
            args.add("-DNK_INCLUDE_DEFAULT_ALLOCATOR");
            args.add("-DNK_INCLUDE_STANDARD_IO");
            args.add("-DNK_INCLUDE_VERTEX_BUFFER_OUTPUT");
            args.add("-DNK_INCLUDE_FONT_BAKING");
            args.add("-DNK_INCLUDE_DEFAULT_FONT");
            scanner.process(this.m_nuklearInclude.resolve("nuklear.h"), args.toArray(String[]::new), this.m_nuklearInclude);

            File nuklearOutput = new File(outputDirectory, NUKLEAR_DIRECTORY);
            if (nuklearOutput.exists() || nuklearOutput.mkdirs())
            {
                List<EnumType.Decl> enums = Generator.gatherEnumDeclarations(scanner);
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner);
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner);
                List<HeaderDeclaration.FunctionSpecifier> functions = incompatibilityFix__1(Generator.gatherFunctions(scanner));

                List<Constant> constants = List.of(
                        new Constant.Int("nk_false", 0),
                        new Constant.Int("nk_true", 1)
                );

                enums.forEach(enumDeclaration -> Generator.writeDeclaration(enumDeclaration, nuklearOutput));
                records.forEach(record -> Generator.writeDeclaration(record, nuklearOutput));
                callbacks.forEach(callback -> Generator.writeDeclaration(callback, nuklearOutput));

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
                        return "Nuklear";
                    }

                    @Override
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(NUKLEAR_PACKAGE);
                    }
                };

                Generator.writeDeclaration(header, nuklearOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create Nuklear output directory.");
            }
        }
    }
}
