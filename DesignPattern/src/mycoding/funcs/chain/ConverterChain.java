package mycoding.funcs.chain;

public class ConverterChain {
    private int amount;
    private String currency;
    private USDConverter converter;

    public ConverterChain(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.converter = new USDConverter();
        THBConverter thbConverter = new THBConverter();
        EURConverter eurConverter = new EURConverter();
        this.converter.setNextConverter(thbConverter);
        thbConverter.setNextConverter(eurConverter);
    }

    public int convert() {
        return this.converter.convert(this.amount, this.currency);
    }
}
