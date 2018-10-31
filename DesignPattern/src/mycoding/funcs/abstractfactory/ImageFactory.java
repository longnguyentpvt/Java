package mycoding.funcs.abstractfactory;

public class ImageFactory implements ConverterFactory {

    private final static String PNG_TYPE = "png";
    private final static String JPG_TYPE = "jpg";

    @Override
    public MediaConverter parse(String parseType) {
        switch (parseType) {
            case PNG_TYPE:
                return new PngConverter();
            case JPG_TYPE:
                return new JpgConverter();
            default:
                return null;
        }
    }
}
