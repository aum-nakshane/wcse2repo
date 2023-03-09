package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp1 {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("which browser u want to open?");
		String BrowserValue = sc.next();

		if(BrowserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if(BrowserValue.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}

		else
		{
			System.out.println("Enter Valid BrowserValue!!!");
		}

	}
}
