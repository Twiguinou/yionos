package assimp;

public interface aiFileOpenProc
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", aiFileOpenProc.class);

    java.lang.foreign.MemorySegment invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return assimp.Assimp.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
