package processor;

import constants.Constants;
import domain.Customer;
import strategies.PremiumCustomerDiscountStrategy;
import strategies.RegularCustomerDiscountStrategy;

public class DiscountProcessor {
    Customer customer;
    Integer discountedTotal;

    public DiscountProcessor(Customer customer) {
        this.customer = customer;
    }

    public Integer applyDiscount(Integer amount){

        if(customer.getType().equalsIgnoreCase(Constants.PREMIUM_CUSTOMER))
           return   discountedTotal =  new PremiumCustomerDiscountStrategy().applyDiscount(amount);
        else
         return  discountedTotal= new RegularCustomerDiscountStrategy().applyDiscount(amount);

    }
}
