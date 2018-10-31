package mycoding.funcs.strategry;

public class CreditCardPayment implements PaymentStrategy {

    private String holderName;
    private String cardNo;
    private String cvv;
    private long expiry;
    private static final String REDIRECT_LINK = "https://creditcard.com";

    public CreditCardPayment(String holderName, String cardNo, String cvv, long expiry) {
        this.holderName = holderName;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    @Override
    public String pay(int amount) {
        System.out.println("Set up Redirect Link to Third Party for Credit Card!");
        String link = REDIRECT_LINK + "?am=" + amount;
        return link;
    }
}
