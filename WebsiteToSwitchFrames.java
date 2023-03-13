package workers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebsiteToSwitchFrames {
	public static boolean switchFrames(WebDriver driver){
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
	   boolean messageCheck = driver
				.findElements(By.xpath("//*[text()='This is a sample page']"))
				.size()>0;
	  return messageCheck;
	}
}
