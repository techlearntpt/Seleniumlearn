package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileAttachment {
	WebDriver driver;

	@Test
	public void file() throws InterruptedException {
	driver.get("http://baalabharathi.com/upload-story/");	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@id='field-SUtF8PwfCXGXx46']")).sendKeys("Hello Tirupati");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("C:\\Users\\user\\Documents\\logo.png");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
