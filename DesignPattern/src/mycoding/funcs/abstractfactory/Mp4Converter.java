package mycoding.funcs.abstractfactory;

public class Mp4Converter implements MediaConverter {

    @Override
    public void convert(MediaFile file) {
        file.setFileType("mp4");
    }
}
