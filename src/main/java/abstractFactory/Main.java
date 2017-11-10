package abstractFactory;

import abstractFactory.widget.builder.GUIBuilder;
import abstractFactory.widget.factory.AbstractWidgetFactory;
import abstractFactory.widget.platform.mac.factory.MacOSXWidgetFactory;
import abstractFactory.widget.platform.ms.factory.MsWindowsWidgetFactory;
import abstractFactory.widget.window.Window;
import org.apache.commons.lang3.SystemUtils;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public class Main {
    public static void main(String[] args) {
        GUIBuilder builder = new GUIBuilder();
        AbstractWidgetFactory widgetFactory = null;
        if(SystemUtils.IS_OS_MAC){
            widgetFactory  = new MacOSXWidgetFactory();
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            widgetFactory  = new MsWindowsWidgetFactory();
        }

        Window window = builder.buildWindow(widgetFactory);
        window.setButton(builder.buildButton(widgetFactory));
        System.out.println(window);
    }
}
