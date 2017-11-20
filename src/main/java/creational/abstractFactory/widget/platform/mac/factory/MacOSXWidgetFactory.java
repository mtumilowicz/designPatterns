package creational.abstractFactory.widget.platform.mac.factory;

import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.factory.AbstractWidgetFactory;
import creational.abstractFactory.widget.platform.mac.button.MacOSXButton;
import creational.abstractFactory.widget.platform.mac.window.MacOSXWindow;
import creational.abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public final class MacOSXWidgetFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow(){
        return new MacOSXWindow();
    }

    @Override
    public Button createButton() {
        return new MacOSXButton();
    }
}
