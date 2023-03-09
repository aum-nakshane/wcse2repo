package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/selenium%20data/web%20element/SSdropdown.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement dropdown=driver.findElement(By.id("i1"));
			Select sel= new Select(dropdown);
			sel.selectByIndex(2);
		}
	}