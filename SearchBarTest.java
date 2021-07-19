package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarTest {

	public static void main(String[] args) throws InterruptedException {
		//Browser initialization and navigating to URL
		System.setProperty("webdriver.chrome.driver",
		"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.etsy.com/");
		
		
		driver.findElement(By.id("global-enhancements-search-query")).click();
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Blue shirt");;
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys(Keys.ENTER);
	}

}

//driver.findElement(By.id("global-enhancements-search-query")).click();
//driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Blue shirt");;
//driver.findElement(By.id("global-enhancements-search-query")).sendKeys(Keys.ENTER);