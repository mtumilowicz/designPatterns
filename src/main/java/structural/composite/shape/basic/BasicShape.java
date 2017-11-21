package structural.composite.shape.basic;

import structural.composite.shape.Shape;

import java.util.Collections;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class BasicShape implements Shape {
    
    private final BasicShapeType type;

    BasicShape(BasicShapeType type) {
        this.type = type;
    }
    
    public BasicShapeType getType() {
        return type;
    }

    @Override
    public List<BasicShape> decompose() {
        return Collections.singletonList(this);
    }
}
