package press.turngeek.todos;

import press.turngeek.db.DBConnection;

import javax.sql.DataSource;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class ToDoService {

    Connection connection;

    public ToDoService(DataSource ds) {
        try {
            connection = ds.getConnection();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            throw new RuntimeException("Cannot open database connection");
        }
    }

    public int addToDo(ToDo toDo) throws SQLException {
        PreparedStatement insertPreparedStatement = null;
        String insertQuery = "INSERT INTO todo" + "(description, created, priority) values" + "(?,?,?)";
        int inserted = 0;
        try {
            connection.setAutoCommit(true);

            insertPreparedStatement = connection.prepareStatement(insertQuery);
            insertPreparedStatement.setString(1, toDo.getDescription());
            insertPreparedStatement.setDate(2, new Date(toDo.getCreated().getTime()));
            insertPreparedStatement.setString(3, toDo.getPriority());
            inserted = insertPreparedStatement.executeUpdate();
            insertPreparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inserted;
    }

    public List<ToDo> getAllTodos() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT description, created, priority FROM todo");
        List<ToDo> allToDos = new ArrayList<ToDo>();
        while (rs.next()) {
            String description = rs.getString("description");
            Date created = rs.getDate("created");
            String priority = rs.getString("priority");
            ToDo toDo = new ToDo(description, new java.util.Date(created.getTime()), priority);
            allToDos.add(toDo);
        }
        return  allToDos;
    }

    // TODO implement
    public ToDo deleteToDo(ToDo todo) {
        return new ToDo();
    }

    public int deleteAllToDos() throws SQLException{
        Statement statement = connection.createStatement();
        int deleted = statement.executeUpdate("DELETE FROM todo");
        return deleted;
    }
}
