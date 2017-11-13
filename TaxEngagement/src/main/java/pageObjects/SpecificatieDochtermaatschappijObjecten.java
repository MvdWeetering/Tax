package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import codebase.LeesXLS;

public class SpecificatieDochtermaatschappijObjecten {
	private static WebElement element = null;
	
	public static WebElement NaamDochtermaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz9p"));
		return element;
	}
	
	public static WebElement RSINFiscaalNummer (WebDriver driver){
 		element = driver.findElement(By.id("idCWNLFiscalNumber"));
		return element;
	}
	
	public static WebElement ActiviteitenOnderneming (WebDriver driver){
 		element = driver.findElement(By.id("idCWNLActivOnd"));
		return element;
	}
	
	//Uitklap 1
	//Is de dochtermaatschappij in dit boekjaar gevoegd in de fiscale eenheid?
	
	public static WebElement dochtermaatschappijGevoegd_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzdm']"));
		return element;
	}

	public static WebElement dochtermaatschappijGevoegd_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzdm-no']"));
		return element;
	}
	
	public static WebElement WaarderingSchuldBalansDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9r"));
		return element;
	}
	
//	Waardering vordering op balans van andere maatschappij 
	public static WebElement WaarderingVorderingBalansAndereMaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9t"));
		return element;
	}
	
//	Belaste vrijval schuld bij dochtermaatschappij
	public static WebElement BelasteVrijvalSchuldDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9u"));
		return element;
	}
	
//	Waardering schuld op balans van andere maatschappij
	public static WebElement WaarderingSchuldBalansAndereMaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9v"));
		return element;
	}
//	Waardering vordering op balans dochtermaatschappij
	public static WebElement WaarderingVorderingBalansDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9w"));
		return element;
	}
//	Belaste vrijval schuld bij andere maatschappij
	public static WebElement BelasteVrijvalSchuldAndereMaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9y"));
		return element;
	}
//	Waarde economisch verkeer deelneming in dochtermaatschappij
	public static WebElement WaardeEconomischVerkeerDeelnemingDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tz9z"));
		return element;
	}
//	Waardering deelneming in dochtermaatschappij op balans moeder
	public static WebElement WaarderingDeelnemingDochtermaatschappijBalansMoeder (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tza1"));
		return element;
	}
//	Fiscaal vermogen dochtermaatschappij
	public static WebElement FiscaalVermogenDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tza2"));
		return element;
	}
//	Herwaardering deelneming in voorafgaande aangifte moedermaatschappij
	public static WebElement HerwaarderingDeelnemingVoorafgaandeAangifteMoedermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tza3"));
		return element;
	}
//	Vermogenssprong moedermaatschappij bij voeging
	public static WebElement VermogenssprongMoedermaatschappijVoeging (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tza5"));
		return element;
	}
	
	//Uitklap 2
	//Is de dochtermaatschappij in dit boekjaar ontvoegd uit de fiscale eenheid?
		
	public static WebElement DochtermaatschappijOntvoegd_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzdn']"));
		return element;
	}

	public static WebElement DochtermaatschappijOntvoegd_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzdn-no']"));
		return element;
	}
	
//	Voor ontvoegde dochtermaatschappij opgeofferd bedrag
	
	public static WebElement VoorOntvoegdeDochtermaatschappijOpgeofferdBedrag (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzac"));
		return element;
	}
	
//	Waardering onderlinge vordering ontvoegende dochtermaatschappij 
	public static WebElement WaarderingOnderlingeVorderingOntvoegendeDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzad"));
		return element;
	}
	
//	Waardering onderlinge schuld ontvoegende dochtermaatschappij
	
	public static WebElement WaarderingOnderlingeSchuldOntvoegendeDochtermaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzaf"));
		return element;
	}
	
//	Waardering onderlinge vordering van andere maatschappij 

	public static WebElement WaarderingOnderlingeVorderingAndereMaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzah"));
		return element;
	}
	
//	Waardering onderlinge schuld van andere maatschappij 

	public static WebElement WaarderingOnderlingeSchuldAndereMaatschappij (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzai"));
		return element;
	}
	
//	Is het tijdstip dat onmiddellijk aan het ontvoegingstijdstip vooraf gaat, sprake van een verplichte herwaardering van vermogensbestanddelen omdat binnen de fiscale eenheid aan of door de ontvoegende dochtermaatschappij een of meer vermogensbestanddelen zijn overgedragen waarvan, op het moment van de overdracht, de waarde in het economisch verkeer hoger was dan de boekwaarde (art. 15ai Wet VPB)?

	public static WebElement TijdstipOnmiddelijkOntvoegingstijdstip_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzaj']"));
		return element;
	}
	public static WebElement TijdstipOnmiddelijkOntvoegingstijdstip_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzaj-no']"));
		return element;
	}	
	
//	Is het betreffende vermogensbestanddeel nog in bezit van de overnemer?

	public static WebElement BetreffendeVermogensbestanddeelNogInBezitOvernemer_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzal']"));
		return element;
	}
	public static WebElement BetreffendeVermogensbestanddeelNogInBezitOvernemer_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzal-no']"));
		return element;
	}	
	
//	Heeft de overnemer het betreffende vermogensbestanddeel voorafgaand aan de ontvoeging ontvreemd? 
	
	public static WebElement  OvernemerBetreffendeVermogensbestanddeelVoorafgaandOntvoegingOntvreemd_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzan']"));
		return element;
	}
	public static WebElement OvernemerBetreffendeVermogensbestanddeelVoorafgaandOntvoegingOntvreemd_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzan-no']"));
		return element;
	}	
	
//	De waarde in het economisch verkeer op het tijdstip dat onmiddellijk voorafgaat aan het ontvoegingstijdstip van het/de overgedragen vermogensbestandde(e)l(en) dat/die nog in bezit zijn van de overnemer. De waarde in het economisch verkeer dient alleen ingevuld te worden als de belastingplichtige geen gebruik maakt van de tegenbewijsregeling van art. 15ai-2.
	public static WebElement WaardeEconomischVerkeerOpTijdstipOnmiddellijkVoorafgaatAanOntvoegingstijdstip (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzap"));
		return element;
	}
	
//	De waarde in het economisch verkeer van het overgedragen bestanddeel op het tijdstip van de overdracht, verminderd met de in aanmerking te nemen afschrijving.
	
	public static WebElement WaardeEconomischVerkeerOvergedragenBestanddeelTijdstipOverdracht (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzar"));
		return element;
	}
	
//	De fiscale boekwaarde op het tijdstip dat onmiddellijk voorafgaat aan het ontvoegingstijdstip van het/de overgedragen vermogensbestandde(e)l(en) dat/die nog in bezit is/zijn van de overnemer.
	public static WebElement FiscaleBoekwaardeOpTijdstipOnmiddellijkVoorafgaatOntvoegingstijdstip  (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzau"));
		return element;
	}
	
//	Het bedrag dat als gevolg van de overdracht van het/de vermogensbestandde(e)l(en) tot de winst van de fiscale eenheid wordt gerekend.

	public static WebElement BedragAlsGevolgVanOverdrachtVanVermogensbestanddenWinst (WebDriver driver){
 		element = driver.findElement(By.id("idxdt9tzay"));
		return element;
	}
	
//	Heeft de overnemer bij de vervreemding van het vermogensbestanddeel een herinvesteringsreserve gevormd?
	
	public static WebElement OvernemerVervreemdVermogensbestanddeelHerinvesteringsreserve_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzb1']"));
		return element;
	}
	
	public static WebElement OvernemerVervreemdVermogensbestanddeelHerinvesteringsreserve_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzb1-no']"));
		return element;
	}
	
	
//	Is de betreffende herinvesteringsreserve al afgeboekt op een vervangend bedrijfsmiddel? 

	public static WebElement BetreffendeHerinvesteringsReserveAfgeboekt_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzb3']"));
		return element;
	}
	
	public static WebElement BetreffendeHerinvesteringsReserveAfgeboekt_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzb3-no']"));
		return element;
	}
	
//	De winst van de fiscale eenheid vanwege vrijval door de overnemer gevormde herinvesteringsreserve. 

	public static WebElement WinstFiscaleEenheidvanwegeVrijval (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzb6"));
		return element;
	}
	
//	De waarde in het economisch verkeer op het tijdstip dat onmiddellijk voorafgaat aan het ontvoegingstijdstip van het vervangende bedrijfsmiddel.

	public static WebElement WaardeEconomischVerkeerTijdstipVoorafgaatOntvoegingstijdstip (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzar"));
		return element;
	}		
	
//	De boekwaarde, op het tijdstip dat onmiddellijk voorafgaat aan het ontvoegingstijdstip, van het vervangende bedrijfsmiddel.
	
	public static WebElement BoekwaardeOpTijdstipOnmiddelijkvoorafgaatOntvoegingsTijdstip (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzau"));
		return element;
	}
	
//	Het bedrag zijnde het verschil tussen de waarde in het economisch verkeer en de fiscale boekwaarde van het vervangende bedrijfmiddel op het tijdstip dat onmiddellijk voorafgaat aan het ontvoegingstijdstip. Dit bedrag wordt tot de winst van de fiscale eenheid gerekend.
	
	public static WebElement BedragZijndeVerschilWaardeEconomischVerkeerEnFiscaleBoekwaarde (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzau"));
		return element;
	}	
	
	
	
//	Staat op de balans van de ontvoegende dochtermaatschappij een herinvesteringsreserve waarvan het bij die reserve behorende voornemen tot vervanging berust bij een andere maatschappij?SpecificatieDochtermaatschappijObjecten.VermogenssprongMoedermaatschappijVoeging(driver).sendKeys(LeesXLS.HaalData("B", 23, Tab, Locatie));
	
	
	public static WebElement BalansOntvoegendeDochterMaatschappijHerinvesteringsreserve_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzbc']"));
		return element;
	}
	
	public static WebElement BalansOntvoegendeDochterMaatschappijHerinvesteringsreserve_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzbc-no']"));
		return element;
	}
		
	
	
//	Staat op de balans van een andere maatschappij een herinvesteringsreserve waarvan het bij die reserve behorende voornemen tot vervanging berust bij de ontvoegende dochtermaatschappij?
				
	
	public static WebElement BalansAndereMaatschappijHerinvesteringsReserveVoornemen_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzbc-no']"));
		return element;
	}
	
	
	public static WebElement BalansAndereMaatschappijHerinvesteringsReserveVoornemen_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzbc-no']"));
		return element;
	}
	
	
	
	
	//Uitklap 3
	//Is de dochtermaatschappij be�indigd door ontbinding en vereffening?
	
	public static WebElement DochtermaatschappijBeeindigd_ja (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzdp']"));
		return element;
	}

	public static WebElement DochtermaatschappijBeeindigd_nee (WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idxdt9tzdp-no']"));
		return element;
	}
	
}
