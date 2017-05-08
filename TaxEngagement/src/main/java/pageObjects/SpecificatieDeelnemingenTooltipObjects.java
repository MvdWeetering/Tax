package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieDeelnemingenTooltipObjects {
	private static WebElement element = null;

	@FieldName(name = "NaamDeelneming")
	public static WebElement NaamDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzgx-popover"));
		return element;
	}
	
	@FieldName(name = "RSINdeelneming")
	public static WebElement RSINdeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzgy-popover"));
		return element;
	}
	
	@FieldName(name = "VestigingsplaatsDeelneming")
	public static WebElement VestigingsplaatsDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh0-popover"));
		return element;
	}
	
	@FieldName(name = "VestigingsLandDeelneming")
	public static WebElement VestigingsLandDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh1-popover"));
		return element;
	}

	@FieldName(name = "PercentageAandelenbezit")
	public static WebElement PercentageAandelenbezit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh2-popover"));
		return element;
	}
	
	@FieldName(name = "Straatnaam")
	public static WebElement Straatnaam(WebDriver driver){
			element = driver.findElement(By.id("idn26n68es-popover"));
			return element;
	}
	
	@FieldName(name = "Huisnummer")
	public static WebElement Huisnummer(WebDriver driver){
				element = driver.findElement(By.id("idn26n68e-popovert"));
				return element;
	}
	
	@FieldName(name = "HuisnummerBuitenlandsAdres")
	public static WebElement HuisnummerBuitenlandsAdres(WebDriver driver) {
		element = driver.findElement(By.id("idn26n68eu-popover"));
		return element;
	}	
	
	@FieldName(name = "NominaleWaardeAandelenBezit")
	public static WebElement NominaleWaardeAandelenBezit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh4-popover"));
		return element;
	}
	
	@FieldName(name = "OpgeofferdBedrag")
	public static WebElement OpgeofferdBedrag(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh6-popover"));
		return element;
	}
	
	@FieldName(name = "BrutoVoordelenMetDeelneming")
	public static WebElement BrutoVoordelenMetDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fj-popover"));
		return element;
	}
	
	@FieldName(name = "KostenVerwervingDeelneming")
	public static WebElement KostenVerwervingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fk-popover"));
		return element;
	}
	
	@FieldName(name = "BalanswaarderingDeelneming")
	public static WebElement BalanswaarderingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh7-popover"));
		return element;
	}
	
	@FieldName(name = "VoordelenDeelneming")
	public static WebElement VoordelenDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzh9-popover"));
		return element;
	}
	
	@FieldName(name = "BedragVorderingenDeelneming")
	public static WebElement BedragVorderingenDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzha-popover"));
		return element;
	}
	
	@FieldName(name = "BedragSchuldDeelneming")
	public static WebElement BedragSchuldDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhd-popover"));
		return element;
	}
	
	@FieldName(name = "OntvRenteDeelneming")
	public static WebElement OntvRenteDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhc-popover"));
		return element;
	}
	
	@FieldName(name = "BetRenteDeelneming")
	public static WebElement BetRenteDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhe-popover"));
		return element;
	}
	
	@FieldName(name = "Voegingsdatum")
	public static WebElement Voegingsdatum(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhn-popover"));
		return element;
	}
	
	@FieldName(name = "Ontvoegingsdatum")
	public static WebElement Ontvoegingsdatum(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhp-popover"));
		return element;
	}
	
	@FieldName(name = "PercentageVerwerving")
	public static WebElement PercentageVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhr-popover"));
		return element;
	}
	
	@FieldName(name = "NominaleWaardeVerwerving")
	public static WebElement NominaleWaardeVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhs-popover"));
		return element;
	}
	
	@FieldName(name = "OpgeofferdbedragVerwerving")
	public static WebElement OpgeofferdbedragVerwerving(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhu-popover"));
		return element;
	}
	
	@FieldName(name = "PercentageVervreemding")
	public static WebElement PercentageVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhw-popover"));
		return element;
	}
	
	@FieldName(name = "NominaleWaardeVervreemding")
	public static WebElement NominaleWaardeVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhx-popover"));
		return element;
	}
	
	@FieldName(name = "OpbrengstVervreemding")
	public static WebElement OpbrengstVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzhz-popover"));
		return element;
	}
	
	@FieldName(name = "BrutoVoordelenDelneming")
	public static WebElement BrutoVoordelenDelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fp-popover"));
		return element;
	}
	
	@FieldName(name = "KostenVervreemdingDeelneming")
	public static WebElement KostenVervreemdingDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idn26n68fq-popover"));
		return element;
	}
	
	@FieldName(name = "VereffeningsdatumDeelneming")
	public static WebElement VereffeningsdatumDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi2-popover"));
		return element;
	}
	
	@FieldName(name = "LiquidatieVerliesDeelneming")
	public static WebElement LiquidatieVerliesDeelneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi3-popover"));
		return element;
	}
	
	@FieldName(name = "WaardeEconomischVerkeer")
	public static WebElement WaardeEconomischVerkeer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzie-popover"));
		return element;
	}
	
	@FieldName(name = "Waarde25ProcentMutatie")
	public static WebElement Waarde25ProcentMutatie(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzi6-popover"));
		return element;
	}
	
	@FieldName(name = "BedragBruteringVoordeel")
	public static WebElement BedragBruteringVoordeel(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzig-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingMeerdan99Deelnemingen")
	public static WebElement ToelichtingMeerdan99Deelnemingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzin-popover"));
		return element;
	}
	
	// verkapt divident
	
	@FieldName(name = "VerkaptDividentBedrag")	
	public static WebElement VerkaptDividentBedrag(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g0-popover"));
		return element;
	}
	
	@FieldName(name = "WaaromVerkaptDivident")
	public static WebElement WaaromVerkaptDivident(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g1-popover"));
		return element;
	}
	
	@FieldName(name = "NaamMoedermaatschappij")
	public static WebElement NaamMoedermaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g2-popover"));
		return element;
	}
	
	@FieldName(name = "StraatnaamMoederMaatschappij")
	public static WebElement StraatnaamMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g3-popover"));
		return element;
	}
	
	@FieldName(name = "HuisnummerMoederMaatschappij")
	public static WebElement HuisnummerMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g4-popover"));
		return element;
	}
	
	@FieldName(name = "HuisnummerToevingMoederMaatschappij")
	public static WebElement HuisnummerToevingMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g5-popover"));
		return element;
	}
	
	@FieldName(name = "VestingsPlaatsMoederMaatschappij")
	public static WebElement VestingsPlaatsMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g6-popover"));
		return element;
	}
	
	@FieldName(name = "VestigingslandMoederMaatschappij")
	public static WebElement VestigingslandMoederMaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68g7-popover"));
		return element;
	}
	
	// Gegevens rechtspersonen
	
	@FieldName(name = "RechtspersoonVoordeelOntgaan")
	public static WebElement RechtspersoonVoordeelOntgaan(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-0-popover"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonStraatnaam")
	public static WebElement RechtspersoonStraatnaam(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-2-popover"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonHuisnummer")
	public static WebElement RechtspersoonHuisnummer(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-4-popover"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonHuisnummerToevoeging")
	public static WebElement RechtspersoonHuisnummerToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-6-popover"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonVestigingsplaats")
	public static WebElement RechtspersoonVestigingsplaats(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-8-popover"));
		return element;
	}
	
	@FieldName(name = "RechtspersoonVestigingsLand")
	public static WebElement RechtspersoonVestigingsLand(WebDriver driver){
		element = driver.findElement(By.id("idtable_GR:0-10-popover"));
		return element;
	}
}
