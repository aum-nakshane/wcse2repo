package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(
				"https://accounts.snapchat.com/accounts/login?client_id=ads-api&referrer=https%25253A%25252F%25252Fads.snapchat.com%25252Fsetup");
		WebElement userNameTb = driver.findElement(By.cssSelector("input[id='username']")); // css selector

		// xpath by using multiple attribute
		WebElement passwordTb = driver.findElement(By.xpath("//input[@class='form-control' and (@id='password')]"));

		// xpath by using axes
		WebElement loginButton = driver.findElement(
				By.xpath("//div[@class='primary_action login-button'] / descendant :: button[@id='loginTrigger']"));

		userNameTb.sendKeys("gheherher");
		passwordTb.sendKeys("fg4rhtjhtj");
		loginButton.click();
	}

}
