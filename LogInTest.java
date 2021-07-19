package seleniumTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogInTest {

	public static void main(String[] args) throws InterruptedException {
		//Browser initialization and navigating to URL
		System.setProperty("webdriver.chrome.driver",
		"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.etsy.com/");
		
		//Finding WebElements

		WebElement signIn = driver.findElement(By.cssSelector("#gnav-header-inner > div.wt-flex-shrink-xs-0 > nav > ul > li:nth-child(1) > button"));
		signIn.click();

		WebElement emailBox = driver.findElement(By.id("join_neu_email_field"));
		emailBox.sendKeys("heetyunphfrynyhavi@uivvn.net");
		WebElement continueBtn = driver.findElement(By.name("submit_attempt"));
		continueBtn.click();
		Thread.sleep(2000);
		WebElement pwBox = driver.findElement(By.id("join_neu_password_field"));
		pwBox.click();
		pwBox.sendKeys("darko123!");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"join-neu-form\"]/div[2]/div/div[6]/div/button"));
		submit.click();
	
		driver.close();
		
		
		
//		driver.findElement(By.id("global-enhancements-search-query")).click();
//		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Blue shirt");;
//		driver.findElement(By.id("global-enhancements-search-query")).sendKeys(Keys.ENTER);
		}

	
}
