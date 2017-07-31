package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WinstenVerliesRekeningTooltipObjecten {
	
	
	private static WebElement element = null;
	
	
	@FieldName(name = "NettoOmzetFiscaal")
	public static WebElement NettoOmzetFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzis-popover"));
		   return element;
	}
	
	@FieldName(name = "GeactiveerdeProdFiscaal")
	public static WebElement GeactiveerdeProdFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tziu-popover"));
		   return element;
	}
	
	@FieldName(name = "OverigeOpbrFiscaal")
	public static WebElement OverigeOpbrFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tziw-popover"));
		   return element;
		}
	
	@FieldName(name = "OntvUitkeringLoonSubsFiscaal")
	public static WebElement OntvUitkeringLoonSubsFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjb-popover"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstVordGroepMaatschFiscaal")
	public static WebElement OpbrengstVordGroepMaatschFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzk5-popover"));
		   return element;
		}
	
	@FieldName(name = "KwijtscheldingsWinstFiscaal")
	public static WebElement KwijtscheldingsWinstFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzk8-popover"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstVordParticipantFiscaal")
	public static WebElement OpbrengstVordParticipantFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzka-popover"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstOverigeVordFiscaal")
	public static WebElement OpbrengstOverigeVordFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkc-popover"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstBanktegoedFiscaal")
	public static WebElement OpbrengstBanktegoedFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkf-popover"));
		   return element;
		}	
	
	@FieldName(name = "OntvangenDividentFiscaal")
	public static WebElement OntvangenDividentFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkk-popover"));
		   return element;
		}
	
	
}
