package structural.composite.shape;

import structural.composite.shape.basic.BasicShape;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public interface Shape {
    List<BasicShape> decompose();
}
