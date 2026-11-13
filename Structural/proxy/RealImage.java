public class RealImage implements Image {
    private String content;
    private ImageMetaData metaData;

    public RealImage(ImageMetaData metaData) {
        this.metaData = metaData;
        loadFromDisk();
    }

    @Override
    public void display(User user) {
        System.out.println("Displaying " + metaData.getName() + ": " + content);
    }

    private void loadFromDisk() {
        this.content = "IMAGE CONTENT ~ " + metaData.getName();
        System.out.println("Loading " + metaData.getName() + " from disk...");
    }

}