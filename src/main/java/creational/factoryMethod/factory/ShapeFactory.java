package creational.factoryMethod.factory;

import com.google.common.base.Preconditions;
import creational.factoryMethod.shape.*;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public final class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape get(ShapeType type) {
        Preconditions.checkArgument(type != null);
        
        final Shape shape;
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            default:
                throw new IllegalStateException("Type not supported: " + type);
        }
        
        return shape;
    }
}
