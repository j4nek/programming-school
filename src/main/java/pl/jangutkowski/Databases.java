package pl.jangutkowski;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Databases {

    private Databases() {
    }

    public static Connection products() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_school?useSSL=false", "root", "coderslab");
    }
}
