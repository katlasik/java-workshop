package pl.sda.users;

public class User {
    private String password;
    private String user;

    public User(String password,  String user) {
        this.password = password;
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}
