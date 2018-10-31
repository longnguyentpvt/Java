package mycoding.funcs.template;

public class MyImage {

    private String imgType;
    private int width;
    private int height;
    private String uploadName;

    public MyImage() {
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName;
    }

    @Override
    public String toString() {
        String str = "\n** Image Information **\n";
        str += "Type: " + this.imgType + "\n" +
                "Size: " + this.width + "x" + this.height + "\n" +
                "Name: " + this.uploadName;
        return str;
    }
}
