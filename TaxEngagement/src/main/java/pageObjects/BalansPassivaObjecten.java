package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansPassivaObjecten {
	private static WebElement element = null;

	
	//Ondernemingsvermogen
	

	public static WebElement OndernemingsvermogenCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv1R0C1"));
		return element;
	}
	
	public static WebElement OndernemingsvermogenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv1R0C3"));
		return element;
	}
	public static WebElement OndernemingsvermogenCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv1R0C5"));
		return element;
	}
	public static WebElement OndernemingsvermogenCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv1R0C7"));
		return element;
	}
	
	public static WebElement OndernemingsvermogenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzo0"));
		return element;
	}
	
		
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
	
	@FieldName(name = "GestortOpgevraagdFiscaal31_12")
	public static WebElement GestortOpgevraagdFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznh"));
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
	
	public static WebElement InformeelKapitaalFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzni"));
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
	
	@FieldName(name = "AgioFiscaal31_12")
	public static WebElement AgioFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznj"));
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

	public static WebElement WinstReserveFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznk"));
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
	
	@FieldName(name = "KostenegalisatiereserveFiscaal31_12")	
	public static WebElement KostenegalisatiereserveFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznm"));
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
	
	@FieldName(name = "HerinvesteringsreserveFiscaal31_12")
	public static WebElement HerinvesteringsreserveFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznp"));
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
	public static WebElement CompartimenteringsreserveFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznt"));
		return element;
	}
		
	//Overige fiscale reserves 
	 
	public static WebElement OverigeFiscaleReservesCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C1"));
		return element;
	}
	
	public static WebElement OverigeFiscaleReservesFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C3"));
		return element;
	}
	public static WebElement OverigeFiscaleReservesCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C5"));
		return element;
	}
	public static WebElement OverigeFiscaleReservesCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R7C7"));
		return element;
	}
	
	@FieldName(name = "OverigeFiscaleReservesFiscaal31_12")
	public static WebElement OverigeFiscaleReservesFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzny"));
		return element;
	}
	
	//Eigen vermogen
		
	public static WebElement EigenvermogenCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R8C1"));
		return element;
	}
	
	public static WebElement EigenvermogenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R8C3"));
		return element;
	}
	public static WebElement EigenvermogenCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R8C5"));
		return element;
	}
	public static WebElement EigenvermogenCF(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R8C7"));
		return element;
	}
	
	public static WebElement EigenvermogenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idOnv2R8C9"));
		return element;
	}
	
	//Voorzieningen
	
	public static WebElement VoorzieningenCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz1R0C1"));
		return element;
	}
	
	public static WebElement VoorzieningenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz1R0C3"));
		return element;
	}
	public static WebElement VoorzieningenCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoz1R0C5"));
		return element;
	}
	public static WebElement VoorzieningenCF(WebDriver driver){
		element = driver.findElement(By.id("idVoz1R0C7"));
		return element;
	}
	
	public static WebElement VoorzieningenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzo8"));
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

	public static WebElement GarantieVoorzieningFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzo2"));
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

	public static WebElement VoorzieningLijfrenteFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzo4"));
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
	
	@FieldName(name = "OverigeVoorzieningFiscaal31_12")
	public static WebElement OverigeVoorzieningFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzo6"));
		return element;
	}
	
	//Totaal Voorzieningen
	
	public static WebElement TotaalVoorzieningCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R3C1"));
		return element;
	}
	
	public static WebElement TotaalVoorzieningFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R3C3"));
		return element;
	}
	public static WebElement TotaalVoorzieningCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R3C5"));
		return element;
	}
	public static WebElement TotaalVoorzieningCF(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R3C7"));
		return element;
	}
	
	public static WebElement TotaalVoorzieningFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoz2R3C9"));
		return element;
	}
	
	
	//Langlopende schulden
		
	public static WebElement LanglopendeSchuldenCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls1R0C1"));
		return element;
	}
	
	public static WebElement LanglopendeSchuldenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls1R0C3"));
		return element;
	}
	public static WebElement LanglopendeSchuldenCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls1R0C5"));
		return element;
	}
	public static WebElement LanglopendeSchuldenCF(WebDriver driver){
		element = driver.findElement(By.id("idLls1R0C7"));
		return element;
	}
	
	@FieldName(name = "LanglopendeSchuldenFiscaal31_12")
	public static WebElement LanglopendeSchuldenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzol"));
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
	
	@FieldName(name = "ConverteerbareleningenFiscaal31_12")
	public static WebElement ConverteerbareleningenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoc"));
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
	
	@FieldName(name = "SchuldenKredietInstFiscaal31_12")
	public static WebElement SchuldenKredietInstFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzod"));
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
	
	@FieldName(name = "ObligatiesFiscaal31_12")
	public static WebElement ObligatiesFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzog"));
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
	
	@FieldName(name = "LanglopendeSchuldenGrMaatschFiscaal31_12")
	public static WebElement LanglopendeSchuldenGrMaatschFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoi"));
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
	
	@FieldName(name = "LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12")
	public static WebElement LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzon"));
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
	
	@FieldName(name = "OverigeLangLopendeSchFiscaal31_12")
	public static WebElement OverigeLangLopendeSchFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzof"));
		return element;
	}
	
	//Totaal langlopende schulden
	
	
	
	public static WebElement TotaalLangLopSchuldCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R6C1"));
		return element;
	}
	
	public static WebElement TotaalLangLopSchuldFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLls2R6C3"));
		return element;
	}
	public static WebElement TotaalLangLopSchuldCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R6C5"));
		return element;
	}
	public static WebElement TotaalLangLopSchuldCF(WebDriver driver){
		element = driver.findElement(By.id("idLls2R6C7"));
		return element;
	}	
	
	public static WebElement TotaalLangLopSchuldFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idLls2R6C9"));
		return element;
	}
	
	
	//Kortlopende schulden
	
	public static WebElement KortLopendeSchuldCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls1R0C1"));
		return element;
	}
	
	public static WebElement KortLopendeSchuldFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls1R0C3"));
		return element;
	}
	public static WebElement KortLopendeSchuldCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls1R0C5"));
		return element;
	}
	public static WebElement KortLopendeSchuldCF(WebDriver driver){
		element = driver.findElement(By.id("idKls1R0C7"));
		return element;
	}	
	
	public static WebElement KortLopendeSchuldFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoy"));
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
	public static WebElement SchuldenLeveranciersHandelsKrFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoq"));
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
	public static WebElement OmzetbelastingFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzor"));
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
	
	public static WebElement LoonheffingenFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzou"));
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
	public static WebElement KortlopendeSchuldGroepsmaatschFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzot"));
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
	
	public static WebElement KortlopendeSchuldParticiantFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzov"));
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
	
	public static WebElement OverigeKortlSchuldFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzow"));
		return element;
	}
	
	//Totaal kortlopende schulden 
		
	public static WebElement TotaalKortlSchuldCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R6C1"));
		return element;
	}
	
	public static WebElement TotaalKortlSchuldFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idKls2R6C3"));
		return element;
	}
	public static WebElement TotaalKortlSchuldCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R6C5"));
		return element;
	}
	public static WebElement TotaalKortlSchuldCF(WebDriver driver){
		element = driver.findElement(By.id("idKls2R6C7"));
		return element;
	}
	
	public static WebElement TotaalKortlSchuldFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idKls2R6C9"));
		return element;
	}
		
	//Totaal passiva 
	
	
	
	public static WebElement TotaalPassivaCommercieeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idTotPa1R0C1"));
		return element;
	}
	
	public static WebElement TotaalPassivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idTotPa1R0C3"));
		return element;
	}
	public static WebElement TotaalPassivaCommercieeel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idTotPa1R0C5"));
		return element;
	}
	public static WebElement TotaalPassivaCF(WebDriver driver){
		element = driver.findElement(By.id("idTotPa1R0C7"));
		return element;
	}
	
	public static WebElement TotaalPassivaFiscaal31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzoz"));
		return element;
	}
		
	//Toelichting balans passiva 
	
	public static WebElement ToelichtingBalansPassiva(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrn"));
		return element;
	}
}
