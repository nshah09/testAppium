package sampleAppium.testAppium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sampleAppium.testAppium.base.TestBase;
import sampleAppium.testAppium.pageObjects.alertsPage;

public class alertsTest extends TestBase{
	
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		this.driver=getDriver();
	}
	
	@Test
	public void verifyHomePage()  {
		System.out.println("Alerts page test...");
		
		try {
			alertsPage alertsPage = new alertsPage(driver);
			//driver.wait(5000);
			Thread.sleep(5000);
			Assert.assertTrue(alertsPage.verifyAlertsLink(), "Alerts Link doesn't match");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void ClickonLinks()
	{
		System.out.println("Verify clicking on Alert Link....");
		alertsPage alertspage= new alertsPage(driver);
		try {
			Assert.assertTrue(alertspage.clickAlertsLink(), "Could not click on alerts link");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
