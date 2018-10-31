package mycoding.funcs.abstractfactory;

public class FlacConverter implements MediaConverter {

    @Override
    public void convert(MediaFile file) {
        file.setFileType("flac");
    }
}
