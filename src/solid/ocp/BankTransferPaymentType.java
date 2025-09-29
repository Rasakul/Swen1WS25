package solid.ocp;

public class BankTransferPaymentType extends PaymentType {

    public BankTransferPaymentType() {
        super("BANK_TRANSFER");
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing BANK_TRANSFER payment");
        return true;
    }
}
