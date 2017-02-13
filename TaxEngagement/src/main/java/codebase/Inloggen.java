package codebase;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.LoginObjecten;
import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inloggen {

	public static WebDriver GetDriver() {

		//Lokaal
		WebDriver driver = new ChromeDriver();
		
		
		//Server 
		/*
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(
			        new URL("http://10.10.0.51:4444/wd/hub"), DesiredCapabilities.chrome());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver LoginWithCredentials(String UserName, String Password) throws InterruptedException {

		WebDriver driver = GetDriver();
		LoginObjecten.UserName(driver).sendKeys(UserName);
		LoginObjecten.PassWord(driver).sendKeys(Password);
		LoginObjecten.buttonInloggen(driver).click();

		return driver;

	}

	public static void main(String[] args) throws InterruptedException {
		LoginWithCredentials("Michel.van.de.Weetering@caseware.nl", "Welkom01");

	}

}
