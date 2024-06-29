package glfw3;

public interface GLFWdropfun
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", GLFWdropfun.class);

    void invoke(java.lang.foreign.MemorySegment arg0, int arg1, java.lang.foreign.MemorySegment arg2);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
