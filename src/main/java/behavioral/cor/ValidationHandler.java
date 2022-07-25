package behavioral.cor;

public class ValidationHandler implements Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("Validation Handler...");
        if (next != null) {
            next.handle();
        }
    }
}
