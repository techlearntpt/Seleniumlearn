package venkat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class work2 {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Readmine");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		
		
	}
	@Test
	void test1() throws InterruptedException {
		driver.get("\"http://baalabharathi.com/upload-story/");
		
			
	}	

}
