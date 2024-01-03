package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RDDDMK {
	WebDriver driver;

	@Test(enabled = true)
	public void rightclick() throws Exception {
		driver.get("http://www.seleniumlearn.com");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Testing']"))).build().perform();
	}

	@Test(enabled = true)
	public void doubleclick() throws Exception {
		driver.get("http://www.seleniumlearn.com/double-click");
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me!']"))).doubleClick()
				.build().perform();

	}

	@Test(enabled=true)
	public void draganddrop() throws Exception {
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source, target).build().perform();
		
		

	//	WebElement my = driver.findElement(By.xpath("//a[normalize-space()='MySQL']"));
	//	my.click();

	}
	
	@Test(enabled=true)
	public void mousehover() throws Exception {
		driver.get("http://www.seleniumlearn.com/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Interview Q&A']"))).click().build().perform();
		
	}
	
	
	@Test
	public void keyboardfunctions() throws Exception {
		driver.get("https://redmine.org/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();		

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
