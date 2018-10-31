package mycoding.funcs.adapter;

public class MyCodingFirstCalculator implements FirstCalculator {

    private int money;

    public MyCodingFirstCalculator(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getTotal() {
        return money;
    }
}
