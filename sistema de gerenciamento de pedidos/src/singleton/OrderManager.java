package singleton;
// Singleton Pattern
public class OrderManager {
    private static OrderManager instance;

    private OrderManager() {} // Private constructor to prevent instantiation outside

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void placeOrder(String item) {
        System.out.println("Order placed for: " + item);
    }
}