package creational.factoryMethod.shape;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public abstract class Shape {
    private final ShapeType type;

    Shape(ShapeType type) {
        this.type = type;
    }
    
    public ShapeType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape that = (Shape) o;
        return type == that.type;
    }
}
