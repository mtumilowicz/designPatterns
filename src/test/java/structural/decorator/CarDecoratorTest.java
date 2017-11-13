package structural.decorator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-13.
 */
public class CarDecoratorTest {
    
    @Test
    public void basicCarPrice() {
        BigDecimal test = new BasicCar().getPrice();
        assertEquals(BigDecimal.ONE, test);
    }

    @Test
    public void luxuryCarPrice() {
        Car basicCar = new BasicCar();
        assertEquals(BigDecimal.valueOf(2), new LuxuryCar(basicCar).getPrice());
    }

    @Test
    public void sportsCarPrice() {
        Car basicCar = new BasicCar();
        assertEquals(BigDecimal.valueOf(1.5), new SportsCar(basicCar).getPrice());
    }

    @Test
    public void luxurySportsCarPrice() {
        Car basicCar = new BasicCar();
        assertEquals(BigDecimal.valueOf(3.0), new LuxuryCar(new SportsCar(basicCar)).getPrice());
    }

    @Test
    public void sportsLuxuryCarPrice() {
        Car basicCar = new BasicCar();
        assertEquals(BigDecimal.valueOf(2.5), new SportsCar(new LuxuryCar(basicCar)).getPrice());
    }
}
