package abstractFactory.widget.window;

import abstractFactory.widget.button.Button;

/**
 * Created by mtumilowicz on 2017-11-10.
 */
public abstract class Window {
    protected Button button;

    public void setButton(Button button) {
        this.button = button;
    }
}
