package pack;
import java.util.Map;
import java.util.HashMap;

public class AuthenticationService {
    private Map<String, User> users;

    AuthenticationService() {
        this.users = new HashMap<>();

        this.users.put("ashik-12345", new User("ashik"));
        this.users.put("aziz-12345", new User("aziz"));
    }

    public User authenticate(String username, String password) {
        String key = username + "-" + password;
        if (users.containsKey(key)) {
            return users.get(key);
        }
        return null;
    }
}
