package solid.dip;

public class MySqlDatabase implements OrderRepository {
    public void saveOrder(String order) {
        System.out.println("Saving order to MySQL: " + order);
    }
}
