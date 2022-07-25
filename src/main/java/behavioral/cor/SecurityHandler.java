package behavioral.cor;

public class SecurityHandler implements Handler {

    private Handler handler;
    @Override
    public void handle() {
        System.out.println("Security Handler...");

        AuthorizationHandler authorizationHandler = new AuthorizationHandler();
        authorizationHandler.setNext(new ValidationHandler());
        AuthenticationHandler authenticationHandler = new AuthenticationHandler();
        authenticationHandler.setNext(authorizationHandler);
        authenticationHandler.handle();
    }
}
