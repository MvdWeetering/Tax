package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectvrijstellingObjecten {
	
	private static WebElement element = null;

	@FieldName(name = "ObjectvrijstellingNaam")
	public static WebElement ObjectvrijstellingNaam(WebDriver driver){
		element = driver.findElement(By.id("idxdt1nam"));
		return element;
	}
	
	@FieldName(name = "VestigingslandOnderneming")
	public static WebElement VestigingslandOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbm"));
		return element;
	}
	
	@FieldName(name = "BuitenlandseOndernemingswinst")
	public static WebElement BuitenlandseOndernemingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbo"));
		return element;
	}
	
	@FieldName(name = "Intehalenverliezen")
	public static WebElement Intehalenverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbp"));
		return element;
	}
	
	@FieldName(name = "Stakingsverlies")
	public static WebElement Stakingsverlies(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbq"));
		return element;
	}
	
	@FieldName(name = "ObjectvrijstellingBuitenlandseOndernemingswinst")
	public static WebElement ObjectvrijstellingBuitenlandseOndernemingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbs"));
		return element;
	}
	
	@FieldName(name = "CumulatiefSaldo")
	public static WebElement CumulatiefSaldo(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbt"));
		return element;
	}	
	
}
