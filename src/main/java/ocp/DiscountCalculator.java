package ocp;

import ocp.discount.DiscountStrategy;

public class DiscountCalculator {

    public double applyDiscount(double amount, DiscountStrategy discountStrategy) {
        return discountStrategy.calculateDiscount(amount);
    }
}
