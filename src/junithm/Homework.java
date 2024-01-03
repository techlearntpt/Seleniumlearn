package junithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Homework {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		Thread.sleep(6000);
		driver.manage().window().maximize();
		
	}

	 

	@Test
	void test() throws Exception   {
		Thread.sleep(1000);
	}

}
