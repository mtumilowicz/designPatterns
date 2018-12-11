package creational.abstractFactory.widget;

import creational.abstractFactory.widget.builder.GUIBuilder;
import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.factory.WidgetFactory;
import creational.abstractFactory.widget.platform.Platform;
import creational.abstractFactory.widget.platform.mac.factory.MacOSXWidgetFactory;
import creational.abstractFactory.widget.platform.ms.factory.MsWindowsWidgetFactory;
import creational.abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public final class PlatformDependentWidgetProducer {

    private final GUIBuilder builder = new GUIBuilder();
    private final WidgetFactory widgetFactory;

    public PlatformDependentWidgetProducer(Platform platform) {
        this.widgetFactory = getPlatformDesignedFactory(platform);
    }

    public Window window() {
        return builder.buildWindow(widgetFactory);
    }

    public Button button() {
        return builder.buildButton(widgetFactory);
    }

    private static WidgetFactory getPlatformDesignedFactory(Platform platform) {
        WidgetFactory widgetFactory;

        switch (platform) {
            case MS:
                widgetFactory = new MsWindowsWidgetFactory();
                break;
            case MAC:
                widgetFactory = new MacOSXWidgetFactory();
                break;
            default:
                throw new IllegalArgumentException("Platform not supported: " + platform);
        }

        return widgetFactory;
    }
}
