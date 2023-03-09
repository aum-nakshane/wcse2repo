package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(3000);
		
		//apply the filters
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click(); //core i5
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click(); //Brand
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (.='DELL')]")).click(); // Dell
		Thread.sleep(4000);
		String priceOfLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']) [1]")).getText();
        System.out.println(priceOfLaptop);
	}	
}
