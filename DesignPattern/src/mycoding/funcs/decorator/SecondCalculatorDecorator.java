package mycoding.funcs.decorator;

public abstract class SecondCalculatorDecorator implements SecondCalculator {

    private final SecondCalculator secondCalculator;

    public SecondCalculatorDecorator(SecondCalculator secondCalculator) {
        this.secondCalculator = secondCalculator;
    }

    public SecondCalculator getSecondCalculator() {
        return this.secondCalculator;
    }
}
