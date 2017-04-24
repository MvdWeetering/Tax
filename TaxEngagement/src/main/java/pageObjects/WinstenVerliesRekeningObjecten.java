package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WinstenVerliesRekeningObjecten {
	
	private static WebElement element = null;
		
	//bedrijfsopbrengsten
	
	public static WebElement NettoOmzetCommercieel(WebDriver driver){
	   element = driver.findElement(By.id("idBeOR0C1"));
	   return element;
	}
	public static WebElement NettoOmzetCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR0C3"));
		   return element;
		}
	public static WebElement WijzigingVoorraadCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR1C1"));
		   return element;
		}
	public static WebElement WijzigingVoorraadCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR1C3"));
		   return element;
		}
	
	public static WebElement GeactiveerdeProductieCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR2C1"));
		   return element;
		}
	public static WebElement GeactiveerdeProductieCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR2C3"));
		   return element;
		}
	
	public static WebElement OverigeOpbrengstenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR3C1"));
		   return element;
		}
	public static WebElement OverigeOpbrengstenProductieCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR3C3"));
		   return element;
		}
		
	//Kosten grond en hulpstoffen
	
	public static WebElement KostenGrondHulpstoffenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR0C1"));
		   return element;
		}
	public static WebElement KostenGrondHulpstoffenCF(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR0C3"));
		   return element;
		}
	public static WebElement KostenUitbesteedCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR1C1"));
		   return element;
		}
	public static WebElement KostenUitbesteedCF(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR1C3"));
		   return element;
		}
	
	//Personeelskosten

	public static WebElement LonenSalarissenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR0C1"));
		   return element;
		}
	public static WebElement LonenSalarissenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR0C3"));
		   return element;
		}
	public static WebElement SocialeLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR1C1"));
		   return element;
		}
	public static WebElement SocialeLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR1C3"));
		   return element;
		}
	public static WebElement PensioenLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR2C1"));
		   return element;
		}
	public static WebElement PensioenLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR2C3"));
		   return element;
		}
	public static WebElement OverigePersoneelskostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR3C1"));
		   return element;
		}
	public static WebElement OverigePersoneelskostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR3C3"));
		   return element;
		}
	public static WebElement OntvangenUitkeringenenLoonsubsidiesCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR4C1"));
		   return element;
		}
	public static WebElement OntvangenUitkeringenenLoonsubsidiesCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR4C3"));
		   return element;
		}
	
	
	//Afschrijvingen
	
	//Overige waardeverandering van immateriele en materiele vaste activa
	
	//Bijzondere waardevermindering van vlottende activa
	
	//Overige bedrijfskosten
	
	//Financiele baten en lasten
	
	//Financiele lasten
	
	//Buitengewone bedrijfsbaten
	
	//Buitengewone bedrijfslasten
	
	
	
	
	
	
	
}
