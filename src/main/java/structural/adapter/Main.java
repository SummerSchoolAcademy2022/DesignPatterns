package structural.adapter;

public class Main {
    public static void main(String[] args) {
        LibraryNotificationSender libraryNotificationSender = new LibraryNotificationSender();
        NotificationSenderAdapter notificationSenderAdapter = new NotificationSenderAdapter(libraryNotificationSender);

        notificationSenderAdapter.send();
    }
}
