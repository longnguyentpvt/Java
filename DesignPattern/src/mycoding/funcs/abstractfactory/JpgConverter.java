package mycoding.funcs.abstractfactory;

public class JpgConverter implements MediaConverter {

    @Override
    public void convert(MediaFile file) {
        file.setFileType("jpg");
    }
}
