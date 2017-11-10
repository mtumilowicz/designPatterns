package abstractFactory.widget.factory;

import abstractFactory.widget.button.Button;
import abstractFactory.widget.window.Window;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public interface AbstractWidgetFactory {
    Window createWindow();
    Button createButton();
}
