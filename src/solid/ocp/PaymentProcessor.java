package solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {

    private Map<String, PaymentType> paymentTypes;

    public PaymentProcessor() {
        paymentTypes = new HashMap<>();
        paymentTypes.put("BANK_TRANSFER", new BankTransferPaymentType());
    }

    public void processPayment(String paymentType, double amount) {

        paymentTypes.get(paymentType).processPayment(amount);

//        if (paymentType.equals("CREDIT_CARD")) {
//            System.out.println("Processing credit card payment: " + amount);
//            // credit card code
//        } else if (paymentType.equals("PAYPAL")) {
//            System.out.println("Processing PayPal payment: " + amount);
//            // PayPal processing
//        } else if (paymentType.equals("BANK_TRANSFER")) {
//            System.out.println("Processing bank transfer: " + amount);
//            // bank code
//        } else {
//            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
//        }
    }
}

