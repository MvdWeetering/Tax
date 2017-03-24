package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlgemeneGegevensTooltipObjects {
	
	private static WebElement element = null;
	
	@FieldName(name = "RSIN")
	public static WebElement RSIN(WebDriver driver){
		element = driver.findElement(By.id("idcontextIdentifier-popover"));
		return element;
	}
	
	@FieldName(name = "Beconnummer")
	public static WebElement Beconnummer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5r-popover"));
		return element;
	}
	
	@FieldName(name = "VoorlettersContact")
	public static WebElement VoorlettersContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5r-popover"));
		return element;
	}
	
	@FieldName(name = "TussenvoegselContact")
	public static WebElement TussenvoegselContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5s-popover"));
		return element;
	}
	@FieldName(name = "VoorlettersOndertekenaar")
	public static WebElement VoorlettersOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5s-popover"));
		return element;
	}
	
	@FieldName(name = "TussenvoegselOndertekenaar")
	public static WebElement TussenvoegselOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5s-popover"));
		return element;
	}
	
	
}



