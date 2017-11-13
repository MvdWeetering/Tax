package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class toelichtingWinstenVerliesRekeningObjecten {

	private static WebElement element = null;

	public static WebElement MilieuBedrijfsmiddelenCommercieel3112(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR0C2"));
		return element;
	}

	public static WebElement MilieuBedrijfsmiddelenCFverschillen(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR0C4"));
		return element;
	}

	public static WebElement MilieuBedrijfsmiddelenFiscaal3112(WebDriver driver) {
		element = driver.findElement(By.id("idxdt9tzrt"));
		return element;
	}

	public static WebElement GebouwenInEigenGebruikCommercieel3112(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR1C2"));
		return element;
	}

	public static WebElement GebouwenInEigenGebruikCFverschillen(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR1C4"));
		return element;
	}

	public static WebElement GebouwenInEigenGebruikFiscaal3112(WebDriver driver) {
		element = driver.findElement(By.id("idxdt9tzrw"));
		return element;
	}

	public static WebElement GebouwenTerBeleggingCommercieel3112(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR2C2"));
		return element;
	}

	public static WebElement GebouwenTerBeleggingCFverschillen(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR2C4"));
		return element;
	}

	public static WebElement GebouwenTerBeleggingFiscaal3112(WebDriver driver) {
		element = driver.findElement(By.id("idxdt9tzrx"));
		return element;
	}

	public static WebElement BedrijfsterreinenCommercieel3112(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR3C2"));
		return element;
	}

	public static WebElement BedrijfsterreinenCFverschillen(WebDriver driver) {
		element = driver.findElement(By.id("idMBMR3C4"));
		return element;
	}

	public static WebElement BedrijfsterreinenFiscaal3112(WebDriver driver) {
		element = driver.findElement(By.id("idxdt9tzrz"));
		return element;
	}

	public static WebElement TotaalAfschrijvingen(WebDriver driver) {
		element = driver.findElement(By.id("idCWNLTotAfschrWEV"));
		return element;
	}
	
	public static WebElement OmschrijvingBedrijfsmiddelen(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecWillAfschrNL:0-0"));
		return element;
	}
	
	public static WebElement BedragWillekeurigeAfschrijvingen(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecWillAfschrNL:0-2"));
		return element;
	}
	
	public static WebElement BoekWaardeBedrijfsmiddelWillekeurigeAfschrijving(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecWillAfschrNL:0-4"));
		return element;
	}
	
	public static WebElement ToelichtingWinstEnVerliesRekening(WebDriver driver) {
		element = driver.findElement(By.id("idxdt9tzs7"));
		return element;
	}
	
		
}
