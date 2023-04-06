package hooks;

import java.util.Properties;

import flows.LoginFlow;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.ConfigReader;
import util.DriverFactory;

public class ApplicationHooks {
	
	private DriverFactory df;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	
	@Before(order = 0)
	public void getProperty()
	{
		configReader = new ConfigReader();
		df = new DriverFactory();
		driver = df.get_driver();

	}

	@Before(order = 1)
	public void launchBrowser()
	{
		df.launchPage();
//		driver.get("http://d3hz8vuwuu12we.cloudfront.net/");
	}
	
	@After(order=0)
	public void quitBrowser()
	{
//		driver.close();
	}

	@After(order=1)
	public void tearDown(Scenario sc)
	{
	//TakeSS
	}
}
