package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    private final List<NotificationListener> notificationListeners = new ArrayList<>();

    public void subscribe(NotificationListener listener) {
        notificationListeners.add(listener);
    }

    public void unsubscribe(NotificationListener listener) {
        notificationListeners.remove(listener);
    }

    public void sendNotification(String message) {
        notificationListeners.forEach(l -> l.update(message));
    }
}
