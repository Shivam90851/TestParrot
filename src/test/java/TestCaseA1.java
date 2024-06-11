import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driversetup.DriverSet;

public class TestCaseA1 extends DriverSet {

	WebDriver driver;

	TestCaseA1() {
		DriverSet obj = new DriverSet();
		driver = obj.init();

	}

	@BeforeClass
	public void Link() {

		driver.get("https://demo.guru99.com/test/login.html");
	}

//	@FindBy(xpath = "//input[@id='email']")
//	WebElement email;
////
//@FindBy(xpath = "//input[@id='passwd']")
//WebElement Password;

	@Test
	public void FrameWork() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@id='email']")).click();
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shivam@12");
		
		driver.findElement(By.xpath("//input[@id='passwd']\"")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwd']\"")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		

//		Password.click();
//		Password.sendKeys("ABC");
	}

}
