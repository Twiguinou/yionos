package yionos.codegen;

import jpgen.*;
import jpgen.clang.CXCursor;
import jpgen.data.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

import static jpgen.clang.Index_h.*;

public interface Generator
{
    String name();

    void generate(File outputDirectory, String[] clangArgs, boolean debug);

    static void writeToFile(File file, byte[] content) throws IOException
    {
        try (FileOutputStream outputStream = new FileOutputStream(file))
        {
            outputStream.write(content);
        }
    }

    static List<RecordType.Decl> gatherRecordDeclarations(SourceScopeScanner scanner, CanonicalPackage location)
    {
        return scanner.getTypeTable().values().stream()
                .filter(type -> type instanceof RecordType.Decl record && !record.isIncomplete() && location.isPrefix(record.location()))
                .map(type -> (RecordType.Decl) type)
                .toList();
    }

    static List<EnumType.Decl> gatherEnumDeclarations(SourceScopeScanner scanner, CanonicalPackage location)
    {
        return scanner.getTypeTable().values().stream()
                .filter(type -> type instanceof EnumType.Decl enumDecl && location.isPrefix(enumDecl.location()))
                .map(type -> (EnumType.Decl) type)
                .toList();
    }

    static List<HeaderDeclaration.FunctionSpecifier> gatherFunctions(SourceScopeScanner scanner)
    {
        return scanner.functions().stream()
                .filter(function -> function.linkage == Linkage.EXTERNAL && !function.descriptorType.variadic())
                .map(HeaderDeclaration.FunctionSpecifier::of)
                .toList();
    }

    static List<CallbackDeclaration> makeCallbacks(SourceScopeScanner scanner, CanonicalPackage location)
    {
        return scanner.getTypeTable().entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Type.Alias(_, CanonicalPackage aliasLocation, _) && location.isPrefix(aliasLocation))
                .map(entry ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, entry.getKey().internal);
                        return ((Type.Alias)entry.getValue()).toCallback(declarationCursor);
                    }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    static void writeDeclaration(Declaration declaration, File directory)
    {
        try
        {
            StringBuilder content = new StringBuilder();
            PrintingContext context = new PrintingContext(content);
            switch (declaration)
            {
                case RecordType.Decl record -> ClassMaker.makeRecord(context, record);
                case EnumType.Decl enumDeclaration -> ClassMaker.makeEnum(context, enumDeclaration);
                case CallbackDeclaration callback -> ClassMaker.makeCallback(context, callback);
                case HeaderDeclaration header -> ClassMaker.makeHeader(context, header);
                default -> throw new IllegalArgumentException(String.format("Unknown declaration type: %s", declaration));
            }

            Generator.writeToFile(new File(directory, String.format("%s.java", declaration.name())), content.toString().getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException e)
        {
            throw new RuntimeException(String.format("Failed to make content of declaration %s: %s", declaration.name(), e));
        }
    }
}
