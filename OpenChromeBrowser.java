package commonstuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeBrowser {
public static WebDriver getChromeDriver() {
System.setProperty("webdriver.chrome.driver",
			"/Users/anjalinayar/Desktop/Java/chromedriver");

/* The following two lines of code are required to make it work with latest versions 
of Chrome browser like version 111 */

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);
return driver;
	 }
}
