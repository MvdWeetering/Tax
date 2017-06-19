package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectvrijstellingObjectenTooltips {

	private static WebElement element = null;
	
	@FieldName(name = "BuitenlandseOndernemingswinst")
	public static WebElement BuitenlandseOndernemingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbo-popover"));
		return element;
	}
	
	@FieldName(name = "Intehalenverliezen")
	public static WebElement Intehalenverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbp-popover"));
		return element;
	}
	
	@FieldName(name = "Stakingsverlies")
	public static WebElement Stakingsverlies(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbq-popover"));
		return element;
	}
	
	@FieldName(name = "ObjectvrijstellingBuitenlandseOndernemingswinst")
	public static WebElement ObjectvrijstellingBuitenlandseOndernemingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbs-popover"));
		return element;
	}
	
	@FieldName(name = "CumulatiefSaldo")
	public static WebElement CumulatiefSaldo(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbt-popover"));
		return element;
	}	
}
