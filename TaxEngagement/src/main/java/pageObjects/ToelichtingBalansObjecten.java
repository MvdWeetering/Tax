package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingBalansObjecten {
	private static WebElement element = null;
	
	//Gebouwen zonder bodemwaarde
	@FieldName(name = "Gebouwenzonderbodemwaarde_Aanschafkosten")
	public static WebElement Gebouwenzonderbodemwaarde_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpb"));
		return element;
	}
	
	@FieldName(name = "Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112")
	public static WebElement Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpd"));
		return element;
	}
	
	@FieldName(name = "Gebouwenzonderbodemwaarde_RestWaarde3112")
	public static WebElement Gebouwenzonderbodemwaarde_RestWaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpe"));
		return element;
	}
	
	//Gebouwen in eigen gebruik
	
	@FieldName(name = "GebouwenInEigenGebruikAanschafkosten")
	public static WebElement GebouwenInEigenGebruikAanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpi"));
		return element;
	}
	
	@FieldName(name = "GebouwenInEigenGebruik_FiscaleBoekwaarde3112")
	public static WebElement GebouwenInEigenGebruik_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpm"));
		return element;
	}
	
	@FieldName(name = "GebouwenInEigenGebruik_Restwaarde3112")
	public static WebElement GebouwenInEigenGebruik_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpq"));
		return element;
	}
	
	@FieldName(name = "GebouwenInEigenGebruik_Bodemwaarde3112")
	public static WebElement GebouwenInEigenGebruik_Bodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzps"));
		return element;
	}
	
	//Gebouwen ter belegging gehouden
	
	@FieldName(name = "GebouwenTerBeleggingGehouden_Aanschafkosten")
	public static WebElement GebouwenTerBeleggingGehouden_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpv"));
		return element;
	}
	@FieldName(name = "GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112")
	public static WebElement GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpy"));
		return element;
	}
	
	@FieldName(name = "GebouwenTerBeleggingGehouden_Restwaarde3112")
	public static WebElement GebouwenTerBeleggingGehouden_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq0"));
		return element;
	}
	
	@FieldName(name = "GebouwenTerBeleggingGehouden_Bodemwaarde3112")
	public static WebElement GebouwenTerBeleggingGehouden_Bodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq1"));
		return element;
	}
	
	//Gebouwen zonder afschrijving
	
	@FieldName(name = "GebouwenZonderafschrijving_Aanschafkosten")
	public static WebElement GebouwenZonderafschrijving_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq3"));
		return element;
	}
	
	@FieldName(name = "GebouwenZonderafschrijving_FiscaleBoekwaarde3112")
	public static WebElement GebouwenZonderafschrijving_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq5"));
		return element;
	}
	
	//Bedrijfsterreinen
	
	@FieldName(name = "Bedrijfsterreinen_Aanschafkosten")
	public static WebElement Bedrijfsterreinen_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqa"));
		return element;
	}
	
	@FieldName(name = "Bedrijfsterreinen_FiscaleBoekwaarde3112")
	public static WebElement Bedrijfsterreinen_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq9"));
		return element;
	}	

	@FieldName(name = "Bedrijfsterreinen_Restwaarde3112")
	public static WebElement Bedrijfsterreinen_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqc"));
		return element;
	}

	//Machines
	
	@FieldName(name = "Machines_Aanschafwaarde")
	public static WebElement Machines_Aanschafwaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqe"));
		return element;
	}
	
	@FieldName(name = "Machines_Restwaarde3112")
	public static WebElement Machines_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqg"));
		return element;
	}
	
	//Andere vaste bedrijfsmiddelen
	
	@FieldName(name = "AndereVasteBedrijfsmiddelen_Aanschafwaarde")
	public static WebElement AndereVasteBedrijfsmiddelen_Aanschafwaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqh"));
		return element;
	}
	
	@FieldName(name = "AndereVasteBedrijfsmiddelen_Restwaarde3112")
	public static WebElement AndereVasteBedrijfsmiddelen_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqi"));
		return element;
	}
	
	//Toelichting ondernemingsvermogen
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel")
	public static WebElement ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOndVerm:0-0"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel")
	public static WebElement ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOndVerm:0-2"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel")
	public static WebElement ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOndVerm:0-4"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_Afschrijvingspercentage")
	public static WebElement ToelichtingOndernemingsvermogen_Afschrijvingspercentage(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOndVerm:0-6"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding")
	public static WebElement ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idtableToeOndVerm:0-8"));
		return element;
	}
		
	//Toeliching ondernemingsvermogen
	
	@FieldName(name = "ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening")
	public static WebElement ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecGar:0-0"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_DotatieGarantievoorziening")
	public static WebElement ToelichtingVoorziening_DotatieGarantievoorziening(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecGar:0-2"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen")
	public static WebElement ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecGar:0-4"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar")
	public static WebElement ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecGar:0-6"));
		return element;
	}
		
	@FieldName(name = "ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen")
	public static WebElement ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecOvVoo:0-0"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_DotatieOverigeVoorzieningen")
	public static WebElement ToelichtingVoorziening_DotatieOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecOvVoo:0-2"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen")
	public static WebElement ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecOvVoo:0-4"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar")
	public static WebElement ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idtableToeVooSpecOvVoo:0-6"));
		return element;
	}	
	
	//Toelichting omzetbelasting
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmzSchVorCurYear"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalEindeBoekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrc"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmzSchVorPrevYear"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalEindeBoekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrg"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalbeginboekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmzSchVorPreviousYears"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalEindeBoekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrk"));
		return element;
	}	
	
	
}
