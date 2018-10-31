package mycoding.funcs.abstractfactory;

public abstract class MediaFile {
    private String mediaType;
    private String fileType;

    public MediaFile(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        String str = "\n** File Info **\n" +
                "Media: " + mediaType + "\n" +
                "File: " + fileType;
        return str;
    }
}
