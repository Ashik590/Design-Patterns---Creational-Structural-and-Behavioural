public class ProxyImage implements Image {
    private RealImage realImage;
    private ImageMetaData metaData;

    public ProxyImage(ImageMetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public void display(User user) {

        if(metaData.getPrivacy() != PrivacyLevel.PUBLIC && user.getRole() != Role.ADMIN) {
            System.out.println("Access Denied: You do not have permission to view this image.");
            return;
        }

        if (realImage == null) {
            System.out.println("Lazy Loading...");
            realImage = new RealImage(metaData);
        } else {
            System.out.println("Displaying cached image....");
        }

        realImage.display(user);
    }
}
