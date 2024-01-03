package pagescrolldownup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class PageDownandUp {
	WebDriver driver;

	@Test
	public void selenium() throws Exception {
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 3300)");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='releases']")).click();
	}
	
	
	@Test
	public void selectedlocator() throws Exception {
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		Thread.sleep(3000);

		 WebElement element = (WebElement) driver.findElement(By.xpath("//a[normalize-space()='releases']"));
	     Coordinates coordinate = ((Locatable)element).getCoordinates(); 
         coordinate.onPage(); 
         coordinate.inViewPort();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='releases']")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
