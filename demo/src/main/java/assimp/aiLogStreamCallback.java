package assimp;

public interface aiLogStreamCallback
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", aiLogStreamCallback.class);

    void invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return assimp.Assimp.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
