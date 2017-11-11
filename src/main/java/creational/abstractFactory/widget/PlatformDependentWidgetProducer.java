package creational.abstractFactory.widget;

import creational.abstractFactory.widget.builder.GUIBuilder;
import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.factory.AbstractWidgetFactory;
import creational.abstractFactory.widget.platform.Platform;
import creational.abstractFactory.widget.platform.mac.factory.MacOSXWidgetFactory;
import creational.abstractFactory.widget.platform.ms.factory.MsWindowsWidgetFactory;
import creational.abstractFactory.widget.window.Window;
import com.google.common.base.Preconditions;
import com.sun.javafx.PlatformUtil;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public class PlatformDependentWidgetProducer {
    
    private static final GUIBuilder builder = new GUIBuilder();
    
    public static Window window() {
        Window window = null;
        if(PlatformUtil.isMac()){
            window = window(Platform.MAC);
        }
        if (PlatformUtil.isWindows()) {
            window = window(Platform.MS);
        }

        Preconditions.checkState(window != null, "Platform not supported!");

        return window;
    }

    public static Button button() {
        Button button = null;
        if(PlatformUtil.isMac()){
            button = button(Platform.MAC);
        }
        if (PlatformUtil.isWindows()) {
            button = button(Platform.MS);
        }

        Preconditions.checkState(button != null, "Platform not supported!");

        return button;
    }

    public static Window window(Platform platform) {
        return builder.buildWindow(getPlatformDesignedFactory(platform));
    }

    public static Button button(Platform platform) {
        return builder.buildButton(getPlatformDesignedFactory(platform));
    }
    
    private static AbstractWidgetFactory getPlatformDesignedFactory(Platform platform) {
        AbstractWidgetFactory widgetFactory;
        
        switch (platform) {
            case MS:
                widgetFactory  = new MsWindowsWidgetFactory();
                break;
            case MAC:
                widgetFactory  = new MacOSXWidgetFactory();
                break;
            default:
                throw new IllegalArgumentException("Platform not supported: " + platform);
        }
        
        return widgetFactory;
    }
}
