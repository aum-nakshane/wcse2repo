package webdriverMethods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.instagram.com");
		Point targetPosition=new Point(375, 50);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(2000);
		Dimension targetSize = new Dimension(1500, 1000);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
}
