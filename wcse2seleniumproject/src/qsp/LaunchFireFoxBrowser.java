package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		new FirefoxDriver();

	}

}
