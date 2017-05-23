package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansActivaObjecten {
	private static WebElement element = null;

	//Algemeen
	public static WebElement NaamOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlh"));
		return element;
	}
	public static WebElement OmschrijvingActiviteit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzli"));
		return element;
	}
	public static WebElement DochterMaatschappij_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlj"));
		return element;
	}
	
	public static WebElement DochterMaatschappij_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlj-no"));
		return element;
	}
		
	public static WebElement BoekjaarAgrarische_ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzll"));
		return element;
	}
	public static WebElement BoekjaarAgrarische_nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzll-no"));
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
		
	//Langlopende vorderingen op groepsmaatschappijen
	
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
	
	//Langlopende vorderingen participanten/maatschappijen

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

	
	//Overige financiële vaste activa 

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
	
	//Voorraden, excl onderhanden werk 
	
	public static WebElement VoorradenCommercieel_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C1"));
		return element;
	}

	public static WebElement VoorradenFiscaal_1_1(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C3"));
		return element;
	}
	
	public static WebElement VoorradenCommercieel_31_12(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C5"));
		return element;
	}
	
	public static WebElement VoorradenCF(WebDriver driver){
		element = driver.findElement(By.id("idVoo2R0C7"));
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
	
	//Handelsdebiteuren
	
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
	
	//Kortlopende vorderingen op groepsmaatschappijen
	
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
	
	//Kortlopende vorderingen participanten/ maatschappijen
	
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
	
	// toelichting balans
	
	public static WebElement Toelichtingbalans(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrm"));
		return element;
	}	
	
	
	
	
	
	
	
	
}
