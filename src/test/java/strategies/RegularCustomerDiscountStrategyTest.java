package strategies;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RegularCustomerDiscountStrategyTest {

    @Test
    public void testApplyDiscountForRegularCustomer() {
        DiscountStrategy discountStrategy = new RegularCustomerDiscountStrategy();

        Assert.assertEquals(Integer.valueOf(100), discountStrategy.applyDiscount(100));
        Assert.assertEquals(Integer.valueOf(7200), discountStrategy.applyDiscount(8000));
        Assert.assertEquals(Integer.valueOf(9600), discountStrategy.applyDiscount(12000));
    }

}