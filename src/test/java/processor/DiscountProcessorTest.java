package processor;

import constants.Constants;
import domain.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DiscountProcessorTest {
    Integer totalAmount = 8000;

    @Test
    public void testApplyDiscountForPremiumCustomer() {
        Customer premiumCustomer = new Customer(1, "Jay", Constants.PREMIUM_CUSTOMER);
        DiscountProcessor discountProcessor = new DiscountProcessor(premiumCustomer);

        Assert.assertEquals(Integer.valueOf(6800), discountProcessor.applyDiscount(totalAmount));

    }

    @Test
    public void testApplyDiscountForRegularCustomer() {
        Customer premiumCustomer = new Customer(1, "Jay", Constants.REGULAR_CUSTOMER);
        DiscountProcessor discountProcessor = new DiscountProcessor(premiumCustomer);

        Assert.assertEquals(Integer.valueOf(7200), discountProcessor.applyDiscount(totalAmount));

    }

}