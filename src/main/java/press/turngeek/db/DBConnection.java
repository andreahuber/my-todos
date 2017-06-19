package press.turngeek.db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConnection {

    public static DataSource getDatasource() {
        Properties prop = new Properties();
        InputStream input = null;
        MysqlDataSource datasource = new MysqlDataSource();
        try {
            input = datasource.getClass().getClassLoader().getResourceAsStream("db.properties");
            prop.load(input);
            datasource.setUrl(prop.getProperty("DB_CONNECTION"));
            datasource.setUser(prop.getProperty("DB_USER"));
            datasource.setPassword(prop.getProperty("DB_PASSWORD"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return datasource;
    }



//    public static List<ToDo> selectAllTodos() {
//
//    }
//
//    public static void deleteAllToDos() {
//
//    }



}
