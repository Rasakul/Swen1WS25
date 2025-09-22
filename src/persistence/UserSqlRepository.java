package persistence;

import model.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserSqlRepository implements IUserRepository {

    private static final UserSqlRepository instance = new UserSqlRepository();
    public static UserSqlRepository getInstance(){return instance;}

    private final List<UserModel> users; //simulates DB

    private UserSqlRepository() {
        users = new ArrayList<>();
    }

    @Override
    public UserModel createUser(String username, String password) {
        UserModel user = new UserModel(UUID.randomUUID().toString(), username, password);
        users.add(user); //change to DB code
        return user;
    }

    @Override
    public UserModel getUserByUsername(String username) {
        //demo: search for user
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
