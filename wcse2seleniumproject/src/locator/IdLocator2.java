package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.snapchat.com/accounts/login");     // SNAPCHAT
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("xyz");
		Thread.sleep(3000);
		driver.findElement(By.id("loginTrigger")).click();
		Thread.sleep(10000); 
		driver.quit();

	}
}
