package driversetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkSpace extends DriverSet {

	WebDriver driver;

	WorkSpace() {

		DriverSet obj = new DriverSet();
		driver = obj.init();

	}

	@BeforeClass
	public void before() {
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@Test
	public void Parrot() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(@href,'REPTILES')]")).click();
		Thread.sleep(300);

		driver.findElement(By.xpath("//a[contains(text(),'RP-LI-02')]")).click();
		Thread.sleep(300);

		driver.findElement(By.linkText("Add to Cart")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='EST-13']")).click();
		driver.findElement(By.xpath("//input[@name='EST-13']")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='EST-13']")).sendKeys("25");
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='updateCartQuantities']")).clear();
		Thread.sleep(300);
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("What to do next? Log in?");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']"))
				.sendKeys("by clicking on Log in everything disappears");
		// Thank you sir

	}

}
