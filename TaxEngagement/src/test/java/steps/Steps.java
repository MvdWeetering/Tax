package steps;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class Steps extends AbstractSteps {

	

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
		WebElement HuidigeUser = ValidatieObjecten.BeoordelenHuidigeUser(driver);
		String User = (HuidigeUser.getText());
		assertTrue(User.equals("MW"));
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
		
		AlgemeneGegevensObjecten.StandpuntExplicieteUitspraak_Ja(driver).click();
		
		AlgemeneGegevensObjecten.Toelichtingverzoek(driver).clear();
		AlgemeneGegevensObjecten.Toelichtingverzoek(driver).sendKeys("toelichting verzoek");
		AlgemeneGegevensObjecten.AangifteFiscaleEenheid_Ja(driver).click();
		AlgemeneGegevensObjecten.FunctioneleValuta_Ja(driver).click();
		AlgemeneGegevensObjecten.Beconnummer(driver).clear();
		AlgemeneGegevensObjecten.Beconnummer(driver).sendKeys("1234");
		AlgemeneGegevensObjecten.Clientgroep(driver).clear();
		AlgemeneGegevensObjecten.Clientgroep(driver).sendKeys("clientgroep");
		AlgemeneGegevensObjecten.Aanhef(driver).sendKeys("mevrouw");
		AlgemeneGegevensObjecten.VoorlettersContact(driver).clear();
		AlgemeneGegevensObjecten.VoorlettersContact(driver).sendKeys("voorletters");
		AlgemeneGegevensObjecten.TussenvoegselContact(driver).clear();
		AlgemeneGegevensObjecten.TussenvoegselContact(driver).sendKeys("tussenvoegsel");
		AlgemeneGegevensObjecten.AchternaamContact(driver).clear();
		AlgemeneGegevensObjecten.AchternaamContact(driver).sendKeys("achternaam");
		AlgemeneGegevensObjecten.TelefoonnummerContact(driver).clear();
		AlgemeneGegevensObjecten.TelefoonnummerContact(driver).sendKeys("0611");
		AlgemeneGegevensObjecten.Straatnaam(driver).clear();
		AlgemeneGegevensObjecten.Straatnaam(driver).sendKeys("straatnaam");
		AlgemeneGegevensObjecten.Huisnummer(driver).clear();
		AlgemeneGegevensObjecten.Huisnummer(driver).sendKeys("huisnummer");
		AlgemeneGegevensObjecten.Postcode(driver).clear();
		AlgemeneGegevensObjecten.Postcode(driver).sendKeys("1000AA");
		AlgemeneGegevensObjecten.HuisnummerToevoeging(driver).clear();
		AlgemeneGegevensObjecten.HuisnummerToevoeging(driver).sendKeys("toev");
		AlgemeneGegevensObjecten.Plaats(driver).clear();
		AlgemeneGegevensObjecten.Plaats(driver).sendKeys("plaats");
		AlgemeneGegevensObjecten.VoorlettersOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.VoorlettersOndertekenaar(driver).sendKeys("Voorletters");
		AlgemeneGegevensObjecten.TussenvoegselOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.TussenvoegselOndertekenaar(driver).sendKeys("tussenvoegsel");
		AlgemeneGegevensObjecten.AchternaamOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.AchternaamOndertekenaar(driver).sendKeys("achternaam");
		AlgemeneGegevensObjecten.FunctieOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.FunctieOndertekenaar(driver).sendKeys("functie ondertekenaar");
		AlgemeneGegevensObjecten.TelefoonnummerOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.TelefoonnummerOndertekenaar(driver).sendKeys("0612");
	}

	@Then("^i can validate the error messages for the Algemene gegevens form$")
	public void i_can_validate_the_error_messages_for_the_Algemene_gegevens_form() throws Throwable {
	   
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		
		// RSIN
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("RSIN", 1, 9, true, true));
		
		// Beconnummer
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("Beconnummer", 1, 9, true, true));
		
		
		// Voorletters contactpersoon
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("VoorlettersContact", 1, 10, false, false));
		
		// Tussenvoegsel contactpersoon
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TussenvoegselContact", 1, 10, false, false));
		
		// Achternaam contact
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("AchternaamContact", 1, 10, false, false));
		
		// telefoonnummer contact
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TelefoonnummerContact", 1, 14, false, false));
		
		// Voorletters ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("VoorlettersOndertekenaar", 1, 10, false, false));
		
		// Tussenvoegsel ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TussenvoegselOndertekenaar", 1, 10, false, false));
		
		
		// Achternaam ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("AchternaamOndertekenaar", 1, 200, false, false));
		
		// Functie ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("FunctieOndertekenaar", 1, 35, false, false));
		
		// Telefoonnummer ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TelefoonnummerOndertekenaar", 1, 35, false, false));		 
		
						
		System.out.println("Validatie resultaat: " + ValidatieResultaat);
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
		/*
		SpecificatieAandeelhoudersObjecten.informeleKapitaalstortingNee(driver).click();
		SpecificatieAandeelhoudersObjecten.NaamRechtspersoon(driver).sendKeys("naamrechtspersoon");
		SpecificatieAandeelhoudersObjecten.StraatnaamRechtspersoon(driver).sendKeys("Straatnaamrechtspersoon");
		SpecificatieAandeelhoudersObjecten.HuisnummerRechtspersoon(driver).sendKeys("huisnr");
		SpecificatieAandeelhoudersObjecten.ToevHuisnummerRechtspersoon(driver).sendKeys("toev");
		SpecificatieAandeelhoudersObjecten.VestigingsplaatsRechtspersoon(driver).sendKeys("vestigingsplaats");
		SpecificatieAandeelhoudersObjecten.VestigingslandRechtspersoon(driver).sendKeys("vestigingsland");
		*/
		
		 // informele kapitaalstorting = ja
		
		
		invoke(SpecificatieAandeelhoudersObjecten.class, "NaamAandeelhouder").sendKeys("nieuwe waarde");
		
		
		SpecificatieAandeelhoudersObjecten.informeleKapitaalstorting(driver).click();
		SpecificatieAandeelhoudersObjecten.BedragInformeleKapitaalStorting(driver).clear();
		SpecificatieAandeelhoudersObjecten.BedragInformeleKapitaalStorting(driver).sendKeys("bedragkapitaalstorting");
		SpecificatieAandeelhoudersObjecten.WaaromInformeleKapitaalstorting(driver).clear(); 
		SpecificatieAandeelhoudersObjecten.WaaromInformeleKapitaalstorting(driver).sendKeys("waarom storting");
		SpecificatieAandeelhoudersObjecten.NaamMoedermaatschappij(driver).clear();
		SpecificatieAandeelhoudersObjecten.NaamMoedermaatschappij(driver).sendKeys("Naam moedermaatschappij");
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijStraatnaam(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijStraatnaam(driver).sendKeys("Straatnaam moedermaatschappij");
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummer(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummer(driver).sendKeys("huisnummer moedermaatschappij");
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummerToev(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummerToev(driver).sendKeys("huisnrToev moedermaatschappij");
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsplaats(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsplaats(driver).sendKeys("vestigingsplaats moedermaatschappij");
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsland(driver).clear();
		SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsland(driver).sendKeys("vestigingsland moedermaatschappij");
			
		SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderJa(driver).click();
		
		SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderNee(driver).click();
		
		
	}

	@Then("^i can validate the error messages for the Specificatie Aandeelhouders form$")
	public void i_can_validate_the_error_messages_for_the_Specificatie_Aandeelhouders_form() throws Throwable {

		Thread.sleep(1000);
		
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		
		// naam aandeelhouders
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NaamAandeelhouder", 1, 69, true, false));
				
		// BSN
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BSN", 9, 9, true, true));			
		
		// Straatnaam
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Straatnaam",1, 24, true, false));
		
		// Huisnummer uitzetten omdat deze de tooltip dubbel weergeeft. juist tekst wordt wel weergegeven.	
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Huisnummer", 1, 5, true, false));
		
		// postcode validatie nog niet geimplementeerd. na implementatie controleren.
		 
		// Postcode
				
		// Huisnummer toev validatie nog niet geimplementeerd. na implementatie controleren. 		
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("HuisnrToev",1, 5, true, false));
		// Huisnummer toev
		
		// Woonplaats uitzetten omdat deze de tooltip dubbel weergeeft. juist tekst wordt wel weergegeven.	
		// Woonplaats
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Woonplaats", 1, 20, true, false));
		
		// nominale waarde aandelen
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardeAandelen", 1, 20, true, false));
		
				
		// Nominale waarde preferente aandelen einde boekjaar 
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardePreferente",1 , 20, true, false));
		
		
		// Nominale waarde prioriteitsaandelen einde boekjaar 
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardePrioriteits", 1, 20, true, false));
		
		
		// Percentage nominaal geplaatst kapitaal 
		
		// Vordering belastingplichtige op aandeelhouder
		
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("VorderingBelastingplichtige", 1, 20, false, false));
		// Schuld belastingplichtige aan aandeelhouder
		
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("SchuldBelastingplichtige",1 , 20, false, false));

		// In het boekjaar ontvangen rente van de aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BoekjaarOntvangenRente",1 , 20, false, false));
				
		// boekjaar betaalde rente
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BoekjaarBetaaldeRente",1 , 20, false, false));
		
		//informele kapitaalstorting
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BedragInformeleKapitaalStorting", 1 , 99, true, false));
		
		//huisnummer toevoeging
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("MoederMaatschappijHuisnummer",1 , 99, true, false));	
		
		
		// als validatieresultaat niet leeg is dan melding genereren.
	//	System.out.println("Validatie resultaat: " + ValidatieResultaat);
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Specificatie Deelnemingen$")
	public void open_the_form_Specificatie_Deelnemingen() throws Throwable {
		NavigerenObjecten.NavigerenSpecificatie_Deelnemingen(driver).click();

	}

	@Then("^i can fill out the form Specificatie Deelnemingen$")
	public void i_can_fill_out_the_form_Specificatie_Deelnemingen() throws Throwable {

		
		
		SpecificatieDeelnemingenObjecten.NaamDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.NaamDeelneming(driver).sendKeys("Naam Deelneming");
		SpecificatieDeelnemingenObjecten.RSINdeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.RSINdeelneming(driver).sendKeys("RSIN");
		SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).sendKeys("Vestigingsplaats deelneming");
		SpecificatieDeelnemingenObjecten.VestigingsLandDeelneming(driver).sendKeys("Nederland");
		SpecificatieDeelnemingenObjecten.PercentageAandelenbezit(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageAandelenbezit(driver).sendKeys("10");
		SpecificatieDeelnemingenObjecten.NominaleWaardeAandelenBezit(driver).clear();
		SpecificatieDeelnemingenObjecten.NominaleWaardeAandelenBezit(driver).sendKeys("1000");
		SpecificatieDeelnemingenObjecten.OpgeofferdBedrag(driver).clear();
		SpecificatieDeelnemingenObjecten.OpgeofferdBedrag(driver).sendKeys("2000");
		SpecificatieDeelnemingenObjecten.BalanswaarderingDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BalanswaarderingDeelneming(driver).sendKeys("3000");
		SpecificatieDeelnemingenObjecten.VoordelenDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.VoordelenDeelneming(driver).sendKeys("4000");
		SpecificatieDeelnemingenObjecten.BedragVorderingenDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BedragVorderingenDeelneming(driver).sendKeys("5000");
		SpecificatieDeelnemingenObjecten.BedragSchuldDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BedragSchuldDeelneming(driver).sendKeys("6000");
		SpecificatieDeelnemingenObjecten.OntvRenteDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.OntvRenteDeelneming(driver).sendKeys("7000");
		SpecificatieDeelnemingenObjecten.BetRenteDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.BetRenteDeelneming(driver).sendKeys("8000");
		SpecificatieDeelnemingenObjecten.DeelnemingGevoegd_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.Voegingsdatum(driver).sendKeys("01-01-2016");
		SpecificatieDeelnemingenObjecten.Ontvoegingsdatum(driver).sendKeys("31-12-2016");
		SpecificatieDeelnemingenObjecten.DeelnemingVerworven_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.PercentageVerwervingn(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageVerwervingn(driver).sendKeys("10");
		SpecificatieDeelnemingenObjecten.NominaleWaardeVerwerving(driver).clear();
		SpecificatieDeelnemingenObjecten.NominaleWaardeVerwerving(driver).sendKeys("9000");
		SpecificatieDeelnemingenObjecten.OpgeofferdbedragVerwerving(driver).clear();
		SpecificatieDeelnemingenObjecten.OpgeofferdbedragVerwerving(driver).sendKeys("10000");
		SpecificatieDeelnemingenObjecten.BelangDeelnemingVerworven_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.DeelnemingVervreemd_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.PercentageVervreemding(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageVervreemding(driver).sendKeys("20");
		SpecificatieDeelnemingenObjecten.NominaleWaardeVervreemding(driver).clear();
		SpecificatieDeelnemingenObjecten.NominaleWaardeVervreemding(driver).sendKeys("11000");
		SpecificatieDeelnemingenObjecten.OpbrengstVervreemding(driver).clear();
		SpecificatieDeelnemingenObjecten.OpbrengstVervreemding(driver).sendKeys("12000");
		SpecificatieDeelnemingenObjecten.BelangVervreemdInBoekjaar_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.DeelnemingGeliquideerd_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.VereffeningsdatumDeelneming(driver).sendKeys("06-06-216");
		SpecificatieDeelnemingenObjecten.LiquidatieVerliesDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.LiquidatieVerliesDeelneming(driver).sendKeys("13000");
		SpecificatieDeelnemingenObjecten.WaarderingsvoorschriftArt13_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.DeelnemingNietKwalificerende_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.WaardeEconomischVerkeer(driver).clear();
		SpecificatieDeelnemingenObjecten.WaardeEconomischVerkeer(driver).sendKeys("14000");
		SpecificatieDeelnemingenObjecten.BelangDeelnemingGedaald25Procent_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.Waarde25ProcentMutatie(driver).clear();
		SpecificatieDeelnemingenObjecten.Waarde25ProcentMutatie(driver).sendKeys("15000");
		SpecificatieDeelnemingenObjecten.BedragBruteringVoordeel(driver).clear();
		SpecificatieDeelnemingenObjecten.BedragBruteringVoordeel(driver).sendKeys("16000");
		SpecificatieDeelnemingenObjecten.BeleggingsdeelnemingEULidstaat_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.VerzoektVerrekening_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.VerzoektAfwijkendeVerrekening_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.Meerdan99Deelnemingen_Ja(driver).click();
		SpecificatieDeelnemingenObjecten.ToelichtingMeerdan99Deelnemingen(driver)
				.sendKeys("Toelichting meer dan 99 deelnemingen");
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

}
