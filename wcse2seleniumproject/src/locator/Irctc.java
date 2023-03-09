package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);  // AC First Class
		driver.findElement(By.xpath("//div[contains(@class,'ui-dropdown-label-container ng-tns-c65-11')]")).click();
		driver.findElement(By.xpath("//span [.= 'AC First Class (1A) ']")).click();
	
		Thread.sleep(2000);   // date
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext ')]")).click();
		driver.findElement(By.xpath("//a[.='11']")).click();
	
		Thread.sleep(2000);   // Tatkal
		driver.findElement(By.xpath("//div[contains(@class,'ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-12')]")).click();
		driver.findElement(By.xpath("//span[.='TATKAL']")).click();
		
		Thread.sleep(2000);   // From
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui')]")).sendKeys("Pune");
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='PUNE JN - PUNE')]")).click();
	
		Thread.sleep(2000);   // To
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c57-9 ng-star-inserted') and (.='MUMBAI CENTRAL - MMCT')]")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@class='search_btn train_Search']")).click();
	}
}
