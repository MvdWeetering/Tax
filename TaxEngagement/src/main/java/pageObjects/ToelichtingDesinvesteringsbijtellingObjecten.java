package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingDesinvesteringsbijtellingObjecten {
	private static WebElement element = null;
	
	public static WebElement OmschrijvingBedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmschrBedrijfsmiddel"));
		return element;
	}

	public static WebElement Investeringsbedrag(WebDriver driver){
		element = driver.findElement(By.id("idCWNLInvestbdrg"));
		return element;
	}
	
	public static WebElement Investeringsjaar(WebDriver driver){
		element = driver.findElement(By.id("idtableToelDIB:2-2"));
		return element;
	}
	
	public static WebElement PercentageKleinschaligheidsaftrek(WebDriver driver){
		element = driver.findElement(By.id("idCWNLPerInvestAftr"));
		return element;
	}
	
	public static WebElement Overdrachtsprijs(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOverdrachtsprijs"));
		return element;
	}
	
	public static WebElement AandeelInvestering(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAandeelInvestering"));
		return element;
	}
	
	public static WebElement Desinvesteringsbijtelling(WebDriver driver){
		element = driver.findElement(By.id("idCWNLDesinvestbijt"));
		return element;
	}
	
}
