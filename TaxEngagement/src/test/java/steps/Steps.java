package steps;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
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
import pageObjects.LoginObjecten;
import pageObjects.NavigerenObjecten;
import pageObjects.SpecificatieAandeelhoudersObjecten;
import pageObjects.SpecificatieDeelnemingenObjecten;
import pageObjects.ToelichtingBalansObjecten;
import pageObjects.ValidatieObjecten;
import pageObjects.WinstenVerliesRekeningObjecten;

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
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("Beconnummer", 1, 9, true, true, driver));
		
		
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
		
		SpecificatieAandeelhoudersObjecten.VestigingslandRechtspersoon(driver).clear();
		SpecificatieAandeelhoudersObjecten.VestigingslandRechtspersoon(driver).sendKeys(invuldata[33]);
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
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsland(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsland(driver).sendKeys(invuldata[26]);
			
			if (invuldata[27].equals("ja")) {
			SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderJa(driver).click();
			}
			else {
			SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderNee(driver).click();
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
			
			// Huisnummer uitzetten omdat deze de tooltip dubbel weergeeft. juist tekst wordt wel weergegeven.	
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
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardeAandelen", 1, 20, false, false, driver));
						
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
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("MoederMaatschappijHuisnummer",1 , 99, true, false, driver));
		}
				
		if (SpecificatieAandeelhoudersObjecten.informeleKapitaalstortingNee(driver).isSelected()) {
		//huisnummer toevoeging
		}
		
		
		// als validatieresultaat niet leeg is dan melding genereren.
		System.out.println("Validatie resultaat: " + ValidatieResultaat);
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
		SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).sendKeys(invuldata[3]);
		SpecificatieDeelnemingenObjecten.VestigingsLandDeelneming(driver).sendKeys(invuldata[4]);
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
		
		SpecificatieDeelnemingenObjecten.PercentageVerwervingn(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageVerwervingn(driver).sendKeys(invuldata[21]);
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
	//	driver.quit();
		
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
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening(driver).sendKeys(invuldata[37]);
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarDotatieOverigevoorziening(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarDotatieOverigevoorziening(driver).sendKeys(invuldata[38]);
		
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenDotatieOverigevoorziening(driver).clear();
		ToelichtingBalansObjecten.ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenDotatieOverigevoorziening(driver).sendKeys(invuldata[39]);
		
				
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
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_Omschrijvingbedrijfsmiddel", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_JaarVervreemdingbedrijfsmiddel", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_Boekwinstvervreemdebedrijfsmiddel", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOndernemingsvermogen_BoekwaardeBedrijfsmiddelOpMomentVervreemding", 1, 99, true, false, driver));
	 		
	 		//Toelichting voorziening
	 		
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OmschrijvingSoortGarantievoorziening", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_DotatieGarantievoorziening", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OnttrekkingGarantieVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_GarantieVoorzieningEindeBoekjaar", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OmschrijvingOverigeVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_DotatieOverigeVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OnttrekkingOverigeVoorzieningen", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingVoorziening_OverigeVoorzieningEindeBoekjaar", 1, 99, true, false, driver));
	 				
	 		//Toelichting omzetbelasting
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOmzetbelasting_SchuldOmzetbelastingDitboekjaarDotatieOverigevoorziening", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOmzetbelasting_SchuldOmzetbelastingVorigboekjaarDotatieOverigevoorziening", 1, 99, true, false, driver));
	 		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipToelichtingBalans("ToelichtingOmzetbelasting_SchuldOmzetbelastingOudereboekjarenDotatieOverigevoorziening", 1, 99, true, false, driver));
	 		
	 	}
	@When("^open the form Winst en Verlies rekening$")
	public void open_the_form_Winst_en_Verlies_rekening() throws Throwable {
		
		NavigerenObjecten.NavigerenWinstEnVerliesRekening(driver).click();
		
	}

	@Then("^i can fill out the form Winst en Verlies rekening$")
	public void i_can_fill_out_the_form_Winst_en_Verlies_rekening() throws Throwable {
	
		//bedrijfsopbrengsten
		
		WinstenVerliesRekeningObjecten.NettoOmzetCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.NettoOmzetCommercieel(driver).sendKeys("1001");
		
		WinstenVerliesRekeningObjecten.NettoOmzetCF(driver).clear();
		WinstenVerliesRekeningObjecten.NettoOmzetCF(driver).sendKeys("1002");
		
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCommercieel(driver).sendKeys("1003");
		
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCF(driver).clear();
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCF(driver).sendKeys("1004");
		
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCommercieel(driver).sendKeys("1005");
		
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCF(driver).clear();
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCF(driver).sendKeys("1006");
		
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenCommercieel(driver).sendKeys("1007");

		WinstenVerliesRekeningObjecten.OverigeOpbrengstenProductieCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenProductieCF(driver).sendKeys("1008");
		
		
		//Kosten grond en hulpstoffen
		
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCommercieel(driver).sendKeys("1009");
		
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCF(driver).sendKeys("1010");
		
		WinstenVerliesRekeningObjecten.KostenUitbesteedCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenUitbesteedCommercieel(driver).sendKeys("1011");
		
		WinstenVerliesRekeningObjecten.KostenUitbesteedCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenUitbesteedCF(driver).sendKeys("1012");
				
		//Personeelskosten
		
		WinstenVerliesRekeningObjecten.LonenSalarissenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.LonenSalarissenCommercieel(driver).sendKeys("1013");

		WinstenVerliesRekeningObjecten.LonenSalarissenCF(driver).clear();
		WinstenVerliesRekeningObjecten.LonenSalarissenCF(driver).sendKeys("1014");
		
		WinstenVerliesRekeningObjecten.SocialeLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.SocialeLastenCommercieel(driver).sendKeys("1015");
		
		WinstenVerliesRekeningObjecten.SocialeLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.SocialeLastenCF(driver).sendKeys("1016");
		
		WinstenVerliesRekeningObjecten.PensioenLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.PensioenLastenCommercieel(driver).sendKeys("1017");
		
		WinstenVerliesRekeningObjecten.PensioenLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.PensioenLastenCF(driver).sendKeys("1018");
		
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCommercieel(driver).sendKeys("1019");
		
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCF(driver).sendKeys("1020");
		
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCommercieel(driver).sendKeys("1021");
		
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCF(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCF(driver).sendKeys("1022");
				
		//Afschrijvingen
		
		WinstenVerliesRekeningObjecten.GoodWillCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.GoodWillCommercieel(driver).sendKeys("1023");
		
		WinstenVerliesRekeningObjecten.GoodWillCF(driver).clear();
		WinstenVerliesRekeningObjecten.GoodWillCF(driver).sendKeys("1024");
		
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCommercieel(driver).sendKeys("1025");
		
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCF(driver).sendKeys("1026");
		
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCommercieel(driver).sendKeys("1027");
				
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCF(driver).clear();
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCF(driver).sendKeys("1028");
				
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCommercieel(driver).sendKeys("1029");
		
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCF(driver).clear();
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCF(driver).sendKeys("1030");
		
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCommercieel(driver).sendKeys("1031");
		
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCF(driver).clear();
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCF(driver).sendKeys("1032");		
		
		//Overige waardeverandering van immateriele en materiele vaste activa
		
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCommercieel(driver).sendKeys("1033");
		
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCF(driver).sendKeys("1033");
				
		//Bijzondere waardevermindering van vlottende activa
		
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCommercieel(driver).sendKeys("1034");
		
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCF(driver).sendKeys("1035");
				
		//Overige bedrijfskosten
		
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCommercieel(driver).sendKeys("1036");
		
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCF(driver).sendKeys("1037");
		
		
		
		
		
		
		
		
		//Financiele baten en lasten
		
		//Financiele lasten
		
		//Buitengewone bedrijfsbaten
		
		//Buitengewone bedrijfslasten
		
	}
	
}

