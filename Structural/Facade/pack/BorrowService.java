package pack;

public class BorrowService {
    public boolean borrowResource(User user, Resource resource) {
        if (resource.isAvailable()) {
            resource.setBorrowedBy(user);
            return true;
        } 

        return false;
    }
}