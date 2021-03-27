package reusablemethods;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.base.Function;

import testBase.DriverFactory;
import testBase.ExtentFactory;
import testBase.WaitFactory;

public class ActionEngine {
	// Calling driver
	public WebDriver driver() {
		return DriverFactory.getInstance().getDriver();
	}

	// Calling ExtentTest
	public ExtentTest extent() {
		return ExtentFactory.getInstance().getExtent();
	}

	// Calling WebDriverWait
	public WebDriverWait CustomWait() {
		return WaitFactory.getInstance().getWait();
	}

	// Refreshing Browser
	public void refreshBrowser() {
		DriverFactory.getInstance().getDriver().navigate().refresh();
		extent().info("refreshing page");
	}

	// Explicit Wait initialization
	public WebDriverWait explicitwait() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getDriver(), 5);
		return wait;
	}

	// Customized send keys method-> To log send keys message for every occ.
	public void sendKeys_custom(WebElement element, String fieldName, String valueToBeSent) {
		try {
			element.sendKeys(valueToBeSent);
			// log success message in exgent report
			// ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==>
			// Entered value as: "+valueToBeSent);
			extent().log(Status.PASS, fieldName + "==> Entered value as: " + valueToBeSent);
		} catch (Exception e) {
			// log failure in extent
			extent().log(Status.FAIL, "Value enter in field: " + fieldName + " is failed due to exception: " + e);
		}

	}

	// custom click method to log every click action in to extent report
	public void click_custom(WebElement element, String fieldName) {
		try {
			element.click();
			// log success message in extent report
			extent().log(Status.PASS, fieldName + "==> Clicked Successfully! ");
		} catch (Exception e) {
			// log failure in extent
			extent().log(Status.FAIL, "Unable to click on field: " + fieldName + " due to exception: " + e);
		}
	}

	// clear data from field
	public void clear_custom(WebElement element, String fieldName) {
		try {
			element.clear();
			Thread.sleep(250);
			extent().log(Status.PASS, fieldName + "==> Data Cleared Successfully! ");
		} catch (Exception e) {
			extent().log(Status.FAIL, "Unable to clear Data on field: " + fieldName + " due to exception: " + e);

		}
	}

	// custom mouseHover
	public void moveToElement_custom(WebElement element, String fieldName) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(DriverFactory.getInstance().getDriver());
			actions.moveToElement(element).build().perform();
			extent().log(Status.PASS, fieldName + "==> Mouse hovered Successfully! ");
			Thread.sleep(1000);
		} catch (Exception e) {
			extent().log(Status.FAIL, "Unable to hover mouse on field: " + fieldName + " due to exception: " + e);

		}
	}

	// check if element is Present
	public boolean isElementPresent_custom(WebElement element, String fieldName) {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
			extent().log(Status.PASS, fieldName + "==> Presence of field is: " + flag);
			return flag;
		} catch (Exception e) {
			extent().log(Status.FAIL,
					"Checking for presence of field: " + fieldName + " not tested due to exception: " + e);
			return flag;
		}
	}

	// Select drop down value value by visibleText
	public void selectDropDownByVisibleText_custom(WebElement element, String fieldName, String ddVisibleText)
			throws Throwable {
		try {
			Select s = new Select(element);
			s.selectByVisibleText(ddVisibleText);
			extent().log(Status.PASS, fieldName + "==> Dropdown Value Selected by visible text: " + ddVisibleText);
		} catch (Exception e) {
			extent().log(Status.FAIL,
					"Dropdown value not selected for field: " + fieldName + "  due to exception: " + e);
		}
	}

	// Select drop down value value by value
	public void selectDropDownByValue_custom(WebElement element, String fieldName, String ddValue) throws Throwable {
		try {
			Select s = new Select(element);
			s.selectByValue(ddValue);
			extent().log(Status.PASS, fieldName + "==> Dropdown Value Selected by visible text: " + ddValue);
		} catch (Exception e) {
			extent().log(Status.FAIL,
					"Dropdown value not selected for field: " + fieldName + "  due to exception: " + e);
		}
	}

	// String Asserts
	public void assertEqualsString_custom(String expvalue, String actualValue, String locatorName) throws Throwable {
		try {
			if (actualValue.equals(expvalue)) {
				extent().log(Status.PASS, "String Assertion is successful on field " + locatorName
						+ " Expected value was: " + expvalue + " actual value is: " + actualValue);
			} else {
				extent().log(Status.FAIL, "String Assertion FAILED on field " + locatorName + " Expected value was: "
						+ expvalue + " actual value is: " + actualValue);
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.toString());
		}
	}

	// Get text from WebElement
	public String getText_custom(WebElement element, String fieldName) {
		String text = "";
		try {
			text = element.getText();
			extent().log(Status.PASS, fieldName + "==> Text retried is: " + text);
			return text;
		} catch (Exception e) {
			extent().log(Status.FAIL, fieldName + "==> Text not retried due to exception: " + e);

		}
		return text;
	}

	// Selecting Radio button value
	public void selectRadioBtnVal(List<WebElement> element, String fieldName, String RadioValue) {

		try {
			for (WebElement ref : element) {
				String val = ref.getText();
				if (val.equals(RadioValue)) {
					ref.click();
					extent().log(Status.PASS, fieldName + "==> Radio button is clicked! ");
					break;
				}
			}

		} catch (Exception e) {
			// log failure in extent
			extent().log(Status.FAIL, "Unable to click on Radio button: " + fieldName + " due to exception: " + e);
		}

	}

	// Selecting check box values
	public void selectCheckBxVals(List<WebElement> element, String fieldName, String check) {
		try {
			String[] strArray = check.split(",");
			for (String str : strArray) {
				for (WebElement ele : element) {
					if (ele.getText().equalsIgnoreCase(str.trim())) {
						ele.click();
						// log success message in extent report
						extent().log(Status.PASS, str + "==> Clicked on check box Successfully! ");
						break;
					}
				}
			}
		} catch (Exception e) {
			// log failure in extent
			extent().log(Status.FAIL, "Unable to click on field: " + fieldName + " due to exception: " + e);
		}

	}

	// Adding AJAX wait ??????

	// Fluent Wait
	public void CustomfluentWait(By locator) {
		@SuppressWarnings("unchecked")
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(DriverFactory.getInstance().getDriver())
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
				.withMessage("User defined Timed out after 20 seconds").ignoring(NoSuchElementException.class);

		WebElement element = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver d) {
				return driver().findElement(locator);
			}
		});
		extent().log(Status.PASS, "Used Fluent Wait on " + locator);
	}

	// Explicit Wait
	public void explicitWaitConditions(By locator, String type) {

		if (type.equals("ETBC")) {
			try {
				CustomWait().until(ExpectedConditions.elementToBeClickable(locator));
				// WaitFactory.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(locator));
				extent().log(Status.PASS, "ExplicitWait were called and checked elementToBeClickable");
			} catch (Throwable t) {
				t.printStackTrace();
				extent().log(Status.FAIL, "Failed to call Explicit Wait to check elementToBeClickable");
			}
		} else if (type.equals("POEL")) {
			try {
				CustomWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
				extent().log(Status.PASS, "ExplicitWait were called and checked presenceOfAllElementsLocatedBy");
			} catch (Throwable t) {
				t.printStackTrace();
				extent().log(Status.FAIL, "Failed to call Explicit Wait to check presenceOfAllElementsLocatedBy");
			}
		}
	}

	// iframes
	/*
	 * Parameters: Index - (zero-based) index Returns: driver focused on the given
	 * frame (current frame) Throws: NoSuchFrameException - If the frame is not
	 * found.
	 */
	public void switchToFrame(int frame) {
		try {
			driver().switchTo().frame(frame);
			extent().log(Status.PASS, "Navigated to frame with index " + frame);
		} catch (NoSuchFrameException e) {
			extent().log(Status.FAIL, "Unable to locate frame with index " + frame + "  " + e.getStackTrace());
		} catch (Exception e) {
			extent().log(Status.FAIL, "Unable to locate frame with index " + frame + "  " + e.getStackTrace());
		}
	}

	/*
	 * Parameters: name Or Id - the name of the frame or the id of the frame
	 * element. Returns: driver focused on the given frame (current frame) Throws:
	 * NoSuchFrameException - If the frame is not found
	 */

	public void switchToFrame(String frameNameorID) {
		try {
			driver().switchTo().frame(frameNameorID);
			extent().log(Status.PASS, "Navigated to frame with Name or ID " + frameNameorID);
		} catch (NoSuchFrameException e) {
			extent().log(Status.FAIL,
					"Unable to locate frame with Name or ID " + frameNameorID + " => " + e.getStackTrace());
		} catch (Exception e) {
			extent().log(Status.FAIL,
					"Unable to locate frame with Name or ID  " + frameNameorID + " => " + e.getStackTrace());
		}
	}

	/*
	 * Parameters: frameElement - The frame element to switch to. Returns: driver
	 * focused on the given frame (current frame). Throws: NoSuchFrameException - If
	 * the given element is neither an iframe nor a frame element. And
	 * StaleElementReferenceException - If the WebElement has gone stale.
	 */

	public void switchToFrame(By frameElement) {
		try {
			if (isElementPresent_custom(driver().findElement(frameElement), "verifying presence of frame")) {

				driver().switchTo().frame(driver().findElement(frameElement));

				extent().log(Status.PASS, "Navigated to frame with element " + frameElement);
			} else {
				extent().log(Status.FAIL,
						"Frame is displayed but unable to navigate to frame with element " + frameElement);
			}
		} catch (NoSuchFrameException e) {
			extent().log(Status.FAIL, "Unable to locate frame with element " + frameElement + e.getStackTrace());
		} catch (StaleElementReferenceException e) {
			extent().log(Status.FAIL,
					"Element with " + frameElement + "is not attached to the page document" + e.getStackTrace());
		} catch (Exception e) {
			extent().log(Status.FAIL, "Unable to navigate to frame with element " + frameElement + e.getStackTrace());
		}
	}

	/*
	 * Some times when there are multiple Frames (Frame in side a frame), we need to
	 * first switch to the parent frame and then we need to switch to the child
	 * frame.
	 */

	public void switchToFrame(String ParentFrameNameorID, String ChildFrameNameorID) {
		try {
			driver().switchTo().frame(ParentFrameNameorID).switchTo().frame(ChildFrameNameorID);
			extent().log(Status.PASS, "Navigated to innerframe with id " + ChildFrameNameorID
					+ "which is present on frame with id" + ParentFrameNameorID);
		} catch (NoSuchFrameException e) {
			extent().log(Status.FAIL, "Unable to locate frame with id " + ParentFrameNameorID + " or "
					+ ChildFrameNameorID + e.getStackTrace());
		} catch (Exception e) {
			extent().log(Status.FAIL, "Unable to navigate to innerframe with id " + ChildFrameNameorID
					+ "which is present on frame with id" + ParentFrameNameorID + e.getStackTrace());
		}
	}

	/*
	 * After working with the frames, main important is to come back to the web
	 * page. if we don't switch back to the default page, driver will throw an
	 * exception.
	 */

	public void switchtoDefaultFrame() {
		try {
			driver().switchTo().defaultContent();
			extent().log(Status.PASS, "Navigated back to webpage from frame");
		} catch (Exception e) {
			extent().log(Status.FAIL, "unable to navigate back to main webpage from frame" + e.getStackTrace());
		}
	}

	// Finding total number of frames on the page
	public int NumberOfFrames(String tagName) {
		extent().info("Finding total Number of frames on the page");
		List<WebElement> frames = driver().findElements(By.tagName(tagName));
		return frames.size();

	}

	// Window Handling
	public String switchtoNextWindow() {
		String mainwindow = driver().getWindowHandle();
		try {

			Set<String> s1 = driver().getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String ChildWindow = i1.next();
				if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
					driver().switchTo().window(ChildWindow);
					extent().log(Status.PASS, "Swithched to the next window => " + ChildWindow);
				}
			}

		} catch (Exception e) {
			extent().log(Status.FAIL, "Failed while switching to the next window " + e.getStackTrace());
		}
		return mainwindow;
	}

	// To close all the other windows except the main window.
	public void closeAllOtherWindows(String mainwindow) {

		try {
			Set<String> s1 = driver().getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String ChildWindow = i1.next();
				if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
					driver().switchTo().window(ChildWindow);
					String title = driver().getTitle();
					driver().close();
					extent().log(Status.PASS, "Closed the next window => " + title);
				}
			}

		} catch (Exception e) {
			extent().log(Status.FAIL, "Failed while closing to child window " + e.getStackTrace());
		}

		driver().switchTo().window(mainwindow);
		String title = driver().getTitle();

		if (driver().getWindowHandles().size() == 1) {
			extent().log(Status.PASS, "Swithched to the main window => " + title);
		} else {
			extent().log(Status.FAIL,
					"Switched to the main window but mismatching the size of the total windows => " + title);
		}
	}

	// Alert and popups
	public String custom_alertaccept() {
		String Alerttext;
		 Alert alert = driver().switchTo().alert();	
		 Alerttext = alert.getText();
		try {
	        alert.accept();
	        extent().log(Status.PASS, "Accepted the alert ");
		} catch(Exception e) {
			extent().log(Status.FAIL, "Failed to accept the alert " + e.getStackTrace());
		}
		return Alerttext;
	}

	public void custom_alertgetText() {
		String Alerttext;
		 Alert alert = driver().switchTo().alert();	
		 Alerttext = alert.getText();
		 extent().log(Status.PASS, "Alert text is => "+Alerttext);
		 
	}

	public String custom_alertdismiss() {
		String Alerttext;
		 Alert alert = driver().switchTo().alert();	
		 Alerttext = alert.getText();
		try {
	        alert.dismiss();
	        extent().log(Status.PASS, "Dismissed the alert ");
		} catch(Exception e) {
			extent().log(Status.FAIL, "Failed to dismisss the alert " + e.getStackTrace());
		}
		return Alerttext;
	}

	public void custom_alertsendkeys(String text) {
	
		try {
			 Alert alert = driver().switchTo().alert();	
	        alert.sendKeys(text);
	        extent().log(Status.PASS, "Text has beedn entered -> "+ text);
		} catch(Exception e) {
			extent().log(Status.FAIL, "Failed to entered the given text " + e.getStackTrace());
		}
	}

}
