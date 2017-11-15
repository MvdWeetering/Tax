package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {
	
	private static WebElement element = null;
	
	public static WebElement NavigerenTax(WebDriver driver){
	 		
		element = driver.findElement(By.linkText("NL Tax Engagement"));
		return element;
	}
	
	public static WebElement NavigerenAlgemeneVragen(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Algemene vragen"));
		return element;
	}
	
	public static WebElement NavigerenAlgemeneGegevens(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Algemene gegevens"));
		return element;
	}
	public static WebElement NavigerenSpecificatieAandeelhouders(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Specificatie aandeelhouders"));
		return element;
	}
	
	public static WebElement NavigerenSpecificatie_Deelnemingen(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Specificatie deelnemingen"));
		return element;
	}
	
	public static WebElement NavigerenToelichting_Balans(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting Balans"));
		return element;
	}
	
	public static WebElement ClickCloud(WebDriver driver){
	    element = driver.findElement(By.className(("GKQUE3LBGGD")));
		return element;
	}
	public static WebElement Zoekveld(WebDriver driver){
		WebElement parent = driver.findElement(By.id("main"));
	    element = parent.findElement(By.cssSelector("[placeholder='Zoeken...']"));
		return element;
	}
	
	public static WebElement NavigerenWinstEnVerliesRekening(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Winst- en verliesrekening"));
		return element;
	}
	
	public static WebElement BalansActiva(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Balans: Activa"));
		return element;
	}
	
	public static WebElement BalansPassiva(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Balans: Passiva"));
		return element;
	}
	public static WebElement Investeringsaftrek(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting investeringsaftrek"));
		return element;
	}
	public static WebElement Objectvrijstelling(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("objectvrijstelling"));
		return element;
	}
	public static WebElement Innovatiebox(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("innovatiebox"));
		return element;
	}
	public static WebElement belastbaarbedrag(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Berekening Belastbaar Bedrag"));
		return element;
	}
	public static WebElement FiscaleVermogensVergelijking(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Fiscale vermogensvergelijking"));
		return element;
	}
	public static WebElement WinstuitZeescheepvaart(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("winst uit zeescheepvaart"));
		return element;
	}
	
	public static WebElement VerliesVerrekening (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Verliesverrekening"));
		return element;
	}
	
	public static WebElement toelichtingOverigeVoorzieningen (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting overige voorzieningen"));
		return element;
	}
	
	public static WebElement ToelichtingMaterieleVasteActiva (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting mater"));
		return element;
	}
	
	public static WebElement ToelichtingGarantievoorziening (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting garantievoorzieningen"));
		return element;
	}
	public static WebElement SpecificatieInvesteringsregelingen (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Specificatie investeringsregelingen"));
		return element;
	}
	public static WebElement ToelichtingDesinvesteringsbijtelling (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting desinvesteringsbijtelling"));
		return element;
	}
	public static WebElement SpecificatieDochtermaatschappij (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Specificatie dochtermaatschappij"));
		return element;
	}
	public static WebElement BerekeningBelastbaarBedrag (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Berekening belastbaar bedrag"));
		return element;
	}
	public static WebElement toelichtingWinstenVerliesRekening (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting winst- en verliesrekening"));
		return element;
	}	
	public static WebElement ToelichtingHerinvesteringsreserve (WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting herinvesteringsreserve"));
		return element;
	}	
}
