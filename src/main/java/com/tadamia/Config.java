package com.tadamia;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static volatile Properties properties;

    private Config() {
    }

    public static Properties loadFile() throws IOException {
        InputStream in = Config.class.getClassLoader().getResourceAsStream("client.properties");
            if (properties == null) {
            synchronized (Config.class) {
                if (properties == null) {
                    properties = new Properties();
                    properties.load(in);
                }
            }
        }
        return properties;

    }
}
