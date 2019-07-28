import cart.ShoppingCart;

import constants.Constants;
import domain.Customer;
import domain.Item;
import processor.DiscountProcessor;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------Premium Customer--------------- ");

        Customer customer1 = new Customer(1, "PremiumCustomer", Constants.PREMIUM_CUSTOMER);

        DiscountProcessor discountProcessor = new DiscountProcessor(customer1);
        ShoppingCart cart = new ShoppingCart(discountProcessor);

        Item item1 = new Item("1234",8000);

        cart.addItem(item1);


        System.out.println("Total amount after discount : " + cart.calculateTotal());

        System.out.println("\n");
 // -------------------------------------------------------------------------------------------------------------------------

        System.out.println("-------------Regular Customer--------------- ");

        Customer customer2 = new Customer(2, "RegularCustomer", Constants.REGULAR_CUSTOMER);

        DiscountProcessor discountProcessor2 = new DiscountProcessor(customer2);
        ShoppingCart cart2 = new ShoppingCart(discountProcessor2);

        Item item2 = new Item("1235",8000);

        cart2.addItem(item2);


        System.out.println("Total amount after discount : " + cart2.calculateTotal());

    }
}
