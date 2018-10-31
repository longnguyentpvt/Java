package mycoding.funcs.abstractfactory;

public class MediaFactory implements ConverterFactory {

    private final static String MP4_TYPE = "mp4";
    private final static String FLAC_TYPE = "flac";

    @Override
    public MediaConverter parse(String parseType) {
        switch (parseType) {
            case MP4_TYPE:
                return new Mp4Converter();
            case FLAC_TYPE:
                return new FlacConverter();
            default:
                return null;
        }
    }

}
