package nuklear;

public interface UnnamedType_1
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_handle.gStructLayout);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", UnnamedType_1.class);

    void invoke(java.lang.foreign.MemorySegment arg1, nuklear.nk_handle arg2);

    default void invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        this.invoke(arg1, new nuklear.nk_handle(arg2));
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return nuklear.Nuklear.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
