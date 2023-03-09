package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/?cp=76060516106_aff_HKtG81k*FmE&ranMID=41134&ranEAID=HKtG81k*FmE&ranSiteID=HKtG81k.FmE-ZsNGw0p663CeKnaKVRRZjg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("dgsfhfhehrhrhejjthtejetj");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hftjrtjtrjryjkryjkryjkrykktkkk");
		driver.findElement(By.id("0b49808d-e3ad-4d66-8e34-a35055818578")).click();
		driver.close();
	}

}
