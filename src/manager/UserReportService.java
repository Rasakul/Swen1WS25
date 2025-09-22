package manager;

import model.UserModel;

public class UserReportService {

    public void printUserReport(UserModel user) {
        System.out.println("=== User Report ===");
        System.out.println("Username: " + user.getUsername());
        System.out.println("===================");
    }
}
