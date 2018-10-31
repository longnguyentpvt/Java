package mycoding.funcs.chain;

public class USDConverter implements Converter {

    private Converter nextConverter;

    public USDConverter() {
    }

    @Override
    public void setNextConverter(Converter converter) {
        this.nextConverter = converter;
    }

    @Override
    public int convert(int amount, String currency) {
        if (currency.equals("USD")) {
            return amount * 3;
        } else if (this.nextConverter != null) {
            return this.nextConverter.convert(amount, currency);
        }
        return 0;
    }
}
