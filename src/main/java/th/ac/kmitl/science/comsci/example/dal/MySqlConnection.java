package th.ac.kmitl.science.comsci.example.dal;

import th.ac.kmitl.science.comsci.example.dal.attributes.JdbcDriver;

import java.sql.SQLException;

@JdbcDriver(driverName = "com.mysql.jdbc.Driver")
public class MySqlConnection extends DatabaseConnection {

    public MySqlConnection(String databaseUri, String username, String password) throws SQLException {
        super(databaseUri, username, password);
    }
}
