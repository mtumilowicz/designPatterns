package creational.abstractFactory.widget.platform.ms.factory;

import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.platform.ms.button.MSButton;
import creational.abstractFactory.widget.factory.WidgetFactory;
import creational.abstractFactory.widget.platform.ms.window.MSWindow;
import creational.abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public final class MsWindowsWidgetFactory implements WidgetFactory {
    
    @Override
    public Window createWindow(){
        return new MSWindow();
    }

    @Override
    public Button createButton() {
        return new MSButton();
    }
}
