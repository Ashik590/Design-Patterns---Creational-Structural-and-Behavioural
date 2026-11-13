public class Main {
    public static void main(String[] args) {
        // creating imageLibrary
        ImageLibrary imageLibrary = new ImageLibrary();

        ImageMetaData image1_metaData = new ImageMetaData("Image1", ImageTag.NATURE, ImageCategory.PERSONAL,
                PrivacyLevel.PUBLIC);
        ImageMetaData image2_metaData = new ImageMetaData("Image2", ImageTag.PROFILE, ImageCategory.PUBLIC,
                PrivacyLevel.PRIVATE);
        ImageMetaData image3_metaData = new ImageMetaData("Image3", ImageTag.DOCUMENT, ImageCategory.WORK,
                PrivacyLevel.LOCKED);
        ImageMetaData image4_metaData = new ImageMetaData("Image4", ImageTag.SENSITIVE, ImageCategory.RESTRICTED,
                PrivacyLevel.RESTRICTED);

        imageLibrary.addImage("Image1", image1_metaData);
        imageLibrary.addImage("Image2", image2_metaData);
        imageLibrary.addImage("Image3", image3_metaData);
        imageLibrary.addImage("Image4", image4_metaData);

        User adminUser = new User(Role.ADMIN);
        User guestUser = new User(Role.GUEST);

        // Admin user
        System.out.println("Admin User:");

        Image image1 = imageLibrary.getImage("Image1");
        image1.display(adminUser);

        // guest user
        System.out.println("\nGuest User:");
        Image image2 = imageLibrary.getImage("Image2");
        image2.display(guestUser);
    }
}
