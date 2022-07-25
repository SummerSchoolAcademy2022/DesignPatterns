package behavioral.cor;

public class AuthorizationHandler implements Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("Authorization Handler...");
        if (next != null) {
            next.handle();
        }
    }
}
