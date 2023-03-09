package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator3 {

 public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.shine.com/registration/");
  driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("564738290ghfjdksl");
  driver.findElement(By.id("id_email")).sendKeys("erty567");
  driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("2345678");
  driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("dfghj56");
  driver.findElement(By.id("registerButton")).click();
 }

}