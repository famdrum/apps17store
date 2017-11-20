import java.util.ArrayList;

abstract interface DeliveryStrategy {
    boolean deliver(ArrayList<Game> games);
}
