package yionos.demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import yionos.demo.app.DemoApplication;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.samples.*;

import java.util.function.Function;

public final class Main
{private Main() {}

    static
    {
        System.loadLibrary("vulkan-1");

        System.loadLibrary("assimp-5");
        System.loadLibrary("glfw3");
        System.loadLibrary("nuklear");
        System.loadLibrary("stb_image");
        System.loadLibrary("vma");

        configureLog4j();
    }

    public static void configureLog4j()
    {
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

        builder.setConfigurationName("jpgen-log4j-logger");
        builder.setStatusLevel(Level.WARN);

        builder.add(builder.newAppender("Console", "CONSOLE")
                .addAttribute("target", ConsoleAppender.Target.SYSTEM_OUT)
                .add(builder.newLayout("PatternLayout")
                        .addAttribute("disableAnsi", false)
                        .addAttribute("pattern", "%highlight{%c | [%d] - %msg%n}{FATAL=red blink, ERROR=red, WARN=yellow bold, INFO=green, DEBUG=green bold, TRACE=blue}")));

        builder.add(builder.newRootLogger(Level.ALL)
                .add(builder.newAppenderRef("Console")));

        Configurator.reconfigure(builder.build());
    }

    private static DemoSample.Supplier makeSampleSupplier(String name, Function<VulkanRenderer, DemoSample> supplyFunction)
    {
        return new DemoSample.Supplier()
        {
            @Override
            public String identifier()
            {
                return name;
            }

            @Override
            public DemoSample get(VulkanRenderer renderer)
            {
                return supplyFunction.apply(renderer);
            }
        };
    }

    public static void main(String... args)
    {
        ProgramArguments parsedArgs = new ProgramArguments(args);

        int windowWidth = parsedArgs.getArgValueIndexed("wnd_dimensions", 0).map(Integer::parseUnsignedInt).orElse(1706);
        int windowHeight = parsedArgs.getArgValueIndexed("wnd_dimensions", 1).map(Integer::parseUnsignedInt).orElse(960);

        int sampleCount = parsedArgs.getArgValueIndexed("sample_count", 0).map(Integer::parseUnsignedInt).orElse(1);

        DemoSample.Supplier[] samples = new DemoSample.Supplier[] {
                makeSampleSupplier("Sphere stack", SphereStackSample::new),
                makeSampleSupplier("MPR test", MPRSample::new),
                makeSampleSupplier("Collision dispatcher", CollisionDispatcherSample::new),
                makeSampleSupplier("Instancing test", InstancingSample::new)
        };

        WindowProcessor window = new WindowProcessor("yionos", windowWidth, windowHeight);
        DemoApplication app = new DemoApplication(window, sampleCount, samples, samples[0]);

        app.run();

        WindowProcessor.terminateGlfw();
    }
}
