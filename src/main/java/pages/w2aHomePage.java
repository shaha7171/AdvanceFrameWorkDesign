package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class w2aHomePage extends TestBase {
	WebDriverWait wait = null;
	By Resources = By.xpath("//a[text()='Resources']");
	By Link_PracticeSite1 = By.xpath("//a[text()='Practice site 1']");
	
	public void clickOnPractiseSiteOne() {
		explicitWaitConditions(Resources, "ETBC");
		moveToElement_custom(driver().findElement(Resources),"Resources");
		click_custom(driver().findElement(Link_PracticeSite1), "Practice Site 1");
		extent().info("Clicked on the Practice Site One");
		
	}
}
