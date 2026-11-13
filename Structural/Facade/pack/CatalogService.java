package pack;
import java.util.ArrayList;
import java.util.List;

public class CatalogService {
    private List<Resource> resources;

    CatalogService() {
        resources = new ArrayList<>();

        resources.add(new Resource("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "Hardcover"));
        resources.add(new Resource("To Kill a Mockingbird", "Harper Lee", "Fiction", "Paperback"));
        resources.add(new Resource("1984", "George Orwell", "Dystopian", "Ebook"));
        resources.add(new Resource("Pride and Prejudice", "Jane Austen", "Romance", "Hardcover"));
        resources.add(new Resource("The Catcher in the Rye", "J.D. Salinger", "Fiction", "Paperback"));
    }

    List<Resource> getResources() {
        return resources;
    }
}
