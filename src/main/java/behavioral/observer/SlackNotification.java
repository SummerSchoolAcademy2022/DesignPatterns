package behavioral.observer;

public class SlackNotification implements NotificationListener{
    @Override
    public void update(String message) {
        System.out.println("Sending Slack notification with message: " + message);
    }
}
