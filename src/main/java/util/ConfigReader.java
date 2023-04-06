package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * Used to load properties from Config.properties file
 */
public class ConfigReader {
	
public Properties prop;
String projPath = (System.getProperty("user.dir"))+"/src/test/resources/config/config.properties";

	public ConfigReader()
	{

		prop = new Properties();
		try {
			FileInputStream fis  = new FileInputStream(projPath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Config Property file not located");
		} catch (IOException e) {
			System.out.println("Unable to load Config Property file");
		}
	}

	public String getBrowser()
	{
		return prop.getProperty("browser");
	}

	public String getURL()
	{
		return prop.getProperty("url");
	}

}
