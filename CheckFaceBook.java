package workers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckFaceBook {
	public static String enterDataAndGetTitle(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("seleniumtest@yahoo.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("******");
		String title = driver.getTitle();
		return title;
	}
}
