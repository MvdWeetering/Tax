package codebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginObjecten;
import steps.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Inloggen {

	public static WebDriver GetDriver(String driversoort) throws Exception {

		Browsers testBrowser = Browsers.toEnum(driversoort);
		Class<? extends WebDriver> testBrowserClass = testBrowser.getBrowserWebDriver();
		
		WebDriver driver = null;
		try {
			driver = testBrowserClass.newInstance();
		} catch (Exception e) {
			throw new Exception(e);
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	
	}

}
