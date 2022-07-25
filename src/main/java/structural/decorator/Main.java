package structural.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        NotificationSender s1 = new EmailSender(new SmsSender(null));
        NotificationSender s2 = new SmsSender(new EmailSender(null));
        NotificationSender s3 = new SmsSender(new SmsSender(null));

        s1.send();
        System.out.println("==================");
        s2.send();
        System.out.println("==================");
        s3.send();

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("")));
    }
}
