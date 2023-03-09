package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
static WebDriver driver;
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
    	WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https:/www.instagram.com/");
    	 System.out.println(driver.getTitle());
	}

}
