package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InnovatieboxObjecten {
	private static WebElement element = null;
	
	@FieldName(name = "Omschrijving")
	public static WebElement Omschrijving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6l"));
		return element;
	}
	@FieldName(name = "Voortbrengingkosten")
	public static WebElement Voortbrengingkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6n"));
		return element;
	}
	
	public static WebElement forfaitaireRegeling_Ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tz6q']"));
		return element;
	}
	
	public static WebElement forfaitaireRegeling_Nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tz6q-no']"));
		return element;
	}
	@FieldName(name = "SaldoDrempelInnovatie")
	public static WebElement SaldoDrempelInnovatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6s"));
		return element;
	}
	@FieldName(name = "InnovatieboxVoortbrengingskosten")
	public static WebElement InnovatieboxVoortbrengingskosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6u"));
		return element;
	}
	@FieldName(name = "InnovatieboxExploitatieverliezen")
	public static WebElement InnovatieboxExploitatieverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6v"));
		return element;
	}
	@FieldName(name = "VoordelenOctrooi")
	public static WebElement VoordelenOctrooi(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6w"));
		return element;
	}
	@FieldName(name = "OvergenomenDrempel")
	public static WebElement OvergenomenDrempel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6y"));
		return element;
	}
	@FieldName(name = "InTeLopenVoortbrengingsKosten")
	public static WebElement InTeLopenVoortbrengingsKosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6z"));
		return element;
	}
	@FieldName(name = "GenotenVoordeelOnder")
	public static WebElement GenotenVoordeelOnder(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz70"));
		return element;
	}
	@FieldName(name = "GenotenVoordeelBoven")
	public static WebElement GenotenVoordeelBoven(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz72"));
		return element;
	}
	@FieldName(name = "SaldoInTeLopen")
	public static WebElement SaldoInTeLopen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz75"));
		return element;
	}	
}
