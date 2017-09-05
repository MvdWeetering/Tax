package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvesteringsaftrekObjecten {
	
	private static WebElement element = null;

	public static WebElement OmschrijvingBedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztc"));
		return element;
	}
	public static WebElement DatumInvestering(WebDriver driver){
		element = driver.findElement(By.id("iddateInvestment"));
		return element;
	}
	public static WebElement DatumIngebruikname(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztj"));
		return element;
	}
	public static WebElement Investeringsbedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzth"));
		return element;
	}
	public static WebElement BedragBetaaldBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztl"));
		return element;
	}
	public static WebElement energieOfMilieuaftrek(WebDriver driver){
		element = driver.findElement(By.id("idcheckboxEnergy"));
		return element;
	}
	public static WebElement MeldingsnummerAftrek(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tztn"));
		return element;
	}
	public static WebElement InvesteringsaftrekEnergieMilieu (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzts"));
		return element;
	}
	public static WebElement CaribischeDeel_Ja (WebDriver driver){
		element = driver.findElement(By.id("idcheckboxCaribbean"));
		return element;
	}

	
}
