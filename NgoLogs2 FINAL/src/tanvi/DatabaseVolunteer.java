/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Soumili
 */
public class DatabaseVolunteer {
    


    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ngologs2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "09October*";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;

    // Method to establish a connection to the database
    public static void connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        }
    }

    // Method to insert volunteer data into the database
    public static void insertVolunteerData(int userId, String skills, String interests, String availability, String whyUs) throws SQLException {
        connect();
        String sql = "INSERT INTO Volunteer (user_id, skills, interests, availability) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId);
            statement.setString(2, skills);
            statement.setString(3, interests);
            statement.setString(4, availability);
            statement.executeUpdate();
        } finally {
            close();
        }
    }

    // Method to close the connection
    public static void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}



