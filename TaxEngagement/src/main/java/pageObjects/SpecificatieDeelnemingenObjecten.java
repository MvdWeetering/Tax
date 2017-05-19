package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieDeelnemingenObjecten {
	private static WebElement element = null;

	@FieldName(name = "NaamDeelneming")
	public static WebElement NaamDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzgx"));
		return element;
	}
	
	@FieldName(name = "RSINdeelneming")
	public static WebElement RSINdeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzgy"));
		return element;
	}
	
	@FieldName(name = "VestigingsplaatsDeelneming")
	public static WebElement VestigingsplaatsDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh0"));
		return element;
	}
	
	@FieldName(name = "VestigingsLandDeelneming")
	public static WebElement VestigingsLandDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh1"));
		return element;
	}

	@FieldName(name = "PercentageAandelenbezit")
	public static WebElement PercentageAandelenbezit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh2"));
		return element;
	}
	
	@FieldName(name = "Straatnaam")
	public static WebElement Straatnaam(WebDriver driver){
			element = driver.findElement(By.id("idn26n68es"));
			return element;
	}
	
	@FieldName(name = "Huisnummer")
	public static WebElement Huisnummer(WebDriver driver){
				element = driver.findElement(By.id("idn26n68et"));
				return element;
	}
	
	@FieldName(name = "HuisnummerBuitenlandsAdres")
	public static WebElement HuisnummerBuitenlandsAdres(WebDriver driver) {
		element = driver.findElement(By.id("idn26n68eu"));
		return element;
		
	}	
	
	@FieldName(name = "NominaleWaardeAandelenBezit")
	public static WebElement NominaleWaardeAandelenBezit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh4"));
		return element;
	}
	
	@FieldName(name = "OpgeofferdBedrag")
	public static WebElement OpgeofferdBedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh6"));
		return element;
	}
	
	@FieldName(name = "BrutoVoordelenMetDeelneming")
	public static WebElement BrutoVoordelenMetDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fj"));
		return element;
	}
	
	@FieldName(name = "KostenVerwervingDeelneming")
	public static WebElement KostenVerwervingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fk"));
		return element;
	}
	
	@FieldName(name = "BalanswaarderingDeelneming")
	public static WebElement BalanswaarderingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh7"));
		return element;
	}
	
	@FieldName(name = "VoordelenDeelneming")
	public static WebElement VoordelenDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh9"));
		return element;
	}
	
	@FieldName(name = "BedragVorderingenDeelneming")
	public static WebElement BedragVorderingenDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzha"));
		return element;
	}
	
	@FieldName(name = "BedragSchuldDeelneming")
	public static WebElement BedragSchuldDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhd"));
		return element;
	}
	
	@FieldName(name = "OntvRenteDeelneming")
	public static WebElement OntvRenteDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhc"));
		return element;
	}
	
	@FieldName(name = "BetRenteDeelneming")
	public static WebElement BetRenteDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhe"));
		return element;
	}
	
	@FieldName(name = "DeelnemingGevoegd_Ja")
	public static WebElement DeelnemingGevoegd_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhg"));
		return element;
	}
	
	@FieldName(name = "DeelnemingGevoegd_Nee")
	public static WebElement DeelnemingGevoegd_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhg-no"));
		return element;
	}
	
	@FieldName(name = "Voegingsdatum")
	public static WebElement Voegingsdatum(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhn"));
		return element;
	}
	
	@FieldName(name = "Ontvoegingsdatum")
	public static WebElement Ontvoegingsdatum(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhp"));
		return element;
	}
	
	@FieldName(name = "DeelnemingVerworven_Ja")
	public static WebElement DeelnemingVerworven_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhh"));
		return element;
	}
	
	@FieldName(name = "DeelnemingVerworven_Nee")
	public static WebElement DeelnemingVerworven_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhh-no"));
		return element;
	}
	
	@FieldName(name = "PercentageVerwerving")
	public static WebElement PercentageVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhr"));
		return element;
	}
	
	@FieldName(name = "NominaleWaardeVerwerving")
	public static WebElement NominaleWaardeVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhs"));
		return element;
	}
	
	@FieldName(name = "OpgeofferdbedragVerwerving")
	public static WebElement OpgeofferdbedragVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhu"));
		return element;
	}
	
	@FieldName(name = "BelangDeelnemingVerworven_Ja")
	public static WebElement BelangDeelnemingVerworven_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhv"));
		return element;
	}
	
	@FieldName(name = "BelangDeelnemingVerworven_Nee")
	public static WebElement BelangDeelnemingVerworven_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhv-no"));
		return element;
	}
	
	@FieldName(name = "DeelnemingVervreemd_Ja")
	public static WebElement DeelnemingVervreemd_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhi"));
		return element;
	}
	
	@FieldName(name = "DeelnemingVervreemd_Nee")
	public static WebElement DeelnemingVervreemd_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhi-no"));
		return element;
	}
	
	@FieldName(name = "PercentageVervreemding")
	public static WebElement PercentageVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhw"));
		return element;
	}
	
	@FieldName(name = "NominaleWaardeVervreemding")
	public static WebElement NominaleWaardeVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhx"));
		return element;
	}
	
	@FieldName(name = "OpbrengstVervreemding")
	public static WebElement OpbrengstVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhz"));
		return element;
	}
	
	@FieldName(name = "BrutoVoordelenDelneming")
	public static WebElement BrutoVoordelenDelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fp"));
		return element;
	}
	
	@FieldName(name = "KostenVervreemdingDeelneming")
	public static WebElement KostenVervreemdingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fq"));
		return element;
	}
	
	@FieldName(name = "BelangVervreemdInBoekjaar_Ja")
	public static WebElement BelangVervreemdInBoekjaar_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi0"));
		return element;
	}
	
	@FieldName(name = "BelangVervreemdInBoekjaar_Nee")
	public static WebElement BelangVervreemdInBoekjaar_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi0-no"));
		return element;
	}
	
	@FieldName(name = "DeelnemingGeliquideerd_Ja")
	public static WebElement DeelnemingGeliquideerd_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhk"));
		return element;
	}
	
	@FieldName(name = "DeelnemingGeliquideerd_Nee")
	public static WebElement DeelnemingGeliquideerd_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhk-no"));
		return element;
	}
	
	@FieldName(name = "VereffeningsdatumDeelneming")
	public static WebElement VereffeningsdatumDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi2"));
		return element;
	}
	
	@FieldName(name = "VerkaptDivident_ja")
	public static WebElement VerkaptDivident_ja(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fc"));
		return element;
	}
	
	@FieldName(name = "VerkaptDivident_nee")
	public static WebElement VerkaptDivident_nee(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fc-no"));
		return element;
	}
		
	@FieldName(name = "LiquidatieVerliesDeelneming")
	public static WebElement LiquidatieVerliesDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi3"));
		return element;
	}
	
	@FieldName(name = "WaarderingsvoorschriftArt13_Ja")
	public static WebElement WaarderingsvoorschriftArt13_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhl"));
		return element;
	}
	
	@FieldName(name = "WaarderingsvoorschriftArt13_Nee")
	public static WebElement WaarderingsvoorschriftArt13_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhl-no"));
		return element;
	}
	
	@FieldName(name = "DeelnemingNietKwalificerende_Ja")
	public static WebElement DeelnemingNietKwalificerende_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhm"));
		return element;
	}
	
	@FieldName(name = "DeelnemingNietKwalificerende_Nee")
	public static WebElement DeelnemingNietKwalificerende_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhm-no"));
		return element;
	}
	
	@FieldName(name = "WaardeEconomischVerkeer")
	public static WebElement WaardeEconomischVerkeer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzie"));
		return element;
	}
	
	@FieldName(name = "BelangDeelnemingGedaald25Procent_Ja")
	public static WebElement BelangDeelnemingGedaald25Procent_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi9"));
		return element;
	}
	
	@FieldName(name = "BelangDeelnemingGedaald25Procent_Nee")
	public static WebElement BelangDeelnemingGedaald25Procent_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi9-no"));
		return element;
	}
	
	@FieldName(name = "Waarde25ProcentMutatie")
	public static WebElement Waarde25ProcentMutatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi6"));
		return element;
	}
	
	@FieldName(name = "BedragBruteringVoordeel")
	public static WebElement BedragBruteringVoordeel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzig"));
		return element;
	}
	
	@FieldName(name = "BeleggingsdeelnemingEULidstaat_Ja")
	public static WebElement BeleggingsdeelnemingEULidstaat_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzih"));
		return element;
	}
	
	@FieldName(name = "BeleggingsdeelnemingEULidstaat_Nee")
	public static WebElement BeleggingsdeelnemingEULidstaat_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzih-no"));
		return element;
	}
	
	@FieldName(name = "VerzoektVerrekening_Ja")
	public static WebElement VerzoektVerrekening_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzik"));
		return element;
	}
	
	@FieldName(name = "VerzoektVerrekening_Nee")
	public static WebElement VerzoektVerrekening_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzik-no"));
		return element;
	}
	
	@FieldName(name = "VerzoektAfwijkendeVerrekening_Ja")
	public static WebElement VerzoektAfwijkendeVerrekening_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzim"));
		return element;
	}
	
	@FieldName(name = "VerzoektAfwijkendeVerrekening_Nee")
	public static WebElement VerzoektAfwijkendeVerrekening_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzim-no"));
		return element;
	}
	
	@FieldName(name = "Meerdan99Deelnemingen_Ja")
	public static WebElement Meerdan99Deelnemingen_Ja(WebDriver driver){
		element = driver.findElement(By.id("idCWNLParticipations"));
		return element;
	}
	
	@FieldName(name = "Meerdan99Deelnemingen_Nee")
	public static WebElement Meerdan99Deelnemingen_Nee(WebDriver driver){
		element = driver.findElement(By.id("idCWNLParticipations-no"));
		return element;
	}
	
	@FieldName(name = "ToelichtingMeerdan99Deelnemingen")
	public static WebElement ToelichtingMeerdan99Deelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzin"));
		return element;
	}
	
	// verkapt divident
	
	@FieldName(name = "VerkaptDividentBedrag")	
	public static WebElement VerkaptDividentBedrag(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g0"));
		return element;
	}
	
	@FieldName(name = "WaaromVerkaptDivident")
	public static WebElement WaaromVerkaptDivident(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g1"));
		return element;
	}
	
	@FieldName(name = "NaamMoedermaatschappij")
	public static WebElement NaamMoedermaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g2"));
		return element;
	}
	
	@FieldName(name = "StraatnaamMoederMaatschappij")
	public static WebElement StraatnaamMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g3"));
		return element;
	}
	
	@FieldName(name = "HuisnummerMoederMaatschappij")
	public static WebElement HuisnummerMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g4"));
		return element;
	}
	
	@FieldName(name = "HuisnummerToevingMoederMaatschappij")
	public static WebElement HuisnummerToevingMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g5"));
		return element;
	}
	
	@FieldName(name = "VestingsPlaatsMoederMaatschappij")
	public static WebElement VestingsPlaatsMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g6"));
		return element;
	}
	
	@FieldName(name = "VestigingslandMoederMaatschappij")
	public static WebElement VestigingslandMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g7"));
		return element;
	}
	
	@FieldName(name = "DirecteDeelnemingOntgaan_ja")
	public static WebElement DirecteDeelnemingOntgaan_ja(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g8"));
		return element;
	}
	
	@FieldName(name = "DirecteDeelnemingOntgaan_nee")
	public static WebElement DirecteDeelnemingOntgaan_nee(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g8-no"));
		return element;
	}
	
	// Gegevens rechtspersonen
	
	
	@FieldName(name = "RechtspersoonVoordeelOntgaan")
	public static WebElement RechtspersoonVoordeelOntgaan(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-0"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonStraatnaam")
	public static WebElement RechtspersoonStraatnaam(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-2"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonHuisnummer")
	public static WebElement RechtspersoonHuisnummer(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-4"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonHuisnummerToevoeging")
	public static WebElement RechtspersoonHuisnummerToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-6"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonVestigingsplaats")
	public static WebElement RechtspersoonVestigingsplaats(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-8"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonVestigingsLand")
	public static WebElement RechtspersoonVestigingsLand(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-10"));
		return element;
	}
	
}
