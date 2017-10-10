package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingGarantieVoorzieningObjecten {
	private static WebElement element = null;
	
	//regel 1
	
	public static WebElement Omschrijving1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:0-0"));
		return element;
	}
	
	public static WebElement DotatieGarantieVoorziening1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:0-2"));
		return element;
	}
	
	public static WebElement OnttrekkingGarantieVoorziening1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:0-4"));
		return element;
	}
	
	public static WebElement GarantieVoorzieningEindeboekjaar1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:0-6"));
		return element;
	}
	
	//regel 2
		public static WebElement Omschrijving2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:1-0"));
		return element;
	}
	
	public static WebElement DotatieGarantieVoorziening2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:1-2"));
		return element;
	}
	
	public static WebElement OnttrekkingGarantieVoorziening2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:1-4"));
		return element;
	}
	
	public static WebElement GarantieVoorzieningEindeboekjaar2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeGV:1-6"));
		return element;
	}
	public static WebElement Totaal(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTotGarVoorzEindBkjr"));
		return element;
	}
}
