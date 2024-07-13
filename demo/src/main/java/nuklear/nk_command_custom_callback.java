package nuklear;

public interface nk_command_custom_callback
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_handle.gRecordLayout);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_command_custom_callback.class);

    void invoke(java.lang.foreign.MemorySegment canvas, short x, short y, short w, short h, nuklear.nk_handle callback_data);

    default void invoke(java.lang.foreign.MemorySegment canvas, short x, short y, short w, short h, java.lang.foreign.MemorySegment callback_data)
    {
        this.invoke(canvas, x, y, w, h, new nuklear.nk_handle(callback_data));
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
