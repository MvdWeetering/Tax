package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingOverigeVoorzieningObjecten {
private static WebElement element = null;
	
	//rij 1
	public static WebElement Omschrijving1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:0-0"));
		return element;
	}
	public static WebElement DotatieOverigeVoorziening1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:0-2"));
		return element;
	}
	public static WebElement OnttrekkingOverigeVoorziening1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:0-4"));
		return element;
	}
	public static WebElement OverigeVoorzieningEindeBoekjaar1(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:0-6"));
		return element;
	}
	
	//rij 2
	public static WebElement Omschrijving2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:1-0"));
		return element;
	}
	public static WebElement DotatieOverigeVoorziening2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:1-2"));
		return element;
	}
	public static WebElement OnttrekkingOverigeVoorziening2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:1-4"));
		return element;
	}
	public static WebElement OverigeVoorzieningEindeBoekjaar2(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOV:1-6"));
		return element;
	}
	
	
	
	
	
}
