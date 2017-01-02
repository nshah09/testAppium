package sampleAppium.testAppium.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {

	private WebDriver driver;
	//static String driverPath = "D:\\chromedriver\";

	public WebDriver getDriver() {
		return driver;
	}

	/*private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}*/

	private void setDriver() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "10.2"); //mandatory
		capabilities.setCapability("deviceName","iPhone 7");//mandatory
		capabilities.setCapability("platformName","iOS");//mandatory
	   capabilities.setCapability("app", "/Users/nishitshah1/Library/Developer/Xcode/DerivedData/WebDriverAgent-brdadhpuduowllgivnnvuygpwhzy/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
	   
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 
		
		   

	}
	
	//@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBase() {
		try {
			setDriver();

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase obj1=new TestBase();
		obj1.initializeTestBase();
		WebDriver driver=obj1.getDriver();
		
		   try {
			   driver.findElement(By.name("Alerts")).click();
			Thread.sleep(5000);
			 driver.findElement(By.name("Back")).click();
			   Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  

		  driver.quit();
	}*/

}
