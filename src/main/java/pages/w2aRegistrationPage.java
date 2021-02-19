package pages;
import java.util.HashMap;

import org.openqa.selenium.By;

import testBase.TestBase;

public class w2aRegistrationPage extends TestBase {
	By txt_FirstName = By.xpath("//input[@name='name']");
	By txt_LastName = By.xpath("//p[2]//input[1]");
	By rdo_MaritalStatus = By.xpath("//label[normalize-space()='Single']");
	By chx_Hobby = By.xpath("//label[normalize-space()='Single']");
	By DD_Country =  By.xpath("//*[@id=\"register_form\"]/fieldset[4]/select");
	By DD_DOB_Month = By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select");  
	By DD_DOB_Day = By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select");
	By DD_DOB_Year =  By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select");
	By txt_PhoneNumber = By.xpath("//input[@name='phone']");
	By txt_UserName = By.xpath("//input[@name='username']");
	By txt_Email =  By.xpath("//input[@name='email']");
	By btn_ProfilePic = By.xpath("//input[@type='file']");
	By txt_AboutYourSelf = By.xpath("//form[@id='register_form']//fieldset//textarea");
	By txt_Password = By.xpath("//input[@name='password']");
	By txt_ConfirmPassword = By.xpath("//input[@name='c_password']");
	By btn_Submit = By.xpath("//input[@value='submit']");
	
	public void submitRegistrationForm(HashMap<String, String> testData) throws Throwable {
		
		sendKeys_custom(driver().findElement(txt_FirstName),"First Name", testData.get("FirstName"));
		sendKeys_custom(driver().findElement(txt_LastName),"Last Name", testData.get("LastName"));
		selectRadioBtnVal(driver().findElements(rdo_MaritalStatus), "Marital Status", testData.get("Marital"));
		selectCheckBxVals(driver().findElements(chx_Hobby), "Hobby selection", testData.get("Hobby"));
		selectDropDownByVisibleText_custom(driver().findElement(DD_Country),"CountryDD",testData.get("Country"));
		selectDropDownByVisibleText_custom(driver().findElement(DD_DOB_Day),"DayDD",testData.get("DobDay"));
		selectDropDownByVisibleText_custom(driver().findElement(DD_DOB_Month),"MonthDD",testData.get("DobMonth"));
		selectDropDownByVisibleText_custom(driver().findElement(DD_DOB_Year),"YearDD",testData.get("DobYear"));
		sendKeys_custom(driver().findElement(txt_PhoneNumber),"Phone Number", testData.get("PhoneNumber"));
		sendKeys_custom(driver().findElement(txt_UserName),"User Name", testData.get("UserName"));
		sendKeys_custom(driver().findElement(txt_Email),"Email", testData.get("Email"));
		sendKeys_custom(driver().findElement(txt_AboutYourSelf),"About yourself", testData.get("About"));
		sendKeys_custom(driver().findElement(txt_Password),"Password", testData.get("Password"));
		sendKeys_custom(driver().findElement(txt_ConfirmPassword),"Confirm Password", testData.get("RePassword"));
		click_custom(driver().findElement(btn_Submit), "Clicking on submit button");
		extent().pass("Submitted Regisration form successfully");
	}
}
