package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.selenium.dev");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.='Downloads']")).click();
		 Thread.sleep(2000);
		 WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		 
		 // To Perform Mouse Action Create Obj of Actions Class
		    Actions act = new Actions(driver);
		   act.contextClick(target).perform();
		   
		 
	}

}

