package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansPassivaTooltipObjecten {
	private static WebElement element = null;

	
	//Ondernemingsvermogen
	
	
	@FieldName(name = "GestortOpgevraagdFiscaal31_12")
	public static WebElement GestortOpgevraagdFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznh-popover"));
		return element;
	}	
	@FieldName(name = "AgioFiscaal31_12")
	public static WebElement AgioFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznj-popover"));
		return element;
	}
	@FieldName(name = "KostenegalisatiereserveFiscaal31_12")	
	public static WebElement KostenegalisatiereserveFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznm-popover"));
		return element;
	}
	
	@FieldName(name = "HerinvesteringsreserveFiscaal31_12")
	public static WebElement HerinvesteringsreserveFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznp-popover"));
		return element;
	}
	
	@FieldName(name = "OverigeFiscaleReservesFiscaal31_12")
	public static WebElement OverigeFiscaleReservesFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzny-popover"));
		return element;
	}
	@FieldName(name = "OverigeVoorzieningFiscaal31_12")
	public static WebElement OverigeVoorzieningFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzo6-popover"));
		return element;
	}
	
	@FieldName(name = "ConverteerbareleningenFiscaal31_12")
	public static WebElement ConverteerbareleningenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoc-popover"));
		return element;
	}	
	
	@FieldName(name = "ObligatiesFiscaal31_12")
		public static WebElement ObligatiesFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzog-popover"));
		return element;
	}
	
	@FieldName(name = "LanglopendeSchuldenGrMaatschFiscaal31_12")
	public static WebElement LanglopendeSchuldenGrMaatschFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoi-popover"));
		return element;
	}
	
	@FieldName(name = "LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12")
	public static WebElement LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzon-popover"));
		return element;
	}
	
	@FieldName(name = "SchuldenKredietInstFiscaal31_12")
	public static WebElement SchuldenKredietInstFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzod-popover"));
		return element;
	}
	
	@FieldName(name = "OverigeLangLopendeSchFiscaal31_12")
	public static WebElement OverigeLangLopendeSchFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzof-popover"));
		return element;
	}

	@FieldName(name = "LanglopendeSchuldenFiscaal31_12")
	public static WebElement LanglopendeSchuldenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzol-popover"));
		return element;
	}
	
}
