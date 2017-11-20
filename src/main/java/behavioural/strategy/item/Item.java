package behavioural.strategy.item;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class Item {
    
    private final String code;
    private final int price;


    public Item(String code, int price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }
}
