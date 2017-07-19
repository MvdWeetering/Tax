package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeescheepvaarObjecten {
	
	private static WebElement element = null;
	
	public static WebElement NaamSchip(WebDriver driver){
	   element = driver.findElement(By.id("idxdt9tz3w"));
	   return element;
	}
	
	public static WebElement NettoTonnageSchip(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tz3x"));
		   return element;
		}
	
	public static WebElement PercentageDeelnameSchip(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tz41"));
		   return element;
		}
	
	public static WebElement aantalDagen(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tz3z"));
		   return element;
		}
}
