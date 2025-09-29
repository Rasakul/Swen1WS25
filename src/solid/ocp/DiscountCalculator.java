package solid.ocp;

public class DiscountCalculator {

    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("REGULAR")) {
            return price * 0.05;
        } else if (customerType.equals("PREMIUM")) {
            return price * 0.10;
        } else if (customerType.equals("VIP")) {
            return price * 0.20;
        } else {
            return 0.0;
        }
    }
}

