package structural.decorator;

import java.math.BigDecimal;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class SportsCar extends CarDecorator {
    
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(BigDecimal.valueOf(0.5));
    }
}
