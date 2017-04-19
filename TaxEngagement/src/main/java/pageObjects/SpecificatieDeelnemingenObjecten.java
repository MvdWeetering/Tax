package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieDeelnemingenObjecten {
	private static WebElement element = null;

	public static WebElement NaamDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzgx"));
		return element;
	}
	public static WebElement RSINdeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzgy"));
		return element;
	}
	public static WebElement VestigingsplaatsDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh0"));
		return element;
	}
	public static WebElement VestigingsLandDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh1"));
		return element;
	}

	public static WebElement PercentageAandelenbezit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh2"));
		return element;
	}
	public static WebElement Straatnaam(WebDriver driver){
			element = driver.findElement(By.id("idn26n68es"));
			return element;
	}
	public static WebElement Huisnummer(WebDriver driver){
				element = driver.findElement(By.id("idn26n68et"));
				return element;
	}
	public static WebElement HuisnummerBuitenlandsAdres(WebDriver driver) {
		element = driver.findElement(By.id("idn26n68eu"));
		return element;
		
	}	public static WebElement NominaleWaardeAandelenBezit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh4"));
		return element;
	}
	public static WebElement OpgeofferdBedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh6"));
		return element;
	}

	public static WebElement BrutoVoordelenMetDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fj"));
		return element;
	}
	
	public static WebElement KostenVerwervingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fk"));
		return element;
	}
	
	public static WebElement BalanswaarderingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh7"));
		return element;
	}
	public static WebElement VoordelenDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh9"));
		return element;
	}
	public static WebElement BedragVorderingenDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzha"));
		return element;
	}
	public static WebElement BedragSchuldDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhd"));
		return element;
	}
	public static WebElement OntvRenteDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhc"));
		return element;
	}
	public static WebElement BetRenteDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhe"));
		return element;
	}
	public static WebElement DeelnemingGevoegd_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhg"));
		return element;
	}
	public static WebElement DeelnemingGevoegd_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhg-no"));
		return element;
	}
	public static WebElement Voegingsdatum(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhn"));
		return element;
	}
	public static WebElement Ontvoegingsdatum(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhp"));
		return element;
	}
	public static WebElement DeelnemingVerworven_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhh"));
		return element;
	}
	public static WebElement DeelnemingVerworven_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhh-no"));
		return element;
	}
	public static WebElement PercentageVerwervingn(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhr"));
		return element;
	}
	public static WebElement NominaleWaardeVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhs"));
		return element;
	}
	public static WebElement OpgeofferdbedragVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhu"));
		return element;
	}
	public static WebElement BelangDeelnemingVerworven_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhv"));
		return element;
	}
	public static WebElement BelangDeelnemingVerworven_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhv-no"));
		return element;
	}
	public static WebElement DeelnemingVervreemd_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhi"));
		return element;
	}
	public static WebElement DeelnemingVervreemd_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi0-no"));
		return element;
	}
	public static WebElement PercentageVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhw"));
		return element;
	}
	public static WebElement NominaleWaardeVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhx"));
		return element;
	}
	public static WebElement OpbrengstVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhz"));
		return element;
	}
	public static WebElement BelangVervreemdInBoekjaar_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi0"));
		return element;
	}
	public static WebElement BelangVervreemdInBoekjaar_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi0-no"));
		return element;
	}
	public static WebElement DeelnemingGeliquideerd_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhk"));
		return element;
	}
	public static WebElement DeelnemingGeliquideerd_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhk-no"));
		return element;
	}
	public static WebElement VereffeningsdatumDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi2"));
		return element;
	}
	public static WebElement LiquidatieVerliesDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi3"));
		return element;
	}
	public static WebElement WaarderingsvoorschriftArt13_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhl"));
		return element;
	}
	public static WebElement WaarderingsvoorschriftArt13_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhl-no"));
		return element;
	}
	public static WebElement DeelnemingNietKwalificerende_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhm"));
		return element;
	}
	public static WebElement DeelnemingNietKwalificerende_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhm-no"));
		return element;
	}
	public static WebElement WaardeEconomischVerkeer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzie"));
		return element;
	}
	public static WebElement BelangDeelnemingGedaald25Procent_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi9"));
		return element;
	}
	public static WebElement BelangDeelnemingGedaald25Procent_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi9-no"));
		return element;
	}
	public static WebElement Waarde25ProcentMutatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi6"));
		return element;
	}
	public static WebElement BedragBruteringVoordeel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzig"));
		return element;
	}
	public static WebElement BeleggingsdeelnemingEULidstaat_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzih"));
		return element;
	}
		public static WebElement BeleggingsdeelnemingEULidstaat_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzih-no"));
		return element;
	}
		public static WebElement VerzoektVerrekening_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzik"));
		return element;
	}
	public static WebElement VerzoektVerrekening_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzik-no"));
		return element;
	}
	public static WebElement VerzoektAfwijkendeVerrekening_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzim"));
		return element;
	}
	public static WebElement VerzoektAfwijkendeVerrekening_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzim-no"));
		return element;
	}
	public static WebElement Meerdan99Deelnemingen_Ja(WebDriver driver){
		element = driver.findElement(By.id("idCWNLParticipations"));
		return element;
	}
	public static WebElement Meerdan99Deelnemingen_Nee(WebDriver driver){
		element = driver.findElement(By.id("idCWNLParticipations-no"));
		return element;
	}
	public static WebElement ToelichtingMeerdan99Deelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzin"));
		return element;
	}
	
}
