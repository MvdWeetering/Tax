package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansPassivaObjecten {
	private static WebElement element = null;

	
	//Gestort en opgevraagd kapitaal
	
	public static WebElement GestortOpgevraagdCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R0C1"));
		return element;
	}
	
	public static WebElement GestortOpgevraagdFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R0C3"));
		return element;
	}
	public static WebElement GestortOpgevraagdCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R0C5"));
		return element;
	}
	public static WebElement GestortOpgevraagdCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R0C7"));
		return element;
	}
	
	//Informeel kapitaal
	
	public static WebElement InformeelKapitaalCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R1C1"));
		return element;
	}
	
	public static WebElement InformeelKapitaalFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R1C3"));
		return element;
	}
	public static WebElement InformeelKapitaalCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R1C5"));
		return element;
	}
	public static WebElement InformeelKapitaalCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R1C7"));
		return element;
	}
	
	//Agio
	
	public static WebElement AgioCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R2C1"));
		return element;
	}
	
	public static WebElement AgioFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R2C3"));
		return element;
	}
	public static WebElement AgioCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R2C5"));
		return element;
	}
	public static WebElement AgioCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R2C7"));
		return element;
	}
			
	//Winstreserve
	
	public static WebElement WinstReserveCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R3C1"));
		return element;
	}
	
	public static WebElement WinstReserveFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R3C3"));
		return element;
	}
	public static WebElement WinstReserveCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R3C5"));
		return element;
	}
	public static WebElement WinstReserveCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R3C7"));
		return element;
	}
	
	//Kostenegalisatiereserve
	
	public static WebElement KostenegalisatiereserveCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R4C1"));
		return element;
	}
	
	public static WebElement KostenegalisatiereserveFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R4C3"));
		return element;
	}
	public static WebElement KostenegalisatiereserveCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R4C5"));
		return element;
	}
	public static WebElement KostenegalisatiereserveCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R4C7"));
		return element;
	}
	
	//Herinvesteringsreserve
	
	public static WebElement HerinvesteringsreserveCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R5C1"));
		return element;
	}
	
	public static WebElement HerinvesteringsreserveFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R5C3"));
		return element;
	}
	public static WebElement HerinvesteringsreserveCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R5C5"));
		return element;
	}
	public static WebElement HerinvesteringsreserveCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R5C7"));
		return element;
	}
	
		
	//Belaste compartimenteringsreserve 
	
	public static WebElement CompartimenteringsreserveCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R6C1"));
		return element;
	}
	
	public static WebElement CompartimenteringsreserveFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R6C3"));
		return element;
	}
	public static WebElement CompartimenteringsreserveCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R6C5"));
		return element;
	}
	public static WebElement CompartimenteringsreserveCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R6C7"));
		return element;
	}
	
	//Overige fiscale reserves 
	 
	public static WebElement FiscaleReservesCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C1"));
		return element;
	}
	
	public static WebElement FiscaleReservesFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C3"));
		return element;
	}
	public static WebElement FiscaleReservesCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C5"));
		return element;
	}
	public static WebElement FiscaleReservesCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C7"));
		return element;
	}
	
}
