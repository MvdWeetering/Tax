package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingHerinvesteringsReserveObjecten {
	private static WebElement element = null;
	

	
	public static WebElement Omschrijving(WebDriver driver){
		element = driver.findElement(By.id("idtableToeHIR:0-0"));
		return element;
	}
	public static WebElement JaarVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idtableToeHIR:0-2"));
		return element;
	}
	public static WebElement BoekwinstVervreemd(WebDriver driver){
		element = driver.findElement(By.id("idtableToeHIR:0-4"));
		return element;
	}
	public static WebElement AfschrijvingsPercentage(WebDriver driver){
		element = driver.findElement(By.id("idtableToeHIR:0-6"));
		return element;
	}
	public static WebElement BoekwaardeBedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtableToeHIR:0-9"));
		return element;
	}
		
	
}
