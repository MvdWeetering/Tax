package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WinstenVerliesRekeningObjecten {
	
	private static WebElement element = null;
		
	//bedrijfsopbrengsten
	
	public static WebElement NettoOmzetCommercieel(WebDriver driver){
	   element = driver.findElement(By.id("idBeOR0C1"));
	   return element;
	}
	public static WebElement NettoOmzetCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR0C3"));
		   return element;
		}
	public static WebElement WijzigingVoorraadCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR1C1"));
		   return element;
		}
	public static WebElement WijzigingVoorraadCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR1C3"));
		   return element;
		}
	
	public static WebElement GeactiveerdeProductieCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR2C1"));
		   return element;
		}
	public static WebElement GeactiveerdeProductieCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR2C3"));
		   return element;
		}
	
	public static WebElement OverigeOpbrengstenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR3C1"));
		   return element;
		}
	public static WebElement OverigeOpbrengstenProductieCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOR3C3"));
		   return element;
		}
		
	//Kosten grond en hulpstoffen
	
	public static WebElement KostenGrondHulpstoffenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR0C1"));
		   return element;
		}
	public static WebElement KostenGrondHulpstoffenCF(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR0C3"));
		   return element;
		}
	public static WebElement KostenUitbesteedCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR1C1"));
		   return element;
		}
	public static WebElement KostenUitbesteedCF(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR1C3"));
		   return element;
		}
	
	//Personeelskosten

	public static WebElement LonenSalarissenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR0C1"));
		   return element;
		}
	public static WebElement LonenSalarissenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR0C3"));
		   return element;
		}
	public static WebElement SocialeLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR1C1"));
		   return element;
		}
	public static WebElement SocialeLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR1C3"));
		   return element;
		}
	public static WebElement PensioenLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR2C1"));
		   return element;
		}
	public static WebElement PensioenLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR2C3"));
		   return element;
		}
	public static WebElement OverigePersoneelskostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR3C1"));
		   return element;
		}
	public static WebElement OverigePersoneelskostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR3C3"));
		   return element;
		}
	public static WebElement OntvangenUitkeringenenLoonsubsidiesCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR4C1"));
		   return element;
		}
	public static WebElement OntvangenUitkeringenenLoonsubsidiesCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR4C3"));
		   return element;
		}
	
	//Afschrijvingen

	public static WebElement GoodWillCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR0C1"));
		   return element;
		}
	public static WebElement GoodWillCF(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR0C3"));
		   return element;
		}
	public static WebElement OverigeImmaterieleActivaCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR1C1"));
		   return element;
		}
	public static WebElement OverigeImmaterieleActivaCF(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR1C3"));
		   return element;
		}
	public static WebElement BedrijfsgebouwenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR2C1"));
		   return element;
		}
	public static WebElement BedrijfsgebouwenCF(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR2C3"));
		   return element;
		}
	public static WebElement MachinesenInstallatiesCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR3C1"));
		   return element;
		}
	public static WebElement MachinesenInstallatiesCF(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR3C3"));
		   return element;
		}
	public static WebElement AndereVasteBedrijfsmiddelenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR4C1"));
		   return element;
		}
	public static WebElement AndereVasteBedrijfsmiddelenCF(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR4C3"));
		   return element;
		}
		
	//Overige waardeverandering van immateriele en materiele vaste activa
	
	public static WebElement OverigeWaardeveranderingCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvWaIvaMvaR0C1"));
		   return element;
		}
	public static WebElement OverigeWaardeveranderingCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvWaIvaMvaR0C3"));
		   return element;
		}
	
	//Bijzondere waardevermindering van vlottende activa
	
	public static WebElement BijzondereWaardeVerminderingVlottendeActivaCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBijWaVaR0C1"));
		   return element;
		}
	public static WebElement BijzondereWaardeVerminderingVlottendeActivaCF(WebDriver driver){
		   element = driver.findElement(By.id("idBijWaVaR0C3"));
		   return element;
		}
		
	//Overige bedrijfskosten
	
	public static WebElement TransportKostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR0C1"));
		   return element;
		}
	public static WebElement TransportKostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR0C3"));
		   return element;
		}
	public static WebElement HuisvestingkostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR1C1"));
		   return element;
		}
	public static WebElement HuisvestingkostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR1C3"));
		   return element;
		}
	public static WebElement OnderhoudOverigCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR2C1"));
		   return element;
		}
	public static WebElement OnderhoudOverigCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR2C3"));
		   return element;
		}
	public static WebElement VerkoopKostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR3C1"));
		   return element;
		}
	public static WebElement VerkoopKostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR3C3"));
		   return element;
		}
	public static WebElement AndereKostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR4C1"));
		   return element;
		}
	public static WebElement AndereKostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR4C3"));
		   return element;
		}
		
	
	//Financiele baten en lasten
	
	public static WebElement OpbrengstVordMaatschCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR0C1"));
		   return element;
		}
	public static WebElement OpbrengstVordMaatschCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR0C3"));
		   return element;
		}

	public static WebElement KwijtscheldingswinstCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR1C1"));
		   return element;
		}
	public static WebElement KwijtscheldingswinstCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR1C3"));
		   return element;
		}
	public static WebElement OpbrengstVordParticipantCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR2C1"));
		   return element;
		}
	public static WebElement OpbrengstVordParticipantCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR2C3"));
		   return element;
		}
	public static WebElement OpbrengstOverigeVordCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR3C1"));
		   return element;
		}
	public static WebElement OpbrengstOverigeVordCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR3C3"));
		   return element;
		}
	public static WebElement OpbrengstBanktegoedCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR4C1"));
		   return element;
		}
	public static WebElement OpbrengstBanktegoedCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR4C3"));
		   return element;
		}
	public static WebElement WaardeVeranderingVorderingenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR5C1"));
		   return element;
		}
	public static WebElement WaardeVeranderingVorderingenCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR5C3"));
		   return element;
		}
	public static WebElement WaardeVeranderingEffectenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR6C1"));
		   return element;
		}
	public static WebElement WaardeVeranderingEffectenCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR6C3"));
		   return element;
		}
	public static WebElement OntvangenDividendCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR7C1"));
		   return element;
		}
	public static WebElement OntvangenDividendCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR7C3"));
		   return element;
		}
	
	//Financiele lasten
	
	public static WebElement KostenParticipantCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR0C1"));
		   return element;
		}
	public static WebElement KostenParticipantCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR0C3"));
		   return element;
		}

	public static WebElement KostenSchuldenRentelastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR1C1"));
		   return element;
		}
	public static WebElement KostenSchuldenRentelastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR1C3"));
		   return element;
		}
	
	public static WebElement KostenSchuldenGroepsmaatschappijenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR2C1"));
		   return element;
		}
	public static WebElement KostenSchuldenGroepsmaatschappijenCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR2C3"));
		   return element;
		}
	
	//Buitengewone bedrijfsbaten
	public static WebElement VoordelenOntvoegingDochterMaatschCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR0C1"));
		   return element;
		}
	public static WebElement VoordelenOntvoegingDochterMaatschCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR0C3"));
		   return element;
		}
	
	public static WebElement OverigeBuitenGewoneBatenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR1C1"));
		   return element;
		}
	public static WebElement OverigeBuitenGewoneBatenCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR1C3"));
		   return element;
		}
	public static WebElement BoekWinstActivaCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR2C1"));
		   return element;
		}
	public static WebElement BoekWinstActivaCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR2C3"));
		   return element;
		}
	
	public static WebElement ResultaatDeelnemingenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idDeelR0C1"));
		   return element;
		}
	public static WebElement ResultaatDeelnemingenCF(WebDriver driver){
		   element = driver.findElement(By.id("idDeelR0C3"));
		   return element;
		}
	
	
	
	
	//Buitengewone bedrijfslasten
	
	public static WebElement AfboekingHerinvesteringsReserveCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR0C1"));
		   return element;
		}
	public static WebElement AfboekingHerinvesteringsReserveCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR0C3"));
		   return element;
		}
	public static WebElement UitkeringenANBICommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR1C1"));
		   return element;
		}
	public static WebElement UitkeringenANBICF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR1C3"));
		   return element;
		}
	public static WebElement OverigeBuitenGewoneLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR2C1"));
		   return element;
		}
	public static WebElement OverigeBuitenGewoneLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR2C3"));
		   return element;
		}
	
}
