package yionos.demo.rendering;

import vulkan.VkSurfaceCapabilitiesKHR;
import vulkan.VkSurfaceFormatKHR;
import yionos.demo.WindowProcessor;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Optional;

import static vulkan.VulkanCore.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class VulkanRenderContext extends VulkanContext
{
    public record PhysicalDeviceSurfaceProperties(VkSurfaceCapabilitiesKHR capabilities, VkSurfaceFormatKHR[] formats, int[] presentModes) {}

    private final MemorySegment m_surface;
    public final WindowProcessor window;
    private @Nullable PhysicalDeviceSurfaceProperties m_physicalDeviceSurfaceProperties = null;

    public VulkanRenderContext(AppInfo appInfo, String[] enabledLayers, String[] enabledExtensions, int[] validationFeatures, WindowProcessor window) throws VulkanException
    {
        super(appInfo, enabledLayers, enabledExtensions, validationFeatures);
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pSurface = arena.allocate(ADDRESS);
            VulkanException.check(window.createVulkanSurface(this.instance().handle(), NULL, pSurface), "Failed to create Vulkan surface");
            this.m_surface = pSurface.get(ADDRESS, 0);

            this.window = window;
        }
    }

    public MemorySegment surface()
    {
        return this.m_surface;
    }

    public Optional<PhysicalDeviceSurfaceProperties> surfaceProperties()
    {
        return Optional.ofNullable(this.m_physicalDeviceSurfaceProperties);
    }

    public void querySurfaceProperties() throws VulkanException
    {
        this.m_physicalDeviceSurfaceProperties = null;
        this.physicalDevice().ifPresent(physicalDevice ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                Arena propertiesArena = Arena.ofAuto();

                VkSurfaceCapabilitiesKHR capabilities = new VkSurfaceCapabilitiesKHR(propertiesArena);
                VkSurfaceFormatKHR[] formats;
                int[] presentModes;

                VulkanException.check(vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice.handle(), this.m_surface, capabilities.ptr()));

                MemorySegment pFormatCount = arena.allocate(JAVA_INT);
                VulkanException.check(vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice.handle(), this.m_surface, pFormatCount, NULL));
                int formatCount = pFormatCount.get(JAVA_INT, 0);
                formats = new VkSurfaceFormatKHR[formatCount];
                MemorySegment pFormats = arena.allocate(VkSurfaceFormatKHR.gRecordLayout, formatCount);
                VulkanException.check(vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice.handle(), this.m_surface, pFormatCount, pFormats));
                for (int i = 0; i < formatCount; i++)
                {
                    VkSurfaceFormatKHR format = VkSurfaceFormatKHR.getAtIndex(pFormats, i);
                    formats[i] = new VkSurfaceFormatKHR(propertiesArena);
                    formats[i].ptr().copyFrom(format.ptr());
                }

                MemorySegment pModeCount = arena.allocate(JAVA_INT);
                VulkanException.check(vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice.handle(), this.m_surface, pModeCount, NULL));
                int modeCount = pModeCount.get(JAVA_INT, 0);
                presentModes = new int[modeCount];
                MemorySegment pPresentModes = arena.allocate(JAVA_INT, modeCount);
                VulkanException.check(vkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice.handle(), this.m_surface, pModeCount, pPresentModes));
                for (int i = 0; i < modeCount; i++)
                {
                    presentModes[i] = pPresentModes.getAtIndex(JAVA_INT, i);
                }

                this.m_physicalDeviceSurfaceProperties = new PhysicalDeviceSurfaceProperties(capabilities, formats, presentModes);
            }
        });
    }

    @Override
    public void dispose()
    {
        this.m_physicalDeviceSurfaceProperties = null;
        vkDestroySurfaceKHR(this.instance(), this.m_surface, NULL);
        super.dispose();
    }
}
