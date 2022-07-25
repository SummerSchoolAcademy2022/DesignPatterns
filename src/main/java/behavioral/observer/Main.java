package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();
        notificationManager.subscribe(new SlackNotification());
        DiscordNotification discordNotification = new DiscordNotification();
        notificationManager.subscribe(discordNotification);
        notificationManager.sendNotification("Hello world!");

        System.out.println("======================");
        notificationManager.unsubscribe(discordNotification);
        notificationManager.sendNotification("Message only for Slack!");
    }
}
