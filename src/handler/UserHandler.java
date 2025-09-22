package handler;

import service.IUserService;

public class UserHandler {

    private final IUserService userService;

    public UserHandler(IUserService userService) {
        this.userService = userService;
    }

    private static boolean validate(String username, String password) {
        //validate input parameter
        if (username == null) {
            return true;
        }
        if (password == null) {
            return true;
        }
        return password.isBlank();
    }

    public boolean register(String username, String password) {
        if (validate(username, password)) return false;
        return userService.register(username, password);
    }

    public boolean login(String username, String password) {
        if (validate(username, password)) return false;
        return userService.login(username, password);
    }

}
