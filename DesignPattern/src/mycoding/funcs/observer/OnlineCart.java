package mycoding.funcs.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class OnlineCart extends Observable {

    private int discount;
    private List<CartItem> items;

    public OnlineCart() {
        this.discount = 0;
        items = new ArrayList<>();
    }

    public void setDiscountCode(int discount) {
        this.discount = discount;
        setChanged();
        notifyObservers(discount);
    }

    public void addItem(CartItem item) {
        items.add(item);
        this.addObserver(item);
    }

    public int getTotal() {
        int total = 0;
        for (CartItem item : this.items) {
            total += item.getPrice();
        }
        return total;
    }
}
