public class BonusDecorator extends CartDecorator{
    BonusDecorator(Cart cart) {
        super(cart);
    }

    public boolean ship(){
        cart.bonus_cash += 15;
        System.out.println("Congrats!! You got a bonus gift. Contact our manager at www.magaz.com for more info");
        return true;
    }
}
