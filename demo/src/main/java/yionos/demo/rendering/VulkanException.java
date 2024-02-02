package yionos.demo.rendering;

import yionos.demo.SequenceInitializer;

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
            throw new VulkanException(STR."\{s}: \{vkError}", vkError);
        }
    }

    public static void check(int vkError) throws VulkanException
    {
        check(vkError, "Vulkan error code");
    }

    public static void check(int vkError, String s, SequenceInitializer initializer) throws VulkanException
    {
        if (vkError != VK_SUCCESS)
        {
            initializer.empty();
            throw new VulkanException(STR."\{s}: \{vkError}", vkError);
        }
    }

    public static void check(int vkError, SequenceInitializer initializer) throws VulkanException
    {
        check(vkError, "Vulkan error code", initializer);
    }
}
