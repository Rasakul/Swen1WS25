package model;

public class UserModel {

    private String uid;
    private String username;
    private final String password;

    public UserModel(String uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
       return this.password;
    }
}
