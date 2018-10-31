package mycoding.funcs.chain;

public interface Converter {

    public void setNextConverter(Converter converter);

    public int convert(int amount, String currency);

}
