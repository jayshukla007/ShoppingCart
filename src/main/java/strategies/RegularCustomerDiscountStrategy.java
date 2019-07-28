package strategies;

public class RegularCustomerDiscountStrategy implements DiscountStrategy {

    public Integer applyDiscount(Integer totalAmount) {

        if (totalAmount > 5000 && totalAmount <= 10000) {
            return totalAmount - getDiscountedAmount(totalAmount, 10);
        } else if (totalAmount > 10000) {
            return totalAmount - getDiscountedAmount(totalAmount, 20);
        } else {
            return totalAmount;
        }

    }

    private int getDiscountedAmount(Integer totalAmount, int percent) {
        return totalAmount * percent / 100;
    }
}
