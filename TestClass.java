package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commonstuff.OpenChromeBrowser;
import workers.CheckFaceBook;
import workers.SearchLinkedIn;
import workers.VirginiaTechWorker;
import workers.WebsiteToSwitchFrames;

public class TestClass {
	WebDriver driver;
	VirginiaTechWorker vtWorker;
	
@BeforeClass
  public void setUp() {
		 driver = OpenChromeBrowser.getChromeDriver();
	}
	
@Test(description ="Test 1- Go to facebook, enter username, password,"
  		+ " getTitle and verify that title is correct.", 
  		priority = 1,
  		enabled = true)
  public void faceBookTest() {	 
	  String facebookTitle = CheckFaceBook.enterDataAndGetTitle(driver);
	  Assert.assertEquals(facebookTitle, "Facebook - log in or sign up");
	  System.out.println("Verified facebook title as "+facebookTitle);
  }
 
@Test(description ="Test 2 - Go to LinkedIn,"
		+ " search for #Software Tester positions in Blacksburg, VA.",
		priority = 2,
		enabled = true)
public void linkedInTest() {
String noOfPositons  = SearchLinkedIn.searchJobs(driver);
System.out.println("No of Software Tester positions in Blacksburg, VA: "+
		noOfPositons );
}

@Test(description ="Test 3 - Go to ToolsQA website, switch frame, and verify "
		+ "that there is a particular message in the new frame",
		priority = 3,
		enabled = true)
public void switchFrameTest() throws InterruptedException {
 boolean messagePresent = WebsiteToSwitchFrames.switchFrames(driver);
 Assert.assertEquals(messagePresent, true);
System.out.println("Verified that expected message was present in the new frame.");
}

@Test(description ="Test 4- Navigate to vt.edu", priority = 4)
public void vtTest1()  {
	 vtWorker = new VirginiaTechWorker(driver);
	 vtWorker.navigateToVTUrl();
	 String vtTitle = vtWorker.getPageTitle();
	 Assert.assertEquals( vtTitle, "Home | Virginia Tech");
	 System.out.println("Successfully navigated to vt.edu");
}
@Test(description ="Test 5- Navigate to Under Graduate Admissions in vt.edu",
dependsOnMethods ="vtTest1")
public void vtTest2()  {
      vtWorker.navigateToApplyVirginiaTech();
      String applyUrl = vtWorker.navigateToApplyVirginiaTech();
      Assert.assertEquals(applyUrl,"https://www.vt.edu/apply.html");	 
      System.out.println("Successfully navigated to Apply|Virginia Tech.");
}

@AfterClass
public void closeBrowser() {
		 driver.quit();
	}
}
