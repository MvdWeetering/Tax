package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingBalansObjecten {
	private static WebElement element = null;
	
	//Gebouwen zonder bodemwaarde 
	public static WebElement Gebouwenzonderbodemwaarde_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpb"));
		return element;
	}
	public static WebElement Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpd"));
		return element;
	}
	public static WebElement Gebouwenzonderbodemwaarde_RestWaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpe"));
		return element;
	}
	
	//Gebouwen in eigen gebruik
	public static WebElement GebouwenInEigenGebruikAanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpi"));
		return element;
	}
	public static WebElement GebouwenInEigenGebruik_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpm"));
		return element;
	}
	public static WebElement GebouwenInEigenGebruik_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpq"));
		return element;
	}
	public static WebElement GebouwenInEigenGebruik_Bodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzps"));
		return element;
	}
	
	//Gebouwen ter belegging gehouden
	
	public static WebElement GebouwenTerBeleggingGehouden_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpv"));
		return element;
	}
	public static WebElement GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpy"));
		return element;
	}
	public static WebElement GebouwenTerBeleggingGehouden_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq0"));
		return element;
	}
	public static WebElement GebouwenTerBeleggingGehouden_Bodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq1"));
		return element;
	}
	
	//Gebouwen zonder afschrijving
	
	public static WebElement GebouwenZonderafschrijving_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq3"));
		return element;
	}
	public static WebElement GebouwenZonderafschrijving_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq5"));
		return element;
	}
	
	//Bedrijfsterreinen
	
	public static WebElement Bedrijfsterreinen_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqa"));
		return element;
	}
	public static WebElement Bedrijfsterreinen_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq9"));
		return element;
	}	
	public static WebElement Bedrijfsterreinen_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqc"));
		return element;
	}

	//Machines
	public static WebElement Machines_Aanschafwaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqe"));
		return element;
	}
	
	public static WebElement Machines_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqg"));
		return element;
	}
	
	//Andere vaste bedrijfsmiddelen
	
	public static WebElement AndereVasteBedrijfsmiddelen_Aanschafwaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqh"));
		return element;
	}
	
	public static WebElement AndereVasteBedrijfsmiddelen_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqi"));
		return element;
	}
	
	//Toelichting ondernemingsvermogen
	public static WebElement ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-0"));
		return element;
	}
	public static WebElement ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-2"));
		return element;
	}
	public static WebElement ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-4"));
		return element;
	}
	public static WebElement ToelichtingOndernemingsvermogen_Afschrijvingspercentage(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-6"));
		return element;
	}
	public static WebElement ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-8"));
		return element;
	}
		
	//Toeliching ondernemingsvermogen
	public static WebElement ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-0"));
		return element;
	}
	public static WebElement ToelichtingVoorziening_DotatieGarantievoorziening(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-2"));
		return element;
	}
	public static WebElement ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-4"));
		return element;
	}
	public static WebElement ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-6"));
		return element;
	}
		
	public static WebElement ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-0"));
		return element;
	}
	public static WebElement ToelichtingVoorziening_DotatieOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-2"));
		return element;
	}
	public static WebElement ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-4"));
		return element;
	}
	public static WebElement ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-6"));
		return element;
	}	
	
	//Toelichting omzetbelasting
	
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idSchuld_Dit"));
		return element;
	}
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrc"));
		return element;
	}
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idSchuld_Vorig"));
		return element;
	}
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrg"));
		return element;
	}
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idSchuld_Oudere"));
		return element;
	}
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrk"));
		return element;
	}	
	
	
}
