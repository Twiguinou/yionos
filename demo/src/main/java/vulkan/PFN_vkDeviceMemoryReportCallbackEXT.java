package vulkan;

public interface PFN_vkDeviceMemoryReportCallbackEXT
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", PFN_vkDeviceMemoryReportCallbackEXT.class);

    void invoke(java.lang.foreign.MemorySegment pCallbackData, java.lang.foreign.MemorySegment pUserData);

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
