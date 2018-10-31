package mycoding.funcs.strategry;

public class PaypalPayment implements PaymentStrategy {

    private static final String REDIRECT_LINK = "https://paypal.com";

    public PaypalPayment(){}

    @Override
    public String pay(int amount) {
        System.out.println("Set up Redirect Link to Third Party for Paypal!");
        String link = REDIRECT_LINK + "?am=" + amount;
        return link;
    }
}
