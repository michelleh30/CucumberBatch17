package utils;
//we need the data to read from java to non java
//.properties is non java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static Properties readProperties(String filePath){

        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();//having the data from the java properties
            prop.load(fis);//to bring the file to the memory RAM
        } catch (FileNotFoundException e) {//parent class
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;//line 15 read the data--holds all the methods from the properties file
    }

    public static String getPropertyValue(String key){
        //from prop object we are calling get property method
        // and we will pass the key to fetch the value
        //in the String key if put browser you'll get chrome
        return prop.getProperty(key);//chrome
    }
}
