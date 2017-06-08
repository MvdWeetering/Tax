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
	
	//Garantievoorziening 
	
	public static WebElement GarantieVoorzieningCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R0C1"));
		return element;
	}
	
	public static WebElement GarantieVoorzieningFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R0C3"));
		return element;
	}
	public static WebElement GarantieVoorzieningCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R0C5"));
		return element;
	}
	public static WebElement GarantieVoorzieningCF(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R0C7"));
		return element;
	}
		
	//Voorziening voor lijfrenten, pensioen en stamrecht
	
	public static WebElement VoorzieningLijfrenteCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R1C1"));
		return element;
	}
	
	public static WebElement VoorzieningLijfrenteFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R1C3"));
		return element;
	}
	public static WebElement VoorzieningLijfrenteCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R1C5"));
		return element;
	}
	public static WebElement VoorzieningLijfrenteCF(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R1C7"));
		return element;
	}
		
	//Overige voorzieningen
	
	public static WebElement OverigeVoorzieningCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R2C1"));
		return element;
	}
	
	public static WebElement OverigeVoorzieningFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R2C3"));
		return element;
	}
	public static WebElement OverigeVoorzieningCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R2C5"));
		return element;
	}
	public static WebElement OverigeVoorzieningCF(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R2C7"));
		return element;
	}
	
	//Converteerbare leningen 
	
	public static WebElement ConverteerbareleningenCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R0C1"));
		return element;
	}
	
	public static WebElement ConverteerbareleningenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R0C3"));
		return element;
	}
	public static WebElement ConverteerbareleningenCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R0C5"));
		return element;
	}
	public static WebElement ConverteerbareleningenCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R0C7"));
		return element;
	}
	
		
	//Schulden aan kredietinstellingen
	
	public static WebElement SchuldenKredietInstCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R1C1"));
		return element;
	}
	
	public static WebElement SchuldenKredietInstFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R1C3"));
		return element;
	}
	public static WebElement SchuldenKredietInstCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R1C5"));
		return element;
	}
	public static WebElement SchuldenKredietInstCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R1C7"));
		return element;
	}
	
	//Obligaties
	
	public static WebElement ObligatiesCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R2C1"));
		return element;
	}
	
	public static WebElement ObligatiesFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R2C3"));
		return element;
	}
	public static WebElement ObligatiesCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R2C5"));
		return element;
	}
	public static WebElement ObligatiesCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R2C7"));
		return element;
	}
	
	//Langlopende schulden groepsmaatschappijen
	
	
	public static WebElement LanglopendeSchuldenGrMaatschCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R3C1"));
		return element;
	}
	
	public static WebElement LanglopendeSchuldenGrMaatschFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R3C3"));
		return element;
	}
	public static WebElement LanglopendeSchuldenGrMaatschCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R3C5"));
		return element;
	}
	public static WebElement LanglopendeSchuldenGrMaatschCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R3C7"));
		return element;
	}
	
	//Langlopende schulden participanten/maatschappijen waarin wordt deelgenomen
		
	
	public static WebElement LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R4C1"));
		return element;
	}
	
	public static WebElement LanglopendeSchuldenPartMaatschDeelnemingFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R4C3"));
		return element;
	}
	public static WebElement LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R4C5"));
		return element;
	}
	public static WebElement LanglopendeSchuldenPartMaatschDeelnemingCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R4C7"));
		return element;
	}
	
	
	//Overige langlopende schulden
	
	
	public static WebElement OverigeLangLopendeSchCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R5C1"));
		return element;
	}
	
	public static WebElement OverigeLangLopendeSchFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R5C3"));
		return element;
	}
	public static WebElement OverigeLangLopendeSchCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R5C5"));
		return element;
	}
	public static WebElement OverigeLangLopendeSchCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R5C7"));
		return element;
	}	
	
	//Schulden aan leveranciers en handelskredieten
	
		
	public static WebElement SchuldenLeveranciersHandelsKrCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R0C1"));
		return element;
	}
	
	public static WebElement SchuldenLeveranciersHandelsKrFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R0C3"));
		return element;
	}
	public static WebElement SchuldenLeveranciersHandelsKrCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R0C5"));
		return element;
	}
	public static WebElement SchuldenLeveranciersHandelsKrCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R0C7"));
		return element;
	}
	
	//Omzetbelasting
	
	public static WebElement OmzetbelastingCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R1C1"));
		return element;
	}
	
	public static WebElement OmzetbelastingFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R1C3"));
		return element;
	}
	public static WebElement OmzetbelastingCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R1C5"));
		return element;
	}
	public static WebElement OmzetbelastingCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R1C7"));
		return element;
	}
	
	//Loonheffingen
	
	public static WebElement LoonheffingenCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R2C1"));
		return element;
	}
	
	public static WebElement LoonheffingenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R2C3"));
		return element;
	}
	public static WebElement LoonheffingenCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R2C5"));
		return element;
	}
	public static WebElement LoonheffingenCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R2C7"));
		return element;
	}
	
	//Kortlopende schulden groepsmaatschappijen 
	
	
	public static WebElement KortlopendeSchuldGroepsmaatschCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R3C1"));
		return element;
	}
	
	public static WebElement KortlopendeSchuldGroepsmaatschFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R3C3"));
		return element;
	}
	public static WebElement KortlopendeSchuldGroepsmaatschCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R3C5"));
		return element;
	}
	public static WebElement KortlopendeSchuldGroepsmaatschCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R3C7"));
		return element;
	}
	
	//Kortlopende schulden op participanten/maatschappijen waarin wordt deelgenomen
	
		
	public static WebElement KortlopendeSchuldParticiantCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R4C1"));
		return element;
	}
	
	public static WebElement KortlopendeSchuldParticiantFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R4C3"));
		return element;
	}
	public static WebElement KortlopendeSchuldParticiantCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R4C5"));
		return element;
	}
	public static WebElement KortlopendeSchuldParticiantCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R4C7"));
		return element;
	}
	
	//Overige kortlopende schulden 
	
	public static WebElement OverigeKortlSchuldCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R5C1"));
		return element;
	}
	
	public static WebElement OverigeKortlSchuldFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R5C3"));
		return element;
	}
	public static WebElement OverigeKortlSchuldCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R5C5"));
		return element;
	}
	public static WebElement OverigeKortlSchuldCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R5C7"));
		return element;
	}
	public static WebElement ToelichtingBalansPassiva(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrn"));
		return element;
	}
}
