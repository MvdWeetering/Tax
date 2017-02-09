package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {

	
	private static WebElement element = null;
	
	public static WebElement NavigerenTax(WebDriver driver){
	    String NavUrl = null;
	    NavUrl = "https://eu.casewarecloud.com/nl-se-develop/webapps/#Files?viewkey=CustomBundle9&filter=NL+Tax+Engagement&entityId=-1";
	    driver.get(NavUrl);
		return element;
	}
	
	
	public static WebElement NavigerenAlgemeneVragen(WebDriver driver){
	    element = driver.findElement(By.linkText("Algemene Vragen"));
		return element;
	}
	
}
