import pack.*;

public class Main {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();

        User user = libraryFacade.login("ashik", "12345");
        Resource resource = libraryFacade.search("The Great Gatsby", "Fiction", user);

        libraryFacade.downloadResource(user, resource);
        libraryFacade.previewResource(user, resource);
        libraryFacade.borrowResource(user, resource);
        libraryFacade.showActivityLogs();
    }
}
