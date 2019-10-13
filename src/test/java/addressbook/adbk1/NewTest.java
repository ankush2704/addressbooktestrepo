package addressbook.adbk1;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;

	@BeforeMethod
	public void startBrowser(){
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("http://34.67.139.38:8080/addressbook/");
	}
	
	@AfterMethod
	public void close(){
		driver.quit();
	}
	
	@Test
	public void addAddree() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Ankush1");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Sawant1");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("1234567890");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("10/11/19");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();

	}
	@Test
	public void addAddree1() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Ankush1");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Sawant1");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("1234567890");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("10/11/19");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();

	}
}
