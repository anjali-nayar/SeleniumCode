package workers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonstuff.NavigateToUrl;

public class VirginiaTechWorker {
	WebDriver driver;
	
	public VirginiaTechWorker(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToVTUrl() {
		NavigateToUrl url = new NavigateToUrl(driver,"https://www.vt.edu/");
		url.navigateUrl();
	}
	
	public String navigateToApplyVirginiaTech(){
		driver.findElement(By.xpath("//a[contains(text(),'Apply')]")).click(); 	
		return driver.getCurrentUrl();
	}

	

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
}
