package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
	}
}
