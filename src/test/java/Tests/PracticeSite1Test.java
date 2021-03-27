package Tests;
import org.testng.annotations.Test;

import pages.w2aHomePage;
import pages.w2aPracticeSite1;
import testBase.TestBase;
public class PracticeSite1Test extends TestBase {
	w2aHomePage w2aHome = new w2aHomePage();
	w2aPracticeSite1 w2aPrac1 = new w2aPracticeSite1();
	@Test(enabled=true)
	public void OpenNewWindow() {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.clickFramesAndWindows();
		w2aPrac1.openNewWindowTest();
	}
	
	@Test(enabled=true)
	public void OpenSeprateNewWindow() {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.clickFramesAndWindows();
		w2aPrac1.openSeprateNewWindow();
	}
	
	@Test(enabled=true)
	public void FrameSet() {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.clickFramesAndWindows();
		w2aPrac1.frameSet();
	}
	
	
	@Test(enabled=true)
	public void SubmitButtonClicked() {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.SubmitButtonClicked();
		w2aPrac1.submitOperationsStartEndDynamic();
	}
	
	@Test(enabled=true)
	public void SelectDropDown() throws Throwable {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.selectDropdown();
		w2aPrac1.DropDownOperation();
	}
	
	@Test(enabled=true)
	public void Alert() throws InterruptedException {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.ClickAlert();
		w2aPrac1.AlertOprations();
		
	}
	
	@Test(enabled=true)
	public void Tabs() throws InterruptedException {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.clickTabs();
		w2aPrac1.TabsOpration();
		
	}
	
	@Test(enabled=true)
	public void Tooltip() throws InterruptedException {
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.clicktooltip();
		w2aPrac1.tooltipOperations();
	}
	
	@Test(enabled=true)
	public void Accordion(){
		w2aHome.clickOnPractiseSiteOne();
		w2aPrac1.RegistrationFormSignIn();
		w2aPrac1.clickAccordian();
		w2aPrac1.AccordianOperations();
	}
}
