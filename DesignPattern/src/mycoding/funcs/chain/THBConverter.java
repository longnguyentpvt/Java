package mycoding.funcs.chain;

public class THBConverter  implements Converter {

    private Converter nextConverter;

    public THBConverter() {
    }

    @Override
    public void setNextConverter(Converter converter) {
        this.nextConverter = converter;
    }

    @Override
    public int convert(int amount, String currency) {
        if (currency.equals("THB")) {
            return amount * 4;
        } else if (this.nextConverter != null) {
            return this.nextConverter.convert(amount, currency);
        }
        return 0;
    }
}
