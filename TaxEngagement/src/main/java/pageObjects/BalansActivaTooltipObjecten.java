package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansActivaTooltipObjecten {
	private static WebElement element = null;

	//Algemeen
	@FieldName(name = "NaamOnderneming")
	public static WebElement NaamOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlh-popover"));
		return element;
	}
	@FieldName(name = "OmschrijvingActiviteit")
	public static WebElement OmschrijvingActiviteit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzli-popover"));
		return element;
	}
	
	@FieldName(name = "GoodwillFiscaal_31_12")
	public static WebElement GoodwillFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlr-popover"));
		return element;
	}

	@FieldName(name = "OverigeImmaterieleFiscaal_31_12")
	public static WebElement OverigeImmaterieleFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzls-popover"));
		return element;
	}	
	
	@FieldName(name = "GebouwenTerreinenFiscaal_31_12")
	public static WebElement GebouwenTerreinenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzm2-popover"));
		return element;
	}
	
	@FieldName(name = "MachinesFiscaal_31_12")
	public static WebElement MachinesFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzm4-popover"));
		return element;
	}
	
	@FieldName(name = "AndereBedrijfsFiscaal_31_12")
	public static WebElement AndereBedrijfsFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzm6-popover"));
		return element;
	}
	
	@FieldName(name = "langlopendevordGroepsNominaleWaarde")		
	public static WebElement langlopendevordGroepsNominaleWaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmk-popover"));
		return element;
	}

	@FieldName(name = "langlopendevordPartNominaleWaarde")	
	public static WebElement langlopendevordPartNominaleWaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzml-popover"));
		return element;
	}
	
	@FieldName(name = "OverigeFinActivaNominaleWaarde")
	public static WebElement OverigeFinActivaNominaleWaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmm-popover"));
		return element;
	}
	
	
	
	@FieldName(name = "langlopendevordGroepsFiscaal_31_12")	
	public static WebElement langlopendevordGroepsFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmd-popover"));
		return element;
	}
	
	@FieldName(name = "langlopendevordPartFiscaal_31_12")	
	public static WebElement langlopendevordPartFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzme-popover"));
		return element;
	}	
	
	@FieldName(name = "HandelsdebiteurenNominale")	
	public static WebElement HandelsdebiteurenNominale(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmz-popover"));
		return element;
	}
		
	@FieldName(name = "HandelsdebiteurenFiscaal_31_12")	
	public static WebElement HandelsdebiteurenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmx-popover"));
		return element;
	}	
	
	@FieldName(name = "KortVordGroepNominale")	
	public static WebElement KortVordGroepNominale(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn7-popover"));
		return element;
	}
	
	
	@FieldName(name = "KortVordGroepFiscaal_31_12")	
	public static WebElement KortVordGroepFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn0-popover"));
		return element;
	}
	
	@FieldName(name = "KortVordPartNominaal")
	public static WebElement KortVordPartNominaal(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn8-popover"));
		return element;
	}
	
	@FieldName(name = "KortVordPartFiscaal_31_12")	
	public static WebElement KortVordPartFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn1-popover"));
		return element;
	}
	
	@FieldName(name = "OverigeVordFiscaal_31_12")	
	public static WebElement OverigeVordFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn2-popover"));
		return element;
	}
	
	@FieldName(name = "EffectenFiscaal_31_12")
	public static WebElement EffectenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn9-popover"));
		return element;
	}
	
}
