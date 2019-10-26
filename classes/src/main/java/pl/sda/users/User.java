package pl.sda.users;

public class User {

    public static final String EMPTY_TOKEN = "---";

    private String username;
    private String password;
    private String secret;

    public User(String username, String password, String secret) {
        this.username = username;
        this.password = password;
        this.secret = secret;
    }

    public User(String username, String password) {
        this(username, password, EMPTY_TOKEN);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean authenticate(String secret) {
        return this.secret.equals(secret) && !this.secret.equals(EMPTY_TOKEN);
    }

}
