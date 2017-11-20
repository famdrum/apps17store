import java.util.ArrayList;

public class DeliveryDHL implements DeliveryStrategy {
    public boolean deliver(ArrayList<Game> games) {
        System.out.println("You've chosen DeliveryDHL. You will receive your package in a few days. Thanks for purchasing!");
        return true;
    }
}
