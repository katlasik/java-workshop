package pl.sda.users;

import java.util.Objects;

public class Administrator extends User {

    public Administrator(String username, String password) {
        super(username, password);
    }

    public Administrator(String username, String password, String secret) {
        super(username, password, secret);
    }

    void confirmWithMFA() {
        System.out.println("Wysyłam SMS z kodem dostępu...");
    }

    @Override
    public boolean authenticate(String username, String password) {
        boolean authenticated = super.authenticate(username, password);
        if (authenticated) {
            confirmWithMFA();
        }
        return authenticated;
    }

    @Override
    public boolean authenticate(String secret) {
        boolean authenticated = super.authenticate(secret);
        if (authenticated) {
            confirmWithMFA();
        }
        return authenticated;
    }


}
