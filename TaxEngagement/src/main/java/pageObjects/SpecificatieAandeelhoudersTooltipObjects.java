package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieAandeelhoudersTooltipObjects {
	
	private static WebElement element = null;
	
	public static WebElement VorderingbelastingplichtigeOpaandeelhouder (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsw-popover"));
		return element;
	}
	public static WebElement SchuldbelastingplichtigeOpaandeelhouder (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt1-popover"));
		return element;
	}
	public static WebElement BoekjaarOntvangenRente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsy-popover"));
		return element;
	}	
	public static WebElement BoekjaarBetaaldeRente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt3-popover"));
		return element;
	}
	
	public static WebElement NaamAandeelhouder (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzse-popover"));
		return element;
	}
	public static WebElement StraatNaam (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsg-popover"));
		return element;
	}
	public static WebElement Huisnummer (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsi-popover"));
		return element;
	}
	
	public static WebElement Postcode (WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
		
	public static WebElement HuisnrToev (WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}	
	public static WebElement Woonplaats (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsk-popover"));
		return element;
	}
	
	
	public static WebElement NominalewaardeAandelen (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzso-popover"));
		return element;
	}
	public static WebElement NominalewaardePreferente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsq-popover"));
		return element;
	}
	public static WebElement NominalewaardePrioriteits (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzss-popover"));
		return element;
	}
	

}
