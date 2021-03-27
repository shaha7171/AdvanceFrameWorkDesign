package Tests;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.w2aHomePage;
import pages.w2aPracticeSite1;
import pages.w2aRegistrationPage;
import reusablemethods.ExcelOperations;
import testBase.ExtentFactory;
import testBase.TestBase;

public class RegistrationPageTest extends TestBase {
	w2aHomePage w2aHome = new w2aHomePage();
	w2aPracticeSite1 w2aPrac1 = new w2aPracticeSite1();
	w2aRegistrationPage w2aRegi = new w2aRegistrationPage();
	ExcelOperations excel = new ExcelOperations("RegistrationForm");
	
	@Test(dataProvider = "RegistrationForm")
	public void SubmitForm(Object obj1) throws Throwable {
		@SuppressWarnings("unchecked")
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		extent().info("Form registration initiated...");
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
	//	Thread.sleep(2000);
		w2aPrac1.clickFormRegistrationLink();
		w2aRegi.submitRegistrationForm(testData);
		ExtentFactory.getInstance().getExtent().info("Form registration Completed...");
	}
	
	@DataProvider (name = "RegistrationForm")
	public Object[][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[excel.getRowCount()][1];
		for (int i = 1; i <= excel.getRowCount(); i++) {
			HashMap<String, String> testData = excel.getTestDataInMap(i);
			obj[i-1][0] = testData;
		}
		return obj;
		
	}
			

}
