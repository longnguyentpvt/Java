package mycoding.funcs.chain;

public class EURConverter implements Converter {
    private Converter nextConverter;

    public EURConverter() {
    }

    @Override
    public void setNextConverter(Converter converter) {
        this.nextConverter = converter;
    }

    @Override
    public int convert(int amount, String currency) {
        if (currency.equals("EUR")) {
            return amount * 5;
        } else if (this.nextConverter != null) {
            return this.nextConverter.convert(amount, currency);
        }
        return 0;
    }
}
