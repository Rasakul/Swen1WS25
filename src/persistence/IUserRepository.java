package persistence;

import model.UserModel;

public interface IUserRepository {
    boolean login(UserModel user);
}
