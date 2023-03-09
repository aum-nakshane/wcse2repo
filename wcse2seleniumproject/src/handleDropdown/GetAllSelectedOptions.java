package handleDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/selenium%20data/web%20element/MSdropdown.html");

		WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='menu']"));

		Select sel = new Select(dropDownElement);

		for (int i = 0; i < 5; i++) {
			sel.selectByIndex(i);
		}

		List<WebElement> allOps = sel.getAllSelectedOptions();

		for (WebElement we : allOps) {
			String options = we.getText();
			System.out.println(options);
		}

	}

}
