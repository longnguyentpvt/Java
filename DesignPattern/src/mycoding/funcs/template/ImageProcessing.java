package mycoding.funcs.template;

public abstract class ImageProcessing {

    private MyImage myImage;

    public ImageProcessing (MyImage myImage) {
        this.myImage = myImage;
    }

    public abstract void convert(MyImage img);
    public abstract void resize(MyImage img);
    public abstract void upload(MyImage img);

    // prevent override
    public final void process() {
        convert(this.myImage);
        resize(this.myImage);
        upload(this.myImage);
    }
}
