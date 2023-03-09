package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {

	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Select Browser Which u want!!!");
		String browserValue= sc.next();
		
		if(browserValue.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	    	 driver=new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.get("https://www.selenium.dev");
		}
	    	 
	    	 else if(browserValue.equals("Edge"))
	    	 {
	    	 System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	 		WebDriver driver= new EdgeDriver();
	 		driver.manage().window().maximize();
	 		 driver.get("https://www.selenium.dev");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("select valid browserValue!!!");
			}
		}
	}