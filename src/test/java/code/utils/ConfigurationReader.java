package code.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configfile;
    //incapsulation for hiding data

    static {
        //static block will get execute before everything
        //get the path and store it in a String
        String pathForPropertiesFile="Configuration.properties";

        try{
            FileInputStream fileInputStream= new FileInputStream(pathForPropertiesFile);
            configfile= new Properties();
            configfile.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            System.out.println("Failed to load the properties");
            throw new RuntimeException(e);
        }

    }
    public static String getProperties(String keyword){

        return configfile.getProperty(keyword);

    }

}
