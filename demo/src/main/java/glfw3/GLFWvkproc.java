package glfw3;

public interface GLFWvkproc
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid();
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", GLFWvkproc.class);

    void invoke();

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
