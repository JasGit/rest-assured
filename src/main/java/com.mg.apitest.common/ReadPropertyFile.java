package com.mg.apitest.common;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * Created by jaspreetwalia on 11/10/2016.
 */
public class ReadPropertyFile {
    /**
     * This method returns value for the key to be passed as input.
     * @param key - name of the parameter, whose value need to be retrieve
     * @return - returns value of the parameter
     * @throws IOException
     */
    public String getProperty(String key) {
        Properties prop = new Properties();

        try {
            String filePath = "src/main/resources/config.properties";
            filePath.replace("/", File.separator);
            FileInputStream input = new FileInputStream(filePath);

            prop.load(input);
        }catch ( IOException ioException)
        {
            ioException.printStackTrace();
        }
        String value = prop.getProperty(key);
        return value;
    }
}
