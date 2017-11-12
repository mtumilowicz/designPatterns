package creational.abstractFactory;

import creational.abstractFactory.widget.PlatformDependentWidgetProducer;
import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.platform.Platform;
import creational.abstractFactory.widget.platform.mac.button.MacOSXButton;
import creational.abstractFactory.widget.platform.mac.window.MacOSXWindow;
import creational.abstractFactory.widget.platform.ms.button.MSButton;
import creational.abstractFactory.widget.platform.ms.window.MSWindow;
import creational.abstractFactory.widget.window.Window;
import com.sun.javafx.PlatformUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PlatformUtil.class)
public class PlatformDependentWidgetProducerTest {

    @Before
    public void setUp() {
        PowerMockito.mockStatic(PlatformUtil.class);
    }
    
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

    @Test
    public void MSPlatform_window() {
        PowerMockito.when(PlatformUtil.isWindows()).thenReturn(true);
        Window window = PlatformDependentWidgetProducer.window();
        assertEquals(MSWindow.class, window.getClass());
    }

    @Test
    public void MSPlatform_button() {
        PowerMockito.when(PlatformUtil.isWindows()).thenReturn(true);
        Button button = PlatformDependentWidgetProducer.button(Platform.MS);
        assertEquals(MSButton.class, button.getClass());
    }

    @Test
    public void MacOSXPlatform_window() {
        PowerMockito.when(PlatformUtil.isMac()).thenReturn(true);
        Window window = PlatformDependentWidgetProducer.window();
        assertEquals(MacOSXWindow.class, window.getClass());
    }

    @Test
    public void MacOSXPlatform_button() {
        PowerMockito.when(PlatformUtil.isMac()).thenReturn(true);
        Button button = PlatformDependentWidgetProducer.button();
        assertEquals(MacOSXButton.class, button.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void NotSupportedPlatform_button() {
        PlatformDependentWidgetProducer.button();
    }

    @Test(expected = IllegalStateException.class)
    public void NotSupportedPlatform_window() {
        PlatformDependentWidgetProducer.window();
    }
}
