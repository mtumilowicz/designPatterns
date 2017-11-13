package structural.decorator;

import java.math.BigDecimal;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class BasicCar implements Car {
    private final BigDecimal price = BigDecimal.ONE;
    
    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
