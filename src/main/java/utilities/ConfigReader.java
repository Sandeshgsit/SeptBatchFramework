package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties properties;   
	
	
	static {	
		try {
			FileInputStream fs = new FileInputStream("src/main/resources/config.properties");
			properties = new Properties();
			properties.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key)   //base.url
	{
		return properties.getProperty(key);  //https://automationexercise.com/login
	}
	
	public static int getInt(String key)
	{
		return Integer.parseInt(get(key));
	}
	
	
}
