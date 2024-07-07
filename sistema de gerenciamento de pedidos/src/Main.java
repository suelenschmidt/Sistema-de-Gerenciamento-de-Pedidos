import facade.OrderFacade;
import singleton.OrderManager;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;
import strategy.PaymentContext;
import strategy.PaymentStrategy;
public class Main {
    public static void main(String[] args) {
        // Singleton Example
        OrderManager orderManager = OrderManager.getInstance();
        orderManager.placeOrder("Smartphone");

        // Strategy Example
        PaymentStrategy creditCardStrategy = new CreditCardPayment("1234567890123456", "12/25");
        PaymentStrategy payPalStrategy = new PayPalPayment("user@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCardStrategy);
        paymentContext.executePayment(500.0);

        paymentContext = new PaymentContext(payPalStrategy);
        paymentContext.executePayment(200.0);

        // Facade Example
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrderAndPay("Laptop", creditCardStrategy);
    }
}
