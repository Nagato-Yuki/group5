package th.ac.kmitl.science.comsci.example.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ConfigurationTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void cannotGetInstanceWithoutInit() throws Throwable {
        Configuration.getConfiguration().finalize();

        exception.expect(RuntimeException.class);
        Configuration configuration = Configuration.getConfiguration();
    }

    @Test
    public void canGetConfiguration() {
        if(!Configuration.isInitialized())
            Configuration.init("junitconfig.properties");

        Configuration configuration = Configuration.getConfiguration();
        assertEquals("eTaxApp", configuration.getProperty("db.username"));
    }

    @Test
    public void cannotInitIfInitialized() {
        if(!Configuration.isInitialized())
            Configuration.init("junitconfig.properties");

        exception.expect(RuntimeException.class);
        Configuration.init("junitconfig.properties");
    }
}