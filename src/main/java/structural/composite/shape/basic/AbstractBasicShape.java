package structural.composite.shape.basic;

import java.util.Collections;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class AbstractBasicShape implements BasicShape {
    
    private final BasicShapeType type;

    AbstractBasicShape(BasicShapeType type) {
        this.type = type;
    }

    @Override
    public BasicShapeType getType() {
        return type;
    }

    @Override
    public List<BasicShape> decompose() {
        return Collections.singletonList(this);
    }
}
