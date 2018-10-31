package mycoding.funcs.strategry;

public class StrategyCart {
    private int total;

    public StrategyCart(int total) {
        this.total = total;
    }

    public String pay(PaymentStrategy strategy) {
        String redirectLink = strategy.pay(total);
        return redirectLink;
    }
}
