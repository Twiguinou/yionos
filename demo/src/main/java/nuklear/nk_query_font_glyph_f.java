package nuklear;

public interface nk_query_font_glyph_f
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_query_font_glyph_f.class);

    void invoke(nuklear.nk_handle handle, float font_height, java.lang.foreign.MemorySegment glyph, int codepoint, int next_codepoint);

    default void invoke(java.lang.foreign.MemorySegment handle, float font_height, java.lang.foreign.MemorySegment glyph, int codepoint, int next_codepoint)
    {
        this.invoke(new nuklear.nk_handle(handle), font_height, glyph, codepoint, next_codepoint);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return nuklear.Nuklear.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
