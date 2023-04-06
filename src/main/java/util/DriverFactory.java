package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Properties;

public class DriverFactory {
    
	public WebDriver driver;
	public ConfigReader cR;

	public DriverFactory()
	{
		cR = new ConfigReader();
	}

	public WebDriver get_driver()
	{
		String browserName = cR.getBrowser();

		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("Mozilla"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new  FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else 
		{
			System.out.println("Please pass correct browser value");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchPage()
	{
		driver.get(cR.getURL());
	}
	

}
