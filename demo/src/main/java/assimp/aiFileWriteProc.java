package assimp;

public interface aiFileWriteProc
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", aiFileWriteProc.class);

    long invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, long arg3, long arg4);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return assimp.Assimp.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
