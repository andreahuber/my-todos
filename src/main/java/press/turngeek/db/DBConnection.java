package press.turngeek.db;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DBConnection {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://db.f4.htw-berlin.de:3306/_hubera__todos?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static final String DB_USER = "hubera";
    private static final String DB_PASSWORD = "Frisk-Fisk1703!";

    public static DataSource getDatasource() {
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setUrl(DB_CONNECTION);
        datasource.setUser(DB_USER);
        datasource.setPassword(DB_PASSWORD);
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
