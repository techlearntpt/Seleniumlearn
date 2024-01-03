package testngtutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_3_Skip_Ignore_Disabled {
	WebDriver driver;

	@Test(priority=3,enabled=false)
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	
	@Test(enabled=false, priority=1)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(priority=5)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=2,enabled=true)
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(priority=0)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	
	@Test(priority=4,enabled=false)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

}
