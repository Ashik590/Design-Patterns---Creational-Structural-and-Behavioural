public class ImageMetaData {
    private String name;
    private ImageTag tag;
    private ImageCategory category;
    private PrivacyLevel privacy;

    public String getName() {
        return name;
    }

    public PrivacyLevel getPrivacy() {
        return privacy;
    }

    public ImageMetaData(String name, ImageTag tag, ImageCategory category, PrivacyLevel privacy) {
        this.name = name;
        this.tag = tag;
        this.category = category;
        this.privacy = privacy;
    }
}
