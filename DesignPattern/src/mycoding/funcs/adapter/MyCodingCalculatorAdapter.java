package mycoding.funcs.adapter;

public class MyCodingCalculatorAdapter implements AdapterCalculator {

    private MyCodingFirstCalculator oldCalculator;
    private String currency;

    public MyCodingCalculatorAdapter(MyCodingFirstCalculator oldCalculator, String currency) {
        this.oldCalculator = oldCalculator;
        this.currency = currency;
    }

    @Override
    public long getTotalInUSD() {
        return oldCalculator.getTotal() * 10;
    }

    @Override
    public long getTotalInTHB() {
        return oldCalculator.getTotal() * 100;
    }
}
