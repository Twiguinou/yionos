package glfw3;

public interface GLFWglproc
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid();
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", GLFWglproc.class);

    void invoke();

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return glfw3.GLFW3.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
