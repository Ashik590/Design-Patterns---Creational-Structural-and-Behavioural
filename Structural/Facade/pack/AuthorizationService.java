package pack;
public class AuthorizationService {

    AuthorizationService() {
    }

    public boolean isAuthorized(User user, Resource resource, String action) {
        return true;
    }
}
