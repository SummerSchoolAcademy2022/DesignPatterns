package behavioral.cor;

public class AuthenticationHandler implements Handler{

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("Authentication Handler....");
        if (next != null) {
            next.handle();
        }
    }
}
