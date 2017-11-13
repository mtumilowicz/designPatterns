package structural.decorator;

import java.math.BigDecimal;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class LuxuryCar extends CarDecorator {
    
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(BigDecimal.valueOf(2));
    }
}
