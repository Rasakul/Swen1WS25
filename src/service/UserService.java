package service;

import model.UserModel;
import persistence.IUserRepository;

public class UserService implements IUserService {

    private static UserService instance = null;

    private IUserRepository userRepository;

    private UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static UserService getInstance(IUserRepository userRepository) {
        if (instance == null) {
            instance = new UserService(userRepository);
        }
        return instance;
    }

    public boolean login(UserModel user) {
        return userRepository.login(user);
    }

}
