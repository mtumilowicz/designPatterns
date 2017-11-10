package abstractFactory;

import abstractFactory.widget.PlatformDependentWidgetProducer;
import abstractFactory.widget.button.Button;
import abstractFactory.widget.platform.Platform;
import abstractFactory.widget.platform.mac.button.MacOSXButton;
import abstractFactory.widget.platform.mac.window.MacOSXWindow;
import abstractFactory.widget.platform.ms.button.MSButton;
import abstractFactory.widget.platform.ms.window.MSWindow;
import abstractFactory.widget.window.Window;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class PlatformDependentWidgetProducerTest {
    
    @Test
    public void MacOSX_Window() {
        Window window = PlatformDependentWidgetProducer.window(Platform.MAC);
        assertEquals(MacOSXWindow.class, window.getClass());
    }

    @Test
    public void MacOSX_Button() {
        Button button = PlatformDependentWidgetProducer.button(Platform.MAC);
        assertEquals(MacOSXButton.class, button.getClass());
    }
    
    @Test
    public void MS_Window() {
        Window window = PlatformDependentWidgetProducer.window(Platform.MS);
        assertEquals(MSWindow.class, window.getClass());
    }

    @Test
    public void MS_Button() {
        Button button = PlatformDependentWidgetProducer.button(Platform.MS);
        assertEquals(MSButton.class, button.getClass());
    }
}
