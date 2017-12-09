package th.ac.kmitl.science.comsci.example.utils;

import java.io.*;
import java.util.Properties;

public class Configuration {

    private static Configuration configuration;
    private static boolean isInitialized = false;

    public static Configuration getConfiguration() {
        if(configuration == null || !isInitialized)
            throw new ConfigurationException("Configuration must be initialized by calling Configuration.init() first");
        return configuration;
    }

    public static void init(String configurationFile) {
        if(isInitialized)
            throw new ConfigurationException("Configuration is initialized.");
        configuration = new Configuration(configurationFile);
        isInitialized = true;
    }

    private final Properties properties = new Properties();

    private Configuration(String configurationFile) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            InputStream inputStream = classLoader.getResourceAsStream(configurationFile);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new ConfigurationException(e.getMessage(), e.getCause());
        } catch (NullPointerException e) {

            // When configurationFile is not exist
            // classLoader.getResourceAsStream(configurationFile) will return null,
            // so inputStream can be null because of this behavior
            throw new ConfigurationException(e.getMessage(), e.getCause());
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static boolean isInitialized() {
        return isInitialized;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        Configuration.configuration = null;
        Configuration.isInitialized = false;
    }
}
