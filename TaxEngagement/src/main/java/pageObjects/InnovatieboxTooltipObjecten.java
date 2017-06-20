package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InnovatieboxTooltipObjecten {
private static WebElement element = null;
	

	@FieldName(name = "Voortbrengingkosten")
	public static WebElement Voortbrengingkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6n-popover"));
		return element;
	}
	
	@FieldName(name = "SaldoDrempelInnovatie")
	public static WebElement SaldoDrempelInnovatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6s-popover"));
		return element;
	}
	@FieldName(name = "InnovatieboxVoortbrengingskosten")
	public static WebElement InnovatieboxVoortbrengingskosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6u-popover"));
		return element;
	}
	@FieldName(name = "InnovatieboxExploitatieverliezen")
	public static WebElement InnovatieboxExploitatieverliezen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6v-popover"));
		return element;
	}
	@FieldName(name = "VoordelenOctrooi")
	public static WebElement VoordelenOctrooi(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6w-popover"));
		return element;
	}
	
	@FieldName(name = "InTeLopenVoortbrengingsKosten")
	public static WebElement InTeLopenVoortbrengingsKosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6z-popover"));
		return element;
	}
	@FieldName(name = "GenotenVoordeelOnder")
	public static WebElement GenotenVoordeelOnder(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz70-popover"));
		return element;
	}
	@FieldName(name = "GenotenVoordeelBoven")
	public static WebElement GenotenVoordeelBoven(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz72-popover"));
		return element;
	}
	@FieldName(name = "SaldoInTeLopen")
	public static WebElement SaldoInTeLopen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz75-popover"));
		return element;
	}	
}
