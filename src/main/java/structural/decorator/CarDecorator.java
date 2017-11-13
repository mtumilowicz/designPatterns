package structural.decorator;

import java.math.BigDecimal;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public abstract class CarDecorator implements Car {
    
    private final Car car;

    CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public BigDecimal getPrice() {
        return car.getPrice();
    }
}
