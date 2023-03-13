package workers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchLinkedIn {
	public static String searchJobs(WebDriver driver) {
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Jobs')]")).click();
		driver.findElement(By.id("job-search-bar-keywords"))
		.sendKeys("Software Tester");
		WebElement location = driver.findElement(By.name("location"));
		location.clear();
		location.sendKeys("Blacksburg, VA");
		location.sendKeys(Keys.RETURN);
		String noOfPositons= driver.findElement(By.className("results-context-header__job-count"))
				.getText();
		return noOfPositons;
	}
}
