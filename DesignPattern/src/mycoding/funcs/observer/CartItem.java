package mycoding.funcs.observer;

import java.util.Observable;
import java.util.Observer;

public class CartItem implements Observer {

    private int price;
    private OnlineCart cart;

    public CartItem(int price) {
        this.price = price;
    }

    @Override
    public void update(Observable o, Object arg) {
        int discount = (int) arg;
        this.price =  this.price - discount;
    }

    public void setCart(OnlineCart cart) {
        this.cart = cart;
    }

    public int getPrice() {
        return price;
    }
}
