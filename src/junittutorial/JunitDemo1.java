package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class JunitDemo1 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test
	void redmine() {
		driver.get("https://www.redmine.org");
	}	
	
	@Test
	void twitter() {
		driver.get("https://www.twitter.com");
		
	}

}
