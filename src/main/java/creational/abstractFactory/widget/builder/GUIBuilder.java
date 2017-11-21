package creational.abstractFactory.widget.builder;

import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.factory.WidgetFactory;
import creational.abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public class GUIBuilder {
    public Window buildWindow(WidgetFactory widgetFactory){
        return widgetFactory.createWindow();
    }

    public Button buildButton(WidgetFactory widgetFactory){
        return widgetFactory.createButton();
    }
}