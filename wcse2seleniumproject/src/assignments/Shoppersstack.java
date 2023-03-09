package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //implicitly wait
		
		driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__l4gLE']/descendant::img[@alt='Santoor']")).click();
        driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("789456");
        
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10)); // explicitly wait
        
        WebElement checkbutton= driver.findElement(By.xpath("//button[.='Check']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkbutton)).click();
        
        Thread.sleep(5000);
        driver.quit();
	}
}