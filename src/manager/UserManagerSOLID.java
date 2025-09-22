package manager;

import model.UserModel;

import java.util.HashMap;
import java.util.Map;

public class UserManagerSOLID {

    private final UserRepository userRepository;
    private final LoggerService logger;

    private final Map<String, UserModel> userMap = new HashMap<>();

    public UserManagerSOLID() {
        userRepository = new UserRepository();
        logger = new LoggerService();
    }

    public boolean login(String username, String password) {
        if (checkPassword(username, password)) {
            UserModel found = userRepository.getUserByUsername(username);
            userMap.put(username, found);
            logger.logAction("LOGIN SUCCESSFUL");
            return true;
        }

        return false;
    }

    public boolean register(String username, String password) {
        userRepository.registerUser(username, password);
        //Add business logic: e.g. check if username exists or password is valid
        logger.logAction("REGISTER SUCCESSFUL");
        return true;
    }

    public boolean checkPassword(String username, String password) {
        UserModel found = userRepository.getUserByUsername(username);
        if (found != null) {
            return found.getPassword().equals(password);
        } else {
            return false;
        }
    }

    public void changePassword(UserModel user, String newPassword) {
        userRepository.updatePassword(user, newPassword);
        logger.logAction("CHANGE PASSWORD SUCCESSFUL");
    }

}
