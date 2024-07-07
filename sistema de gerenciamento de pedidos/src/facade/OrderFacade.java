package facade;
import singleton.OrderManager;
import strategy.PaymentContext;
import strategy.PaymentStrategy;


// Facade Pattern
public class OrderFacade {
    private OrderManager orderManager;
    private PaymentContext paymentContext;

    public OrderFacade() {
        orderManager = OrderManager.getInstance();
    }

    public void placeOrderAndPay(String item, PaymentStrategy paymentStrategy) {
        orderManager.placeOrder(item);
        paymentContext = new PaymentContext(paymentStrategy);
        paymentContext.executePayment(100.0); // Assuming total amount to pay
    }
}