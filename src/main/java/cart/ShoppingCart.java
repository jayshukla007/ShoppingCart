package cart;

import domain.Item;
import processor.DiscountProcessor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;
    DiscountProcessor discountProcessor;

    public List<Item> getItems() {
        return items;
    }

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public ShoppingCart(DiscountProcessor discountProcessor) {
        this.items = new ArrayList<>();
        this.discountProcessor = discountProcessor;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return discountProcessor.applyDiscount(sum);
    }

}
