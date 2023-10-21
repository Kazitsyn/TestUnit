package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin = false;
    boolean isAuthenticate = false;



    public boolean getIsAdmin() {
        return isAdmin;
    }

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        isAuthenticate = this.name.equals(name) && this.password.equals(password);
        return isAuthenticate;
    }

}