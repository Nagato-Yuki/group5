package th.ac.kmitl.science.comsci.example.dal.connection.jdbc;

import javax.security.auth.login.Configuration;
import java.sql.SQLException;

public class JdbcConnectionBuilder {
    
    private String jdbcDriverName;
    private String databaseUri;
    private String username;
    private String password;

    public JdbcConnectionBuilder withJdbcDriverName(String jdbcDriverName) {
        this.jdbcDriverName = jdbcDriverName;
        return this;
    }

    public JdbcConnectionBuilder withDatabaseUri(String databaseUri) {
        this.databaseUri = databaseUri;
        return this;
    }

    public JdbcConnectionBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public JdbcConnectionBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public JdbcConnection build() throws SQLException {
        if(jdbcDriverName == null || jdbcDriverName.isEmpty() 
                || databaseUri == null || databaseUri.isEmpty()
                || username == null || username.isEmpty()
                || password == null || password.isEmpty())
           throw new IllegalArgumentException("Arguments are missing"); 
        return new JdbcConnection(jdbcDriverName, databaseUri, username, password);
    }
    
    public static JdbcConnection fromConfiguration() {
        Configuration configuration = Configuration.getInstance();
    }
}