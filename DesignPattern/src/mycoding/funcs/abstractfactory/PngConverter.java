package mycoding.funcs.abstractfactory;

public class PngConverter implements MediaConverter {

    @Override
    public void convert(MediaFile file) {
        file.setFileType("png");
    }
}
