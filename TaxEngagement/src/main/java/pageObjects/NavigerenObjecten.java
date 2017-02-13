package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {

	
	private static WebElement element = null;
	
	public static WebElement NavigerenTax(WebDriver driver){
	    
		WebElement parentElement = driver.findElement(By.className("GOMEOCKDEJD"));
		WebElement childElement = parentElement.findElement(By.className("GOMEOCKDCJD"));
		return childElement;
	}
	
	public static WebElement NavigerenAlgemeneVragen(WebDriver driver){
	    element = driver.findElement(By.linkText("Algemene Vragen"));
		return element;
	}
	
	public static WebElement ClickCloud(WebDriver driver){
	    element = driver.findElement(By.className(("GOMEOCKDB3C")));
		return element;
	}
	
}
