public class Privat24Payment implements PaymentStategy{
    public boolean pay(double price) {
        System.out.println("You paid: " + price + " with Privat24. Thanks! And have a great day");
        return true;
    }
}
