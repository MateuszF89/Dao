package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/%s";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "WXLgr89524AJL";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                String.format(DB_URL, "workshop2"),
                DB_USER, DB_PASS);
    }
    }

