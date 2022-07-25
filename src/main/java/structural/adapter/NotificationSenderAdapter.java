package structural.adapter;

import structural.decorator.NotificationSender;

public class NotificationSenderAdapter implements NotificationSender {

    private final LibraryNotificationSender libraryNotificationSender;

    public NotificationSenderAdapter(LibraryNotificationSender libraryNotificationSender) {
        this.libraryNotificationSender = libraryNotificationSender;
    }

    @Override
    public void send() {
        System.out.println("Sending notification using the custom notification sender...");
        libraryNotificationSender.sendNotification();
    }
}
