
package steps;

import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import codebase.Inloggen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AbstractSteps;
import pageObjects.AlgemeneGegevensObjecten;
import pageObjects.AlgemeneVragenObjecten;
import pageObjects.BalansActivaObjecten;
import pageObjects.BalansPassivaObjecten;
import pageObjects.LoginObjecten;
import pageObjects.NavigerenObjecten;
import pageObjects.SpecificatieAandeelhoudersObjecten;
import pageObjects.SpecificatieDeelnemingenObjecten;
import pageObjects.ToelichtingBalansObjecten;
import pageObjects.ValidatieObjecten;
import pageObjects.WinstenVerliesRekeningObjecten;
import codebase.*;

public class Steps extends AbstractSteps {

	WebDriver driver = Inloggen.GetDriver();

	@Given("^I want to login$")
	public void i_want_to_login() throws Throwable {

		String InlogUrl = null;
		InlogUrl = "https://eu.casewarecloud.com/nl-se-develop/webapps/#login";
		driver.get(InlogUrl);
		driver.manage().window().maximize();
	}

	@When("^I type username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_type_username_and_password(String UserName, String Password) throws Throwable {

		LoginObjecten.UserName(driver).sendKeys(UserName);
		LoginObjecten.PassWord(driver).sendKeys(Password);
		LoginObjecten.buttonInloggen(driver).click();
		Thread.sleep(2000);
		//WebElement HuidigeUser = ValidatieObjecten.BeoordelenHuidigeUser(driver);
		//String User = (HuidigeUser.getText());
		//assertTrue(User.equals("MW"));
	}

	@When("^Select the Tax engagement module$")
	public void select_the_Tax_engagement_module() throws Throwable {

		NavigerenObjecten.ClickCloud(driver).click();
		Thread.sleep(2000);
		NavigerenObjecten.NavigerenTax(driver).click();
		Thread.sleep(3000);
		System.out.println("click op tax");
	}

	@When("^open the Project \"([^\"]*)\"$")
	public void open_the_Project(String Project) throws Throwable {

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String oldTab = driver.getWindowHandle();

		NavigerenObjecten.Zoekveld(driver).sendKeys(Project);

		Thread.sleep(1500);

		driver.findElement(By.linkText(Project)).click();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(newTab.get(0));

		Thread.sleep(3500);
	}

	@Then("^I am succesfully logged into the Tax engagement module$")
	public void I_am_succesfully_logged_into_the_Tax_engagement_module() throws Throwable {

		WebElement HuidigeModule = ValidatieObjecten.BeoordelenHuidigeModule(driver);
		String Module = (HuidigeModule.getText());
		assertTrue(Module.equals("NL Tax Engagement"));
		driver.quit();

	}

	@Then("^i can work on the project$")
	public void i_can_work_on_the_project() throws Throwable {
		// nog geen validatie mogelijk, website aan te passen indien van
		// toepassing

		driver.quit();
	}

	@When("^open the form Algemene Vragen$")
	public void open_the_form_Algemene_Vragen() throws Throwable {
		Thread.sleep(1500);
		NavigerenObjecten.NavigerenAlgemeneVragen(driver).click();
		Thread.sleep(1500);
	}

	@Then("^i can fill out the form Algemene Vragen with config (\\d+)$")
	public void i_can_fill_out_the_form_Algemene_Vragen_with_config(int configId) throws Throwable {

		String[] invuldata = codebase.AlgemeneVragenXLS.HaalData(configId);
		
		if (invuldata[1].equals("ja")) {
			AlgemeneVragenObjecten.vraag1_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag1_no(driver).click();
		}

		if (invuldata[2].equals("ja")) {
			AlgemeneVragenObjecten.vraag2_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag2_no(driver).click();
		}
		if (invuldata[3].equals("ja")) {
			AlgemeneVragenObjecten.vraag3_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag3_no(driver).click();
		}
		if (invuldata[4].equals("ja")) {
			AlgemeneVragenObjecten.vraag4_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag4_no(driver).click();
		}
		if (invuldata[5].equals("ja")) {
			AlgemeneVragenObjecten.vraag5_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag5_no(driver).click();
		}
		if (invuldata[6].equals("ja")) {
			AlgemeneVragenObjecten.vraag6_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag6_no(driver).click();
		}
		if (invuldata[7].equals("ja")) {
			AlgemeneVragenObjecten.vraag7_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag7_no(driver).click();
		}
		if (invuldata[8].equals("ja")) {
			AlgemeneVragenObjecten.vraag8_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag8_no(driver).click();
		}

		if (invuldata[9].equals("ja")) {
			AlgemeneVragenObjecten.vraag9_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag9_no(driver).click();
		}

		if (invuldata[10].equals("ja")) {
			AlgemeneVragenObjecten.vraag10_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag10_no(driver).click();
		}

		if (invuldata[11].equals("ja")) {
			AlgemeneVragenObjecten.vraag11_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag11_no(driver).click();
		}

		if (invuldata[12].equals("ja")) {
			AlgemeneVragenObjecten.vraag12_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag12_no(driver).click();
		}

		if (invuldata[13].equals("ja")) {
			AlgemeneVragenObjecten.vraag13_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag13_no(driver).click();
		}

		if (invuldata[14].equals("ja")) {
			AlgemeneVragenObjecten.vraag14_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag14_no(driver).click();
		}

		if (invuldata[15].equals("ja")) {
			AlgemeneVragenObjecten.vraag15_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag15_no(driver).click();
		}
		if (invuldata[16].equals("ja")) {
			AlgemeneVragenObjecten.vraag16_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag16_no(driver).click();
		}
		
		AlgemeneVragenObjecten.Bedragmateriele(driver).clear();
		AlgemeneVragenObjecten.Bedragmateriele(driver).sendKeys(invuldata[17]);
		
		if (invuldata[18].equals("ja")) {
			AlgemeneVragenObjecten.vraag17_yes(driver).click();
		}
		else {
			AlgemeneVragenObjecten.vraag17_no(driver).click();
		}
		
		AlgemeneVragenObjecten.Toelichting(driver).clear();
		AlgemeneVragenObjecten.Toelichting(driver).sendKeys(invuldata[19]);
		
		driver.quit();

	}

	@When("^open the form Algemene Gegevens$")
	public void open_the_form_Algemene_Gegevens() throws Throwable {

		NavigerenObjecten.NavigerenAlgemeneGegevens(driver).click();

	}

	@Then("^i can fill out the form Algemene Gegevens with config (\\d+)$")
	public void i_can_fill_out_the_form_Algemene_Gegevens_with_config(int configId) throws Throwable {
		
		String[] invuldata = codebase.AlgemeneGegevensXLS.HaalData(configId);
		
		
		
		AlgemeneGegevensObjecten.HandelsnaamOnderneming(driver).clear();
		AlgemeneGegevensObjecten.HandelsnaamOnderneming(driver).sendKeys(invuldata[1]);
		AlgemeneGegevensObjecten.RSIN(driver).clear();
		AlgemeneGegevensObjecten.RSIN(driver).sendKeys(invuldata[2]);
		AlgemeneGegevensObjecten.BoekjaarBegin(driver).sendKeys(invuldata[3]);
		AlgemeneGegevensObjecten.BoekjaarEind(driver).sendKeys(invuldata[4]);
		
		if (invuldata[5].equals("ja")) { 
			AlgemeneGegevensObjecten.StandpuntExplicieteUitspraak_Ja(driver).click();
			AlgemeneGegevensObjecten.Toelichtingverzoek(driver).clear();
			AlgemeneGegevensObjecten.Toelichtingverzoek(driver).sendKeys(invuldata[6]);
		} 
		else { AlgemeneGegevensObjecten.StandpuntExplicieteUitspraak_Nee(driver).click(); }
			
		if (invuldata[7].equals("ja")) { AlgemeneGegevensObjecten.AangifteFiscaleEenheid_Ja(driver).click(); }
		else {AlgemeneGegevensObjecten.AangifteFiscaleEenheid_Nee(driver).click();}
		
		if (invuldata[8].equals("ja")) {AlgemeneGegevensObjecten.FunctioneleValuta_Ja(driver).click(); }
		else {AlgemeneGegevensObjecten.FunctioneleValuta_Nee(driver).click();}
		
		
		AlgemeneGegevensObjecten.Beconnummer(driver).clear();
		AlgemeneGegevensObjecten.Beconnummer(driver).sendKeys(invuldata[9]);
		
		AlgemeneGegevensObjecten.Clientgroep(driver).clear();
		AlgemeneGegevensObjecten.Clientgroep(driver).sendKeys(invuldata[10]);
		AlgemeneGegevensObjecten.Aanhef(driver).sendKeys(invuldata[11]);
		AlgemeneGegevensObjecten.VoorlettersContact(driver).clear();
		AlgemeneGegevensObjecten.VoorlettersContact(driver).sendKeys(invuldata[12]);
		AlgemeneGegevensObjecten.TussenvoegselContact(driver).clear();
		AlgemeneGegevensObjecten.TussenvoegselContact(driver).sendKeys(invuldata[13]);
		AlgemeneGegevensObjecten.AchternaamContact(driver).clear();
		AlgemeneGegevensObjecten.AchternaamContact(driver).sendKeys(invuldata[14]);
		AlgemeneGegevensObjecten.TelefoonnummerContact(driver).clear();
		AlgemeneGegevensObjecten.TelefoonnummerContact(driver).sendKeys(invuldata[15]);
		AlgemeneGegevensObjecten.Straatnaam(driver).clear();
		AlgemeneGegevensObjecten.Straatnaam(driver).sendKeys(invuldata[16]);
		AlgemeneGegevensObjecten.Huisnummer(driver).clear();
		AlgemeneGegevensObjecten.Huisnummer(driver).sendKeys(invuldata[17]);
		AlgemeneGegevensObjecten.Postcode(driver).clear();
		AlgemeneGegevensObjecten.Postcode(driver).sendKeys(invuldata[18]);
		AlgemeneGegevensObjecten.HuisnummerToevoeging(driver).clear();
		AlgemeneGegevensObjecten.HuisnummerToevoeging(driver).sendKeys(invuldata[19]);
		AlgemeneGegevensObjecten.Plaats(driver).clear();
		AlgemeneGegevensObjecten.Plaats(driver).sendKeys(invuldata[20]);
		AlgemeneGegevensObjecten.VoorlettersOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.VoorlettersOndertekenaar(driver).sendKeys(invuldata[21]);
		AlgemeneGegevensObjecten.TussenvoegselOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.TussenvoegselOndertekenaar(driver).sendKeys(invuldata[22]);
		AlgemeneGegevensObjecten.AchternaamOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.AchternaamOndertekenaar(driver).sendKeys(invuldata[23]);
		AlgemeneGegevensObjecten.FunctieOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.FunctieOndertekenaar(driver).sendKeys(invuldata[24]);
		AlgemeneGegevensObjecten.TelefoonnummerOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.TelefoonnummerOndertekenaar(driver).sendKeys(invuldata[25]);
	}

	@Then("^i can validate the error messages for the Algemene gegevens form$")
	public void i_can_validate_the_error_messages_for_the_Algemene_gegevens_form() throws Throwable {
	   
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		
		// RSIN
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("RSIN", 1, 9, true, true, driver));
		
		// Beconnummer
		//ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("Beconnummer", 1, 9, true, true, driver));
		
		
		// Voorletters contactpersoon
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("VoorlettersContact", 1, 10, false, false, driver));
		
		// Tussenvoegsel contactpersoon
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TussenvoegselContact", 1, 10, false, false, driver));
		
		// Achternaam contact
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("AchternaamContact", 1, 10, false, false, driver));
		
		// telefoonnummer contact
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TelefoonnummerContact", 1, 14, false, false, driver));
		
		// Voorletters ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("VoorlettersOndertekenaar", 1, 10, false, false, driver));
		
		// Tussenvoegsel ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TussenvoegselOndertekenaar", 1, 10, false, false, driver));
		
		
		// Achternaam ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("AchternaamOndertekenaar", 1, 200, false, false, driver));
		
		// Functie ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("FunctieOndertekenaar", 1, 35, false, false, driver));
		
		// Telefoonnummer ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TelefoonnummerOndertekenaar", 1, 35, false, false, driver));		 
		
					
		System.out.println("Validatie resultaat: " + ValidatieResultaat);
		driver.quit();
		
		assertTrue(ValidatieResultaat.isEmpty());	
		
	}
	
	@Then("^i can validate the error messages for Specificatie Deelnemingen form$")
	public void i_can_validate_the_error_messages_for_Specificatie_Deelnemingen_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		
		
		Thread.sleep(1500);
		
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("NaamDeelneming", 1, 70, false, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("RSINdeelneming", 1, 9, false, true, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("Huisnummer", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("NominaleWaardeAandelenBezit", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("OpgeofferdBedrag", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BalanswaarderingDeelneming", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("VoordelenDeelneming", 1, 99, true, false, driver));
		
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BedragVorderingenDeelneming", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BedragSchuldDeelneming", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("OntvRenteDeelneming", 1, 99, true, false, driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BetRenteDeelneming", 1, 99, true, false, driver));
		
		// **
		
		if (pageObjects.SpecificatieDeelnemingenObjecten.DeelnemingVerworven_Ja(driver).isSelected()) {
			
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("PercentageVerwerving", 1, 99, true, false, driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("NominaleWaardeVerwerving", 1, 99, true, false, driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("OpgeofferdbedragVerwerving", 1, 99, true, false, driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BrutoVoordelenMetDeelneming", 1, 99, true, false, driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("KostenVerwervingDeelneming", 1, 99, true, false, driver));
			
		}
		
		// **
		
		driver.quit();
		
		assertTrue(ValidatieResultaat.isEmpty());	
		
	}
	
	@When("^open the form Specificatie Aandeelhouders$")
	public void open_the_form_Specificatie_Aandeelhouders() throws Throwable {
		Thread.sleep(1000);
		NavigerenObjecten.NavigerenSpecificatieAandeelhouders(driver).click();

	}
	
	
	@Then("^i can fill out the form Specificatie Aandeelhouders with config (\\d+)$")
	public void i_can_fill_out_the_form_Specificatie_Aandeelhouders_with_config(int configId) throws Throwable {

		String[] invuldata = codebase.SpecificatieAandeelHoudersXLS.HaalData(configId);

		SpecificatieAandeelhoudersObjecten.NaamAandeelhouder(driver).clear();
		SpecificatieAandeelhoudersObjecten.NaamAandeelhouder(driver).sendKeys(invuldata[1]);
		SpecificatieAandeelhoudersObjecten.BSN(driver).clear();
		SpecificatieAandeelhoudersObjecten.BSN(driver).sendKeys(invuldata[3]);
		
		if (invuldata[2].equals("ja")) {
			SpecificatieAandeelhoudersObjecten.Natuurlijkpersoon(driver).click();
		} else {
			SpecificatieAandeelhoudersObjecten.Natuurlijkpersoon_nee(driver).click();
			SpecificatieAandeelhoudersObjecten.Straatnaam(driver).clear();
			SpecificatieAandeelhoudersObjecten.Straatnaam(driver).sendKeys(invuldata[4]);
			SpecificatieAandeelhoudersObjecten.Huisnummer(driver).clear();
			SpecificatieAandeelhoudersObjecten.Huisnummer(driver).sendKeys(invuldata[5]);
			SpecificatieAandeelhoudersObjecten.Postcode(driver).clear();
			SpecificatieAandeelhoudersObjecten.Postcode(driver).sendKeys(invuldata[6]);
			SpecificatieAandeelhoudersObjecten.HuisnrToev(driver).clear();
			SpecificatieAandeelhoudersObjecten.HuisnrToev(driver).sendKeys(invuldata[7]);
			SpecificatieAandeelhoudersObjecten.Woonplaats(driver).clear();
			SpecificatieAandeelhoudersObjecten.Woonplaats(driver).sendKeys(invuldata[8]);
			SpecificatieAandeelhoudersObjecten.Land(driver).sendKeys(invuldata[9]);
		}

		SpecificatieAandeelhoudersObjecten.NominalewaardeAandelen(driver).clear();
		SpecificatieAandeelhoudersObjecten.NominalewaardeAandelen(driver).sendKeys(invuldata[10]);
		SpecificatieAandeelhoudersObjecten.NominalewaardePreferente(driver).clear();
		SpecificatieAandeelhoudersObjecten.NominalewaardePreferente(driver).sendKeys(invuldata[11]);
		SpecificatieAandeelhoudersObjecten.NominalewaardePrioriteits(driver).clear();
		SpecificatieAandeelhoudersObjecten.NominalewaardePrioriteits(driver).sendKeys(invuldata[12]);
		SpecificatieAandeelhoudersObjecten.PercentageNominaal(driver).clear();
		SpecificatieAandeelhoudersObjecten.PercentageNominaal(driver).sendKeys(invuldata[13]);
		SpecificatieAandeelhoudersObjecten.VorderingBelastingplichtige(driver).clear();
		SpecificatieAandeelhoudersObjecten.VorderingBelastingplichtige(driver).sendKeys(invuldata[14]);
		SpecificatieAandeelhoudersObjecten.SchuldBelastingplichtige(driver).clear();
		SpecificatieAandeelhoudersObjecten.SchuldBelastingplichtige(driver).sendKeys(invuldata[15]);
		SpecificatieAandeelhoudersObjecten.BoekjaarOntvangenRente(driver).clear();
		SpecificatieAandeelhoudersObjecten.BoekjaarOntvangenRente(driver).sendKeys(invuldata[16]);
		SpecificatieAandeelhoudersObjecten.BoekjaarBetaaldeRente(driver).clear();
		SpecificatieAandeelhoudersObjecten.BoekjaarBetaaldeRente(driver).sendKeys(invuldata[17]);

		
		// informele kapitaalstorting = nee
		
		if (invuldata[18].equals("nee")) {
		
		SpecificatieAandeelhoudersObjecten.informeleKapitaalstortingNee(driver).click();
		
		}
		
		// informele kapitaalstorting = ja
		else {
			
		SpecificatieAandeelhoudersObjecten.informeleKapitaalstorting(driver).click();
		SpecificatieAandeelhoudersObjecten.BedragInformeleKapitaalStorting(driver).clear();
		SpecificatieAandeelhoudersObjecten.BedragInformeleKapitaalStorting(driver).sendKeys(invuldata[19]);
		
		SpecificatieAandeelhoudersObjecten.WaaromInformeleKapitaalstorting(driver).clear(); 
		SpecificatieAandeelhoudersObjecten.WaaromInformeleKapitaalstorting(driver).sendKeys(invuldata[20]);
		SpecificatieAandeelhoudersObjecten.NaamMoedermaatschappij(driver).clear();
		SpecificatieAandeelhoudersObjecten.NaamMoedermaatschappij(driver).sendKeys(invuldata[21]);
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijStraatnaam(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijStraatnaam(driver).sendKeys(invuldata[22]);
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummer(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummer(driver).sendKeys(invuldata[23]);
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummerToev(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummerToev(driver).sendKeys(invuldata[24]);
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsplaats(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsplaats(driver).sendKeys(invuldata[25]);
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsland(driver).sendKeys(invuldata[26]);
			
			if (invuldata[27].equals("ja")) {
			SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderJa(driver).click();
			}
			else {
			SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderNee(driver).click();
			
			SpecificatieAandeelhoudersObjecten.NaamRechtspersoon(driver).clear();
			SpecificatieAandeelhoudersObjecten.NaamRechtspersoon(driver).sendKeys(invuldata[28]);
			
			SpecificatieAandeelhoudersObjecten.StraatnaamRechtspersoon(driver).clear();
			SpecificatieAandeelhoudersObjecten.StraatnaamRechtspersoon(driver).sendKeys(invuldata[29]);
			
			SpecificatieAandeelhoudersObjecten.HuisnummerRechtspersoon(driver).clear();
			SpecificatieAandeelhoudersObjecten.HuisnummerRechtspersoon(driver).sendKeys(invuldata[30]);
			
			SpecificatieAandeelhoudersObjecten.ToevHuisnummerRechtspersoon(driver).clear();
			SpecificatieAandeelhoudersObjecten.ToevHuisnummerRechtspersoon(driver).sendKeys(invuldata[31]);
						
			SpecificatieAandeelhoudersObjecten.VestigingsplaatsRechtspersoon(driver).clear(); 
			SpecificatieAandeelhoudersObjecten.VestigingsplaatsRechtspersoon(driver).sendKeys(invuldata[32]);
			
			SpecificatieAandeelhoudersObjecten.VestigingslandRechtspersoon(driver).sendKeys(invuldata[33]);
			
			}
		}
		
	}

	@Then("^i can validate the error messages for the Specificatie Aandeelhouders form$")
	public void i_can_validate_the_error_messages_for_the_Specificatie_Aandeelhouders_form() throws Throwable {
		
		Thread.sleep(1000);
		
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		ValidatieResultaat.clear();
	
		// naam aandeelhouders
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NaamAandeelhouder", 1, 69, false, false, driver));
				
		// BSN
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BSN", 9, 9, false, true, driver));			
		
		if (SpecificatieAandeelhoudersObjecten.Natuurlijkpersoon_nee(driver).isSelected()) {
			// Straatnaam
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Straatnaam",1, 24, false, false, driver));
			
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Huisnummer", 1, 5, false, false, driver));
			
			// postcode validatie nog niet geimplementeerd. na implementatie controleren.
			 
			// Postcode
					
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Postcode", 1, 6, false, false, driver));
			
			// Huisnummer toev validatie nog niet geimplementeerd. na implementatie controleren. 		
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("HuisnrToev",1, 5, false, false, driver));
			// Huisnummer toev
			
			// Woonplaats uitzetten omdat deze de tooltip dubbel weergeeft. juist tekst wordt wel weergegeven.	
			// Woonplaats
			
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Woonplaats", 1, 20, false, false, driver));
		
		}
		// nominale waarde aandelen
		
		/* Check uit ivm bug.
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardeAandelen", 1, 20, false, false, driver));
		*/
		
		// Nominale waarde preferente aandelen einde boekjaar 
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardePreferente",1 , 20, false, false, driver));
				
		// Nominale waarde prioriteitsaandelen einde boekjaar 
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardePrioriteits", 1, 20, false, false, driver));
		
		// Percentage nominaal geplaatst kapitaal 
		
		// Vordering belastingplichtige op aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("VorderingBelastingplichtige", 1, 20, false, false, driver));
		
		// Schuld belastingplichtige aan aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("SchuldBelastingplichtige",1 , 20, false, false, driver));

		// In het boekjaar ontvangen rente van de aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BoekjaarOntvangenRente",1 , 20, false, false, driver));
				
		// boekjaar betaalde rente
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BoekjaarBetaaldeRente",1 , 20, false, false, driver));
		
		
		if (SpecificatieAandeelhoudersObjecten.informeleKapitaalstorting(driver).isSelected()) {
		//informele kapitaalstorting
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BedragInformeleKapitaalStorting", 1 , 99, true, false, driver));
		
		//moeder maatschappij huisnummer
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("MoederMaatschappijHuisnummer",1 , 5, false, false, driver));
		
		
			if (SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderNee(driver).isSelected()) {
				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("HuisnummerRechtspersoon",1 , 5, false, false, driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("ToevHuisnummerRechtspersoon",1 , 4, false, false, driver));
			}
		
		}
				
			
		// als validatieresultaat niet leeg is dan melding genereren.
		//System.out.println("Validatie resultaat: " + ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());
		
	}

	@When("^open the form Specificatie Deelnemingen$")
	public void open_the_form_Specificatie_Deelnemingen() throws Throwable {
		NavigerenObjecten.NavigerenSpecificatie_Deelnemingen(driver).click();

	}

	@Then("^i can fill out the form Specificatie Deelnemingen$")
	public void i_can_fill_out_the_form_Specificatie_Deelnemingen() throws Throwable {
		
		String[] invuldata = codebase.SpecificatieDeelnemingenXLS.HaalData(1);
		
		
		// algemene vragen
		SpecificatieDeelnemingenObjecten.NaamDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.NaamDeelneming(driver).sendKeys(invuldata[1]);
		SpecificatieDeelnemingenObjecten.RSINdeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.RSINdeelneming(driver).sendKeys(invuldata[2]);
		
		/* Uitzetten ivm bug melding 281
		SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).sendKeys(invuldata[3]);
		SpecificatieDeelnemingenObjecten.VestigingsLandDeelneming(driver).sendKeys(invuldata[4]);
		*/
		
		SpecificatieDeelnemingenObjecten.PercentageAandelenbezit(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageAandelenbezit(driver).sendKeys(invuldata[5]);
		SpecificatieDeelnemingenObjecten.Straatnaam(driver).clear();
		SpecificatieDeelnemingenObjecten.Straatnaam(driver).sendKeys(invuldata[6]);
		SpecificatieDeelnemingenObjecten.Huisnummer(driver).clear();
		SpecificatieDeelnemingenObjecten.Huisnummer(driver).sendKeys(invuldata[7]);		
		SpecificatieDeelnemingenObjecten.HuisnummerBuitenlandsAdres(driver).clear();
		SpecificatieDeelnemingenObjecten.HuisnummerBuitenlandsAdres(driver).sendKeys(invuldata[8]);
		
		//Schulden en vorderingen
		
		SpecificatieDeelnemingenObjecten.NominaleWaardeAandelenBezit(driver).clear();
		SpecificatieDeelnemingenObjecten.NominaleWaardeAandelenBezit(driver).sendKeys(invuldata[9]);
		SpecificatieDeelnemingenObjecten.OpgeofferdBedrag(driver).clear();
		SpecificatieDeelnemingenObjecten.OpgeofferdBedrag(driver).sendKeys(invuldata[10]);
		SpecificatieDeelnemingenObjecten.BalanswaarderingDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BalanswaarderingDeelneming(driver).sendKeys(invuldata[11]);
		SpecificatieDeelnemingenObjecten.VoordelenDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.VoordelenDeelneming(driver).sendKeys(invuldata[12]);
		SpecificatieDeelnemingenObjecten.BedragVorderingenDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BedragVorderingenDeelneming(driver).sendKeys(invuldata[13]);
		SpecificatieDeelnemingenObjecten.BedragSchuldDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BedragSchuldDeelneming(driver).sendKeys(invuldata[14]);
		SpecificatieDeelnemingenObjecten.OntvRenteDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.OntvRenteDeelneming(driver).sendKeys(invuldata[15]);
		SpecificatieDeelnemingenObjecten.BetRenteDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BetRenteDeelneming(driver).sendKeys(invuldata[16]);
		
		
		//Vragen inzake deelnemingen
		
		//Is de deelneming in het boekjaar gevoegd in en/ of ontvoegd uit een fiscale eenheid met de belastingplichtige?
		if (invuldata[17].equals("ja")) {
			SpecificatieDeelnemingenObjecten.DeelnemingGevoegd_Ja(driver).click();
			SpecificatieDeelnemingenObjecten.Voegingsdatum(driver).sendKeys(invuldata[18]);
			SpecificatieDeelnemingenObjecten.Ontvoegingsdatum(driver).sendKeys(invuldata[19]);
		}
		else {
			SpecificatieDeelnemingenObjecten.DeelnemingGevoegd_Nee(driver).click();
		}
		
		// Is de deelneming in het boekjaar verworven of is het belang in de deelneming in het boekjaar vergroot?
		
		if (invuldata[20].equals("ja")) {
		SpecificatieDeelnemingenObjecten.DeelnemingVerworven_Ja(driver).click();
		
		SpecificatieDeelnemingenObjecten.PercentageVerwerving(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageVerwerving(driver).sendKeys(invuldata[21]);
		SpecificatieDeelnemingenObjecten.NominaleWaardeVerwerving(driver).clear();
		SpecificatieDeelnemingenObjecten.NominaleWaardeVerwerving(driver).sendKeys(invuldata[22]);
		SpecificatieDeelnemingenObjecten.OpgeofferdbedragVerwerving(driver).clear();
		SpecificatieDeelnemingenObjecten.OpgeofferdbedragVerwerving(driver).sendKeys(invuldata[23]);
		SpecificatieDeelnemingenObjecten.BrutoVoordelenMetDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BrutoVoordelenMetDeelneming(driver).sendKeys(invuldata[24]);
		SpecificatieDeelnemingenObjecten.KostenVerwervingDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.KostenVerwervingDeelneming(driver).sendKeys(invuldata[25]);
		SpecificatieDeelnemingenObjecten.BelangDeelnemingVerworven_Ja(driver).click();
		
		}
		else {
			SpecificatieDeelnemingenObjecten.DeelnemingVerworven_Nee(driver).click();
		}
		
		//Is de deelneming in het boekjaar vervreemd of is het belang in de deelneming in het boekjaar verkleind?

		if (invuldata[27].equals("ja")) {
		SpecificatieDeelnemingenObjecten.DeelnemingVervreemd_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.PercentageVervreemding(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageVervreemding(driver).sendKeys(invuldata[28]);
		SpecificatieDeelnemingenObjecten.NominaleWaardeVervreemding(driver).clear();
		SpecificatieDeelnemingenObjecten.NominaleWaardeVervreemding(driver).sendKeys(invuldata[29]);
		SpecificatieDeelnemingenObjecten.OpbrengstVervreemding(driver).clear();
		SpecificatieDeelnemingenObjecten.OpbrengstVervreemding(driver).sendKeys(invuldata[30]);
		SpecificatieDeelnemingenObjecten.BrutoVoordelenDelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BrutoVoordelenDelneming(driver).sendKeys(invuldata[31]);
		SpecificatieDeelnemingenObjecten.KostenVervreemdingDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.KostenVervreemdingDeelneming(driver).sendKeys(invuldata[32]);
		SpecificatieDeelnemingenObjecten.BelangVervreemdInBoekjaar_Ja(driver).click();
		}
		else {
			SpecificatieDeelnemingenObjecten.DeelnemingVervreemd_Nee(driver).click();			
		}
		
		
		if (invuldata[33].equals("ja")) {
			SpecificatieDeelnemingenObjecten.DeelnemingGeliquideerd_Ja(driver).click();	
			SpecificatieDeelnemingenObjecten.VereffeningsdatumDeelneming(driver).sendKeys(invuldata[34]);
			SpecificatieDeelnemingenObjecten.LiquidatieVerliesDeelneming(driver).clear();
			SpecificatieDeelnemingenObjecten.LiquidatieVerliesDeelneming(driver).sendKeys(invuldata[35]);
		}
		else {
			
			SpecificatieDeelnemingenObjecten.DeelnemingGeliquideerd_Nee(driver).click();
		}
		
		SpecificatieDeelnemingenObjecten.WaarderingsvoorschriftArt13_Ja(driver).click();

		
		if (invuldata[37].equals("ja")) {
			
			SpecificatieDeelnemingenObjecten.DeelnemingNietKwalificerende_Ja(driver).click();
			
			SpecificatieDeelnemingenObjecten.WaardeEconomischVerkeer(driver).clear();
			SpecificatieDeelnemingenObjecten.WaardeEconomischVerkeer(driver).sendKeys(invuldata[38]);
			
			if (invuldata[39].equals("ja")) {
				SpecificatieDeelnemingenObjecten.BelangDeelnemingGedaald25Procent_Ja(driver).click();
				}
				else {
					SpecificatieDeelnemingenObjecten.BelangDeelnemingGedaald25Procent_Nee(driver).click();
				}
			SpecificatieDeelnemingenObjecten.Waarde25ProcentMutatie(driver).clear();
			SpecificatieDeelnemingenObjecten.Waarde25ProcentMutatie(driver).sendKeys(invuldata[38]);
			SpecificatieDeelnemingenObjecten.BedragBruteringVoordeel(driver).clear();
			SpecificatieDeelnemingenObjecten.BedragBruteringVoordeel(driver).sendKeys(invuldata[39]);
		}
		
		// Verkapt divident radio button - onderin het scherm verschijnen 2 verschillende invul tabellen
		if (invuldata[40].equals("ja")) {
			SpecificatieDeelnemingenObjecten.VerkaptDivident_ja(driver).click();	
		}
		else {		
			SpecificatieDeelnemingenObjecten.VerkaptDivident_nee(driver).click();
		}	
				
		if (invuldata[41].equals("ja")) {
		SpecificatieDeelnemingenObjecten.BeleggingsdeelnemingEULidstaat_Ja(driver).click();
			if (invuldata[42].equals("ja")) {
				SpecificatieDeelnemingenObjecten.VerzoektVerrekening_Ja(driver).click();
			}
			else {
				SpecificatieDeelnemingenObjecten.VerzoektVerrekening_Nee(driver).click();
			}
			
			if(invuldata[43].equals("ja")) {
				SpecificatieDeelnemingenObjecten.VerzoektAfwijkendeVerrekening_Ja(driver).click();
			}
			else {
				SpecificatieDeelnemingenObjecten.VerzoektAfwijkendeVerrekening_Nee(driver).click();
			}
		}
		else {
			SpecificatieDeelnemingenObjecten.BeleggingsdeelnemingEULidstaat_Nee(driver).click();
		}
		
		if (invuldata[44].equals("ja")) {
		SpecificatieDeelnemingenObjecten.Meerdan99Deelnemingen_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.ToelichtingMeerdan99Deelnemingen(driver).sendKeys(invuldata[45]);
		}
		else {
			SpecificatieDeelnemingenObjecten.Meerdan99Deelnemingen_Nee(driver).click();
		}
		
		// Implementatie verkapt divident of Gegevens Rechtspersonen
		
		// Verkapt Divident
		if (invuldata[40].equals("ja")) {
		
			SpecificatieDeelnemingenObjecten.VerkaptDividentBedrag(driver).clear();
			SpecificatieDeelnemingenObjecten.VerkaptDividentBedrag(driver).sendKeys(invuldata[52]);
			
			SpecificatieDeelnemingenObjecten.WaaromVerkaptDivident(driver).clear();
			SpecificatieDeelnemingenObjecten.WaaromVerkaptDivident(driver).sendKeys(invuldata[53]);
			
			SpecificatieDeelnemingenObjecten.NaamMoedermaatschappij(driver).clear();
			SpecificatieDeelnemingenObjecten.NaamMoedermaatschappij(driver).sendKeys(invuldata[54]);
			
			SpecificatieDeelnemingenObjecten.StraatnaamMoederMaatschappij(driver).clear();
			SpecificatieDeelnemingenObjecten.StraatnaamMoederMaatschappij(driver).sendKeys(invuldata[55]);
			
			SpecificatieDeelnemingenObjecten.HuisnummerMoederMaatschappij(driver).clear();
			SpecificatieDeelnemingenObjecten.HuisnummerMoederMaatschappij(driver).sendKeys(invuldata[56]);
			
			SpecificatieDeelnemingenObjecten.HuisnummerToevingMoederMaatschappij(driver).clear();
			SpecificatieDeelnemingenObjecten.HuisnummerToevingMoederMaatschappij(driver).sendKeys(invuldata[57]);
			
			SpecificatieDeelnemingenObjecten.VestingsPlaatsMoederMaatschappij(driver).clear();
			SpecificatieDeelnemingenObjecten.VestingsPlaatsMoederMaatschappij(driver).sendKeys(invuldata[58]);
			
			SpecificatieDeelnemingenObjecten.VestigingslandMoederMaatschappij(driver).sendKeys(invuldata[59]);
			
			if (invuldata[60].equals("ja")) {
				SpecificatieDeelnemingenObjecten.DirecteDeelnemingOntgaan_ja(driver).click();
			}
			else {
				SpecificatieDeelnemingenObjecten.DirecteDeelnemingOntgaan_nee(driver).click();
			}
		}
		
		//Gegevens Rechtspersonen
		
		if (invuldata[40].equals("nee")) {
		SpecificatieDeelnemingenObjecten.RechtspersoonVoordeelOntgaan(driver).clear();
		SpecificatieDeelnemingenObjecten.RechtspersoonVoordeelOntgaan(driver).sendKeys(invuldata[46]);
		
		SpecificatieDeelnemingenObjecten.RechtspersoonStraatnaam(driver).clear();
		SpecificatieDeelnemingenObjecten.RechtspersoonStraatnaam(driver).sendKeys(invuldata[47]);
		
		SpecificatieDeelnemingenObjecten.RechtspersoonHuisnummer(driver).clear();
		SpecificatieDeelnemingenObjecten.RechtspersoonHuisnummer(driver).sendKeys(invuldata[48]);
		
		SpecificatieDeelnemingenObjecten.RechtspersoonHuisnummerToevoeging(driver).clear();
		SpecificatieDeelnemingenObjecten.RechtspersoonHuisnummerToevoeging(driver).sendKeys(invuldata[49]);
		
		SpecificatieDeelnemingenObjecten.RechtspersoonVestigingsplaats(driver).clear();
		SpecificatieDeelnemingenObjecten.RechtspersoonVestigingsplaats(driver).sendKeys(invuldata[50]);
		
		SpecificatieDeelnemingenObjecten.RechtspersoonVestigingsLand(driver).clear();
		SpecificatieDeelnemingenObjecten.RechtspersoonVestigingsLand(driver).sendKeys(invuldata[51]);
		}
		
		
	}
	
	@When("^open the form Toelichting Balans$")
	public void open_the_form_Toelichting_Balans() throws Throwable {
		
		NavigerenObjecten.NavigerenToelichting_Balans(driver).click();
	
	}

	@Then("^i can fill out the form Toelichting Balans with configId (\\d+)$")
	public void i_can_fill_out_the_form_Toelichting_Balans_with_configId(int configId) throws Throwable {
	   
	String[] invuldata = codebase.ToelichtingBalansXLS.HaalData(configId);
		
		
		//Gebouwen zonder bodemwaarde
		ToelichtingBalansObjecten.Gebouwenzonderbodemwaarde_Aanschafkosten(driver).clear();
		ToelichtingBalansObjecten.Gebouwenzonderbodemwaarde_Aanschafkosten(driver).sendKeys(invuldata[1]);
		
		ToelichtingBalansObjecten.Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112(driver).clear();
		ToelichtingBalansObjecten.Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112(driver).sendKeys(invuldata[2]);
		
		ToelichtingBalansObjecten.Gebouwenzonderbodemwaarde_RestWaarde3112(driver).clear();
		ToelichtingBalansObjecten.Gebouwenzonderbodemwaarde_RestWaarde3112(driver).sendKeys(invuldata[3]);
		
		//Gebouwen in eigen gebruik
		
		ToelichtingBalansObjecten.GebouwenInEigenGebruikAanschafkosten(driver).clear();
		ToelichtingBalansObjecten.GebouwenInEigenGebruikAanschafkosten(driver).sendKeys(invuldata[4]);
		
		ToelichtingBalansObjecten.GebouwenInEigenGebruik_FiscaleBoekwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenInEigenGebruik_FiscaleBoekwaarde3112(driver).sendKeys(invuldata[5]);
		
		ToelichtingBalansObjecten.GebouwenInEigenGebruik_Restwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenInEigenGebruik_Restwaarde3112(driver).sendKeys(invuldata[6]);
		
		ToelichtingBalansObjecten.GebouwenInEigenGebruik_Bodemwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenInEigenGebruik_Bodemwaarde3112(driver).sendKeys(invuldata[7]);
		
		//Gebouwen ter belegging gehouden
		
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_Aanschafkosten(driver).clear();
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_Aanschafkosten(driver).sendKeys(invuldata[8]);
		
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112(driver).sendKeys(invuldata[9]);
		
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_Restwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_Restwaarde3112(driver).sendKeys(invuldata[10]);
		
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_Bodemwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenTerBeleggingGehouden_Bodemwaarde3112(driver).sendKeys(invuldata[11]);
		
		//Gebouwen zonder afschrijving
		
		ToelichtingBalansObjecten.GebouwenZonderafschrijving_Aanschafkosten(driver).clear();
		ToelichtingBalansObjecten.GebouwenZonderafschrijving_Aanschafkosten(driver).sendKeys(invuldata[12]);
		
		ToelichtingBalansObjecten.GebouwenZonderafschrijving_FiscaleBoekwaarde3112(driver).clear();
		ToelichtingBalansObjecten.GebouwenZonderafschrijving_FiscaleBoekwaarde3112(driver).sendKeys(invuldata[13]);
		
		
		//Bedrijfsterreinen
		
		ToelichtingBalansObjecten.Bedrijfsterreinen_Aanschafkosten(driver).clear();
		ToelichtingBalansObjecten.Bedrijfsterreinen_Aanschafkosten(driver).sendKeys(invuldata[14]);
		
		ToelichtingBalansObjecten.Bedrijfsterreinen_FiscaleBoekwaarde3112(driver).clear();
		ToelichtingBalansObjecten.Bedrijfsterreinen_FiscaleBoekwaarde3112(driver).sendKeys(invuldata[15]);
		
		ToelichtingBalansObjecten.Bedrijfsterreinen_Restwaarde3112(driver).clear();
		ToelichtingBalansObjecten.Bedrijfsterreinen_Restwaarde3112(driver).sendKeys(invuldata[16]);
		
		//Machines
		
		ToelichtingBalansObjecten.Machines_Aanschafwaarde(driver).clear();
		ToelichtingBalansObjecten.Machines_Aanschafwaarde(driver).sendKeys(invuldata[17]);
		
		ToelichtingBalansObjecten.Machines_Restwaarde3112(driver).clear();
		ToelichtingBalansObjecten.Machines_Restwaarde3112(driver).sendKeys(invuldata[18]);
		
		//Andere vaste bedrijfsmiddelen
		
		ToelichtingBalansObjecten.AndereVasteBedrijfsmiddelen_Aanschafwaarde(driver).clear();
		ToelichtingBalansObjecten.AndereVasteBedrijfsmiddelen_Aanschafwaarde(driver).sendKeys(invuldata[19]);
		
		ToelichtingBalansObjecten.AndereVasteBedrijfsmiddelen_Restwaarde3112(driver).clear();
		ToelichtingBalansObjecten.AndereVasteBedrijfsmiddelen_Restwaarde3112(driver).sendKeys(invuldata[20]);
		
		//Toeliching ondernemingsvermogen
		
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel(driver).sendKeys(invuldata[21]);
		
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel(driver).sendKeys(invuldata[22]);
		
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel(driver).sendKeys(invuldata[23]);
		
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_Afschrijvingspercentage(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_Afschrijvingspercentage(driver).sendKeys(invuldata[24]);
		
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding(driver).sendKeys(invuldata[25]);
		
		
		//Toelichting voorziening
				
		ToelichtingBalansObjecten.ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening(driver).sendKeys(invuldata[26]);
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_DotatieGarantievoorziening(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_DotatieGarantievoorziening(driver).sendKeys(invuldata[27]);
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen(driver).sendKeys(invuldata[28]);
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar(driver).sendKeys(invuldata[29]);
		
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen(driver).sendKeys(invuldata[30]);
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_DotatieOverigeVoorzieningen(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_DotatieOverigeVoorzieningen(driver).sendKeys(invuldata[31]);
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen(driver).sendKeys(invuldata[32]);
		
		ToelichtingBalansObjecten.ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar(driver).sendKeys(invuldata[33]);
		
		//Toelichting omzetbelasting
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalbeginboekjaar(driver).sendKeys(invuldata[34]);
				
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalbeginboekjaar(driver).sendKeys(invuldata[35]);
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalbeginboekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalbeginboekjaar(driver).sendKeys(invuldata[36]);
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalEindeBoekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalEindeBoekjaar(driver).sendKeys(invuldata[37]);
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalEindeBoekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalEindeBoekjaar(driver).sendKeys(invuldata[38]);
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalEindeBoekjaar(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalEindeBoekjaar(driver).sendKeys(invuldata[39]);
		
				
	}
	@Then("^i can validate the error messages for the Toelichting Balans form$")
		public void i_can_validate_the_error_messages_for_the_Toelichting_Balans_form() throws Throwable {
	  
			ArrayList<String> ValidatieResultaat = new ArrayList<String>();
			
	 		//Gebouwen zonder bodemwaarde
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Gebouwenzonderbodemwaarde_Aanschafkosten", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Gebouwenzonderbodemwaarde_FiscaleBoekwaarde3112", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Gebouwenzonderbodemwaarde_RestWaarde3112", 1, 99, true, false, driver));
	 		
	 		//Gebouwen in eigen gebruik
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenInEigenGebruikAanschafkosten", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenInEigenGebruik_FiscaleBoekwaarde3112", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenInEigenGebruik_Restwaarde3112", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenInEigenGebruik_Bodemwaarde3112", 1, 99, true, false, driver));
	 		
	 		//Gebouwen ter belegging gehouden
	 		
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenTerBeleggingGehouden_Aanschafkosten", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenTerBeleggingGehouden_FiscaleBoekwaarde3112", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenTerBeleggingGehouden_Restwaarde3112", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenTerBeleggingGehouden_Bodemwaarde3112", 1, 99, true, false, driver));
	 		
	 		//Gebouwen zonder afschrijving
	 		
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenZonderafschrijving_Aanschafkosten", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("GebouwenZonderafschrijving_FiscaleBoekwaarde3112", 1, 99, true, false, driver));
	 				
	 		//Bedrijfsterreinen
	 		
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Bedrijfsterreinen_Aanschafkosten", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Bedrijfsterreinen_FiscaleBoekwaarde3112", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Bedrijfsterreinen_Restwaarde3112", 1, 99, true, false, driver));
	 				
	 		//Machines
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Machines_Aanschafwaarde", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("Machines_Restwaarde3112", 1, 99, true, false, driver));
	 				
	 		//Andere vaste bedrijfsmiddelen
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("AndereVasteBedrijfsmiddelen_Aanschafwaarde", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("AndereVasteBedrijfsmiddelen_Restwaarde3112", 1, 99, true, false, driver));
	 						
	 		//Toeliching ondernemingsvermogen
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel", 1, 70, false, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding", 1, 99, true, false, driver));
	 		
	 		//Toelichting voorziening
	 		
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening", 1, 70, false, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_DotatieGarantievoorziening", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen", 1, 70, false, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_DotatieOverigeVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar", 1, 99, true, false, driver));
	 				
	 		//Toelichting omzetbelasting
	 		
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarFiscaalEindeBoekjaar", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarFiscaalEindeBoekjaar", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenFiscaalEindeBoekjaar", 1, 99, true, false, driver));
	 		
	 		//System.out.println(ValidatieResultaat);
	 		assertTrue(ValidatieResultaat.isEmpty());
	 		
	 		
	 	}
	@When("^open the form Winst en Verlies rekening$")
	public void open_the_form_Winst_en_Verlies_rekening() throws Throwable {
		
		NavigerenObjecten.NavigerenWinstEnVerliesRekening(driver).click();
		
	}

	@Then("^i can fill out the form Winst en Verlies rekening$")
	public void i_can_fill_out_the_form_Winst_en_Verlies_rekening() throws Throwable {
	
		//bedrijfsopbrengsten
		
		WinstenVerliesRekeningObjecten.NettoOmzetCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.NettoOmzetCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",7));
		
		WinstenVerliesRekeningObjecten.NettoOmzetCF(driver).clear();
		WinstenVerliesRekeningObjecten.NettoOmzetCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",7));
		
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",8));
		
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCF(driver).clear();
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",8));
		
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",9));
		
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCF(driver).clear();
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",9));
		
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",10));

		WinstenVerliesRekeningObjecten.OverigeOpbrengstenProductieCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenProductieCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",10));
		
		
		//Kosten grond en hulpstoffen
		
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",20));
		
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",20));
		
		WinstenVerliesRekeningObjecten.KostenUitbesteedCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenUitbesteedCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",21));
		
		WinstenVerliesRekeningObjecten.KostenUitbesteedCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenUitbesteedCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",21));
				
		//Personeelskosten
		
		WinstenVerliesRekeningObjecten.LonenSalarissenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.LonenSalarissenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",27));

		WinstenVerliesRekeningObjecten.LonenSalarissenCF(driver).clear();
		WinstenVerliesRekeningObjecten.LonenSalarissenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",27));
		
		WinstenVerliesRekeningObjecten.SocialeLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.SocialeLastenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",28));
		
		WinstenVerliesRekeningObjecten.SocialeLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.SocialeLastenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",28));
		
		WinstenVerliesRekeningObjecten.PensioenLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.PensioenLastenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",29));
		
		WinstenVerliesRekeningObjecten.PensioenLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.PensioenLastenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",29));
		
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",30));
		
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",30));
		
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",31));
		
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCF(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",31));
				
		//Afschrijvingen
		
		WinstenVerliesRekeningObjecten.GoodWillCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.GoodWillCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",37));
		
		WinstenVerliesRekeningObjecten.GoodWillCF(driver).clear();
		WinstenVerliesRekeningObjecten.GoodWillCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",37));
		
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",38));
		
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",38));
		
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",39));
				
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCF(driver).clear();
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",39));
				
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",40));
		
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCF(driver).clear();
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",40));
		
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",41));
		
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCF(driver).clear();
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",41));		
		
		//Overige waardeverandering van immateriele en materiele vaste activa
		
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",47));
		
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",47));
				
		//Bijzondere waardevermindering van vlottende activa
		
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",52));
		
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",52));
				
		//Overige bedrijfskosten
		
		WinstenVerliesRekeningObjecten.TransportKostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.TransportKostenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",56));
		
		WinstenVerliesRekeningObjecten.TransportKostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.TransportKostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",56));
		
		WinstenVerliesRekeningObjecten.HuisvestingkostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.HuisvestingkostenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",57));
		
		WinstenVerliesRekeningObjecten.HuisvestingkostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.HuisvestingkostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",57));
				
		WinstenVerliesRekeningObjecten.OnderhoudOverigCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OnderhoudOverigCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",58));
		
		WinstenVerliesRekeningObjecten.OnderhoudOverigCF(driver).clear();
		WinstenVerliesRekeningObjecten.OnderhoudOverigCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",58));
				
		WinstenVerliesRekeningObjecten.VerkoopKostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.VerkoopKostenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",59));
		
		WinstenVerliesRekeningObjecten.VerkoopKostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.VerkoopKostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",59));
		
		WinstenVerliesRekeningObjecten.AndereKostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AndereKostenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",60));
		
		WinstenVerliesRekeningObjecten.AndereKostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.AndereKostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",60));
				
		//Financiele baten en lasten
		
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",71));
		
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",71));
		
		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",72));
		
		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCF(driver).clear();
		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",72));
		
		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",73));
		
		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",73));
		
		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",74));
		
		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",74));
		
		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",75));
		
		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",75));
		
		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",76));
				
		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCF(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",76));
				
		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",77));
		
		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCF(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",77));
		
		WinstenVerliesRekeningObjecten.OntvangenDividendCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenDividendCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",78));
		
		WinstenVerliesRekeningObjecten.OntvangenDividendCF(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenDividendCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",78));
		
		//Financiele lasten
		
		WinstenVerliesRekeningObjecten.KostenParticipantCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenParticipantCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",84));
		
		WinstenVerliesRekeningObjecten.KostenParticipantCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenParticipantCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",84));
		
		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",85));
		
		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",85));
		
		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",86));
		
		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",86));
			
		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("E",94));
		
		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCF(driver).clear();
		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCF(driver).sendKeys(WinstVerliesXLS.HaalData("F",94));
		
		
		//Buitengewone bedrijfsbaten
		
		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",100));
		
		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCF(driver).clear();
		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",100));
		
		
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",101));
		
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",101));
				
		WinstenVerliesRekeningObjecten.BoekWinstActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BoekWinstActivaCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",102));
		
		WinstenVerliesRekeningObjecten.BoekWinstActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.BoekWinstActivaCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",102));
		
		//Buitengewone bedrijfslasten
		
		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",107));
		
		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCF(driver).clear();
		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",107));
		
		WinstenVerliesRekeningObjecten.UitkeringenANBICommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.UitkeringenANBICommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",108));
		
		WinstenVerliesRekeningObjecten.UitkeringenANBICF(driver).clear();
		WinstenVerliesRekeningObjecten.UitkeringenANBICF(driver).sendKeys(WinstVerliesXLS.HaalData("C",108));
		
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",109));
		
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",109));
		
	}
	
	@Then("^i can validate the totals for each column$")
	public void i_can_validate_the_totals_for_each_column() throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		
		//Bedrijfsopbrengsten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.NettoOmzetFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",7)), "D7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.WijzigingVoorraadOnderhWerkFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",8)), "D8"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.GeactiveerdeProdFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",9)), "D9"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigeOpbrFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",10)), "D10"));
		
		//Totaal Bedrijfsopbrengsten
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBedrOpbrCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("E",13)), "E13"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBedrOpbrCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("F",13)), "F13"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBedrOpbrFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("G",13)), "G13"));

		//Kosten grond- en hulpstoffen, uitbesteed werk en dergelijke 
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.KostenGrondHulpStFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",20)), "D20"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.KostenUitbesteedWerkFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",21)), "D21"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalKostenGrondHulpstCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",22)), "B22"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalKostenGrondHulpstCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",22)), "C22"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalKostenGrondHulpstFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",22)), "D22"));
		
		//Personeelskosten
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.LonenSalarissenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",27)), "D27"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.SocialeLastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",28)), "D28"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.PensioenLastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",29)), "D29"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigePersoneelsKostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",30)), "D30"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OntvUitkeringLoonSubsFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",31)), "D31"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalPersKostenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",32)), "B32"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalPersKostenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",32)), "C32"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalPersKostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",32)), "D32"));
		
		//Afschrijvingen
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.GoodWillFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",37)), "D37"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigeImmaterielActFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",38)), "D38"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BedrijfsgebouwenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",39)), "D39"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.MachinesInstallatiesFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",40)), "D40"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.AndereVasteActFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",41)), "D41"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalAfschrijvCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",42)), "B42"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalAfschrijvCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",42)), "C42"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalAfschrijvFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",42)), "D42"));
		
		//Overige waardeveranderingen van immateriele en materiele vaste activa
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigeWaardeVeranderingFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",47)), "D47"));
		
		//Bijzondere waardevermindering van vlottende activa
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",52)), "D52"));
		
		//Overige bedrijfskosten
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.AutoTransportKostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",56)), "D56"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.HuisvestingsKostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",57)), "D57"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.onderhoudOverigeMatrActFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",58)), "D58"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.VerkoopkostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",59)), "D59"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.AndereKostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",60)), "D60"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaaloverigeBedrKostenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",61)), "B61"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaaloverigeBedrKostenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",61)), "C61"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaaloverigeBedrKostenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",61)), "D61"));
		
		//Financiele Baten
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OpbrengstVordGroepMaatschFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",71)), "D71"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.KwijtscheldingsWinstFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",72)), "D72"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OpbrengstVordParticipantFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",73)), "D73"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OpbrengstOverigeVordFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",74)), "D74"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OpbrengstBanktegoedFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",75)), "D75"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.WaardeVeranderingVordFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",76)), "D76"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",77)), "D77"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OntvangenDividentFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",78)), "D78"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaleFinancieleBatenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",79)), "B79"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaleFinancieleBatenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",79)), "C79"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaleFinancieleBatenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",79)), "D79"));
		
		//Financiele Lasten
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.KostenSchuldenParticipantFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",84)), "D84"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",85)), "D85"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.KostenSchuldenGroepsMaatschFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",86)), "D86"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalFinLastenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",87)), "B87"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalFinLastenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",87)), "C87"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalFinLastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",87)), "D87"));
		
		//Totaal financiele baten en lasten 
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalfinancieleBatenLastenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("E",90)), "E90"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalfinancieleBatenLastenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("F",90)), "F90"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalfinancieleBatenLastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("G",90)), "G90"));
		
		//Resultaat uit gewone bedrijfsuitoefening 
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.ResultaatGewoneBedrijfsuitoefCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("E",91)), "E91"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.ResultaatGewoneBedrijfsuitoefCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("F",91)), "F91"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.ResultaatGewoneBedrijfsuitoefFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("G",91)), "G91"));
		
		//Resultaat uit deelnemingen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.ResultaatDeelnemingFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("G",94)), "G94"));
		
		
		//Buitengewone bedrijfsbaten en lasten ****
		
		//Buitengewone bedrijfsbaten 
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.VoordelenOntvoegDochterFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",100)), "D100"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigeBuitenGewBatenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",101)), "D101"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BoekwinstActivaFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",102)), "D102"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBuitenGewBedrijfsBatenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",103)), "B103"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBuitenGewBedrijfsBatenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",103)), "C103"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBuitenGewBedrijfsBatenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",103)), "D103"));
		
		//Buitengewone bedrijfslasten 
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.AfboekenHerinvesteringReserveFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",107)), "D107"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.UitkeringANBIFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",108)), "D108"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigeBuitengewoneLastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",109)), "D109"));

		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBuitengewBedrLastenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("B",110)), "B110"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBuitengewBedrLastenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("C",110)), "C110"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBuitengewBedrLastenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("D",110)), "D110"));
		
		//Buitengewone resultaten
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BuitenGewoneResultatenCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("E",113)), "E113"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BuitenGewoneResultatenCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("F",113)), "F113"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BuitenGewoneResultatenFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("G",113)), "G113"));
		
				
		//Saldo fiscale winstberekening 
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.SaldoFiscWinstBerCommercieel(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("E",118)), "E118"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.SaldoFiscWinstBerCF(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("F",118)), "F118"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.SaldoFiscWinstBerFiscaal(driver).getAttribute("value"), Double.parseDouble(WinstVerliesXLS.HaalData("G",118)), "G118"));
		
			
		driver.quit();
		System.out.println(ValidatieResultaat);
	}
	

@When("^open the form Balans Activa$")
public void open_the_form_Balans_Activa() throws Throwable {
   
	NavigerenObjecten.BalansActiva(driver).click();
   
}

@Then("^i can fill out the form Balans Activa$")
public void i_can_fill_out_the_form_Balans_Activa() throws Throwable {
    
	BalansActivaObjecten.NaamOnderneming(driver).clear();
	BalansActivaObjecten.NaamOnderneming(driver).sendKeys(BalansActivaXLS.HaalText(5));
	BalansActivaObjecten.OmschrijvingActiviteit(driver).clear();
	BalansActivaObjecten.OmschrijvingActiviteit(driver).sendKeys(BalansActivaXLS.HaalText(6));
	
	
	String[] DochterMaatsch =codebase.BalansActivaXLS.HaalText(7);
			
	if (DochterMaatsch[0].equals("Ja")) 
		{ BalansActivaObjecten.DochterMaatschappij_Ja(driver).click();	
		}
	else {BalansActivaObjecten.DochterMaatschappij_Nee(driver).click();
		}
		
	String[] BoekjaarAgr =codebase.BalansActivaXLS.HaalText(8);
			
	if (BoekjaarAgr[0].equals("Ja")) 
		{ BalansActivaObjecten.BoekjaarAgrarische_ja(driver).click();	
		}
	else
		{ BalansActivaObjecten.BoekjaarAgrarische_nee(driver).click();
		}
		
	
	//goodwill fiscaal
	
	BalansActivaObjecten.GoodwillAanschaf(driver).clear();
	BalansActivaObjecten.GoodwillAanschaf(driver).sendKeys(BalansActivaXLS.HaalData("B", 16));
	
	BalansActivaObjecten.GoodwillCommercieel_1_1(driver).clear();
	BalansActivaObjecten.GoodwillCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 16));
	
	BalansActivaObjecten.GoodwillFiscaal_1_1(driver).clear();
	BalansActivaObjecten.GoodwillFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 16));
	
	BalansActivaObjecten.GoodwillCommercieel_31_12(driver).clear();
	BalansActivaObjecten.GoodwillCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 16));
	 
	BalansActivaObjecten.GoodwillCF(driver).clear();
	BalansActivaObjecten.GoodwillCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 16));
		
	//Overige immateriele vaste activa
   	BalansActivaObjecten.OverigeImmaterieleAanschaf(driver).clear();
	BalansActivaObjecten.OverigeImmaterieleAanschaf(driver).sendKeys(BalansActivaXLS.HaalData("B", 17));
	
	BalansActivaObjecten.OverigeImmaterieleCommercieel_1_1(driver).clear();
	BalansActivaObjecten.OverigeImmaterieleCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 17));
	
	BalansActivaObjecten.OverigeImmaterieleFiscaal_1_1(driver).clear();
	BalansActivaObjecten.OverigeImmaterieleFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 17));
	
	BalansActivaObjecten.OverigeImmaterieleCommercieel_31_12(driver).clear();
	BalansActivaObjecten.OverigeImmaterieleCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 17));
	
	BalansActivaObjecten.OverigeImmaterieleCF(driver).clear();
	BalansActivaObjecten.OverigeImmaterieleCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 17));
	
	
	 	
	//Gebouwen en terreinen 
	BalansActivaObjecten.GebouwenTerreinenCommercieel_1_1(driver).clear();
	BalansActivaObjecten.GebouwenTerreinenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 26));
	
	BalansActivaObjecten.GebouwenTerreinenFiscaal_1_1(driver).clear();
	BalansActivaObjecten.GebouwenTerreinenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 26));
	
	BalansActivaObjecten.GebouwenTerreinenCommercieel_31_12(driver).clear();
	BalansActivaObjecten.GebouwenTerreinenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 26));
	
	BalansActivaObjecten.GebouwenTerreinenCF(driver).clear();
	BalansActivaObjecten.GebouwenTerreinenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 26));
	
		
	
	//Machines en installaties 
	BalansActivaObjecten.MachinesCommercieel_1_1(driver).clear();
	BalansActivaObjecten.MachinesCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 27));
	
	BalansActivaObjecten.MachinesFiscaal_1_1(driver).clear();
	BalansActivaObjecten.MachinesFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 27));
	
	BalansActivaObjecten.MachinesCommercieel_31_12(driver).clear();
	BalansActivaObjecten.MachinesCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 27));
	
	BalansActivaObjecten.MachinesCF(driver).clear();
	BalansActivaObjecten.MachinesCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 27));
	
	
	
	//Andere vaste bedrijfsmiddelen 
	BalansActivaObjecten.AndereBedrijfsCommercieel_1_1(driver).clear();
	BalansActivaObjecten.AndereBedrijfsCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 28));
	
	BalansActivaObjecten.AndereBedrijfsFiscaal_1_1(driver).clear();
	BalansActivaObjecten.AndereBedrijfsFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 28));
	
	BalansActivaObjecten.AndereBedrijfsCommercieel_31_12(driver).clear();
	BalansActivaObjecten.AndereBedrijfsCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 28));
	
	BalansActivaObjecten.AndereBedrijfsCF(driver).clear();
	BalansActivaObjecten.AndereBedrijfsCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 28));

	
	//Deelnemingen 
	
	BalansActivaObjecten.DeelnemingenCommercieel_1_1(driver).clear();
	BalansActivaObjecten.DeelnemingenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 37));
	
	BalansActivaObjecten.DeelnemingenFiscaal_1_1(driver).clear();
	BalansActivaObjecten.DeelnemingenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 37));
	
	BalansActivaObjecten.DeelnemingenCommercieel_31_12(driver).clear();
	BalansActivaObjecten.DeelnemingenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 37));
	
	BalansActivaObjecten.DeelnemingenCF(driver).clear();
	BalansActivaObjecten.DeelnemingenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 37));
	
		
	//Langlopende vorderingen op groepsmaatschappijen
	
	BalansActivaObjecten.langlopendevordGroepsNominaleWaarde(driver).clear();
	BalansActivaObjecten.langlopendevordGroepsNominaleWaarde(driver).sendKeys(BalansActivaXLS.HaalData("B", 38));
	
	BalansActivaObjecten.langlopendevordGroepsCommercieel_1_1(driver).clear();
	BalansActivaObjecten.langlopendevordGroepsCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 38));
	
	BalansActivaObjecten.langlopendevordGroepsFiscaal_1_1(driver).clear();
	BalansActivaObjecten.langlopendevordGroepsFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 38));
	
	BalansActivaObjecten.langlopendevordGroepsCommercieel_31_12(driver).clear();
	BalansActivaObjecten.langlopendevordGroepsCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 38));
	
	BalansActivaObjecten.langlopendevordGroepsCF(driver).clear();
	BalansActivaObjecten.langlopendevordGroepsCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 38));
	
		
	 
	//Langlopende vorderingen participanten/maatschappijen
	
	BalansActivaObjecten.langlopendevordPartNominaleWaarde(driver).clear();
	BalansActivaObjecten.langlopendevordPartNominaleWaarde(driver).sendKeys(BalansActivaXLS.HaalData("B", 39));
	
	BalansActivaObjecten.langlopendevordPartCommercieel_1_1(driver).clear();
	BalansActivaObjecten.langlopendevordPartCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 39));
	
	BalansActivaObjecten.langlopendevordPartFiscaal_1_1(driver).clear();
	BalansActivaObjecten.langlopendevordPartFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 39));
	
	BalansActivaObjecten.langlopendevordPartCommercieel_31_12(driver).clear();
	BalansActivaObjecten.langlopendevordPartCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 39));
	
	BalansActivaObjecten.langlopendevordPartCF(driver).clear();
	BalansActivaObjecten.langlopendevordPartCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 39));
	
	
		
	//Overige financiele vaste activa 
	
	BalansActivaObjecten.OverigeFinActivaNominaleWaarde(driver).clear();
	BalansActivaObjecten.OverigeFinActivaNominaleWaarde(driver).sendKeys(BalansActivaXLS.HaalData("B", 40));
	
	BalansActivaObjecten.OverigeFinActivaCommercieel_1_1(driver).clear();
	BalansActivaObjecten.OverigeFinActivaCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 40));
	
	BalansActivaObjecten.OverigeFinActivaFiscaal_1_1(driver).clear();
	BalansActivaObjecten.OverigeFinActivaFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 40));
	
	BalansActivaObjecten.OverigeFinActivaCommercieel_31_12(driver).clear();
	BalansActivaObjecten.OverigeFinActivaCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 40));
	
	BalansActivaObjecten.OverigeFinActivaCF(driver).clear();
	BalansActivaObjecten.OverigeFinActivaCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 40));
	
	
	//Voorraden, excl onderhanden werk 
		
	BalansActivaObjecten.VoorradenCommercieel_1_1(driver).clear();
	BalansActivaObjecten.VoorradenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("B", 48));
	
	BalansActivaObjecten.VoorradenFiscaal_1_1(driver).clear();
	BalansActivaObjecten.VoorradenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 48));
		
	BalansActivaObjecten.VoorradenCommercieel_31_12(driver).clear();
	BalansActivaObjecten.VoorradenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("D", 48));
	
	BalansActivaObjecten.VoorradenCF(driver).clear();
	BalansActivaObjecten.VoorradenCF(driver).sendKeys(BalansActivaXLS.HaalData("E", 48));
		
	//Onderhanden werk
	
	BalansActivaObjecten.OnderhandenCommercieel_1_1(driver).clear();
	BalansActivaObjecten.OnderhandenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 49));
	
	BalansActivaObjecten.OnderhandenFiscaal_1_1(driver).clear();
	BalansActivaObjecten.OnderhandenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 49));
	
	BalansActivaObjecten.OnderhandenCommercieel_31_12(driver).clear();
	BalansActivaObjecten.OnderhandenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 49));
	
	BalansActivaObjecten.OnderhandenCF(driver).clear();
	BalansActivaObjecten.OnderhandenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 49));
	
		
	//Handelsdebiteuren 
	
	
	BalansActivaObjecten.HandelsdebiteurenNominale(driver).clear();
	BalansActivaObjecten.HandelsdebiteurenNominale(driver).sendKeys(BalansActivaXLS.HaalData("B", 57));
	
	BalansActivaObjecten.HandelsdebiteurenCommericeel_1_1(driver).clear();
	BalansActivaObjecten.HandelsdebiteurenCommericeel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 57));
	
	BalansActivaObjecten.HandelsdebiteurenFiscaal_1_1(driver).clear();
	BalansActivaObjecten.HandelsdebiteurenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 57));
	
	BalansActivaObjecten.HandelsdebiteurenCommercieel_31_12(driver).clear();
	BalansActivaObjecten.HandelsdebiteurenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 57));
	
	BalansActivaObjecten.HandelsdebiteurenCF(driver).clear();
	BalansActivaObjecten.HandelsdebiteurenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 57));
	
	
	//Omzetbelasting
	
	BalansActivaObjecten.OmzetBelastingCommercieel_1_1(driver).clear();
	BalansActivaObjecten.OmzetBelastingCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 58));
	
	BalansActivaObjecten.OmzetBelastingFiscaal_1_1(driver).clear();
	BalansActivaObjecten.OmzetBelastingFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 58));
	
	BalansActivaObjecten.OmzetBelastingCommercieel_31_12(driver).clear();
	BalansActivaObjecten.OmzetBelastingCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 58));
	
	BalansActivaObjecten.OmzetBelastingCF(driver).clear();
	BalansActivaObjecten.OmzetBelastingCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 58));
	
	
	//Kortlopende vorderingen op groepsmaatschappijen
	
	BalansActivaObjecten.KortVordGroepNominale(driver).clear();
	BalansActivaObjecten.KortVordGroepNominale(driver).sendKeys(BalansActivaXLS.HaalData("B", 59));
	
	BalansActivaObjecten.KortVordGroepCommercieel_1_1(driver).clear();
	BalansActivaObjecten.KortVordGroepCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 59));
	
	BalansActivaObjecten.KortVordGroepFiscaal_1_1(driver).clear();
	BalansActivaObjecten.KortVordGroepFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 59));
	
	BalansActivaObjecten.KortVordGroepCommercieel_31_12(driver).clear();
	BalansActivaObjecten.KortVordGroepCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 59));
	
	BalansActivaObjecten.KortVordGroepCF(driver).clear();
	BalansActivaObjecten.KortVordGroepCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 59));
	
	
	//Kortlopende vorderingen participanten/ maatschappijen
	
	BalansActivaObjecten.KortVordPartNominaal(driver).clear();
	BalansActivaObjecten.KortVordPartNominaal(driver).sendKeys(BalansActivaXLS.HaalData("B", 60));
	
	BalansActivaObjecten.KortVordPartCommercieel_1_1(driver).clear();
	BalansActivaObjecten.KortVordPartCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 60));
	
	BalansActivaObjecten.KortVordPartFiscaal_1_1(driver).clear();
	BalansActivaObjecten.KortVordPartFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 60));
	
	BalansActivaObjecten.KortVordPartCommercieel_31_12(driver).clear();
	BalansActivaObjecten.KortVordPartCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 60));
	
	BalansActivaObjecten.KortVordPartCF(driver).clear();
	BalansActivaObjecten.KortVordPartCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 60));	
	
	
	//Overige vorderingen 
	
	BalansActivaObjecten.OverigeVordCommercieel_1_1(driver).clear();
	BalansActivaObjecten.OverigeVordCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 61));
	
	BalansActivaObjecten.OverigeVordFiscaal_1_1(driver).clear();
	BalansActivaObjecten.OverigeVordFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 61));
	
	BalansActivaObjecten.OverigeVordCommercieel_31_12(driver).clear();
	BalansActivaObjecten.OverigeVordCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 61));
		
	BalansActivaObjecten.OverigeVordCF(driver).clear();
	BalansActivaObjecten.OverigeVordCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 61));
	
	
	//Effecten
	
	BalansActivaObjecten.EffectenCommercieel_1_1(driver).clear();
	BalansActivaObjecten.EffectenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 67));
	
	BalansActivaObjecten.EffectenFiscaal_1_1(driver).clear();
	BalansActivaObjecten.EffectenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 67));
	
	BalansActivaObjecten.EffectenCommercieel_31_12(driver).clear();
	BalansActivaObjecten.EffectenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 67));
	
	BalansActivaObjecten.EffectenCF(driver).clear();
	BalansActivaObjecten.EffectenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 67));
	
		
	//liquide middelen
	
	BalansActivaObjecten.LiquideCommercieel_1_1(driver).clear();
	BalansActivaObjecten.LiquideCommercieel_1_1(driver)	.sendKeys(BalansActivaXLS.HaalData("C", 72));
	
	BalansActivaObjecten.LiquideFiscaal_1_1(driver).clear();
	BalansActivaObjecten.LiquideFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 72));
	
	BalansActivaObjecten.LiquideCommercieel_31_12(driver).clear();
	BalansActivaObjecten.LiquideCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 72));
	
	BalansActivaObjecten.LiquideCF(driver).clear();
	BalansActivaObjecten.LiquideCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 72));
	
	//toelichting balans
	
	BalansActivaObjecten.Toelichtingbalans(driver).clear();
	BalansActivaObjecten.Toelichtingbalans(driver).sendKeys(BalansActivaXLS.HaalText(80));
	
}

@Then("^i can validate the totals for Balans Activa$")
public void i_can_validate_the_totals_for_Balans_Activa() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^open the form Balans Passiva$")
public void open_the_form_Balans_Passiva() throws Throwable {
    NavigerenObjecten.BalansPassiva(driver).click();    
}

@Then("^i can fill out the form Balans Passiva$")
public void i_can_fill_out_the_form_Balans_Passiva() throws Throwable {
    
	
	//Gestort en opgevraagd kapitaal 
	
	BalansPassivaObjecten.GestortOpgevraagdCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.GestortOpgevraagdCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",9));
	
	BalansPassivaObjecten.GestortOpgevraagdFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.GestortOpgevraagdFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",9));
	
	BalansPassivaObjecten.GestortOpgevraagdCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.GestortOpgevraagdCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",9));
	
	BalansPassivaObjecten.GestortOpgevraagdCF(driver).clear();
	BalansPassivaObjecten.GestortOpgevraagdCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",9));
	
	//Informeel kapitaal 
			
	BalansPassivaObjecten.InformeelKapitaalCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.InformeelKapitaalCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",10));
	
	BalansPassivaObjecten.InformeelKapitaalFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.InformeelKapitaalFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",10));
	
	BalansPassivaObjecten.InformeelKapitaalCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.InformeelKapitaalCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",10));	
	
	BalansPassivaObjecten.InformeelKapitaalCF(driver).clear();
	BalansPassivaObjecten.InformeelKapitaalCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",10));
		
	
	//Agio
	
	BalansPassivaObjecten.AgioCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.AgioCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",11));
	
	BalansPassivaObjecten.AgioFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.AgioFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",11));
	
	BalansPassivaObjecten.AgioCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.AgioCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",11));
	
	BalansPassivaObjecten.AgioCF(driver).clear();
	BalansPassivaObjecten.AgioCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",11));
		
	//Winstreserve

	BalansPassivaObjecten.WinstReserveCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.WinstReserveCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",12));
	
	BalansPassivaObjecten.WinstReserveFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.WinstReserveFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",12));
	
	BalansPassivaObjecten.WinstReserveCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.WinstReserveCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",12));
	
	BalansPassivaObjecten.WinstReserveCF(driver).clear();
	BalansPassivaObjecten.WinstReserveCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",12));
	
	//Kostenegalisatiereserve
	
	BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",13));
	
	BalansPassivaObjecten.KostenegalisatiereserveFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.KostenegalisatiereserveFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",13));
	
	BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",13));
	
	BalansPassivaObjecten.KostenegalisatiereserveCF(driver).clear();
	BalansPassivaObjecten.KostenegalisatiereserveCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",13));
	
	//Herinvesteringsreserve
	
	BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",14));
	
	BalansPassivaObjecten.HerinvesteringsreserveFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.HerinvesteringsreserveFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",14));
	
	BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",14));
	
	BalansPassivaObjecten.HerinvesteringsreserveCF(driver).clear();
	BalansPassivaObjecten.HerinvesteringsreserveCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",14));
	
	//Belaste compartimenteringsreserve 
	
	BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",15));
	
	BalansPassivaObjecten.CompartimenteringsreserveFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.CompartimenteringsreserveFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",15));
	
	BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",15));
	
	BalansPassivaObjecten.CompartimenteringsreserveCF(driver).clear();
	BalansPassivaObjecten.CompartimenteringsreserveCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",15));
		
	//Overige fiscale reserves 
	
	BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",16));
	
	BalansPassivaObjecten.OverigeFiscaleReservesFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.OverigeFiscaleReservesFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",16));
	
	BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",16));
	
	BalansPassivaObjecten.OverigeFiscaleReservesCF(driver).clear();
	BalansPassivaObjecten.OverigeFiscaleReservesCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",16));
	
	
	//Garantievoorziening
	
	BalansPassivaObjecten.GarantieVoorzieningCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.GarantieVoorzieningCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",25));
	
	BalansPassivaObjecten.GarantieVoorzieningFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.GarantieVoorzieningFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",25));
	
	BalansPassivaObjecten.GarantieVoorzieningCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.GarantieVoorzieningCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",25));
	
	BalansPassivaObjecten.GarantieVoorzieningCF(driver).clear();
	BalansPassivaObjecten.GarantieVoorzieningCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",25));
		
	//Voorziening voor lijfrenten, pensioen en stamrecht 
	
	BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",26));
	
	BalansPassivaObjecten.VoorzieningLijfrenteFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.VoorzieningLijfrenteFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",26));
	
	BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",26));
	
	BalansPassivaObjecten.VoorzieningLijfrenteCF(driver).clear();
	BalansPassivaObjecten.VoorzieningLijfrenteCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",26));
	
	//Overige voorzieningen
	
	BalansPassivaObjecten.OverigeVoorzieningCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.OverigeVoorzieningCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",27));
	
	BalansPassivaObjecten.OverigeVoorzieningFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.OverigeVoorzieningFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",27));
	
	BalansPassivaObjecten.OverigeVoorzieningCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.OverigeVoorzieningCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",27));
	
	BalansPassivaObjecten.OverigeVoorzieningCF(driver).clear();
	BalansPassivaObjecten.OverigeVoorzieningCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",27));

	//Converteerbare leningen 

	BalansPassivaObjecten.ConverteerbareleningenCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.ConverteerbareleningenCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",36));
	
	BalansPassivaObjecten.ConverteerbareleningenFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.ConverteerbareleningenFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",36));
	
	BalansPassivaObjecten.ConverteerbareleningenCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.ConverteerbareleningenCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",36));
	
	BalansPassivaObjecten.ConverteerbareleningenCF(driver).clear();
	BalansPassivaObjecten.ConverteerbareleningenCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",36));
	
	//Schulden aan kredietinstellingen 
	
	BalansPassivaObjecten.SchuldenKredietInstCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.SchuldenKredietInstCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",37));
	
	BalansPassivaObjecten.SchuldenKredietInstFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.SchuldenKredietInstFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",37));
	
	BalansPassivaObjecten.SchuldenKredietInstCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.SchuldenKredietInstCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",37));
	
	BalansPassivaObjecten.SchuldenKredietInstCF(driver).clear();
	BalansPassivaObjecten.SchuldenKredietInstCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",37));
		
	//Obligaties
	
	BalansPassivaObjecten.ObligatiesCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.ObligatiesCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",38));
	
	BalansPassivaObjecten.ObligatiesFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.ObligatiesFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",38));
	
	BalansPassivaObjecten.ObligatiesCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.ObligatiesCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",38));
	
	BalansPassivaObjecten.ObligatiesCF(driver).clear();
	BalansPassivaObjecten.ObligatiesCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",38));	
	
	//Langlopende schulden groepsmaatschappijen 
	
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",39));
	
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",39));
	
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",39));
	
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCF(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",39));
	
	//Langlopende schulden participanten/maatschappijen waarin wordt deelgenomen
	
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",40));
	
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",40));
	
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",40));
	
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCF(driver).clear();
	BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",40));
	
	//Overige langlopende schulden
	
	BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",41));
	
	BalansPassivaObjecten.OverigeLangLopendeSchFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.OverigeLangLopendeSchFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",41));
	
	BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",41));
	
	BalansPassivaObjecten.OverigeLangLopendeSchCF(driver).clear();
	BalansPassivaObjecten.OverigeLangLopendeSchCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",41));
	
		
	
	//Schulden aan leveranciers en handelskredieten
	
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",49));
	
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",49));
	
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",49));
	
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCF(driver).clear();
	BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",49));	
	
	//Omzetbelasting 
	
	BalansPassivaObjecten.OmzetbelastingCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.OmzetbelastingCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",50));
	
	BalansPassivaObjecten.OmzetbelastingFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.OmzetbelastingFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",50));
	
	BalansPassivaObjecten.OmzetbelastingCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.OmzetbelastingCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",50));
	
	BalansPassivaObjecten.OmzetbelastingCF(driver).clear();
	BalansPassivaObjecten.OmzetbelastingCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",50));
		
	//Loonheffingen 
	
	BalansPassivaObjecten.LoonheffingenCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.LoonheffingenCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",51));
	
	BalansPassivaObjecten.LoonheffingenFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.LoonheffingenFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",51));
	
	BalansPassivaObjecten.LoonheffingenCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.LoonheffingenCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",51));
	
	BalansPassivaObjecten.LoonheffingenCF(driver).clear();
	BalansPassivaObjecten.LoonheffingenCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",51));
		
	//Kortlopende schulden groepsmaatschappijen
	
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",52));
	
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",52));
	
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",52));
	
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCF(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",52));
		
	//Kortlopende schulden op participanten/maatschappijen waarin wordt deelgenomen
	
	BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",53));
	
	BalansPassivaObjecten.KortlopendeSchuldParticiantFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldParticiantFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",53));
	
	BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",53));
	
	BalansPassivaObjecten.KortlopendeSchuldParticiantCF(driver).clear();
	BalansPassivaObjecten.KortlopendeSchuldParticiantCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",53));

	//Overige kortlopende schulden 
	
	BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_1_1(driver).clear();
	BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B",54));
	
	BalansPassivaObjecten.OverigeKortlSchuldFiscaal_1_1(driver).clear();
	BalansPassivaObjecten.OverigeKortlSchuldFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C",54));
	
	BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_31_12(driver).clear();
	BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D",54));
	
	BalansPassivaObjecten.OverigeKortlSchuldCF(driver).clear();
	BalansPassivaObjecten.OverigeKortlSchuldCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E",54));
	
	BalansPassivaObjecten.ToelichtingBalansPassiva(driver).clear();
	BalansPassivaObjecten.ToelichtingBalansPassiva(driver).sendKeys(codebase.BalansPassivaXLS.HaalText(62));
		
	
}

@Then("^i can validate the totals for Balans Passiva$")
public void i_can_validate_the_totals_for_Balans_Passiva() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
	ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		
	//Ondernemingsvermogen 
	
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",7)), "B7"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",7)), "C7"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",7)), "D7"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",7)), "E7"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",7)), "F7"));
	
	//Gestort en opgevraagd kapitaal 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.GestortOpgevraagdFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",9)), "F9"));
		
	//Informeel kapitaal 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.InformeelKapitaalFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",10)), "F10"));
		
	//Agio
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.AgioFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",11)), "F11"));
		
	//Winstreserve
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.WinstReserveFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",12)), "F12"));
	
	//Kostenegalisatiereserve
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KostenegalisatiereserveFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",13)), "F13"));
		
	//Herinvesteringsreserve
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.HerinvesteringsreserveFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",14)), "F14"));
	
	//Belaste compartimenteringsreserve 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.CompartimenteringsreserveFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",15)), "F15"));
	
	//Overige fiscale reserves 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OverigeFiscaleReservesFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",16)), "F16"));
			
	//Eigen vermogen 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.EigenvermogenCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",17)), "B17"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.EigenvermogenFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",17)), "C17"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.EigenvermogenCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",17)), "D17"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.EigenvermogenCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",17)), "E17"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.EigenvermogenFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",17)), "F17"));	
	
	//Voorzieningen
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",22)), "B22"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",22)), "C22"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",22)), "D22"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",22)), "E22"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",22)), "F22"));
	
	//Garantievoorziening 
	
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.GarantieVoorzieningFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",25)), "F25"));
	
	//Voorziening voor lijfrenten, pensioen en stamrecht 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningLijfrenteFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",26)), "F26"));
	
	//Overige voorzieningen 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OverigeVoorzieningFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",27)), "F27"));	
	
	//Totaal voorzieningen 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalVoorzieningCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",28)), "B28"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalVoorzieningFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",28)), "C28"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalVoorzieningCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",28)), "D28"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalVoorzieningCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",28)), "E28"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalVoorzieningFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",28)), "F28"));
		
	//Langlopende schulden 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",33)), "B33"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",33)), "C33"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",33)), "D33"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",33)), "E33"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",33)), "F33"));
		
	//Converteerbare leningen 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.ConverteerbareleningenFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",36)), "F36"));
		
	//Schulden aan kredietinstellingen 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.SchuldenKredietInstFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",37)), "F37"));
		
	//Obligaties
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.ObligatiesFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",38)), "F38"));
	
	//Langlopende schulden groepsmaatschappijen
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenGrMaatschFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",39)), "F39"));
		
	//Langlopende schulden participanten/maatschappijen waarin wordt deelgenomen
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",40)), "F40"));
	
	//Overige langlopende schulden 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OverigeLangLopendeSchFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",41)), "F41"));
	
	//Totaal langlopende schulden
	
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalLangLopSchuldCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",42)), "B42"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalLangLopSchuldFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",42)), "C42"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalLangLopSchuldCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",42)), "D42"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalLangLopSchuldCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",42)), "E42"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalLangLopSchuldFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",42)), "F42"));
	
	//Kortlopende schulden 

	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",46)), "B46"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",46)), "C46"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",46)), "D46"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",46)), "E46"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",46)), "F46"));
	
	//Schulden aan leveranciers en handelskredieten 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.SchuldenLeveranciersHandelsKrFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",49)), "F49"));
	
	//Omzetbelasting
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OmzetbelastingFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",50)), "F50"));
	
	//Loonheffingen
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LoonheffingenFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",51)), "F51"));
	
	//Kortlopende schulden groepsmaatschappijen
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",52)), "F52"));
		
	//Kortlopende schulden op participanten/maatschappijen waarin wordt deelgenomen
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortlopendeSchuldParticiantFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",53)), "F53"));
	
	//Overige kortlopende schulden 
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OverigeKortlSchuldFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",54)), "F54"));
	
	//Totaal kortlopende schulden 
	
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalKortlSchuldCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",55)), "B55"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalKortlSchuldFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",55)), "F55"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalKortlSchuldCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",55)), "D55"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalKortlSchuldCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",55)), "E55"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalKortlSchuldFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",55)), "F55"));
		
	//Totaal passiva 
	
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaCommercieeel_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("B",59)), "B59"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaFiscaal_1_1(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("C",59)), "C59"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaCommercieeel_31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("D",59)), "D59"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaCF(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("E",59)), "E59"));
	ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaFiscaal31_12(driver).getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F",59)), "F59"));	
	
	System.out.println(ValidatieResultaat);
		
}


}


