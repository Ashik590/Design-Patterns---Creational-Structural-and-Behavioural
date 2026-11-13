package pack;

public class LibraryFacade {
    private SearchService searchService;
    private AuthorizationService authorizationService;
    private PreviewService previewService;
    private BorrowService borrowService;
    private DownloadService downloadService;
    private NotificationService notificationService;
    private ActivityLogger activityLogger;
    private AuthenticationService authenticationService;
    private CatalogService catalogService;

    public LibraryFacade() {
        searchService = new SearchService();
        authorizationService = new AuthorizationService();
        previewService = new PreviewService();
        borrowService = new BorrowService();
        downloadService = new DownloadService();
        notificationService = new NotificationService();
        activityLogger = new ActivityLogger();
        authenticationService = new AuthenticationService();
        catalogService = new CatalogService();
    }

    public User login(String username, String password) {
        User user = authenticationService.authenticate(username, password);
        if (user != null) {
            activityLogger.addLog("User " + username + " logged in successfully.");
            notificationService.notifyUser(user, "Welcome, " + username + "! You have successfully logged in.");
        } else {
            System.out.println("Invalid username or password.");
        }
        return user;
    }

    public Resource search(String title, String category, User user) {
        Resource resource = searchService.searchResource(title, category, catalogService.getResources());
        if (resource != null) {
            notificationService.notifyUser(user, "Resource found: " + resource.getTitle());
        } else {
            notificationService.notifyUser(user, "Resource not found.");
            return null;
        }

        activityLogger.addLog(
                "User " + user.getUsername() + " searched for resource: " + title + " in category: " + category);

        if (!authorizationService.isAuthorized(user, resource, "search")) {
            notificationService.notifyUser(user, "You are not authorized to search for resources.");
            return null;
        }

        return resource;
    }

    public void previewResource(User user, Resource resource) {
        activityLogger.addLog("User " + user.getUsername() + " attempted to preview resource: " + resource.getTitle());

        if (!authorizationService.isAuthorized(user, resource, "preview")) {
            notificationService.notifyUser(user,
                    "You are not authorized to preview the resource: " + resource.getTitle());
            return;
        }

        previewService.previewResource(resource);
    }

    public void borrowResource(User user, Resource resource) {
        activityLogger.addLog("User " + user.getUsername() + " attempted to borrow resource: " + resource.getTitle());

        if (!authorizationService.isAuthorized(user, resource, "borrow")) {
            notificationService.notifyUser(user,
                    "You are not authorized to borrow the resource: " + resource.getTitle());
            return;
        }

        borrowService.borrowResource(user, resource);
    }

    public void downloadResource(User user, Resource resource) {
        activityLogger.addLog(
                "User " + user.getUsername() + " attempted to download resource: " + resource.getTitle());

        if (!authorizationService.isAuthorized(user, resource, "download")) {
            notificationService.notifyUser(user,
                    "You are not authorized to download the resource: " + resource.getTitle());
            return;
        }

        downloadService.downloadResource(resource);
    }

    public void showActivityLogs() {
        activityLogger.printLogs();
    }

}
