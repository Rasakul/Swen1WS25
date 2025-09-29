package solid.ocp;

public abstract class PaymentType {

    private String name;

    public PaymentType(String name) {
        this.name = name;
    }

    public boolean processPayment(double amount) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
