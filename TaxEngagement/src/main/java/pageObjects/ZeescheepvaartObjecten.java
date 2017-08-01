package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeescheepvaartObjecten {
	
	private static WebElement element = null;
	
	@FieldName(name = "NaamSchip")
	public static WebElement NaamSchip(WebDriver driver){
	   element = driver.findElement(By.id("idxdt9tz3w"));
	   return element;
	}
	
	@FieldName(name = "NettoTonnageSchip")
	public static WebElement NettoTonnageSchip(WebDriver driver){
	   element = driver.findElement(By.id("idxdt9tz3x"));
	   return element;
	}
		
	@FieldName(name = "PercentageDeelnameSchip")
	public static WebElement PercentageDeelnameSchip(WebDriver driver){
	   element = driver.findElement(By.id("idxdt9tz41"));
	   return element;
	}
	
	@FieldName(name = "aantalDagen")
	public static WebElement aantalDagen(WebDriver driver){
	  element = driver.findElement(By.id("idxdt9tz3z"));
	  return element;
	  
	}
}
