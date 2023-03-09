package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator { 
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name^='u'")).sendKeys("mala_mahit_nahi_re");
	driver.findElement(By.cssSelector("input[name^='p'")).sendKeys("mala_mahit_nahi1234");
	driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
}
}
