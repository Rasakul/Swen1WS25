package solid.dip;

public class OrderService {
    private OrderRepository repository;

    public void inject(OrderRepository repository) {
        this.repository = repository;
    }

    public void placeOrder(String order) {
        System.out.println("Placing order: " + order);
        repository.saveOrder(order);
    }
}
