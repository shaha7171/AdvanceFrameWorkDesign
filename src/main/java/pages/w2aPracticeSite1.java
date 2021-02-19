package pages;

import org.openqa.selenium.By;

import testBase.TestBase;

public class w2aPracticeSite1 extends TestBase {
	
	
	By Link_Registration = By.xpath("//img[@src='images/registration.jpg']");	
	By Link_SignIn = By.xpath("//a[normalize-space()='Signin']");
	By txt_UserName = By.xpath("//div[@id='login']//input[@name='username']");
	By txt_Passwprd = By.xpath("//div[@id='login']//input[@name='password']");
	By btn_Submit = By.xpath("//div[@id='login']//input[@value='Submit']");
	By Registration = By.xpath("//h1[text()='Registration']");
	By DynamicElement_Dropdown= By.xpath("//h2[normalize-space()='Dropdown']");
	
	public void RegistrationFormSignIn() {
		explicitWaitConditions(Link_SignIn, "ETBC");
		click_custom(driver().findElement(Link_SignIn), "Registration Form Sign In");
		explicitWaitConditions(txt_UserName, "POEL");
		sendKeys_custom(driver().findElement(txt_UserName),"First Name", "a");
		sendKeys_custom(driver().findElement(txt_Passwprd),"Password","a");
		click_custom(driver().findElement(btn_Submit), "Clicking on submit button");
		extent().info("Sigining process is completed");
	}
	public void clickFormRegistrationLink() throws InterruptedException {
		//WaitFactory.getInstance().getWait().until(ExpectedConditions.textToBePresentInElementLocated(Link_Registration, "Registration"));
		//WaitFactory.getInstance().getWait().until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(Link_Registration)));
		//WaitFactory.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(DriverFactory.getInstance().getDriver().findElement(Link_Registration)));
		//Thread.sleep(2000);
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
	
	
}
