package abstractFactory.widget.builder;

import abstractFactory.widget.button.Button;
import abstractFactory.widget.factory.AbstractWidgetFactory;
import abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public class GUIBuilder {
    public Window buildWindow(AbstractWidgetFactory widgetFactory){
        return widgetFactory.createWindow();
    }

    public Button buildButton(AbstractWidgetFactory widgetFactory){
        return widgetFactory.createButton();
    }
}