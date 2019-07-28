package cart;

import domain.Item;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import processor.DiscountProcessor;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartTest {

    @Mock
    DiscountProcessor discountProcessor;

    @InjectMocks
    ShoppingCart cart;


    @Test
    public void testCreateEmptyShoppingCart() {
        Assert.assertEquals(0, cart.getItems().size());
    }

    @Test
    public void testAddProductToShoppingCart() {
        when(discountProcessor.applyDiscount(anyInt())).thenReturn(7500);
        Item product = new Item("TV", 8000);
        cart.addItem(product);
        Assert.assertEquals(1, cart.getItems().size());
        Assert.assertEquals(7500, cart.calculateTotal(),0.0);
    }

    @Test
    public void testRemoveProductToShoppingCart() {

        ShoppingCart cart = new ShoppingCart();
        Item product = new Item("TV", 8000);
        cart.addItem(product);
        Assert.assertEquals(1, cart.getItems().size());

        cart.removeItem(product);
        Assert.assertEquals(0, cart.getItems().size());
    }

}