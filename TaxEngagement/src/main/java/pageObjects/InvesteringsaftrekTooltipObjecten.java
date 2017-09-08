package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvesteringsaftrekTooltipObjecten {
	private static WebElement element = null;
	
	
	@FieldName(name = "OmschrijvingBedrijfsmiddel")
	public static WebElement OmschrijvingBedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztc-popover"));
		return element;
	}
	
	@FieldName(name = "Investeringsbedrag")
	public static WebElement Investeringsbedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzth-popover"));
		return element;
	}
	@FieldName(name = "BedragBetaaldBoekjaar")
	public static WebElement BedragBetaaldBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztl-popover"));
		return element;
	}
	
	@FieldName(name = "MeldingsnummerAftrek")
	public static WebElement MeldingsnummerAftrek(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztn-popover"));
		return element;
	}
	
	@FieldName(name = "InvesteringsaftrekEnergieMilieu")
	public static WebElement InvesteringsaftrekEnergieMilieu (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzts-popover"));
		return element;
	}
	
	@FieldName(name = "AftrekKleinschalig")
	public static WebElement AftrekKleinschalig (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztw-popover"));
		return element;
	}	
	
}
