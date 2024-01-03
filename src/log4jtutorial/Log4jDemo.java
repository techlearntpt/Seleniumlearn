package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;

	@Test
	public void googlesearch() throws InterruptedException {

		Logger log = Logger.getLogger("Search");
		PropertyConfigurator.configure("Log4j.properties");

		driver = new ChromeDriver();
		log.info("Chrome Browser is Launched");
		
		driver.manage().window().maximize();
		log.info("Browser window Maximed");
		
		driver.get("https://www.google.com");
		log.info("To navigate to the Google Application");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		log.info("Enter the Selenium text in Google Search");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter Button click on keyboard");
		
		Thread.sleep(3000);
		log.info("Wait for 3 Seconds");
		
		
		

	}
}
