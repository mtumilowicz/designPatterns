package behavioural.strategy.shopping;

import behavioural.strategy.item.Item;
import behavioural.strategy.payment.Payment;
import behavioural.strategy.payment.PaymentType;
import org.apache.commons.collections4.ListUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
class ShoppingCart {
    
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    private int calculateTotal(){
        return ListUtils.emptyIfNull(items).stream().mapToInt(Item::getPrice).sum();
    }

    public PaymentType pay(Payment method){
        int amount = calculateTotal();
        return method.pay(amount);
    }
}
