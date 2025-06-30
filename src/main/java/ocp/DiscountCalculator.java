package ocp;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        return switch (customerType) {
            case "regular" -> amount * 0.05;
            case "premium" -> amount * 0.10;
            case "vip" -> amount * 0.20;
            default -> 0;
        };
    }
}
