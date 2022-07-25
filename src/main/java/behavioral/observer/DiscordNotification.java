package behavioral.observer;

public class DiscordNotification implements NotificationListener{
    @Override
    public void update(String message) {
        System.out.println("Sending Discord notification with message: " + message);
    }
}
