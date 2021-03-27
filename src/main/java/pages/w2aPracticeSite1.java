package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class w2aPracticeSite1 extends TestBase {

	By Link_Registration = By.xpath("//img[@src='images/registration.jpg']");
	By Link_SignIn = By.xpath("//a[normalize-space()='Signin']");
	By txt_UserName = By.xpath("//div[@id='login']//input[@name='username']");
	By txt_Passwprd = By.xpath("//div[@id='login']//input[@name='password']");
	By btn_Submit = By.xpath("//div[@id='login']//input[@value='Submit']");
	By Registration = By.xpath("//h1[text()='Registration']");
	By DynamicElement_Dropdown = By.xpath("//h2[normalize-space()='Dropdown']");
	By FramesAndWindows = By.xpath("//h2[normalize-space()='Frames and Windows']");
	By frame_FramesAndWindow = By.xpath("//div[@id='example-1-tab-1']//iframe[@class='demo-frame']");
	By frame_SeprateNewWindow = By.xpath("//div[@id='example-1-tab-2']//iframe[@class='demo-frame']");
	By frame_frameset = By.xpath("//div[@id='example-1-tab-3']//iframe[@class='demo-frame']");
	By Link_OpenNewWindow = By.xpath("//a[normalize-space()='Open New Window']");
	By Link_NewBrowserTab = By.xpath("//a[normalize-space()='New Browser Tab']");
	By Link_SeprateNewWindow = By.xpath("//a[normalize-space()='Open Seprate New Window']");
	By Link_FrameSet = By.xpath("//a[normalize-space()='Frameset']");
	By frame_Link_seprateWindow = By.xpath("//a[normalize-space()='Open New Seprate Window']");
	By frame_Link_OpenframesetWindow = By.xpath("//a[normalize-space()='Open Frameset Window']");
	By frameset_frame1 = By.xpath("//frame[@name='topFrame']");
	By frameset_frame2 = By.xpath("//frame[@name='contentFrame']");
	By frameset_frame1_headw2a = By.xpath("//h2[normalize-space()='www.way2automation.com']");
	By frameset_frame2_headw2a = By.xpath("//h2[normalize-space()='www.way2automation.com']");

	// Dynamic elements
	By Link_SubmitButtonClicked = By.xpath("//h2[normalize-space()='Submit Button Clicked']");
	By Link_StartWith = By.xpath("//a[normalize-space()='Starts With']");
	By frameStartWith = By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe");
	By txt_textStartWith = By.xpath("//input[@type='text']");
	By btn_StartWithSubmit = By.xpath("//input[starts-with(@id,'submit')]");
	By Link_EndWith = By.xpath("//a[normalize-space()='Ends With']");
	By frameEndWith = By.xpath("//div[@id='example-1-tab-2']//iframe[@class='demo-frame']");
	By txt_textEndWith = By.xpath("//input[@type='text']");
	By btn_EndWithSubmit = By.xpath("//input[@name='submit']");
	By Link_CompletedIDDynamic = By.xpath("//a[text()='Complete id Dynamic']");
	By frameDynamic = By.xpath("//div[@id='example-1-tab-3']//iframe[@class='demo-frame']");
	By txt_textDynamic = By.xpath("//input[@type='text']");
	By btn_DynamicSubmit = By.xpath("//input[@name='submit' and @value='submit']");

	// Dropdown
	By Link_Dropdown = By.xpath("//h2[normalize-space()='Dropdown']");
	By Link_SelectCountry = By.xpath("//a[normalize-space()='Select Country']");
	By frameSelectCountry = By.xpath("//iframe[@src='dropdown/default.html']");
	By DD_selctCountry = By.xpath("//body//select");
	By Link_EnterData = By.xpath("//a[normalize-space()='Enter Country']");
	By frameEnterData = By.xpath("//div[@id='example-1-tab-2']//iframe[@class='demo-frame']");
	By DD_EnterData = By.xpath("//select[@id='combobox']");
	By txt_EnterData = By.xpath(
			"//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']");
	By tip_EnterData = By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']");
	By tip_EnterDataValue = By.xpath("//option[@value='Algeria']");

	// Alert
	By Link_Alert = By.xpath("//h2[text()='Alert']");
	By frameSimpleAlert = By.xpath("//iframe[@src='alert/simple-alert.html']");
	By Link_SimpleAlert = By.xpath("//a[text()='Simple Alert']");
	By btn_AlertBox = By.xpath("//button[text()='Click the button to display an alert box:']");
	By link_inputAlert = By.xpath("//a[text()='Input Alert']");
	By frameinputAlert = By.xpath("//iframe[@src='alert/input-alert.html']");
	By btn_inputAlert = By.xpath("//button[text()='Click the button to demonstrate the Input box.']");

	// Widget
	// Tabs
	By Link_WidgetTabs = By.xpath("//h2[text()='Tabs']");
	By Link_Tabs = By.xpath("//li[@class='active']//a[contains(text(),'Tabs')]");
	By frameTabs = By.xpath("//iframe[@class='demo-frame']");
	By Link_Tab1 = By.xpath("//a[text()='Tab 1']");
	By Link_Tab2 = By.xpath("//a[text()='Tab 2']");
	By Link_Tab3 = By.xpath("//a[text()='Tab 3']");
	// Tooltip
	By Link_toolTip = By.xpath("//h2[text()='Tooltip']");
	By Link_toolTip_DefaultFunc = By.xpath("//a[text()='Default functionality']");
	By frameDefaultfunc = By.xpath("//div[@id='example-1-tab-1']//iframe[@class='demo-frame']");
	By txt_DefaultFuncAge = By.id("age");
	By tip_DefaultFuncAge = By.xpath("//input[@title='We ask for your age only for statistical purposes.']");
	By Link_tootlTip_CustomAnimationDemo = By.xpath("//a[normalize-space()='custom animation demo']");
	By frameCustomAnimationDemo = By.xpath("//div[@id='example-1-tab-2']//iframe[@class='demo-frame']");
	By Link_Show = By.id("show-option");
	By tip_Show = By.xpath("//*[@title='slide down on show']");
			//Accordian
	By Link_Accordian = By.xpath("//h2[text()='Accordion']");
	By Link_DefaultFunctionality = By.xpath("//a[text()='Default functionality']");
	By frameDefaultFunctionality = By.xpath("//div[@id='example-1-tab-1']//iframe[@class='demo-frame']");
	By Section_1 = By.xpath("//h3[text()='Section 1']");
	By Section_1_txt = By.xpath("//p[contains(text(),'Mauris mauris ante, blandit et, ultrices a, suscip')]");
	By Section_2 = By.xpath("//h3[text()='Section 2']");
	By Section_2_txt = By.xpath("//p[contains(text(),'Sed non urna. Donec et ante. Phasellus eu ligula. ')]");
	By Section_3 = By.xpath("//h3[text()='Section 3']");
	By Section_3_txt = By.xpath("//div[@id='ui-id-6']");
			
	

	public void RegistrationFormSignIn() {
		explicitWaitConditions(Link_SignIn, "ETBC");
		click_custom(driver().findElement(Link_SignIn), "Registration Form Sign In");
		explicitWaitConditions(txt_UserName, "POEL");
		sendKeys_custom(driver().findElement(txt_UserName), "First Name", "a");
		sendKeys_custom(driver().findElement(txt_Passwprd), "Password", "a");
		click_custom(driver().findElement(btn_Submit), "Clicking on submit button");
		extent().info("Sigining process is completed");
	}

	public void clickFormRegistrationLink() throws InterruptedException {
		refreshBrowser();
		CustomfluentWait(Link_Registration);
		click_custom(driver().findElement(Link_Registration), "Registration Form Link");
		extent().info("Clicked on form regisration link");
	}

	public void clickDynamicElementDropdownLink() throws InterruptedException {
		refreshBrowser();
		CustomfluentWait(DynamicElement_Dropdown);
		click_custom(driver().findElement(DynamicElement_Dropdown), "Dropdown Link");
		extent().info("Clicked on form Dropdown link");
	}

	public void clickFramesAndWindows() {
		refreshBrowser();
		CustomfluentWait(FramesAndWindows);
		click_custom(driver().findElement(FramesAndWindows), "FramesAndWindows");
		extent().info("Clicked on forms and windows");
		System.out.println(NumberOfFrames("iframe"));

		extent().info("Switched to the frame -> " + frame_FramesAndWindow);
		// Thread.sleep(2000);
		// click_custom(driver().findElement(Link_OpenNewWindow), "Open New Tab");
		// Thread.sleep(1000);

	}

	public void openNewWindowTest() {
		click_custom(driver().findElement(Link_OpenNewWindow), "Open New Tab");
		switchToFrame(frame_FramesAndWindow);
		click_custom(driver().findElement(Link_NewBrowserTab), "New Browser Tab");
		String mainWindow = switchtoNextWindow();
		System.out.println(driver().getTitle());
		System.out.println(driver().findElement(Link_NewBrowserTab).getText());
		closeAllOtherWindows(mainWindow);
		// click_custom(driver().findElement(Link_OpenNewWindow), "Open New Tab");
	}

	public void openSeprateNewWindow() {
		click_custom(driver().findElement(Link_SeprateNewWindow), "Open New Window");
		switchToFrame(frame_SeprateNewWindow);
		click_custom(driver().findElement(frame_Link_seprateWindow), "Open Seprate New Window");
		String mainWindow = switchtoNextWindow();
		System.out.println(driver().getTitle());
		System.out.println(driver().findElement(frame_Link_seprateWindow).getText());
		closeAllOtherWindows(mainWindow);
		switchtoDefaultFrame();
		System.out.println(driver().findElement(Link_OpenNewWindow).getText());

	}

	public void frameSet() {
		click_custom(driver().findElement(Link_FrameSet), "Frame set");
		switchToFrame(frame_frameset);
		click_custom(driver().findElement(frame_Link_OpenframesetWindow), "Open Frameset window");
		String mainWindow = switchtoNextWindow();
		System.out.println(driver().getTitle());
		switchToFrame(frameset_frame1);
		System.out.println(driver().findElement(frameset_frame1_headw2a).getText());
		switchtoDefaultFrame();
		switchToFrame(frameset_frame2);
		System.out.println(driver().findElement(frameset_frame2_headw2a).getText());
		closeAllOtherWindows(mainWindow);

	}

	public void SubmitButtonClicked() {
		refreshBrowser();
		CustomfluentWait(Link_SubmitButtonClicked);
		click_custom(driver().findElement(Link_SubmitButtonClicked), "Submit and clicked button");
		extent().info("Clicked on Submit and clicked link");
		System.out.println(NumberOfFrames("iframe"));
	}

	public void submitOperationsStartEndDynamic() {
		click_custom(driver().findElement(Link_StartWith), "Start with link");
		switchToFrame(frameStartWith);
		sendKeys_custom(driver().findElement(txt_textStartWith), "Sending text in start with", "Vishal");
		click_custom(driver().findElement(btn_StartWithSubmit), "Clicked on the start with submit button");
		switchtoDefaultFrame();

		click_custom(driver().findElement(Link_EndWith), "End with link");
		switchToFrame(frameEndWith);
		sendKeys_custom(driver().findElement(txt_textEndWith), "Sending text in End with", "Vishal2");
		click_custom(driver().findElement(btn_EndWithSubmit), "Clicked on the End with submit button");
		switchtoDefaultFrame();

		click_custom(driver().findElement(Link_CompletedIDDynamic), "dynamic with link");
		switchToFrame(frameDynamic);
		sendKeys_custom(driver().findElement(txt_textDynamic), "Sending text in dynamic with", "Vishal");
		click_custom(driver().findElement(btn_DynamicSubmit), "Clicked on the dynamic with submit button");
		switchtoDefaultFrame();

	}

	public void selectDropdown() {
		refreshBrowser();
		CustomfluentWait(Link_Dropdown);
		click_custom(driver().findElement(Link_Dropdown), "Drop Down Link");
		extent().info("Clicked on dropdown link");
		System.out.println(NumberOfFrames("iframe"));
	}

	public void DropDownOperation() throws Throwable {
		click_custom(driver().findElement(Link_SelectCountry), "Select Country");
		switchToFrame(frameSelectCountry);
		selectDropDownByVisibleText_custom(driver().findElement(DD_selctCountry), "Select dropdown by visible text",
				"Aruba");
		Thread.sleep(1000);
		selectDropDownByValue_custom(driver().findElement(DD_selctCountry), "Select dropdown by value ", "Guam");
		Thread.sleep(1000);
		sendKeys_custom(driver().findElement(DD_selctCountry), "Enter Data using sendkey", "India");

		switchtoDefaultFrame();
		click_custom(driver().findElement(Link_EnterData), "Enter Data in DD");
		switchToFrame(frameEnterData);
		driver().findElement(txt_EnterData).clear();
		sendKeys_custom(driver().findElement(txt_EnterData), "Select Enter data", "India");
		Thread.sleep(1000);

	}

	public void ClickAlert() {
		refreshBrowser();
		CustomfluentWait(Link_Alert);
		click_custom(driver().findElement(Link_Alert), "Alert Link");
		extent().info("Clicked on Alert link");
		System.out.println(NumberOfFrames("iframe"));
	}

	public void AlertOprations() throws InterruptedException {
		click_custom(driver().findElement(Link_SimpleAlert), "Simple Alert");
		switchToFrame(frameSimpleAlert);
		click_custom(driver().findElement(btn_AlertBox), "Alert Box");
		extent().info("Simple Alert oprations are successfully completed");
		custom_alertaccept();
		switchtoDefaultFrame();
		click_custom(driver().findElement(link_inputAlert), "input Alert");
		switchToFrame(frameinputAlert);
		click_custom(driver().findElement(btn_inputAlert), "Input Alert Button");
		custom_alertsendkeys("Vishal");
		Thread.sleep(2000);
		custom_alertaccept();
		extent().info("Sendkey Alert oprations are successfully completed");
	}

	public void clickTabs() {
		refreshBrowser();
		CustomfluentWait(Link_WidgetTabs);
		click_custom(driver().findElement(Link_WidgetTabs), "Tabs Link");
		extent().info("Clicked on Tabs link");
		System.out.println(NumberOfFrames("iframe"));
	}

	public void TabsOpration() throws InterruptedException {
		click_custom(driver().findElement(Link_Tabs), "Main Tab button");
		switchToFrame(frameTabs);
		click_custom(driver().findElement(Link_Tab1), "Tab1");
		Thread.sleep(1000);
		click_custom(driver().findElement(Link_Tab2), "Tab2");
		Thread.sleep(1000);
		click_custom(driver().findElement(Link_Tab3), "Tab3");
		Thread.sleep(1000);
	}

	public void clicktooltip() {
		refreshBrowser();
		CustomfluentWait(Link_toolTip);
		click_custom(driver().findElement(Link_toolTip), "Tooltip Link");
		extent().info("Clicked on Tooltip link");
		System.out.println(NumberOfFrames("iframe"));
	}

	public void tooltipOperations() {
		click_custom(driver().findElement(Link_tootlTip_CustomAnimationDemo), "Custom animaiton Demo");
		switchToFrame(frameCustomAnimationDemo);
		WebElement ShowLink = driver().findElement(Link_Show);
		String tooltipTextShow = ShowLink.getAttribute("title");
		System.out.println("Retrieved tooltip text as :" + tooltipTextShow);
		switchtoDefaultFrame();
		click_custom(driver().findElement(Link_toolTip_DefaultFunc), "Tootl tip default function");
		switchToFrame(frameDefaultfunc);
		WebElement ageTextBox = driver().findElement(txt_DefaultFuncAge);
		String tooltipText = ageTextBox.getAttribute("title");
		System.out.println("Retrieved tooltip text as :" + tooltipText);
	}
	
	public void clickAccordian() {
		refreshBrowser();
		CustomfluentWait(Link_Accordian);
		click_custom(driver().findElement(Link_Accordian), "Accordian Link");
		extent().info("Clicked on Accordian link");
		System.out.println(NumberOfFrames("iframe"));
	}
	
	public void AccordianOperations() {
		click_custom(driver().findElement(Link_DefaultFunctionality), "Clicking on Default functionality");
		switchToFrame(frameDefaultFunctionality);
		click_custom(driver().findElement(Section_1), "clicking on the section 1");
		System.out.println(driver().findElement(Section_1_txt).getText());
		click_custom(driver().findElement(Section_2), "clicking on the section 2");
		isElementPresent_custom(driver().findElement(Section_2_txt), "section 2 text");
		System.out.println(driver().findElement(Section_2_txt).getText());
		click_custom(driver().findElement(Section_3), "clicking on the section 3");

		//switchtoDefaultFrame();
		
	}
}

