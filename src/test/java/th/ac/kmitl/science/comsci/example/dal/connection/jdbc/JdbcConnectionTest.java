package th.ac.kmitl.science.comsci.example.dal.connection.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import th.ac.kmitl.science.comsci.example.utils.Configuration;

import java.sql.SQLException;

public class JdbcConnectionTest {

    @Before
    public void initializeConfiguration() {
        if (!Configuration.isInitialized())
            Configuration.init("junitconfig.properties");
    }

    @Test
    public void canInitializeConnectionFromBuilder() throws SQLException {
        Configuration configuration = Configuration.getConfiguration();

        JdbcConnection jdbcConnection = new JdbcConnectionBuilder()
                .withJdbcDriverName(configuration.getProperty("db.driver"))
                .withDatabaseUri(configuration.getProperty("db.databaseUrl"))
                .withUsername(configuration.getProperty("db.username"))
                .withPassword(configuration.getProperty("db.password"))
                .build();
        jdbcConnection.close();
    }

    @Test
    public void canInitializeConnectionFromConfig() throws SQLException {
        JdbcConnection jdbcConnection = JdbcConnectionBuilder.fromConfiguration();
        jdbcConnection.close();
    }

    @After
    public void cleanupConfiguration() throws Throwable {
        Configuration.getConfiguration().finalize();
    }
}