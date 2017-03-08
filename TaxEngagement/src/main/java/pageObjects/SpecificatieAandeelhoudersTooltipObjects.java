package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieAandeelhoudersTooltipObjects {
	
	private static WebElement element = null;
	
	@FieldName(name = "VorderingBelastingplichtige")
	public static WebElement VorderingBelastingplichtige (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsw-popover"));
		return element;
	}
	@FieldName(name = "SchuldBelastingplichtige")
	public static WebElement SchuldBelastingplichtige (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt1-popover"));
		return element;
	}
	@FieldName(name = "BoekjaarOntvangenRente")
	public static WebElement BoekjaarOntvangenRente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsy-popover"));
		return element;
	}	
	
	@FieldName(name = "BoekjaarBetaaldeRente")
	public static WebElement BoekjaarBetaaldeRente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt3-popover"));
		return element;
	}
	
	@FieldName(name = "NaamAandeelhouder")
	public static WebElement NaamAandeelhouder (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzse-popover"));
		return element;
	}
	@FieldName(name = "StraatNaam")
	public static WebElement StraatNaam (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsg-popover"));
		return element;
	}
	
	@FieldName(name = "Huisnummer")
	public static WebElement Huisnummer (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsi-popover"));
		return element;
	}
	
	@FieldName(name = "Postcode")
	public static WebElement Postcode (WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
	
	@FieldName(name = "HuisnrToev")
	public static WebElement HuisnrToev (WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
	
	@FieldName(name = "Woonplaats")
	public static WebElement Woonplaats (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsk-popover"));
		return element;
	}
	
	@FieldName(name = "NominalewaardeAandelen")
	public static WebElement NominalewaardeAandelen (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzso-popover"));
		return element;
	}
	
	@FieldName(name = "NominalewaardePreferente")
	public static WebElement NominalewaardePreferente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsq-popover"));
		return element;
	}
	
	@FieldName(name = "NominalewaardePrioriteits")
	public static WebElement NominalewaardePrioriteits (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzss-popover"));
		return element;
	}
	

}
