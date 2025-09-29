package solid.dip;

public class Injector {

    private final OrderRepository orderRepository = new MySqlDatabase();
    private final OrderService orderService = new OrderService();

    public void injectDependencies() {

        orderService.inject(orderRepository);

    }

    public OrderService getOrderService() {
        return orderService;
    }

}
