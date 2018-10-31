package mycoding.funcs.abstractfactory;

public final class ConverterFactoryProducer {


    public static ConverterFactory getConverterFactory(MediaFile file) {
        String mediaType = file.getMediaType();
        switch (mediaType) {
            case "img" :
                return new ImageFactory();
            case "vdo" :
                return new MediaFactory();
        }
        return null;
    }
}
