package mycoding.main;

import mycoding.funcs.abstractfactory.*;
import mycoding.funcs.adapter.AdapterCalculator;
import mycoding.funcs.adapter.MyCodingFirstCalculator;
import mycoding.funcs.adapter.MyCodingCalculatorAdapter;
import mycoding.funcs.chain.ConverterChain;
import mycoding.funcs.decorator.CurrencySecondCalculator;
import mycoding.funcs.decorator.PrivateSecondCalculator;
import mycoding.funcs.decorator.PublicSecondCalculator;
import mycoding.funcs.decorator.SecondCalculator;
import mycoding.funcs.observer.CartItem;
import mycoding.funcs.observer.OnlineCart;
import mycoding.funcs.strategry.CreditCardPayment;
import mycoding.funcs.strategry.PaypalPayment;
import mycoding.funcs.strategry.StrategyCart;
import mycoding.funcs.template.CoverProcessing;
import mycoding.funcs.template.ImageProcessing;
import mycoding.funcs.template.MyImage;
import mycoding.funcs.template.ThumbnailProcessing;

import java.util.Collections;

public class DesignPattern {

    public static void main(String args[]) {
        System.out.println("---- Abstract Factory ----");
        MediaFile imgFile = new ImageFile();
        ConverterFactory converterFac = ConverterFactoryProducer.getConverterFactory(imgFile);
        MediaConverter converter = converterFac.parse("png");
        converter.convert(imgFile);
        System.out.println(imgFile);

        MediaFile vdoFile = new VideoFile();
        converterFac = ConverterFactoryProducer.getConverterFactory(vdoFile);
        converter = converterFac.parse("mp4");
        converter.convert(vdoFile);
        System.out.println(vdoFile);

        System.out.println("---- Adapter ----");
        MyCodingFirstCalculator oldCalculator = new MyCodingFirstCalculator(1000);
        AdapterCalculator newCalcualtor = new MyCodingCalculatorAdapter(oldCalculator, "THB");
        long thb = newCalcualtor.getTotalInTHB();
        long usd = newCalcualtor.getTotalInUSD();
        System.out.println("thb " + thb);
        System.out.println("usd " + usd);

        System.out.println("---- Decorator Pattern ----");
        SecondCalculator pvPackage = new PrivateSecondCalculator();
        SecondCalculator pbPackage = new PublicSecondCalculator();

        pvPackage = new CurrencySecondCalculator(pvPackage, "THB");
        pbPackage = new CurrencySecondCalculator(pbPackage, "USD");
        System.out.println("thb " + pvPackage.getTotal());
        System.out.println("usd " + pbPackage.getTotal());

        System.out.println("---- Chain Of Responsibility Pattern ----");
        ConverterChain chain = new ConverterChain(200, "EUR");
        System.out.println("eur " + chain.convert());

        System.out.println("---- Observer Pattern ----");
        OnlineCart cart = new OnlineCart();
        CartItem shirt = new CartItem(100);
        CartItem hat = new CartItem(70);
        cart.addItem(shirt);
        cart.addItem(hat);
        cart.setDiscountCode(30);
        System.out.println("total " + cart.getTotal());

        System.out.println("---- Strategy Pattern ----");
        StrategyCart strCart = new StrategyCart(2000);
        strCart.pay(new CreditCardPayment("Long Nguyen", "5555555555554444", "304", 1507309200000l));
        strCart.pay(new PaypalPayment());

        System.out.println("---- Template Pattern ----");
        MyImage cover = new MyImage();
        ImageProcessing coverProcessing = new CoverProcessing(cover);
        coverProcessing.process();
        System.out.println(cover);
        MyImage thumb = new MyImage();
        ImageProcessing thumbProcessing = new ThumbnailProcessing(thumb);
        thumbProcessing.process();
        System.out.println(thumb);
    }

}
