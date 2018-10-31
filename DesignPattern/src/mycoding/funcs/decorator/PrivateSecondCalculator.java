package mycoding.funcs.decorator;

public class PrivateSecondCalculator implements SecondCalculator {

    public PrivateSecondCalculator() {
    }

    @Override
    public int getTotal() {
        return 2000;
    }

}
