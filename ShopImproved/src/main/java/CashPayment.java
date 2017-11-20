public class CashPayment implements PaymentStategy {
    public boolean pay(double price) {
        System.out.println("You paid: " + price + " with cash. Thanks! And have a great day");
        return true;
    }
}
