package creational.factoryMethod.shape;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public abstract class AbstractShape implements Shape {
    private final ShapeType type;

    AbstractShape(ShapeType type) {
        this.type = type;
    }

    @Override
    public ShapeType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractShape)) return false;
        AbstractShape that = (AbstractShape) o;
        return type == that.type;
    }
}
