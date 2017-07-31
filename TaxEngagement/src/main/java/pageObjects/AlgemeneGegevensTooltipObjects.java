package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlgemeneGegevensTooltipObjects {
	
	private static WebElement element = null;
	
	
	@FieldName(name = "HandelsnaamOnderneming")
	public static WebElement HandelsnaamOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5o-popover"));
		return element;
	}
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
		element = driver.findElement(By.id("idxdt9tz5s-popover"));
		return element;
	}
	
	@FieldName(name = "TussenvoegselContact")
	public static WebElement TussenvoegselContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5u-popover"));
		return element;
	}
	
	
	@FieldName(name = "BeconnummerIntermediair")
	public static WebElement BeconnummerIntermediair(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5y-popover"));
		return element;
	}

	@FieldName(name = "NaamKoepelorgFisDienstverl")
	public static WebElement NaamKoepelorgFisDienstverl(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz61-popover"));
		return element;
	}
	
	
	@FieldName(name = "VoorlettersOndertekenaar")
	public static WebElement VoorlettersOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6a-popover"));
		return element;
	}
	
	@FieldName(name = "TussenvoegselOndertekenaar")
	public static WebElement TussenvoegselOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6c-popover"));
		return element;
	}
	
	@FieldName(name = "AchternaamContact")
	public static WebElement AchternaamContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5v-popover"));
		return element;
	}
	
	@FieldName(name = "TelefoonnummerContact")
	public static WebElement TelefoonnummerContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5w-popover"));
		return element;
	}
	
	@FieldName(name = "AchternaamOndertekenaar")
	public static WebElement AchternaamOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6d-popover"));
		return element;
	}
	
	@FieldName(name = "FunctieOndertekenaar")
	public static WebElement FunctieOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6f-popover"));
		return element;
	}
	
	@FieldName(name = "TelefoonnummerOndertekenaar")
	public static WebElement TelefoonnummerOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6h-popover"));
		return element;
	}
	
	@FieldName(name = "Toelichtingverzoek")
	public static WebElement Toelichtingverzoek(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzf0-popover"));
		return element;
	}
	
}



