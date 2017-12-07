package com.sap.csc.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FlexCredentials {
	
    private static final Properties props = loadProperties();
    public static final String APP_ID = props.getProperty("appId");
    public static final String APP_KEY = props.getProperty("appKey");

    
    private FlexCredentials() {
		super();
	}

	private static Properties loadProperties() {
        Properties properties = new Properties();
        try (final InputStream stream = FlexCredentials.class.getResourceAsStream("/flex.properties")) {
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
