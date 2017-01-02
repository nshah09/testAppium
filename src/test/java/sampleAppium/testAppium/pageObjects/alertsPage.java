package sampleAppium.testAppium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alertsPage {
	protected WebDriver driver;
	//private By alertslink= By.name("Alerts");
	private By alertslink= By.xpath("//XCUIElementTypeButton[1]");
	private By backlink= By.name("Back");
	public alertsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyAlertsLink()
	{
		WebElement alert=driver.findElement(alertslink);
		return alert.getText().contains("Alerts");
		
		
	}
	
	public boolean clickAlertsLink() throws Exception
	{
		WebElement element=driver.findElement(alertslink);
		element.click();
		Thread.sleep(5000);
		element= driver.findElement(backlink);
		element.click();
		Thread.sleep(5000);
		return driver.findElement(alertslink).getText().contains("Alerts");
	}
	
}
