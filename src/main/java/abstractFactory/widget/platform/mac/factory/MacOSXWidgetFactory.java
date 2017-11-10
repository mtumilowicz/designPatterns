package abstractFactory.widget.platform.mac.factory;

import abstractFactory.widget.button.Button;
import abstractFactory.widget.factory.AbstractWidgetFactory;
import abstractFactory.widget.platform.mac.button.MacOSXButton;
import abstractFactory.widget.platform.mac.window.MacOSXWindow;
import abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow(){
        return new MacOSXWindow();
    }

    @Override
    public Button createButton() {
        return new MacOSXButton();
    }
}
