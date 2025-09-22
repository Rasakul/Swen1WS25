import handler.UserHandler;
import persistence.IUserRepository;
import persistence.UserSqlRepository;
import service.IUserService;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        IUserRepository repository = UserSqlRepository.getInstance();
        IUserService userService = UserService.getInstance(repository);
        String username = "admin";
        String password = "password";

        UserHandler userHandler = new UserHandler(userService);
        userHandler.register(username, password);
        boolean loggedIn = userHandler.login(username, password);

    }

}
