package yionos.codegen;

import jpgen.ClassMaker;
import jpgen.PrintingContext;
import jpgen.SizedIterable;
import jpgen.data.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public interface Generator
{
    String name();

    void generate(File outputDirectory, String[] clangArgs);

    static void writeToFile(File file, byte[] content) throws IOException
    {
        try (FileOutputStream outputStream = new FileOutputStream(file))
        {
            outputStream.write(content);
        }
    }

    static List<RecordType.Decl> gatherRecordDeclarations(Iterable<Declaration> declarations)
    {
        List<RecordType.Decl> records = new ArrayList<>();
        for (Declaration declaration : declarations)
        {
            if (declaration instanceof RecordType.Decl record && !record.isIncomplete())
            {
                records.add(record);
            }
        }

        return records;
    }

    static List<EnumType.Decl> gatherEnumDeclarations(Iterable<Declaration> declarations)
    {
        List<EnumType.Decl> enums = new ArrayList<>();
        for (Declaration declaration : declarations)
        {
            if (declaration instanceof EnumType.Decl enumDeclaration)
            {
                enums.add(enumDeclaration);
            }
        }

        return enums;
    }

    static List<HeaderDeclaration.FunctionSpecifier> gatherFunctions(Iterable<Declaration> declarations)
    {
        List<HeaderDeclaration.FunctionSpecifier> functions = new ArrayList<>();
        for (Declaration declaration : declarations)
        {
            if (declaration instanceof FunctionType.Decl function && function.linkage == Linkage.EXTERNAL)
            {
                functions.add(HeaderDeclaration.FunctionSpecifier.of(function));
            }
        }

        return functions;
    }

    static List<CallbackDeclaration> makeCallbacks(Iterable<Type> types, String declsPackage)
    {
        List<CallbackDeclaration> callbacks = new ArrayList<>();
        for (Type type : types)
        {
            if (type instanceof Type.Alias(Type underlying, String identifier) &&
                    underlying.flatten() instanceof Type.Pointer pointer &&
                    pointer.referencedType.flatten() instanceof FunctionType functionType)
            {
                String[] argsNames = new String[functionType.parameterTypes().size()];
                for (int i = 0; i < argsNames.length; i++) argsNames[i] = String.format("arg%d", i);

                callbacks.add(new CallbackDeclaration(functionType, declsPackage, identifier, SizedIterable.ofArray(argsNames)));
            }
        }

        return callbacks;
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
