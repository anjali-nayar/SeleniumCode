package workers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonstuff.NavigateToUrl;

public class GmailSignUpWindowDataEntry {
WebDriver driver;
	
	public GmailSignUpWindowDataEntry(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToGmailUrl() {
		NavigateToUrl url = new NavigateToUrl(driver,"https://www.google.com/gmail/about/");
		url.navigateUrl();
	}
	
	public void clickNextBtnWithoutEnteringNames()  {
		driver.findElement(By.xpath("//a[@data-action='create an account']")).click();
		clickNextButton();	
	}

	private void clickNextButton() {
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	public List<WebElement> nameErrorList()  {
		return driver
		.findElements(By.xpath("//span[text()='Enter first and last names']"));	
	}
	
	public void clickNextBtnAfterEnteringNames() {
	driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("FirstName");
	driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("LastName");
	clickNextButton();
	}
}
