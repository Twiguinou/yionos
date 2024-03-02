package yionos.demo.app.samples;

import yionos.demo.app.Camera;
import yionos.demo.app.NuklearContext;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.WindowInputMap;

public interface DemoSample
{
    interface Supplier
    {
        String identifier();

        DemoSample get(VulkanRenderer renderer);
    }

    void initSimulation();

    void handleInputs(WindowInputMap inputs);

    void update();

    void render(Camera camera);

    void arrangeOverlay(NuklearContext context);

    void dispose();
}
