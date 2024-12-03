package in.rohit.co;

import java.sql.*;

public class TaskDao {
    private static final String URL = "jdbc:mysql://localhost:3306/tasks";
    private static final String USER = "root";
    private static final String PASSWORD = "root_password";

    public void addTask(Task task) {
        String query = "INSERT INTO tasks(description, subject, date, due_date, color, hours) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, task.getDescription());
            statement.setString(2, task.getSubject());
            statement.setString(3, task.getDate());
            statement.setString(4, task.getDueDate());
            statement.setString(5, task.getColor());
            statement.setInt(6, task.getHours());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
