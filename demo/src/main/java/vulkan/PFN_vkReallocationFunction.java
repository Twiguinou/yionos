package vulkan;

public interface PFN_vkReallocationFunction
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkReallocationFunction.class);

    java.lang.foreign.MemorySegment invoke(java.lang.foreign.MemorySegment pUserData, java.lang.foreign.MemorySegment pOriginal, long size, long alignment, int allocationScope);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
