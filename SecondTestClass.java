package tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commonstuff.OpenChromeBrowser;
import workers.CheckFaceBook;
import workers.GmailSignUpWindowDataEntry;
import workers.SearchLinkedIn;
import workers.VirginiaTechWorker;
import workers.WebsiteToSwitchFrames;

public class SecondTestClass {
	WebDriver driver;
	VirginiaTechWorker vtWorker;
	
@BeforeClass
  public void setUp() {
		 driver = OpenChromeBrowser.getChromeDriver();
	}
	
@Test(description ="Test 6- Navigate to Gmail, click on 'Sign Up', verify that there is an error message when name fields are not entered.", 
  		priority = 1,
  		enabled = true)
  public void faceBookTest() {
	GmailSignUpWindowDataEntry gmailWorker = new GmailSignUpWindowDataEntry(driver);
	gmailWorker.navigateToGmailUrl();
	gmailWorker.clickNextBtnWithoutEnteringNames();
	//WebElement nameErrorMsg = gmailWorker.nameError();
	//Assert.assertTrue(nameErrorMsg.isDisplayed());
	 List<WebElement> nameErrorMsgList = gmailWorker.nameErrorList();
	 Assert.assertFalse(nameErrorMsgList.isEmpty());
	System.out.println("Verified that an error message is displayed when a value is not entered in First Name, Last Name fields.");
	gmailWorker.clickNextBtnAfterEnteringNames();
   nameErrorMsgList = gmailWorker.nameErrorList();
    Assert.assertTrue(nameErrorMsgList.isEmpty());
    System.out.println("Verified that an error message is not displayed when values are entered in First Name, Last Name fields.");    
}

@AfterClass
public void closeBrowser() {
		 driver.quit();
	}
}