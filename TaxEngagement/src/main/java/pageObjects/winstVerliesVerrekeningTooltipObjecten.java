package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class winstVerliesVerrekeningTooltipObjecten {

	private static WebElement element = null;

	@FieldName(name = "RSINMaatschappij")
	public static WebElement RSINMaatschappij(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:0-0-popover"));
		return element;
	}
	@FieldName(name = "RSINMaatschappij2")
	public static WebElement RSINMaatschappij2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:1-0-popover"));
		return element;
	}
	@FieldName(name = "VerrekenenRSINMaatschappij")
	public static WebElement VerrekenenRSINMaatschappij(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:0-0-popover"));
		return element;
	}
	@FieldName(name = "VerrekenenRSINMaatschappij2")
	public static WebElement VerrekenenRSINMaatschappij2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:1-0-popover"));
		return element;
	}
	

	@FieldName(name = "VerrekeningVerliesVorigBoekjaar")
	public static WebElement VerrekeningVerliesVorigBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:0-4"));
		return element;
	}
	
	@FieldName(name = "VerrekeningVerliesVorigBoekjaar2")
	public static WebElement VerrekeningVerliesVorigBoekjaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:1-4"));
		return element;
	}
	
	
}
