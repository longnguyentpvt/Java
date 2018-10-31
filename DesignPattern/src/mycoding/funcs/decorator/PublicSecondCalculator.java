package mycoding.funcs.decorator;

public class PublicSecondCalculator implements SecondCalculator {

    public PublicSecondCalculator() {}

    @Override
    public int getTotal() {
        return 1000;
    }

}
