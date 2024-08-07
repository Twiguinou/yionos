package yionos.demo.rendering;

import static vulkan.VkResult.*;

public class VulkanException extends IllegalStateException
{
    public final int vkError;

    public VulkanException(String s)
    {
        super(s);
        this.vkError = VK_ERROR_UNKNOWN;
    }

    public VulkanException(String s, int vkError)
    {
        super(s);
        this.vkError = vkError;
    }

    public static void check(int vkError, String s) throws VulkanException
    {
        if (vkError != VK_SUCCESS)
        {
            throw new VulkanException(String.format("%s: %d", s, vkError));
        }
    }

    public static void check(int vkError) throws VulkanException
    {
        check(vkError, "Vulkan error code");
    }
}
