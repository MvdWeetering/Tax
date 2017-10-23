package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvesteringsaftrekObjecten {
	
	private static WebElement element = null;

	@FieldName(name = "OmschrijvingBedrijfsmiddel")
	public static WebElement OmschrijvingBedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztc"));
		return element;
	}
	
	@FieldName(name = "DatumInvestering")
	public static WebElement DatumInvestering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLdateInvestment"));
		return element;
	}
	
	@FieldName(name = "DatumIngebruikname")
	public static WebElement DatumIngebruikname(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztj"));
		return element;
	}
	
	@FieldName(name = "Investeringsbedrag")
	public static WebElement Investeringsbedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzth"));
		return element;
	}
	
	@FieldName(name = "BedragBetaaldBoekjaar")
	public static WebElement BedragBetaaldBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztl"));
		return element;
	}
	
	public static WebElement energieInvesteringsAftrek_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLEIA']"));
		return element;
	}
	
	public static WebElement energieInvesteringsAftrek_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLEIA-no']"));
		return element;
	}
	
	public static WebElement MilleuInvesteringsAftrek_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLMIA']"));
		return element;
	}
	
	public static WebElement MilleuInvesteringsAftrek_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLMIA-no']"));
		return element;
	}
	
	public static WebElement MilleuCategorie(WebDriver driver){
		element = driver.findElement(By.id("idCWNLMIACategorie"));
		return element;
	}
	
	public static WebElement AandelingInvestering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAandeelInvestering"));
		return element;
	}
	
	
	@FieldName(name = "MeldingsnummerAftrek")
	public static WebElement MeldingsnummerAftrek(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztn"));
		return element;
	}
	
	@FieldName(name = "InvesteringsaftrekEnergieMilieu")
	public static WebElement InvesteringsaftrekEnergieMilieu (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzts"));
		return element;
	}
	
	public static WebElement CaribischeDeel_Ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCarib']"));
		return element;
	}
	
	public static WebElement CaribischeDeel_Nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCarib-no']"));
		return element;
	}
	
	@FieldName(name = "AftrekKleinschalig")
	public static WebElement AftrekKleinschalig (WebDriver driver){
		element = driver.findElement(By.id("idCWNLKIACarib"));
		return element;
	}	
	
	
}
