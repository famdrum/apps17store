import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Test {
    public static void main(String[] args) {
        Game game = new Game("CS", 15, "shooter", "funny game");
        ArrayList<Game> games = new ArrayList<Game>();
        games.add(game);
        Privat24Payment privat = new Privat24Payment();
        DeliveryStrategy dhl = new DeliveryDHL();
        CashPayment cash = new CashPayment();
        DeliveryNovaPoshta nova = new DeliveryNovaPoshta();
        assertEquals(privat.pay(15), true);
        assertEquals(dhl.deliver(games), true);
        assertEquals(cash.pay(15), true);
        assertEquals(nova.deliver(games), true);
        Cart cart = new Cart(games, new Privat24Payment(), new DeliveryDHL());
        CartDecorator decor = new CartDecorator(cart);
        assertEquals((int)cart.computeTotalPrice(), (int)15);
        cart.getDelivery(cart.computeTotalPrice());
        assertEquals(cart.getDelivery(cart.computeTotalPrice()), true);
        assertEquals(cart.ship(), false);
        assertEquals(cart.getPayment(cart.computeTotalPrice()), true);
        System.out.println("");
        BonusDecorator bonus = new BonusDecorator(cart);
        DiscountDecorator discount = new DiscountDecorator(cart);
        assertEquals(bonus.ship(), true);
        assertEquals((int)cart.bonus_cash, (int)15);
        assertEquals((int)discount.computeTotalPrice(),(int)(15 * 0.9) );
        discount.computeTotalPrice();
        assertEquals((int)cart.total_price, (int)(15 * 0.9));
        assertEquals(game.get_description(), "funny game");
        assertEquals(game.get_genre(), "shooter");
        assertEquals(game.get_name(), "CS");
        assertEquals((int)game.get_price(), (int)15);
        assertEquals(bonus.cart, cart);
        assertEquals(bonus.ship(), true);
        assertEquals(discount.cart, cart);
        assertEquals((int)discount.computeTotalPrice(), (int)13);
        assertEquals((int)cart.total_price,(int) 13);
    }
}
