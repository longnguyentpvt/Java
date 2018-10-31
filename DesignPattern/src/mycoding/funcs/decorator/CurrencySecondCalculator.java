package mycoding.funcs.decorator;

public class CurrencySecondCalculator extends SecondCalculatorDecorator {

    private String currency;

    public CurrencySecondCalculator(SecondCalculator secondCalculator, String currency) {
        super(secondCalculator);
        this.currency = currency;
    }

    @Override
    public int getTotal() {
        SecondCalculator secondCalculator = super.getSecondCalculator();
        int total = secondCalculator.getTotal();
        switch (currency) {
            case "THB":
                total *= 3;
                break;
            case "USD":
                total *= 10;
                break;
        }
        return total;
    }

}
