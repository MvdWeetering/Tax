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
		   element = driver.findElement(By.id("idPerR5C1"));
		   return element;
		}
	public static WebElement OntvangenUitkeringenenLoonsubsidiesCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR5C3"));
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
	
	//Totalen *******
	
	// Bedrijfsopbrengsten fiscaal 31-12
	
	@FieldName(name = "NettoOmzetFiscaal")
	public static WebElement NettoOmzetFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzis"));
		   return element;
		}
	
	public static WebElement WijzigingVoorraadOnderhWerkFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzit"));
		   return element;
		}
	
	@FieldName(name = "GeactiveerdeProdFiscaal")
	public static WebElement GeactiveerdeProdFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tziu"));
		   return element;
		}
	
	@FieldName(name = "OverigeOpbrFiscaal")
	public static WebElement OverigeOpbrFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tziw"));
		   return element;
		}
	

	// Totaal bedrijfsopbrengsten
	
	public static WebElement TotaalBedrOpbrCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBeOToR0C2"));
		   return element;
		}
	public static WebElement TotaalBedrOpbrCF(WebDriver driver){
		   element = driver.findElement(By.id("idBeOToR0C4"));
		   return element;
		}
	public static WebElement TotaalBedrOpbrFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzix"));
		   return element;
		}

	
	// bedrijfslasten
	
	//Kosten grond- en hulpstoffen, uitbesteed werk en dergelijke
	
	public static WebElement KostenGrondHulpStFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzj2"));
		   return element;
		}
	public static WebElement KostenUitbesteedWerkFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzj3"));
		   return element;
		}
	
	
	//Totaal kosten grond- en hulpstoffen, uitbesteed werk en dergelijke
	
	public static WebElement TotaalKostenGrondHulpstCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR2C1"));
		   return element;
		}
	
	public static WebElement TotaalKostenGrondHulpstCF(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR2C3"));
		   return element;
		}
	
	public static WebElement TotaalKostenGrondHulpstFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idGrHulpUitR2C5"));
		   return element;
		}
	
	//Personeelskosten
	
	public static WebElement LonenSalarissenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzj6"));
		   return element;
		}
	
	public static WebElement SocialeLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzj7"));
		   return element;
		}
	
	
	public static WebElement PensioenLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzj9"));
		   return element;
		}
	
	
	public static WebElement OverigePersoneelsKostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzja"));
		   return element;
		}
	
	public static WebElement OntvUitkeringLoonSubsFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjb"));
		   return element;
		}
		
	public static WebElement TotaalPersKostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idPerR6C1"));
		   return element;
		}
	
	public static WebElement TotaalPersKostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idPerR6C3"));
		   return element;
		}
	public static WebElement TotaalPersKostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idPerR6C5"));
		   return element;
		}
	
	
	//Afschrijvingen
	
	public static WebElement GoodWillFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzje"));
		   return element;
		}
	
	public static WebElement OverigeImmaterielActFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjg"));
		   return element;
		}
	
	public static WebElement BedrijfsgebouwenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjh"));
		   return element;
		}
	
	public static WebElement MachinesInstallatiesFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzji"));
		   return element;
		}
	
	public static WebElement AndereVasteActFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjk"));
		   return element;
		}
	
	public static WebElement TotaalAfschrijvCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR5C1"));
		   return element;
		}
	
	public static WebElement TotaalAfschrijvCF(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR5C3"));
		   return element;
		}
	
	public static WebElement TotaalAfschrijvFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idAfsR5C5"));
		   return element;
		}
	
	//Overige waardeveranderingen van immateri�le en materi�le vaste activa�
	
	
	public static WebElement OverigeWaardeVeranderingFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjl"));
		   return element;
		}
	
	//Bijzondere waardevermindering van vlottende activa�
	
	public static WebElement BijzondereWaardeVerminderingFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjm"));
		   return element;
		}
	
	//Overige bedrijfskosten
	
	public static WebElement AutoTransportKostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjq"));
		   return element;
		}
	
	public static WebElement HuisvestingsKostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjr"));
		   return element;
		}
	
	public static WebElement onderhoudOverigeMatrActFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjt"));
		   return element;
		}
	
	public static WebElement VerkoopkostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzju"));
		   return element;
		}
	
	public static WebElement AndereKostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzjv"));
		   return element;
		}
	
	public static WebElement TotaaloverigeBedrKostenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR5C1"));
		   return element;
		}
	
	public static WebElement TotaaloverigeBedrKostenCF(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR5C3"));
		   return element;
		}
	
	public static WebElement TotaaloverigeBedrKostenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idOvBeKR5C5"));
		   return element;
		}
	
	//Financiele baten en lasten ***
	
	//Financiele baten
	
	@FieldName(name = "OpbrengstVordGroepMaatschFiscaal")
	public static WebElement OpbrengstVordGroepMaatschFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzk5"));
		   return element;
		}
	
	@FieldName(name = "KwijtscheldingsWinstFiscaal")
	public static WebElement KwijtscheldingsWinstFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzk8"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstVordParticipantFiscaal")
	public static WebElement OpbrengstVordParticipantFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzka"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstOverigeVordFiscaal")
	public static WebElement OpbrengstOverigeVordFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkc"));
		   return element;
		}
	
	@FieldName(name = "OpbrengstBanktegoedFiscaal")
	public static WebElement OpbrengstBanktegoedFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkf"));
		   return element;
		}
	
	public static WebElement WaardeVeranderingVordFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkh"));
		   return element;
		}
	
	public static WebElement WaardeVeranderingEffectenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzki"));
		   return element;
		}
	
	@FieldName(name = "OntvangenDividentFiscaal")
	public static WebElement OntvangenDividentFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkk"));
		   return element;
		}
	
	public static WebElement TotaleFinancieleBatenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR8C1"));
		   return element;
		}
	
	public static WebElement TotaleFinancieleBatenCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR8C3"));
		   return element;
		}
	
	public static WebElement TotaleFinancieleBatenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idFinBatR8C5"));
		   return element;
		}
	
	
	//Financiele lasten
	
	
	public static WebElement KostenSchuldenParticipantFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzko"));
		   return element;
		}
	public static WebElement KostenSchuldenRentelastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkp"));
		   return element;
		}
	public static WebElement KostenSchuldenGroepsMaatschFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkq"));
		   return element;
		}
	public static WebElement TotaalFinLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR3C1"));
		   return element;
		}
	public static WebElement TotaalFinLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR3C3"));
		   return element;
		}
	public static WebElement TotaalFinLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idFinLasR3C5"));
		   return element;
		}
	
	
	//Totaal financiele baten en lasten
	
	public static WebElement TotaalfinancieleBatenLastenCommercieel (WebDriver driver){
		   element = driver.findElement(By.id("idTotFinBatLasR0C1"));
		   return element;
		}

	public static WebElement TotaalfinancieleBatenLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idTotFinBatLasR0C3"));
		   return element;
		}
	
	public static WebElement TotaalfinancieleBatenLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzks"));
		   return element;
		}
	
	public static WebElement ResultaatGewoneBedrijfsuitoefCommercieel (WebDriver driver){
		   element = driver.findElement(By.id("idResBedrR0C2"));
		   return element;
		}
	
	public static WebElement ResultaatGewoneBedrijfsuitoefCF(WebDriver driver){
		   element = driver.findElement(By.id("idResBedrR0C4"));
		   return element;
		}
	
	public static WebElement ResultaatGewoneBedrijfsuitoefFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzku"));
		   return element;
		}
	
	public static WebElement ResultaatDeelnemingFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzkv"));
		   return element;
		}
	
	//Buitengewone bedrijfsbaten en lasten ****
	
	//Buitengewone bedrijfsbaten 
	
	@FieldName(name = "VoordelenOntvoegDochterFiscaal")
	public static WebElement VoordelenOntvoegDochterFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl1"));
		   return element;
		}
	
	@FieldName(name = "OverigeBuitenGewBatenFiscaal")
	public static WebElement OverigeBuitenGewBatenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl2"));
		   return element;
		}
	
	public static WebElement BoekwinstActivaFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl4"));
		   return element;
		}
	
	public static WebElement TotaalBuitenGewBedrijfsBatenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR3C1"));
		   return element;
		}
	
	public static WebElement TotaalBuitenGewBedrijfsBatenCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR3C3"));
		   return element;
		}
	
	public static WebElement TotaalBuitenGewBedrijfsBatenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idBuiBatR3C5"));
		   return element;
		}
	
	
	//Buitengewone bedrijfslasten
	@FieldName(name = "AfboekenHerinvesteringReserveFiscaal")
	public static WebElement AfboekenHerinvesteringReserveFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl7"));
		   return element;
		}
	
	@FieldName(name = "UitkeringANBIFiscaal")
	public static WebElement UitkeringANBIFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl8"));
		   return element;
		}
	
	@FieldName(name = "OverigeBuitengewoneLastenFiscaal")
	public static WebElement OverigeBuitengewoneLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzl9"));
		   return element;
		}
	
	public static WebElement TotaalBuitengewBedrLastenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR3C1"));
		   return element;
		}
	
	public static WebElement TotaalBuitengewBedrLastenCF(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR3C3"));
		   return element;
		}
	
	public static WebElement TotaalBuitengewBedrLastenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idBuiLasR3C5"));
		   return element;
		}
	
	//Buitengewone resultaten

	public static WebElement BuitenGewoneResultatenCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idTotBuiResR0C1"));
		   return element;
		}
	
	public static WebElement BuitenGewoneResultatenCF(WebDriver driver){
		   element = driver.findElement(By.id("idTotBuiResR0C3"));
		   return element;
		}
	
	public static WebElement BuitenGewoneResultatenFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzlb"));
		   return element;
		}
	
	//Saldo fiscale winstberekening
	
	public static WebElement SaldoFiscWinstBerCommercieel(WebDriver driver){
		   element = driver.findElement(By.id("idTotFisWinstR0C1"));
		   return element;
		}
	
	public static WebElement SaldoFiscWinstBerCF(WebDriver driver){
		   element = driver.findElement(By.id("idTotFisWinstR0C3"));
		   return element;
		}
	
	public static WebElement SaldoFiscWinstBerFiscaal(WebDriver driver){
		   element = driver.findElement(By.id("idxdt9tzlc"));
		   return element;
		}
		
}
