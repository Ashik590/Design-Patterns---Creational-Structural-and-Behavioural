package pack;
public class NotificationService {
    NotificationService() {
    }

    public void notifyUser(User user, String message) {
        System.out.println("Notifying user -> " + user.getUsername() + " about " + message);
    }
}
