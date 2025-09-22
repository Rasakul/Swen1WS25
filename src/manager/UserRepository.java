package manager;

import model.UserModel;

import java.util.UUID;

public class UserRepository {
    private final LoggerService logger;

    public UserRepository() {
        this.logger = new LoggerService();
    }

    public void saveToDatabase(UserModel user) {
        logger.logAction("Saving user '" + user.getUsername() + "' with password '" + user.getPassword() + "' to database...");
        // DB Code
    }

    public void updatePassword(UserModel user, String password) {
        System.out.println("Change password to " + password);
        //DB Code
    }

    public UserModel getUserByUsername(String username) {
        //DB Code
        return null;
    }

    public UserModel registerUser(String user, String password) {
        //DB Code
        return new UserModel(UUID.randomUUID().toString(), user, password);
    }
}
