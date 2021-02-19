package testBase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import reusablemethods.ActionEngine;
import reusablemethods.PropertiesOperations;

public class TestBase extends ActionEngine{
	BrowserFactory bf = new BrowserFactory();
	//static WebDriverWait wait = null;
	@BeforeMethod
	public void LaunchApplication() throws Exception {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = 	PropertiesOperations.getPropertyValueByKey("url");

		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));

		DriverFactory.getInstance().getDriver().manage().window().maximize();
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverFactory.getInstance().getDriver().navigate().to(url);
		WaitFactory.getInstance().setWait(explicitwait());
	}
	

	
	

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
}
