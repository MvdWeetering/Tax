package codebase;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.AlgemeneVragenObjecten;
import pageObjects.LoginObjecten;
import pageObjects.NavigerenObjecten;

public class Inloggen {

	public static WebDriver GetDriver() {

		WebDriver driver = new ChromeDriver();
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
