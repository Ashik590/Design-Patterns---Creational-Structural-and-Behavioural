package pack;
import java.util.List;

public class SearchService {
    SearchService() {
    }

    public Resource searchResource(String title, String category, List<Resource> resources) {
        for (Resource resource : resources) {
            if (resource.getTitle().equalsIgnoreCase(title) && resource.getCategory().equalsIgnoreCase(category)) {
                return resource;
            }
        }
        return null;
    }
}
