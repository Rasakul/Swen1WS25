package service;

import model.UserModel;
import persistence.IUserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

    private static UserService instance = null;

    private final IUserRepository userRepository;

    private final List<UserModel> loggedInUsers;

    private UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
        this.loggedInUsers = new ArrayList<>();
    }

    public static UserService getInstance(IUserRepository userRepository) {
        if (instance == null) {
            instance = new UserService(userRepository);
        }
        return instance;
    }

    @Override
    public boolean login(String username, String password) {
        if (checkPassword(username, password)) {
            UserModel found = userRepository.getUserByUsername(username);
            loggedInUsers.add(found);
            return true;
        }

        return false;
    }

    @Override
    public boolean register(String username, String password) {
        //Add business logic: e.g. check if username exists or password is valid
        UserModel user = userRepository.createUser(username, password);
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
}
