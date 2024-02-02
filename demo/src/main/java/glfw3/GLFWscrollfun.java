package glfw3;

public interface GLFWscrollfun
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", GLFWscrollfun.class);

    void invoke(java.lang.foreign.MemorySegment window, double xoffset, double yoffset);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return glfw3.GLFW3.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
