Project created using Selenium, Java and TestNG with 3 packages:
•	"commonstuff"
•	"tests"
•	"workers"
"commonstuff" package includes common activities for browser operations
"tests" package includes Test Classes with 5 tests:
•	Test 1 - Navigates to Facebook, enters username and password, gets title
•	Test 2 - Navigates to LinkedIn, searches for open positions for Software Testers in Blacksburg, VA
•	Test 3 - Navigates to ToolQA website, switches to a new frame, collects and verifies message
•	Test 4 - Navigates to vt.edu and verifies page title
•	Test 5 - Depends on Test 4 and clicks "APPLY" button in vt.edu, verifies navigation to "Apply| Virginia Tech"
Test Classes have @BeforeClass and @AfterClass methods to open and close the browser
SecondTestClass under "tests" package includes 1 test:
•	Test 6 - Navigates to Gmail, clicks on Sign Up button and verifies error message with empty First Name and Last Name fields. Then enters First Name and Last Name, verifies error message is NOT displayed.
"workers" package includes Worker Classes:
•	CheckFaceBook - Method to enter data and get title
•	SearchLinkedIn - Method to navigate to LinkedIn and do a particular search
•	VirginiaTechWorker - Has 4 methods:
o	Constructor to assign driver to class variable
o	navigateToVTUrl() - calls navigateToUrl() method in NavigateToUrl class
o	navigateToApplyVirginiaTech() method
o	getPageTitle() method
•	WebsiteToSwitchFrames - Method to navigate to ToolQA website, switch to a new frame, collect message
•	GmailSignUpWindowDataEntry - Used by SecondTestClass with 6 methods: 
o	Constructor
o	navigateToGmailUrl()
o	clickNextButton()
o	clickNextBtnWithoutEnteringNames() - Navigate to Gmail Sign Up window and click Next without entering First Name and Last Name, calls clickNextButton() after navigating to Sign Up window page
o	clickNextBtnWithoutEnteringNames() - Enters First and Last Name and calls clickNextButton()
o	nameErrorList() - Collects nameError in a list (if any).




