package mycoding.funcs.template;

public class CoverProcessing extends ImageProcessing {

    private final static String COVER_IMG_TYPE = "jpg";
    private final static int IMG_WIDTH = 1920;
    private final static int IMG_HEIGHT = 580;

    public CoverProcessing(MyImage myImage) {
        super(myImage);
    }

    @Override
    public void convert(MyImage img) {
        img.setImgType(COVER_IMG_TYPE);
    }

    @Override
    public void resize(MyImage img) {
        img.setWidth(IMG_WIDTH);
        img.setHeight(IMG_HEIGHT);
    }

    @Override
    public void upload(MyImage img) {
        img.setUploadName("Cover");
    }

}
