package org.assignment.dbcontext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A singleton class for the db context connecting to postgresql
 */
public class DbContext {

    private static DbContext instance;
    private static Connection connection;
    private final static String URL = "jdbc:postgresql://localhost:5432/ats";

    // private constructor to prevent initialisation
    private DbContext() {}

    public static DbContext getInstance() {
        if (instance == null) {
            instance = new DbContext();
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, "postgres", "admin");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
