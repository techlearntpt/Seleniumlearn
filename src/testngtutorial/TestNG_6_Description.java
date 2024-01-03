package testngtutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_6_Description {
	WebDriver driver;

	@Test(description="Top Menu Items")
	public void RM_1() {
		driver.findElement(By.xpath("//a[@class='home']")).click();
	}
	
	@Test(description="Sign in Module")
	public void RM_2() {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("techlearn");
	}
	
	@Test(description="Registration Module")
	public void RM_3() {
		driver.findElement(By.xpath("//*[@id=\"account\"]/ulghtf/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("techlearn");
	}
	
	@Test(description="Search")
	public void RM_4() {		
		driver.findElement(By.xpath("//input[@id='a']")).sendKeys("Java");
	}
	
	@Test(description="Logo")
	public void RM_5() {		
		driver.findElement(By.xpath("//h1[normalize-space()='Redmine']")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redmine.org/");
	}

}
