package yionos.codegen;

import jpgen.SourceScopeScanner;
import jpgen.data.*;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class VmaGenerator implements Generator
{
    private static final String VMA_PACKAGE = "vma";
    private static final String VMA_DIRECTORY = VMA_PACKAGE.replaceAll("\\.", "/");

    private final Path m_vmaInclude;
    private final Path m_vulkanInclude;

    public VmaGenerator(Path vmaInclude, Path vulkanInclude)
    {
        this.m_vmaInclude = vmaInclude;
        this.m_vulkanInclude = vulkanInclude;
    }

    @Override
    public String name()
    {
        return "VMA";
    }

    @Override
    public void generate(File outputDirectory, String[] clangArgs)
    {
        try (SourceScopeScanner scanner = new SourceScopeScanner(Logger.getLogger("VMA Generator"), false, VMA_PACKAGE))
        {
            List<String> args = new ArrayList<>(List.of(clangArgs));
            args.add(String.format("-I%s", this.m_vulkanInclude.toAbsolutePath()));
            scanner.process(this.m_vmaInclude.resolve("vk_mem_alloc.h"), args.toArray(String[]::new), this.m_vmaInclude);

            File vmaOutput = new File(outputDirectory, VMA_DIRECTORY);
            if (vmaOutput.exists() || vmaOutput.mkdirs())
            {
                List<EnumType.Decl> enums = Generator.gatherEnumDeclarations(scanner);
                List<RecordType.Decl> records = Generator.gatherRecordDeclarations(scanner);
                List<CallbackDeclaration> callbacks = Generator.makeCallbacks(scanner);
                List<HeaderDeclaration.FunctionSpecifier> functions = Generator.gatherFunctions(scanner);

                enums.forEach(enumDeclaration -> Generator.writeDeclaration(enumDeclaration, vmaOutput));
                records.forEach(record -> Generator.writeDeclaration(record, vmaOutput));
                callbacks.forEach(callback -> Generator.writeDeclaration(callback, vmaOutput));

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
                        return "VMA";
                    }

                    @Override
                    public Optional<String> canonicalPackage()
                    {
                        return Optional.of(VMA_PACKAGE);
                    }
                };

                Generator.writeDeclaration(header, vmaOutput);
            }
            else
            {
                throw new RuntimeException("Failed to create VMA output directory.");
            }
        }
    }
}
