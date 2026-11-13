package pack;

public class DownloadService {
    DownloadService() {
    }

    public void downloadResource(Resource resource) {
        System.out.println("Downloading resource: " + resource.getTitle());
    }
}
