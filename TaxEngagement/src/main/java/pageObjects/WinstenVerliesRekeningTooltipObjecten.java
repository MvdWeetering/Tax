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
	
	@FieldName(name = "VoordelenOntvoegDochterFiscaal")
	public static WebElement VoordelenOntvoegDochterFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl1-popover"));
		   return element;
		}
	
	@FieldName(name = "OverigeBuitenGewBatenFiscaal")
	public static WebElement OverigeBuitenGewBatenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl2-popover"));
		   return element;
		}
	
	@FieldName(name = "AfboekenHerinvesteringReserveFiscaal")
	public static WebElement AfboekenHerinvesteringReserveFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl7-popover"));
		   return element;
		}
	
	@FieldName(name = "UitkeringANBIFiscaal")
	public static WebElement UitkeringANBIFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl8-popover"));
		   return element;
		}
	
	@FieldName(name = "OverigeBuitengewoneLastenFiscaal")
	public static WebElement OverigeBuitengewoneLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl9-popover"));
		   return element;
		}
	
}
