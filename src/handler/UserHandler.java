package handler;

import model.UserModel;
import service.IUserService;
import service.UserService;

public class UserHandler {

    private IUserService userService;

    public UserHandler(IUserService userService) {
        this.userService = userService;
    }

    public boolean login(UserModel user){
        if(user == null){
            return false;
        }
        if(user.getPassword().isBlank()){
            return false;
        }
        return userService.login(user);
    }

}
