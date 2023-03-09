package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://zero.webappsecurity.com/");     // Zero Web Security
		Thread.sleep(3000);
		driver.findElement(By.id("signin_button")).click();		
		Thread.sleep(10000);
		driver.quit();  

	}
}
