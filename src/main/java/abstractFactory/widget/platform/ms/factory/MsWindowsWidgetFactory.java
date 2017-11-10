package abstractFactory.widget.platform.ms.factory;

import abstractFactory.widget.button.Button;
import abstractFactory.widget.platform.ms.button.MSButton;
import abstractFactory.widget.factory.AbstractWidgetFactory;
import abstractFactory.widget.platform.ms.window.MSWindow;
import abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow(){
        return new MSWindow();
    }

    @Override
    public Button createButton() {
        return new MSButton();
    }
}
