package th.ac.kmitl.science.comsci.example.dal.connection.jdbc;

import th.ac.kmitl.science.comsci.example.dal.connection.jdbc.annotations.JdbcDriver;

import java.sql.*;

public abstract class JdbcConnection implements AutoCloseable {

    private String databaseUri;
    private String username;
    private String password;
    private String jdbcDriverName;
    private Connection connection;
    private boolean isAutoCommit = false;
    private boolean isInitialized = false;

    public JdbcConnection(String databaseUri, String username, String password) throws SQLException {
        this.databaseUri = databaseUri;
        this.username = username;
        this.password = password;
        this.jdbcDriverName = getJdbcDriverName();
        this.initialize();
    }

    public String getDatabaseUri() {
        return databaseUri;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean isAutoCommit() throws SQLException {
        return connection.getAutoCommit();
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
        connection.setAutoCommit(autoCommit);
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public String getJdbcDriverName() {
        if(getClass().isAnnotationPresent(JdbcDriver.class)) {
            JdbcDriver driverAnnotation = getClass().getAnnotation(JdbcDriver.class);
            return driverAnnotation.value();
        }
        throw new UnsupportedOperationException("Can't get JDBC driver name");
    }

    public PreparedStatement prepareStatement(String sqlStatement) throws SQLException {
        return connection.prepareStatement(sqlStatement);
    }

    public Statement CreateStatement(String sqlStatement) throws SQLException {
        return connection.createStatement();
    }

    public void initialize() throws SQLException {
        try {
            Class.forName(jdbcDriverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
        connection = DriverManager.getConnection(databaseUri, username, password);
        connection.setAutoCommit(isAutoCommit);
        isInitialized = true;
    }

    public void commit() throws SQLException {
        connection.commit();
    }

    public void rollback() throws SQLException {
        connection.rollback();
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
