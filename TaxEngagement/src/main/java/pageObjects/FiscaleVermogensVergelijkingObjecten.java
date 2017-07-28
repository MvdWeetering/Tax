package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiscaleVermogensVergelijkingObjecten {
	private static WebElement element = null;
	
	@FieldName(name = "OndernemingsvermogenEindeJaar")
	public static WebElement OndernemingsvermogenEindeJaar (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzu4"));
		return element;
	}
	
	@FieldName(name = "MutatiesKapitaal")
	public static WebElement MutatiesKapitaal (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzu5"));
		return element;
	}
	
	@FieldName(name = "TotaalEindvermogenTerugbetalingen ")
	public static WebElement TotaalEindvermogenTerugbetalingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzu7"));
		return element;
	}
	
	@FieldName(name = "OndernemingsvermogenBeginJaar")
	public static WebElement OndernemingsvermogenBeginJaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzu8"));
		return element;
	}
	
	@FieldName(name = "StortingKapitaal ")
	public static WebElement StortingKapitaal(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzua"));
		return element;
	}
	
	public static WebElement DividentOntwWinstCheckbox(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCBAanDivOndWinTot']"));
		return element;
	}
	
		
	@FieldName(name = "TotaalBeginvermogenStortingen ")
	public static WebElement TotaalBeginvermogenStortingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzub"));
		return element;
	}
	
	@FieldName(name = "Vermogensverschil")
	public static WebElement Vermogensverschil(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuc"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbareBedragen ")
	public static WebElement NietAftrekbareBedragen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzud"));
		return element;
	}
	
	@FieldName(name = "SaldoFiscaleWinstberekening ")
	public static WebElement SaldoFiscaleWinstberekening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzuf"));
		return element;
	}
	
	@FieldName(name = "ResultaatWinstVerliesrekening ")
	public static WebElement ResultaatWinstVerliesrekening(WebDriver driver){
		element = driver.findElement(By.id("idCWNLResultaatWinVer"));
		return element;
	}
	
	@FieldName(name = "Verschil")
	public static WebElement Verschil(WebDriver driver){
		element = driver.findElement(By.id("idCWNLVerschilResWinstVerlBerFiscWinst"));
		return element;
	}
	
	@FieldName(name = "DividendOnderworpenWinstuitdelingen")
	public static WebElement DividendOnderworpenWinstuitdelingen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tze9"));
		return element;
	}
	
	@FieldName(name = "OmschrijvingUitdeling_1")
	public static WebElement OmschrijvingUitdeling_1(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:0-0"));
		return element;
	}
	
	@FieldName(name = "DatumTerbeschikkingstelling_1")
	public static WebElement DatumTerbeschikkingstelling_1(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:0-2"));
		return element;
	}
	
	@FieldName(name = "DatumAangifteDividendbelasting_1")
	public static WebElement DatumAangifteDividendbelasting_1(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:0-4"));
		return element;
	}
	
	@FieldName(name = "BedragIngehoudenDividendbelasting_1")
	public static WebElement BedragIngehoudenDividendbelasting_1(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:0-6"));
		return element;
	}
	
	@FieldName(name = "BedragWinstuitdeling_1")
	public static WebElement BedragWinstuitdeling_1(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:0-8"));
		return element;
	}
	
	@FieldName(name = "OmschrijvingUitdeling_2")
	public static WebElement OmschrijvingUitdeling_2(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:1-0"));
		return element;
	}
	
	@FieldName(name = "DatumTerbeschikkingstelling_2")
	public static WebElement DatumTerbeschikkingstelling_2(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:1-2"));
		return element;
	}
	
	@FieldName(name = "DatumAangifteDividendbelasting_2")
	public static WebElement DatumAangifteDividendbelasting_2(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:1-4"));
		return element;
	}
	
	@FieldName(name = "BedragIngehoudenDividendbelasting_2")
	public static WebElement BedragIngehoudenDividendbelasting_2(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:1-6"));
		return element;
	}
	
	@FieldName(name = "BedragWinstuitdeling_2")
	public static WebElement BedragWinstuitdeling_2(WebDriver driver){
		element = driver.findElement(By.id("idtableAanDivOndWin:1-8"));
		return element;
	}
	
	@FieldName(name = "VennootschapsbelastingFiscaalVermogenOnttrokken")
	public static WebElement VennootschapsbelastingFiscaalVermogenOnttrokken(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzeb"));
		return element;
	}
	
	@FieldName(name = "BuitenlandseBelastingRegeling")
	public static WebElement BuitenlandseBelastingRegeling(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzec"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarWinstuitdelingenCooperaties")
	public static WebElement NietAftrekbaarWinstuitdelingenCooperaties(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzed"));
		return element;
	}
	
	public static WebElement NietAftrDeelWinstCoopCheckbox(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCBNieAftDeeWinDooCooTot']"));
		return element;
	}
	
		
	@FieldName(name = "WinstuitdelingenCooperaties")
	public static WebElement WinstuitdelingenCooperaties(WebDriver driver){
		element = driver.findElement(By.id("idCWNLWinDooCoo"));
		return element;
	}
	
	@FieldName(name = "AftrekbaarDeelWinstuitdelingenCooperaties")
	public static WebElement AftrekbaarDeelWinstuitdelingenCooperaties(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAftDeeWinDooCoo"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarWinstuitdelingenCooperaties_sub")
	public static WebElement NietAftrekbaarWinstuitdelingenCooperaties_sub(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTotNieAftDeeWinDooCoo"));
		return element;
	}
	
	@FieldName(name = "AndereOpenlijkeVermomdeUitdelingenWinst")
	public static WebElement AndereOpenlijkeVermomdeUitdelingenWinst(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzef"));
		return element;
	}
	
	public static WebElement NietAftrDeelCommCheckbox(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCBNieAftDeeBelComTot']"));
		return element;
	}
	
	
	@FieldName(name = "NietAftrekbaarDeelBeloningenCommissarissen")
	public static WebElement NietAftrekbaarDeelBeloningenCommissarissen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzeh"));
		return element;
	}
	
	@FieldName(name = "BeloningenCommissarissen")
	public static WebElement BeloningenCommissarissen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLBelCom"));
		return element;
	}
	
	@FieldName(name = "AftrekbaarDeelBeloningenCommissarissen ")
	public static WebElement AftrekbaarDeelBeloningenCommissarissen(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAftDeelBelCom"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarDeelBeloningenCommissarissen_sub")
	public static WebElement NietAftrekbaarDeelBeloningenCommissarissen_sub(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzeh"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarDeelTantiemes")
	public static WebElement NietAftrekbaarDeelTantiemes(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzek"));
		return element;
	}
	
	public static WebElement NietAftrDeelTantiemesCheckbox(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCBNieAftDeeTanTot']"));
		return element;
	}
	
	@FieldName(name = "Tantiemes")
	public static WebElement Tantiemes(WebDriver driver){
		element = driver.findElement(By.id("idCWNLTantiemes"));
		return element;
	}
	
	@FieldName(name = "AftrekbaarDeelTantiemes")
	public static WebElement AftrekbaarDeelTantiemes(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAftDeeTan"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarDeelTantiemes_sub")
	public static WebElement NietAftrekbaarDeelTantiemes_sub(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzek"));
		return element;
	}
	
	public static WebElement NietAftrDeelKapVerstrCheckbox(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLCBNieAftDeeVerVooKapTot']"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarDeelVergoedingenKapitaalverstrekking")
	public static WebElement NietAftrekbaarDeelVergoedingenKapitaalverstrekking(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzeo"));
		return element;
	}
	
	@FieldName(name = "VergoedingenVoorKapitaalverstrekking")
	public static WebElement VergoedingenVoorKapitaalverstrekking(WebDriver driver){
		element = driver.findElement(By.id("idCWNLVerVooKap"));
		return element;
	}
	
	@FieldName(name = "AftrekbaarDeelVergoedingenVooKapitaalverstrekking")
	public static WebElement AftrekbaarDeelVergoedingenVooKapitaalverstrekking(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAftDeeVerVooKap"));
		return element;
	}
	
	@FieldName(name = "NietAftrekbaarDeelVergoedingenKapitaalverstrekking_sub")
	public static WebElement NietAftrekbaarDeelVergoedingenKapitaalverstrekking_sub(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzeo"));
		return element;
	}
	
	@FieldName(name = "UitkeringenIngevolgeStatutaireAndereVoorschriften")
	public static WebElement UitkeringenIngevolgeStatutaireAndereVoorschriften(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzer"));
		return element;
	}
	
	@FieldName(name = "ResultaatTijdelijkIngekochteAandelenWerknemeropties")
	public static WebElement ResultaatTijdelijkIngekochteAandelenWerknemeropties(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzeu"));
		return element;
	}
	
	@FieldName(name = "KostenAankoopResterendeAandelenDochtermaatschappijen")
	public static WebElement KostenAankoopResterendeAandelenDochtermaatschappijen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzev"));
		return element;
	}	
	
	@FieldName(name = "NietAftrekbareBedragen_Tot")
	public static WebElement NietAftrekbareBedragen_Tot(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzud"));
		return element;
	}
	
}
