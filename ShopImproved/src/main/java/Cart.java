import java.util.ArrayList;

public class Cart {
    ArrayList<Game> games;
    PaymentStategy paymentStategy;
    DeliveryStrategy deliveryStrategy;
    double total_price;
    double bonus_cash;
    Cart(ArrayList<Game> games, PaymentStategy paymentStategy, DeliveryStrategy deliveryStrategy){
        this.games = games;
        this.paymentStategy = paymentStategy;
        this. deliveryStrategy = deliveryStrategy;
        this.bonus_cash = 0;
    }
    public boolean ship(){
        if(this.bonus_cash > 0) {
            System.out.println("Congrats!! You got a bonus gift. Contact our manager at www.magaz.com for more info");
            return true;
        }
        System.out.println("You have no gifts(");
        return false;
    }
    public double computeTotalPrice(){
        double total = 0;
        for(Game i: games){
            total += i.get_price();
        }
        this.total_price = total;
        return total;
    }
    public boolean getPayment(double money){
        if (money == total_price){
            paymentStategy.pay(money);
            return true;
        }
        return false;
    }
    public boolean getDelivery(double money){
        if (money == total_price){
            deliveryStrategy.deliver(games);
            return true;
        }
        return false;
    }

}
