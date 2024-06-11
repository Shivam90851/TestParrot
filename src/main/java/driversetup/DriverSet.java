package driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSet {
	public WebDriver init() {

		String DriverPath = ("D:\\eclipse - coding\\AdaniHub\\src\\main\\resources\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", DriverPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}
}
