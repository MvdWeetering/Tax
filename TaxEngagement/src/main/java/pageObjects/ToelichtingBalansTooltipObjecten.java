package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingBalansTooltipObjecten {
	
	private static WebElement element = null;
	
	//Gebouwen zonder bodemwaarde
	@FieldName(name = "Gebouwenzonderbodemwaarde_Aanschafkosten")
	public static WebElement Gebouwenzonderbodemwaarde_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpb-popover"));
		return element;
	}
	
	@FieldName(name = "Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112")
	public static WebElement Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpd-popover"));
		return element;
	}
	
	@FieldName(name = "Gebouwenzonderbodemwaarde_RestWaarde3112")
	public static WebElement Gebouwenzonderbodemwaarde_RestWaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpe-popover"));
		return element;
	}
	
	//Gebouwen in eigen gebruik
	
	@FieldName(name = "GebouwenInEigenGebruikAanschafkosten")
	public static WebElement GebouwenInEigenGebruikAanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpi-popover"));
		return element;
	}
	
	@FieldName(name = "GebouwenInEigenGebruik_FiscaleBoekwaarde3112")
	public static WebElement GebouwenInEigenGebruik_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpm-popover"));
		return element;
	}
	
	@FieldName(name = "GebouwenInEigenGebruik_Restwaarde3112")
	public static WebElement GebouwenInEigenGebruik_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpq-popover"));
		return element;
	}
	
	@FieldName(name = "GebouwenInEigenGebruik_Bodemwaarde3112")
	public static WebElement GebouwenInEigenGebruik_Bodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzps-popover"));
		return element;
	}
	
	//Gebouwen ter belegging gehouden
	
	@FieldName(name = "GebouwenTerBeleggingGehouden_Aanschafkosten")
	public static WebElement GebouwenTerBeleggingGehouden_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpv-popover"));
		return element;
	}
	@FieldName(name = "GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112")
	public static WebElement GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpy-popover"));
		return element;
	}
	
	@FieldName(name = "GebouwenTerBeleggingGehouden_Restwaarde3112")
	public static WebElement GebouwenTerBeleggingGehouden_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq0-popover"));
		return element;
	}
	
	@FieldName(name = "GebouwenTerBeleggingGehouden_Bodemwaarde3112")
	public static WebElement GebouwenTerBeleggingGehouden_Bodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq1-popover"));
		return element;
	}
	
	//Gebouwen zonder afschrijving
	
	@FieldName(name = "GebouwenZonderafschrijving_Aanschafkosten")
	public static WebElement GebouwenZonderafschrijving_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq3-popover"));
		return element;
	}
	
	@FieldName(name = "GebouwenZonderafschrijving_FiscaleBoekwaarde3112")
	public static WebElement GebouwenZonderafschrijving_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq5-popover"));
		return element;
	}
	
	//Bedrijfsterreinen
	
	@FieldName(name = "Bedrijfsterreinen_Aanschafkosten")
	public static WebElement Bedrijfsterreinen_Aanschafkosten(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqa-popover"));
		return element;
	}
	
	@FieldName(name = "Bedrijfsterreinen_FiscaleBoekwaarde3112")
	public static WebElement Bedrijfsterreinen_FiscaleBoekwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq9-popover"));
		return element;
	}	

	@FieldName(name = "Bedrijfsterreinen_Restwaarde3112")
	public static WebElement Bedrijfsterreinen_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqc-popover"));
		return element;
	}

	//Machines
	
	@FieldName(name = "Machines_Aanschafwaarde")
	public static WebElement Machines_Aanschafwaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqe-popover"));
		return element;
	}
	
	@FieldName(name = "Machines_Restwaarde3112")
	public static WebElement Machines_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqg-popover"));
		return element;
	}
	
	//Andere vaste bedrijfsmiddelen
	
	@FieldName(name = "AndereVasteBedrijfsmiddelen_Aanschafwaarde")
	public static WebElement AndereVasteBedrijfsmiddelen_Aanschafwaarde(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqh-popover"));
		return element;
	}
	
	@FieldName(name = "AndereVasteBedrijfsmiddelen_Restwaarde3112")
	public static WebElement AndereVasteBedrijfsmiddelen_Restwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqi-popover"));
		return element;
	}
	
	//Toelichting ondernemingsvermogen
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel")
	public static WebElement ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-0-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel")
	public static WebElement ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-2-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel")
	public static WebElement ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-4-popover"));
		return element;
	}
	
	/* Geen tooltip aanwezig
	@FieldName(name = "ToelichtingOndernemingsvermogen_Afschrijvingspercentage")
	public static WebElement ToelichtingOndernemingsvermogen_Afschrijvingspercentage(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-6"));
		return element;
	}
	*/
	
	@FieldName(name = "ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding")
	public static WebElement ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding(WebDriver driver){
		element = driver.findElement(By.id("idtable_TOV:0-8-popover"));
		return element;
	}
		
	//Toeliching voorziening
	
	@FieldName(name = "ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening")
	public static WebElement ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-0-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_DotatieGarantievoorziening")
	public static WebElement ToelichtingVoorziening_DotatieGarantievoorziening(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-2-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen")
	public static WebElement ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-4-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar")
	public static WebElement ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSG:0-6-popover"));
		return element;
	}
		
	@FieldName(name = "ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen")
	public static WebElement ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-0-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_DotatieOverigeVoorzieningen")
	public static WebElement ToelichtingVoorziening_DotatieOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-2-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen")
	public static WebElement ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-4-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar")
	public static WebElement ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar(WebDriver driver){
		element = driver.findElement(By.id("idtable_TVSOV:0-6-popover"));
		return element;
	}	
	
	//Toelichting omzetbelasting
	
	/*
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idSchuld_Dit"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrc"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar(WebDriver driver){
		element = driver.findElement(By.id("idSchuld_Vorig"));
		return element;
	}
	*/
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalEindeBoekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrc-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalEindeBoekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrg-popover"));
		return element;
	}
	
	@FieldName(name = "ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalEindeBoekjaar")
	public static WebElement ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenDotatieOverigevoorziening(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrk-popover"));
		return element;
	}	
	
}
