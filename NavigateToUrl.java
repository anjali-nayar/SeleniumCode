package commonstuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateToUrl {
	WebDriver driver;
	private String url;
	
	public NavigateToUrl(WebDriver driver, String url) {
		this.driver = driver;
		this.url = url;
	}
	
public void navigateUrl() {
	driver.get(url);
	 }
}
