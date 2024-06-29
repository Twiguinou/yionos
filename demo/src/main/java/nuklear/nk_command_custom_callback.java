package nuklear;

public interface nk_command_custom_callback
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_handle.gRecordLayout);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_command_custom_callback.class);

    void invoke(java.lang.foreign.MemorySegment arg0, short arg1, short arg2, short arg3, short arg4, nuklear.nk_handle arg5);

    default void invoke(java.lang.foreign.MemorySegment arg0, short arg1, short arg2, short arg3, short arg4, java.lang.foreign.MemorySegment arg5)
    {
        this.invoke(arg0, arg1, arg2, arg3, arg4, new nuklear.nk_handle(arg5));
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
