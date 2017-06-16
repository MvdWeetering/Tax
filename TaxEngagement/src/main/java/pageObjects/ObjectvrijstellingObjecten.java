package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectvrijstellingObjecten {
	
	private static WebElement element = null;

	public static WebElement ObjectvrijstellingNaam(WebDriver driver){
		element = driver.findElement(By.id("idxdt1nam"));
		return element;
	}
	
	public static WebElement VestigingslandOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbm"));
		return element;
	}
	
	public static WebElement BuitenlandseOndernemingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbo"));
		return element;
	}
	
	public static WebElement Intehalenverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbp"));
		return element;
	}
	
	public static WebElement Stakingsverlies(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbq"));
		return element;
	}
	
	public static WebElement ObjectvrijstellingBuitenlandseOndernemingswinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbs"));
		return element;
	}
	
	public static WebElement CumulatiefSaldo(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzbt"));
		return element;
	}	
	
}
