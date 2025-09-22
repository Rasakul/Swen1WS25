package persistence;

import model.UserModel;

public interface IUserRepository {
    UserModel createUser(String username, String password);

    UserModel getUserByUsername(String username);

}
