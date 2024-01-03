package alertpopwindowhandles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AlertWindowHandles {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void clickonokbutton() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	
	@Disabled
	@Test
	void clickoncancelbutton() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	void sendtextclickonokbutton() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Raaju");
		alt.accept();
		
	/*	driver.switchTo().alert().sendKeys("Venkat");
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); */
		
		
	}

}
