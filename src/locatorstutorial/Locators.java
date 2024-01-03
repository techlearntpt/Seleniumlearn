package locatorstutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void test() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("yugandhar");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".form-submit")).click();
	//	driver.findElement(By.cssSelector("input.form-submit")).click();
	//	driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("venkat");
	}
	
	@Disabled
	@Test
	void test1() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("News")).click();
		
	}
	
	@Disabled
	@Test
	void test2() throws InterruptedException {
		
		driver.get("https://www.ndtv.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		System.out.println("Total number of Links on NDTV :"+links.size());
		
		
	}
	
	@Test
	void xpath() throws InterruptedException {
		
		driver.get("http://www.hyderabadreport.com/user");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Raju");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("ABC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
		
	}
	
	@Test
	void redmine() throws InterruptedException {
		
		driver.get("https://www.redmine.org");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Lekha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[3]/div[2]/div[1]/form/label[3]/input")).click();		
		
	}
	
	

	@Test
	void facebook() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@class=''inputtext _55r1 _6luy]")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("\sujith");
		
	}
	@Disabled
	@Test
	void facebook1() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("lavan");
		
		
	}

}