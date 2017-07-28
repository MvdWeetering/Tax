package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansActivaObjecten {
	private static WebElement element = null;

	//Algemeen
	@FieldName(name = "NaamOnderneming")
	public static WebElement NaamOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlh"));
		return element;
	}
	@FieldName(name = "OmschrijvingActiviteit")
	public static WebElement OmschrijvingActiviteit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzli"));
		return element;
	}
	public static WebElement DochterMaatschappij_Ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzlj']"));
		return element;
	}
	
	public static WebElement DochterMaatschappij_Nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzlj-no']"));
		return element;
	}
	
	public static WebElement BoekjaarAgrarische_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzll']"));
		return element;
	}
	public static WebElement BoekjaarAgrarische_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzll-no']"));
		return element;
	}
		
	//Immateriele vaste activa 
	public static WebElement ImmaterieleVasteActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva1R0C1"));
		return element;
	}
	
	public static WebElement ImmaterieleVasteActivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva1R0C3"));
		return element;
	}
	
	public static WebElement ImmaterieleVasteActivaCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idIva1R0C5"));
		return element;
	}
	
	public static WebElement ImmaterieleVasteActivaCF(WebDriver driver){
		element = driver.findElement(By.id("idIva1R0C7"));
		return element;
	}
	
	@FieldName(name = "ImmaterieleVasteActivaFiscaal_31_12")
	public static WebElement ImmaterieleVasteActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlv"));
		return element;
	}
	
	
	//goodwill fiscaal
	public static WebElement GoodwillAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzp4"));
		return element;
	}
	
	public static WebElement GoodwillCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva2R0C3"));
		return element;
	}

	public static WebElement GoodwillFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva2R0C5"));
		return element;
	}
	
	public static WebElement GoodwillCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idIva2R0C7"));
		return element;
	}
	
	public static WebElement GoodwillCF(WebDriver driver){
		element = driver.findElement(By.id("idIva2R0C9"));
		return element;
	}
	
	@FieldName(name = "GoodwillFiscaal_31_12")
	public static WebElement GoodwillFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlr"));
		return element;
	}
	
	//overige immateriele vaste activa
	public static WebElement OverigeImmaterieleAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzp6"));
		return element;
	}
	
	public static WebElement OverigeImmaterieleCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva2R1C3"));
		return element;
	}
	
	public static WebElement OverigeImmaterieleFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva2R1C5"));
		return element;
	}
	
	public static WebElement OverigeImmaterieleCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idIva2R1C7"));
		return element;
	}
	public static WebElement OverigeImmaterieleCF(WebDriver driver){
		element = driver.findElement(By.id("idIva2R1C9"));
		return element;
	}
	
	@FieldName(name = "OverigeImmaterieleFiscaal_31_12")
	public static WebElement OverigeImmaterieleFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzls"));
		return element;
	}	
	
	//Totaal immateriele vaste activa
	
	public static WebElement TotaalImmaterieleVasteActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva2R2C3"));
		return element;
	}
	
	public static WebElement TotaalImmaterieleVasteActivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idIva2R2C5"));
		return element;
	}
	
	public static WebElement TotaalImmaterieleVasteActivaCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idIva2R2C7"));
		return element;
	}
	
	public static WebElement TotaalImmaterieleVasteActivaCF(WebDriver driver){
		element = driver.findElement(By.id("idIva2R2C9"));
		return element;
	}
	
	public static WebElement TotaalImmaterieleVasteActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idIva2R2C11"));
		return element;
	}
		
	//gebouwen en terreinen
	public static WebElement GebouwenTerreinenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R0C1"));
		return element;
	}
	
	public static WebElement GebouwenTerreinenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R0C3"));
		return element;
	}
	
	public static WebElement GebouwenTerreinenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idMva2R0C5"));
		return element;
	}
	
	public static WebElement GebouwenTerreinenCF(WebDriver driver){
		element = driver.findElement(By.id("idMva2R0C7"));
		return element;
	}

	@FieldName(name = "GebouwenTerreinenFiscaal_31_12")
	public static WebElement GebouwenTerreinenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzm2"));
		return element;
	}
	
		
	//machines
	public static WebElement MachinesCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R1C1"));
		return element;
	}
	
	public static WebElement MachinesFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R1C3"));
		return element;
	}
	
	public static WebElement MachinesCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idMva2R1C5"));
		return element;
	}
	
	public static WebElement MachinesCF(WebDriver driver){
		element = driver.findElement(By.id("idMva2R1C7"));
		return element;
	}
	
	@FieldName(name = "MachinesFiscaal_31_12")
	public static WebElement MachinesFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzm4"));
		return element;
	}
	
	//Andere vaste bedrijfsmiddelen
	public static WebElement AndereBedrijfsCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R2C1"));
		return element;
	}
	
	public static WebElement AndereBedrijfsFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R2C3"));
		return element;
	}
	
	public static WebElement AndereBedrijfsCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idMva2R2C5"));
		return element;
	}
	
	public static WebElement AndereBedrijfsCF(WebDriver driver){
		element = driver.findElement(By.id("idMva2R2C7"));
		return element;
	}
	
	@FieldName(name = "AndereBedrijfsFiscaal_31_12")
	public static WebElement AndereBedrijfsFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzm6"));
		return element;
	}
		
	//Totaal materiele vaste activa
		
	public static WebElement TotaalMaterieleVasteActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R3C1"));
		return element;
	}
	
	public static WebElement TotaalMaterieleVasteActivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idMva2R3C3"));
		return element;
	}
	
	public static WebElement TotaalMaterieleVasteActivaCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idMva2R3C5"));
		return element;
	}
	
	public static WebElement TotaalMaterieleVasteActivaCF(WebDriver driver){
		element = driver.findElement(By.id("idMva2R3C7"));
		return element;
	}
	public static WebElement TotaalMaterieleVasteActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idMva2R3C9"));
		return element;
	}
	
	//Financi�le vaste activa 
		
	public static WebElement FinancieleVasteActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C1"));
		return element;
	}
	
	public static WebElement FinancieleVasteActivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C3"));
		return element;
	}
	
	public static WebElement FinancieleVasteActivaCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C5"));
		return element;
	}
	
	public static WebElement FinancieleVasteActivaCF(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C7"));
		return element;
	}
	public static WebElement FinancieleVasteActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmh"));
		return element;
	}
		
	//Deelnemingen
	public static WebElement DeelnemingenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R0C3"));
		return element;
	}
	
	public static WebElement DeelnemingenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R0C5"));
		return element;
	}
	
	public static WebElement DeelnemingenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idFva2R0C7"));
		return element;
	}
	
	public static WebElement DeelnemingenCF(WebDriver driver){
		element = driver.findElement(By.id("idFva2R0C9"));
		return element;
	}
	public static WebElement DeelnemingenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmc"));
		return element;
	}
		
	//Langlopende vorderingen op groepsmaatschappijen
	
	@FieldName(name = "langlopendevordGroepsNominaleWaarde")
	public static WebElement langlopendevordGroepsNominaleWaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmk"));
		return element;
	}
	
	public static WebElement langlopendevordGroepsCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R1C3"));
		return element;
	}
	
	public static WebElement langlopendevordGroepsFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R1C5"));
		return element;
	}
	
	public static WebElement langlopendevordGroepsCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idFva2R1C7"));
		return element;
	}
	
	public static WebElement langlopendevordGroepsCF(WebDriver driver){
		element = driver.findElement(By.id("idFva2R1C9"));
		return element;
	}
	
	@FieldName(name = "langlopendevordGroepsFiscaal_31_12")	
	public static WebElement langlopendevordGroepsFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmd"));
		return element;
	}
	
	//Langlopende vorderingen participanten/maatschappijen
	@FieldName(name = "langlopendevordPartNominaleWaarde")
	public static WebElement langlopendevordPartNominaleWaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzml"));
		return element;
	}
	
	public static WebElement langlopendevordPartCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R2C3"));
		return element;
	}
	
	public static WebElement langlopendevordPartFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R2C5"));
		return element;
	}
	
	public static WebElement langlopendevordPartCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idFva2R2C7"));
		return element;
	}
	
	public static WebElement langlopendevordPartCF(WebDriver driver){
		element = driver.findElement(By.id("idFva2R2C9"));
		return element;
	}
	
	@FieldName(name = "langlopendevordPartFiscaal_31_12")
	public static WebElement langlopendevordPartFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzme"));
		return element;
	}
	
	//Overige financi�le vaste activa 
	
	@FieldName(name = "OverigeFinActivaNominaleWaarde")
	public static WebElement OverigeFinActivaNominaleWaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmm"));
		return element;
	}
	
	public static WebElement OverigeFinActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva2R3C3"));
		return element;
	}
	
	public static WebElement OverigeFinActivaFiscaal_1_1(WebDriver driver){
			element = driver.findElement(By.id("idFva2R3C5"));
			return element;
		}
	
	public static WebElement OverigeFinActivaCommercieel_31_12(WebDriver driver){
			element = driver.findElement(By.id("idFva2R3C7"));
			return element;
		}
	
	public static WebElement OverigeFinActivaCF(WebDriver driver){
			element = driver.findElement(By.id("idFva2R3C9"));
			return element;
		}
	
	public static WebElement OverigeFinActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmg"));
		return element;
	}	
	
	//Totaal financiele vaste activa
	
	public static WebElement TotaalFinVasteActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C1"));
		return element;
	}
	
	public static WebElement TotaalFinVasteActivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C3"));
		return element;
	}
	
	public static WebElement TotaalFinVasteActivaCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C5"));
		return element;
	}
	
	public static WebElement TotaalFinVasteActivaCF(WebDriver driver){
		element = driver.findElement(By.id("idFva1R0C7"));
		return element;
	}
	public static WebElement TotaalFinVasteActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmh"));
		return element;
	}
	
	//Voorraden
	
	public static WebElement VoorradenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo1R0C1"));
		return element;
	}
	
	public static WebElement VoorradenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo1R0C3"));
		return element;
	}
	
	public static WebElement VoorradenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoo1R0C5"));
		return element;
	}
	
	public static WebElement VoorradenCF(WebDriver driver){
		element = driver.findElement(By.id("idVoo1R0C7"));
		return element;
	}
	public static WebElement VoorradenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmv"));
		return element;
	}
	
	//Voorraden, excl onderhanden werk 
	
	public static WebElement VoorradenExlCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C1"));
		return element;
	}

	public static WebElement VoorradenExlFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C3"));
		return element;
	}
	
	public static WebElement VoorradenExlCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C5"));
		return element;
	}
	
	public static WebElement VoorradenExlCF(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C7"));
		return element;
	}
	public static WebElement VoorradenExlFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzms"));
		return element;
	}
	
	//Onderhanden werk
	
	public static WebElement OnderhandenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R1C1"));
		return element;
	}
	
	public static WebElement OnderhandenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R1C3"));
		return element;
	}

	public static WebElement OnderhandenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R1C5"));
		return element;
	}
	
	public static WebElement OnderhandenCF(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R1C7"));
		return element;
	}
	
	public static WebElement OnderhandenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmt"));
		return element;
	}
	
	//Totaal voorraden 
	
	public static WebElement TotaalVoorradenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R2C1"));
		return element;
	}
	
	public static WebElement TotaalVoorradenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R2C3"));
		return element;
	}

	public static WebElement TotaalVoorradenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R2C5"));
		return element;
	}
	
	public static WebElement TotaalVoorradenCF(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R2C7"));
		return element;
	}
	
	public static WebElement TotaalVoorradenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R2C9"));
		return element;
	}
	
	//Vorderingen
	
	public static WebElement VorderingenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor1R0C1"));
		return element;
	}
	
	public static WebElement VorderingenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor1R0C3"));
		return element;
	}

	public static WebElement VorderingenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor1R0C5"));
		return element;
	}
	
	public static WebElement VorderingenCF(WebDriver driver){
		element = driver.findElement(By.id("idVor1R0C7"));
		return element;
	}
	
	public static WebElement VorderingenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn4"));
		return element;
	}
			
	//Handelsdebiteuren
	
	@FieldName(name = "HandelsdebiteurenNominale")	
	public static WebElement HandelsdebiteurenNominale(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmz"));
		return element;
	}
	
	public static WebElement HandelsdebiteurenCommericeel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R0C3"));
		return element;
	}
	
	public static WebElement HandelsdebiteurenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R0C5"));
		return element;
	}
	
	public static WebElement HandelsdebiteurenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R0C7"));
		return element;
	}
	
	public static WebElement HandelsdebiteurenCF(WebDriver driver){
		element = driver.findElement(By.id("idVor2R0C9"));
		return element;
	}
	
	@FieldName(name = "HandelsdebiteurenFiscaal_31_12")	
	public static WebElement HandelsdebiteurenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmx"));
		return element;
	}
	
	//Omzetbelasting
	
	public static WebElement OmzetBelastingCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R1C3"));
		return element;
	}
	
	public static WebElement OmzetBelastingFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R1C5"));
		return element;
	}
	
	public static WebElement OmzetBelastingCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R1C7"));
		return element;
	}
	
	public static WebElement OmzetBelastingCF(WebDriver driver){
		element = driver.findElement(By.id("idVor2R1C9"));
		return element;
	}
	
	public static WebElement OmzetBelastingFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzmy"));
		return element;
	}
	
	//Kortlopende vorderingen op groepsmaatschappijen
	@FieldName(name = "KortVordGroepNominale")	
	public static WebElement KortVordGroepNominale(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn7"));
		return element;
	}
	
	public static WebElement KortVordGroepCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R2C3"));
		return element;
	}
	
	public static WebElement KortVordGroepFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R2C5"));
		return element;
	}
	
	public static WebElement KortVordGroepCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R2C7"));
		return element;
	}
	
	public static WebElement KortVordGroepCF(WebDriver driver){
		element = driver.findElement(By.id("idVor2R2C9"));
		return element;
	}
	
	@FieldName(name = "KortVordGroepFiscaal_31_12")	
	public static WebElement KortVordGroepFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn0"));
		return element;
	}
	
	//Kortlopende vorderingen participanten/ maatschappijen
	
	@FieldName(name = "KortVordPartNominaal")
	public static WebElement KortVordPartNominaal(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn8"));
		return element;
	}
	
	public static WebElement KortVordPartCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R3C3"));
		return element;
	}
	
	public static WebElement KortVordPartFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R3C5"));
		return element;
	}
	
	public static WebElement KortVordPartCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R3C7"));
		return element;
	}
	
	public static WebElement KortVordPartCF(WebDriver driver){
		element = driver.findElement(By.id("idVor2R3C9"));
		return element;
	}
	
	@FieldName(name = "KortVordPartFiscaal_31_12")	
	public static WebElement KortVordPartFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn1"));
		return element;
	}
	
	//Overige vorderingen 	
	
	public static WebElement OverigeVordCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R4C3"));
		return element;
	}
	
	public static WebElement OverigeVordFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R4C5"));
		return element;
	}
	
	public static WebElement OverigeVordCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R4C7"));
		return element;
	}
	
	public static WebElement OverigeVordCF(WebDriver driver){
		element = driver.findElement(By.id("idVor2R4C9"));
		return element;
	}
	
	@FieldName(name = "OverigeVordFiscaal_31_12")
	public static WebElement OverigeVordFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn2"));
		return element;
	}
	
	
	//Totaal vorderingen 
	
	
	
	public static WebElement TotaalVorderingenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R5C3"));
		return element;
	}
	
	public static WebElement TotaalVorderingenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVor2R5C5"));
		return element;
	}
	
	public static WebElement TotaalVorderingenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R5C7"));
		return element;
	}
	
	public static WebElement TotaalVorderingenCF(WebDriver driver){
		element = driver.findElement(By.id("idVor2R5C9"));
		return element;
	}
	
	public static WebElement TotaalVorderingenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVor2R5C11"));
		return element;
	}
	
	//effecten
	
	public static WebElement EffectenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idEff1R0C1"));
		return element;
	}
	
	public static WebElement EffectenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idEff1R0C3"));
		return element;
	}
	
	public static WebElement EffectenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idEff1R0C5"));
		return element;
	}
	
	public static WebElement EffectenCF(WebDriver driver){
		element = driver.findElement(By.id("idEff1R0C7"));
		return element;
	}
	
	@FieldName(name = "EffectenFiscaal_31_12")
	public static WebElement EffectenFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzn9"));
		return element;
	}
	
	//liquide middelen
	
	public static WebElement LiquideCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLiq1R0C1"));
		return element;
	}
	
	public static WebElement LiquideFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idLiq1R0C3"));
		return element;
	}
	
	public static WebElement LiquideCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idLiq1R0C5"));
		return element;
	}
	
	public static WebElement LiquideCF(WebDriver driver){
		element = driver.findElement(By.id("idLiq1R0C7"));
		return element;
	}
	
	public static WebElement LiquideFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznb"));
		return element;
	}
	
	//Totaal Activa
	
	public static WebElement TotaalActivaCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idTotAc1R0C1"));
		return element;
	}
	
	public static WebElement TotaalActivaFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idTotAc1R0C3"));
		return element;
	}
	
	public static WebElement TotaalActivaCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idTotAc1R0C5"));
		return element;
	}
	
	public static WebElement TotaalActivaCF(WebDriver driver){
		element = driver.findElement(By.id("idTotAc1R0C7"));
		return element;
	}
	
	public static WebElement TotaalActivaFiscaal_31_12(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tznc"));
		return element;
	}
	
	// toelichting balans
	
	public static WebElement Toelichtingbalans(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrm"));
		return element;
	}	
	
	
}
