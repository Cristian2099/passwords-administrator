package repository;

import model.Password;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PasswordRepository {

    public static Password save(Password password){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/password_admin", "root", "pass");
            System.out.println("Connection is success.");
            connection.prepareStatement(String.format("INSERT INTO passwords(userId, PassId, PassName, UserName, Pass, Notes, PassHistory, SiteLink) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s','%s')",
                    password.getUserId(), password.getPassId(), password.getPassName(), password.getUserName(), password.getPassword(), password.getNotes(), password.getPassHistory(), password.getSiteLink())).executeUpdate();
            System.out.println("Password save successfully");
            connection.close();
            return password;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> getPasswordHistory(Password password){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/password_admin", "root", "Cristian21*");
            System.out.println("Connection is success.");
            ResultSet allPasswords = connection.prepareStatement(String.format("SELECT * FROM passwords WHERE userId = '%s' AND PassId = '%s'", password.getUserId(), password.getPassId())).executeQuery();
            ArrayList<String> passwordHistory = new ArrayList<>();
            while (allPasswords.next()){
                passwordHistory.add(allPasswords.getString("Pass"));
            }
            System.out.println("Password save successfully");
            connection.close();
            return passwordHistory;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
