package strategies;

        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PremiumCustomerDiscountStrategyTest {


    @Test
    public void testApplyDiscountForPremiumCustomer() {
        DiscountStrategy discountStrategy = new PremiumCustomerDiscountStrategy();

        Assert.assertEquals(Integer.valueOf(90), discountStrategy.applyDiscount(100));
        Assert.assertEquals(Integer.valueOf(6800), discountStrategy.applyDiscount(8000));
        Assert.assertEquals(Integer.valueOf(9600), discountStrategy.applyDiscount(12000));
        Assert.assertEquals(Integer.valueOf(10500), discountStrategy.applyDiscount(15000));

    }
}