package creational.abstractFactory;

import creational.abstractFactory.widget.PlatformDependentWidgetProducer;
import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.platform.Platform;
import creational.abstractFactory.widget.platform.mac.button.MacOSXButton;
import creational.abstractFactory.widget.platform.mac.window.MacOSXWindow;
import creational.abstractFactory.widget.platform.ms.button.MSButton;
import creational.abstractFactory.widget.platform.ms.window.MSWindow;
import creational.abstractFactory.widget.window.Window;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class PlatformDependentWidgetProducerTest {

    private final PlatformDependentWidgetProducer forMs =
            PlatformDependentWidgetProducer.getPlatformDesignedFactory(Platform.MS);
    private final PlatformDependentWidgetProducer forMac =
            PlatformDependentWidgetProducer.getPlatformDesignedFactory(Platform.MAC);

    @Test
    public void MSPlatform_window() {
        Window window = forMs.window();
        assertEquals(MSWindow.class, window.getClass());
    }

    @Test
    public void MSPlatform_button() {
        Button button = forMs.button();
        assertEquals(MSButton.class, button.getClass());
    }

    @Test
    public void MacOSXPlatform_window() {
        Window window = forMac.window();
        assertEquals(MacOSXWindow.class, window.getClass());
    }

    @Test
    public void MacOSXPlatform_button() {
        Button button = forMac.button();
        assertEquals(MacOSXButton.class, button.getClass());
    }
}
