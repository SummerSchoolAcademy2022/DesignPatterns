package structural.decorator;

public class EmailSender implements NotificationSender{

    private final NotificationSender notificationSender;

    public EmailSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send() {
        if (notificationSender != null) {
            notificationSender.send();
        }
        System.out.println("Sending email notification...");
    }
}
