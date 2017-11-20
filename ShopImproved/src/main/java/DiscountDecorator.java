public class DiscountDecorator extends CartDecorator {
    DiscountDecorator(Cart cart) {
        super(cart);
    }
    public double computeTotalPrice(){
        System.out.println("You got a discount! Congrats!! Contact our manager at www.magaz.com for more info");
        cart.total_price = cart.computeTotalPrice() * 0.9;
        return cart.total_price;
    }
}
