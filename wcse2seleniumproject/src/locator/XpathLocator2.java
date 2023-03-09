package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name, 'username')]")).sendKeys("hghgfvikhggogvo");
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("hghgfv@1213242344");
		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Forgot ')]")).click();
	}
}
