package strategies;

public class PremiumCustomerDiscountStrategy implements DiscountStrategy {

    public PremiumCustomerDiscountStrategy() {

    }

    public Integer applyDiscount(Integer totalAmount) {

        if (totalAmount <= 4000) {
            return totalAmount - getDiscountedAmount(totalAmount, 10);
        } else if (totalAmount <= 8000) {
            return totalAmount - getDiscountedAmount(totalAmount, 15);
        } else if (totalAmount <= 12000) {
            return totalAmount - getDiscountedAmount(totalAmount, 20);
        } else if (totalAmount > 12000) {
            return totalAmount - getDiscountedAmount(totalAmount, 30);
        } else {
            return totalAmount;
        }

    }

    private int getDiscountedAmount(Integer totalAmount, int percent) {
        return totalAmount * percent / 100;
    }
}
