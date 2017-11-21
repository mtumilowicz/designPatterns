package creational.abstractFactory.widget.factory;

import creational.abstractFactory.widget.button.Button;
import creational.abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public interface WidgetFactory {
    Window createWindow();
    Button createButton();
}
