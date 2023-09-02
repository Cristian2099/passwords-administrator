import model.Password;
import service.PasswordService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userId, passId, passName, userName, password, notes, siteLink;

        System.out.println("Please set user id");
        userId = scanner.nextLine();

        System.out.println("Please set pass id");
        passId = scanner.nextLine();

        System.out.println("Please set pass name");
        passName = scanner.nextLine();

        System.out.println("Please set user name");
        userName = scanner.nextLine();

        System.out.println("Please set password");
        password = scanner.nextLine();

        System.out.println("Please set notes");
        notes = scanner.nextLine();

        System.out.println("Please set site link");
        siteLink = scanner.nextLine();

        Password passwordToSave = new Password(userId, passId, passName, userName, password, notes, siteLink);

        Password passwordSaved = PasswordService.savePassword(passwordToSave);

        System.out.println(passwordSaved);
    }
}