package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {
	
//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	//	driver = new EdgeDriver();
	//	driver = new ChromeDriver();
	//	driver = new FirefoxDriver();
	//	driver.manage().window().maximize();
	//	driver.manage().window().minimize();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
	//	driver.close();
		driver.quit();

	}

}
