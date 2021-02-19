package testBase;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFactory {
	// Singleton design Pattern
	// private constructor so that no one else can create object of this class
	private WaitFactory() {

	}

	private static WaitFactory instance = new WaitFactory();

	public static WaitFactory getInstance() {
		return instance;
	}

	// factory design pattern --> define separate factory methods for creating
	// objects and create objects by calling that methods
	ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setWait(WebDriverWait waitTestObject) {
		wait.set(waitTestObject);
	}

	public void removeWaitObject() {
		wait.remove();
	}
}
