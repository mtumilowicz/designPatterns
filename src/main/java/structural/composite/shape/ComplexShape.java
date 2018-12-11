package structural.composite.shape;

import com.google.common.base.Preconditions;
import structural.composite.shape.basic.BasicShape;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-11-12.
 */
public class ComplexShape implements Shape {
    
    private final List<Shape> constituents = new LinkedList<>();
    
    public void addConstituent(Shape shape) {
        Preconditions.checkArgument(shape != null);
        constituents.add(shape);
    }
    
    @Override
    public List<BasicShape> decompose() {
        return constituents
                .stream()
                .map(Shape::decompose)
                .collect(Collectors.toList())
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
