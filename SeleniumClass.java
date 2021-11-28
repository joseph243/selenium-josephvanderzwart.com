package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	private static WebDriver driver = new ChromeDriver();

	public static void openBrowser() {
		// Launch
		System.out.println("Launching Browser.");
		driver.navigate().to("http://josephvanderzwart.com/");
	}

	public static void quitBrowser() {
		// Quit
		System.out.println("Quitting Browser.");
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
