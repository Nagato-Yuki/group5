package th.ac.kmitl.science.comsci.example.dal.connection.jdbc;

import th.ac.kmitl.science.comsci.example.dal.connection.jdbc.annotations.JdbcDriver;

import java.sql.SQLException;

@JdbcDriver("com.mysql.jdbc.Driver")
public class MySqlJdbcConnection extends JdbcConnection {

    public MySqlJdbcConnection(String databaseUri, String username, String password) throws SQLException {
        super(databaseUri, username, password);
    }
}
