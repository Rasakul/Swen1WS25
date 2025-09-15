import handler.UserHandler;
import model.UserModel;
import persistence.IUserRepository;
import persistence.UserSqlRepository;
import service.IUserService;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        UserModel userModel = new UserModel("admin", "password");

        IUserRepository repository = UserSqlRepository.getInstance();
        IUserService userService = UserService.getInstance(repository);

        UserHandler userHandler = new UserHandler(userService);
        boolean loggedIn = userHandler.login(userModel);

    }

}
