package persistence;

import model.UserModel;

import java.util.List;

public class UserSqlRepository implements IUserRepository {

    private static UserSqlRepository instance = new UserSqlRepository();
    public static UserSqlRepository getInstance(){return instance;}

    private List<UserModel> users;

    private UserSqlRepository(){}

    public boolean login(UserModel user) {
        for (UserModel userModel : users) {
            if(userModel.getUsername().equals(user.getUsername())
                    && userModel.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }

}
