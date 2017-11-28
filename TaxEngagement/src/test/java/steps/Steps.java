
package steps;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AbstractSteps;
import pageObjects.AlgemeneGegevensObjecten;
import pageObjects.AlgemeneVragenObjecten;
import pageObjects.BalansActivaObjecten;
import pageObjects.BalansPassivaObjecten;
import pageObjects.BerekeningBelastbaarBedragObjecten;
import pageObjects.FieldName;
import pageObjects.FiscaleVermogensVergelijkingObjecten;
import pageObjects.InnovatieboxObjecten;
import pageObjects.InvesteringsaftrekObjecten;
import pageObjects.InvesteringsregelingenObjecten;
import pageObjects.LoginObjecten;
import pageObjects.NavigerenObjecten;
import pageObjects.ObjectvrijstellingObjecten;
import pageObjects.SpecificatieAandeelhoudersObjecten;
import pageObjects.SpecificatieDeelnemingenObjecten;
import pageObjects.SpecificatieDochtermaatschappijObjecten;
import pageObjects.ToelichtingBalansObjecten;
import pageObjects.ToelichtingDesinvesteringsbijtellingObjecten;
import pageObjects.ToelichtingGarantieVoorzieningObjecten;
import pageObjects.ToelichtingHerinvesteringsReserveObjecten;
import pageObjects.ToelichtingMaterieleVasteActivaObjecten;
import pageObjects.ToelichtingOverigeVoorzieningObjecten;
import pageObjects.WinstenVerliesRekeningObjecten;
import pageObjects.ZeescheepvaartObjecten;
import pageObjects.toelichtingWinstenVerliesRekeningObjecten;
import pageObjects.winstVerliesVerrekeningObjecten;
import codebase.*;

public class Steps extends AbstractSteps {

	public WebDriver driver = null;

	@Given("^I want to login with browser \"(.*?)\"$")
	public void i_want_to_login_with_browser(String Browser) throws Throwable {

		driver = Inloggen.GetDriver(Browser);

		String InlogUrl = null;

		// test
		InlogUrl = "http://eu.casewarecloud.com/test-cwnltest/webapps/#login";
		// Splat
		// InlogUrl = "localhost:7777/nl-se-develop/webapps/#login";

		// Dev
		// InlogUrl =
		// "https://eu.casewarecloud.com/nl-se-develop/webapps/#login";

		driver.get(InlogUrl);
		driver.manage().window().maximize();

	}

	@When("^I type username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_type_username_and_password(String UserName, String Password) throws Throwable {
		Thread.sleep(1500);
		LoginObjecten.UserName(driver).sendKeys(UserName);
		LoginObjecten.PassWord(driver).sendKeys(Password);

		driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();

		// WebElement HuidigeUser =
		// ValidatieObjecten.BeoordelenHuidigeUser(driver);
		// String User = (HuidigeUser.getText());
		// assertTrue(User.equals("MW"));
	}

	@When("^Select the Tax engagement module$")
	public void select_the_Tax_engagement_module() throws Throwable {
		Thread.sleep(10000);
		NavigerenObjecten.ClickCloud(driver).click();
		Thread.sleep(2000);
		NavigerenObjecten.NavigerenTax(driver).click();
		Thread.sleep(3000);
	}

	@When("^open the Project \"([^\"]*)\"$")
	public void open_the_Project(String Project) throws Throwable {

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String oldTab = driver.getWindowHandle();
		Thread.sleep(1000);
		NavigerenObjecten.Zoekveld(driver).sendKeys(Project);

		Thread.sleep(1500);

		driver.findElement(By.linkText(Project)).click();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(newTab.get(0));

		Thread.sleep(3500);
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
		} else {
			AlgemeneVragenObjecten.vraag1_no(driver).click();
		}

		if (invuldata[2].equals("ja")) {
			AlgemeneVragenObjecten.vraag2_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag2_no(driver).click();
		}
		if (invuldata[3].equals("ja")) {
			AlgemeneVragenObjecten.vraag3_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag3_no(driver).click();
		}
		if (invuldata[4].equals("ja")) {
			AlgemeneVragenObjecten.vraag4_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag4_no(driver).click();
		}
		if (invuldata[5].equals("ja")) {
			AlgemeneVragenObjecten.vraag5_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag5_no(driver).click();
		}
		if (invuldata[6].equals("ja")) {
			AlgemeneVragenObjecten.vraag6_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag6_no(driver).click();
		}
		if (invuldata[7].equals("ja")) {
			AlgemeneVragenObjecten.vraag7_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag7_no(driver).click();
		}
		if (invuldata[8].equals("ja")) {
			AlgemeneVragenObjecten.vraag8_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag8_no(driver).click();
		}

		if (invuldata[9].equals("ja")) {
			AlgemeneVragenObjecten.vraag9_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag9_no(driver).click();
		}

		if (invuldata[10].equals("ja")) {
			AlgemeneVragenObjecten.vraag10_yes(driver).click();

		} else {
			AlgemeneVragenObjecten.vraag10_no(driver).click();
		}

		if (invuldata[11].equals("ja")) {
			AlgemeneVragenObjecten.vraag11_yes(driver).click();
			AlgemeneVragenObjecten.vraag12(driver).clear();
			AlgemeneVragenObjecten.vraag12(driver).sendKeys(invuldata[12]);
		} else {
			AlgemeneVragenObjecten.vraag11_no(driver).click();
		}

		if (invuldata[13].equals("ja")) {
			AlgemeneVragenObjecten.vraag13_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag13_no(driver).click();
		}

		if (invuldata[14].equals("ja")) {
			AlgemeneVragenObjecten.vraag14_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag14_no(driver).click();
		}

		if (invuldata[15].equals("ja")) {
			AlgemeneVragenObjecten.vraag15_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag15_no(driver).click();
		}

		if (invuldata[16].equals("ja")) {
			AlgemeneVragenObjecten.vraag16_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag16_no(driver).click();
		}

		if (invuldata[17].equals("ja")) {
			AlgemeneVragenObjecten.vraag17_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag17_no(driver).click();
		}

		if (invuldata[18].equals("ja")) {
			AlgemeneVragenObjecten.vraag18_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag18_no(driver).click();
		}

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		AlgemeneVragenObjecten.vraag19(driver).sendKeys(invuldata[19]);

		if (invuldata[20].equals("ja")) {
			AlgemeneVragenObjecten.vraag20_yes(driver).click();
			AlgemeneVragenObjecten.vraag21(driver).sendKeys(invuldata[21]);
		} else {
			AlgemeneVragenObjecten.vraag20_no(driver).click();
		}

		if (invuldata[22].equals("ja")) {
			AlgemeneVragenObjecten.vraag22_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag22_no(driver).click();
		}

		if (invuldata[23].equals("ja")) {
			AlgemeneVragenObjecten.vraag23_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag23_no(driver).click();
		}
		if (invuldata[24].equals("ja")) {
			AlgemeneVragenObjecten.vraag24_yes(driver).click();
		} else {
			AlgemeneVragenObjecten.vraag24_no(driver).click();
		}

		AlgemeneVragenObjecten.vraag25(driver).clear();
		AlgemeneVragenObjecten.vraag25(driver).sendKeys(invuldata[25]);

		driver.quit();
	}

	@When("^open the form Algemene Gegevens$")
	public void open_the_form_Algemene_Gegevens() throws Throwable {

		NavigerenObjecten.NavigerenAlgemeneGegevens(driver).click();

		Thread.sleep(1500);

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
		} else {
			AlgemeneGegevensObjecten.StandpuntExplicieteUitspraak_Nee(driver).click();
		}

		if (invuldata[7].equals("ja")) {
			AlgemeneGegevensObjecten.AangifteFiscaleEenheid_Ja(driver).click();
		} else {
			AlgemeneGegevensObjecten.AangifteFiscaleEenheid_Nee(driver).click();
		}

		if (invuldata[8].equals("ja")) {
			AlgemeneGegevensObjecten.FunctioneleValuta_Ja(driver).click();
		} else {
			AlgemeneGegevensObjecten.FunctioneleValuta_Nee(driver).click();
		}

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

		AlgemeneGegevensObjecten.BeconnummerIntermediair(driver).clear();
		AlgemeneGegevensObjecten.BeconnummerIntermediair(driver).sendKeys(invuldata[16]);

		if (invuldata[17].equals("ja")) {
			AlgemeneGegevensObjecten.EenofMeerKoepel_ja(driver).click();
			AlgemeneGegevensObjecten.NaamKoepelorgFisDienstverl(driver).clear();
			AlgemeneGegevensObjecten.NaamKoepelorgFisDienstverl(driver).sendKeys(invuldata[18]);
		} else {
			AlgemeneGegevensObjecten.FunctioneleValuta_Nee(driver).click();
		}

		AlgemeneGegevensObjecten.VoorlettersOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.VoorlettersOndertekenaar(driver).sendKeys(invuldata[19]);
		AlgemeneGegevensObjecten.TussenvoegselOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.TussenvoegselOndertekenaar(driver).sendKeys(invuldata[20]);
		AlgemeneGegevensObjecten.AchternaamOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.AchternaamOndertekenaar(driver).sendKeys(invuldata[21]);

		AlgemeneGegevensObjecten.FunctieOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.FunctieOndertekenaar(driver).sendKeys(invuldata[22]);
		AlgemeneGegevensObjecten.TelefoonnummerOndertekenaar(driver).clear();
		AlgemeneGegevensObjecten.TelefoonnummerOndertekenaar(driver).sendKeys(invuldata[23]);

	}

	@Then("^i can validate the error messages for the Algemene gegevens form$")
	public void i_can_validate_the_error_messages_for_the_Algemene_gegevens_form() throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// Handelsnaam onderneming
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("HandelsnaamOnderneming", 1, 200,
				"TextVeld", driver));

		// RSIN
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("RSIN", 1, 9, "BSN", driver));

		// Toelichting verzoek
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("Toelichtingverzoek", 1, 6930,
				"TextVeld", driver));

		// Consulent **

		// Becon

		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("Beconnummer", 1, 99, "Positief6", driver));

		// Client groep

		// Voorletters contactpersoon
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("VoorlettersContact", 1, 10, "TextVeld", driver));

		// Tussenvoegsel contactpersoon
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TussenvoegselContact", 1, 10,
				"TextVeld", driver));

		// Achternaam contact
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("AchternaamContact", 1, 200, "TextVeld", driver));

		// telefoonnummer contact
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TelefoonnummerContact", 1, 14,
				"TextVeld", driver));

		// Beconnummer (intermediair)

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("BeconnummerIntermediair", 1, 20,
				"Positief6", driver));

		// Naam koepelorganisatie fiscale dienstverleners
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("NaamKoepelorgFisDienstverl", 1,
				20, "TextVeld", driver));

		// Aanhef

		// Ondertekenaar **

		// Voorletters ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("VoorlettersOndertekenaar", 1,
				10, "TextVeld", driver));

		// Tussenvoegsel ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TussenvoegselOndertekenaar", 1,
				10, "TextVeld", driver));

		// Achternaam ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("AchternaamOndertekenaar", 1,
				200, "TextVeld", driver));

		// Functie ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("FunctieOndertekenaar", 1, 35,
				"TextVeld", driver));

		// Telefoonnummer ondertekenaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipAlgemeneGegevens("TelefoonnummerOndertekenaar", 1,
				14, "TextVeld", driver));

		// System.out.println("Validatie resultaat: " + ValidatieResultaat);
		driver.quit();

		assertTrue(ValidatieResultaat.isEmpty());

	}

	@Then("^i can validate the error messages for Specificatie Deelnemingen form$")
	public void i_can_validate_the_error_messages_for_Specificatie_Deelnemingen_form() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);", "");

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		Thread.sleep(1500);

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("NaamDeelneming", 1, 70,
				"TextVeld", driver));
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("RSINdeelneming", 1, 9, "BSN", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("Huisnummer", 1, 99,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipSpecificatieDeelnemingen("NominaleWaardeAandelenBezit", 1, 99, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("OpgeofferdBedrag", 1,
				99, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipSpecificatieDeelnemingen("BalanswaarderingDeelneming", 1, 99, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("VoordelenDeelneming", 1,
				99, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipSpecificatieDeelnemingen("BedragVorderingenDeelneming", 1, 99, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BedragSchuldDeelneming",
				1, 99, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("OntvRenteDeelneming", 1,
				99, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("BetRenteDeelneming", 1,
				99, "GeheelGetal", driver));

		// Is de deelneming in het boekjaar gevoegd in en/ of ontvoegd uit een
		// fiscale eenheid met de belastingplichtige?

		if (pageObjects.SpecificatieDeelnemingenObjecten.DeelnemingGevoegd_Ja(driver).isSelected()) {
			// tooltip checker 'valt niet binnen fiscale jaar bouwen
		}

		// Is de deelneming in het boekjaar verworven of is het belang in de
		// deelneming in het boekjaar vergroot?

		if (pageObjects.SpecificatieDeelnemingenObjecten.DeelnemingVerworven_Ja(driver).isSelected()) {

			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("PercentageVerwerving", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("NominaleWaardeVerwerving", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("OpgeofferdbedragVerwerving", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("BrutoVoordelenMetDeelneming", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("KostenVerwervingDeelneming", 1, 99, "GeheelGetal", driver));
		}

		// Is de deelneming in het boekjaar vervreemd of is het belang in de
		// deelneming in het boekjaar verkleind?

		if (pageObjects.SpecificatieDeelnemingenObjecten.DeelnemingVervreemd_Ja(driver).isSelected()) {

			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("PercentageVervreemding", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("NominaleWaardeVervreemding", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("OpbrengstVervreemding", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("BrutoVoordelenDelneming", 1, 99, "GeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
					"KostenVervreemdingDeelneming", 1, 99, "GeheelGetal", driver));
		}

		// Is de deelneming geliquideerd en is de vereffening in het boekjaar
		// voltooid?

		if (pageObjects.SpecificatieDeelnemingenObjecten.DeelnemingGeliquideerd_Ja(driver).isSelected()) {

			// Tooltip checker fiscale jaar inbouwen voor Vereffeningsdatum
			// deelneming
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
					"LiquidatieVerliesDeelneming", 1, 99, "PositiefGeheelGetal", driver));
		}

		// Is de deelneming een als belegging gehouden deelneming niet zijnde
		// een kwalificerende beleggingsdeelneming?

		if (pageObjects.SpecificatieDeelnemingenObjecten.DeelnemingNietKwalificerende_Ja(driver).isSelected()) {

			// Tooltip checker fiscale jaar inbouwen voor Vereffeningsdatum
			// deelneming
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("WaardeEconomischVerkeer", 1, 99, "PositiefGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("Waarde25ProcentMutatie", 1, 99, "PositiefGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("BedragBruteringVoordeel", 1, 99, "PositiefGetal", driver));
		}

		// Is er sprake van meer dan 99 deelnemingen?

		// if
		// (pageObjects.SpecificatieDeelnemingenObjecten.Meerdan99Deelnemingen_Ja(driver).isSelected())
		// {
		// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen("ToelichtingMeerdan99Deelnemingen",
		// 1, 99, "TextVeld", driver));
		// }

		// Verkapt divident
		if (pageObjects.SpecificatieDeelnemingenObjecten.VerkaptDivident_ja(driver).isSelected()) {

			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
					"VerkaptDividentBedrag", 1, 99, "PositiefGeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("WaaromVerkaptDivident", 1, 99, "TextVeld", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("NaamMoedermaatschappij", 1, 99, "TextVeld", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecificatieDeelnemingen("StraatnaamMoederMaatschappij", 1, 99, "TextVeld", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
					"HuisnummerMoederMaatschappij", 1, 99, "PositiefGeheelGetal", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
					"HuisnummerToevingMoederMaatschappij", 1, 99, "TextVeld", driver));
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
					"VestingsPlaatsMoederMaatschappij", 1, 99, "TextVeld", driver));

			if (pageObjects.SpecificatieDeelnemingenObjecten.DirecteDeelnemingOntgaan_nee(driver).isSelected()) {
				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
						"RechtspersoonVoordeelOntgaan", 1, 99, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker
						.CheckTooltipSpecificatieDeelnemingen("RechtspersoonStraatnaam", 1, 99, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker
						.CheckTooltipSpecificatieDeelnemingen("RechtspersoonHuisnummer", 1, 99, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
						"RechtspersoonHuisnummerToevoeging", 1, 99, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
						"RechtspersoonVestigingsplaats", 1, 99, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecificatieDeelnemingen(
						"RechtspersoonVestigingsLand", 1, 99, "TextVeld", driver));
			}
		}

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

		if (configId == 2) {
			WebElement mySelectElm = driver.findElement(By.cssSelector("[ng-model='currentRepeatForm']"));
			Select mySelect = new Select(mySelectElm);
			mySelect.selectByVisibleText("002 Specificatie Aandeelhouders");
		}

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
			SpecificatieAandeelhoudersObjecten.HuisnummerBuitenl(driver).clear();
			SpecificatieAandeelhoudersObjecten.HuisnummerBuitenl(driver).sendKeys(invuldata[6]);

			SpecificatieAandeelhoudersObjecten.Postcode(driver).clear();
			SpecificatieAandeelhoudersObjecten.Postcode(driver).sendKeys(invuldata[7]);
			SpecificatieAandeelhoudersObjecten.HuisnrToev(driver).clear();
			SpecificatieAandeelhoudersObjecten.HuisnrToev(driver).sendKeys(invuldata[8]);
			SpecificatieAandeelhoudersObjecten.Woonplaats(driver).clear();
			SpecificatieAandeelhoudersObjecten.Woonplaats(driver).sendKeys(invuldata[9]);
			SpecificatieAandeelhoudersObjecten.Land(driver).sendKeys(invuldata[10]);
		}

		SpecificatieAandeelhoudersObjecten.NominalewaardeAandelen(driver).clear();
		SpecificatieAandeelhoudersObjecten.NominalewaardeAandelen(driver).sendKeys(invuldata[11]);
		SpecificatieAandeelhoudersObjecten.NominalewaardePreferente(driver).clear();
		SpecificatieAandeelhoudersObjecten.NominalewaardePreferente(driver).sendKeys(invuldata[12]);
		SpecificatieAandeelhoudersObjecten.NominalewaardePrioriteits(driver).clear();
		SpecificatieAandeelhoudersObjecten.NominalewaardePrioriteits(driver).sendKeys(invuldata[13]);
		SpecificatieAandeelhoudersObjecten.PercentageNominaal(driver).clear();
		SpecificatieAandeelhoudersObjecten.PercentageNominaal(driver).sendKeys(invuldata[14]);
		SpecificatieAandeelhoudersObjecten.VorderingBelastingplichtige(driver).clear();
		SpecificatieAandeelhoudersObjecten.VorderingBelastingplichtige(driver).sendKeys(invuldata[15]);
		SpecificatieAandeelhoudersObjecten.SchuldBelastingplichtige(driver).clear();
		SpecificatieAandeelhoudersObjecten.SchuldBelastingplichtige(driver).sendKeys(invuldata[16]);
		SpecificatieAandeelhoudersObjecten.BoekjaarOntvangenRente(driver).clear();
		SpecificatieAandeelhoudersObjecten.BoekjaarOntvangenRente(driver).sendKeys(invuldata[17]);
		SpecificatieAandeelhoudersObjecten.BoekjaarBetaaldeRente(driver).clear();
		SpecificatieAandeelhoudersObjecten.BoekjaarBetaaldeRente(driver).sendKeys(invuldata[18]);

		// informele kapitaalstorting = nee

		System.out.println(invuldata[19]);

		if (invuldata[19].equals("nee")) {

			SpecificatieAandeelhoudersObjecten.informeleKapitaalstortingNee(driver).click();

		}

		// informele kapitaalstorting = ja
		else {

			SpecificatieAandeelhoudersObjecten.informeleKapitaalstorting(driver).click();
			SpecificatieAandeelhoudersObjecten.BedragInformeleKapitaalStorting(driver).clear();
			SpecificatieAandeelhoudersObjecten.BedragInformeleKapitaalStorting(driver).sendKeys(invuldata[20]);

			SpecificatieAandeelhoudersObjecten.WaaromInformeleKapitaalstorting(driver).clear();
			SpecificatieAandeelhoudersObjecten.WaaromInformeleKapitaalstorting(driver).sendKeys(invuldata[21]);
			SpecificatieAandeelhoudersObjecten.NaamMoedermaatschappij(driver).clear();
			SpecificatieAandeelhoudersObjecten.NaamMoedermaatschappij(driver).sendKeys(invuldata[22]);
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijStraatnaam(driver).clear();
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijStraatnaam(driver).sendKeys(invuldata[23]);
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummer(driver).clear();
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummer(driver).sendKeys(invuldata[24]);
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummerToev(driver).clear();
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijHuisnummerToev(driver).sendKeys(invuldata[25]);
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsplaats(driver).clear();
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsplaats(driver).sendKeys(invuldata[26]);
			SpecificatieAandeelhoudersObjecten.MoederMaatschappijVestigingsland(driver).sendKeys(invuldata[27]);

			if (invuldata[28].equals("ja")) {
				SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderJa(driver).click();
			} else {
				SpecificatieAandeelhoudersObjecten.BevoordelingvanAandeelhouderNee(driver).click();

				SpecificatieAandeelhoudersObjecten.NaamRechtspersoon(driver).clear();
				SpecificatieAandeelhoudersObjecten.NaamRechtspersoon(driver).sendKeys(invuldata[29]);

				SpecificatieAandeelhoudersObjecten.StraatnaamRechtspersoon(driver).clear();
				SpecificatieAandeelhoudersObjecten.StraatnaamRechtspersoon(driver).sendKeys(invuldata[30]);

				SpecificatieAandeelhoudersObjecten.HuisnummerRechtspersoon(driver).clear();
				SpecificatieAandeelhoudersObjecten.HuisnummerRechtspersoon(driver).sendKeys(invuldata[31]);

				SpecificatieAandeelhoudersObjecten.ToevHuisnummerRechtspersoon(driver).clear();
				SpecificatieAandeelhoudersObjecten.ToevHuisnummerRechtspersoon(driver).sendKeys(invuldata[32]);

				SpecificatieAandeelhoudersObjecten.VestigingsplaatsRechtspersoon(driver).clear();
				SpecificatieAandeelhoudersObjecten.VestigingsplaatsRechtspersoon(driver).sendKeys(invuldata[33]);

				SpecificatieAandeelhoudersObjecten.VestigingslandRechtspersoon(driver).sendKeys(invuldata[34]);

			}
		}

	}

	@Then("^i can validate the error messages for the Specificatie Aandeelhouders form$")
	public void i_can_validate_the_error_messages_for_the_Specificatie_Aandeelhouders_form() throws Throwable {

		Thread.sleep(1000);

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		ValidatieResultaat.clear();

		// naam aandeelhouders
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NaamAandeelhouder", 1, 70, "TextVeld", driver));

		// BSN
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BSN", 9, 9, "BSN", driver));

		if (driver.findElement(By.id("idCWNLShareholder-no")).isSelected()) {
			// Straatnaam
			ValidatieResultaat.addAll(
					codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Straatnaam", 1, 23, "TextVeld", driver));

			// Huisnummer
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Huisnummer", 1, 5,
					"PositiefGetal", driver));

			// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Postcode",
			// 1, 6, "TextVeld", driver));

			// Huisnummer toev
			ValidatieResultaat.addAll(
					codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("HuisnrToev", 1, 4, "TextVeld", driver));

			// Huisnummer buitenlands adres
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("HuisnummerBuitenl", 1, 9,
					"TextVeld", driver));

			// Woonplaats
			ValidatieResultaat.addAll(
					codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("Woonplaats", 1, 24, "TextVeld", driver));

		}
		// nominale waarde aandelen

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardeAandelen", 1,
				20, "GeheelGetal", driver));

		// Nominale waarde preferente aandelen einde boekjaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardePreferente", 1,
				20, "GeheelGetal", driver));

		// Nominale waarde prioriteitsaandelen einde boekjaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NominalewaardePrioriteits", 1,
				20, "GeheelGetal", driver));

		// Percentage nominaal geplaatst kapitaal - FIXEN !!
		/// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("",
		// 1, 20, "Procent", driver));

		// Vordering belastingplichtige op aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("VorderingBelastingplichtige",
				1, 20, "PositiefGeheelGetal", driver));

		// Schuld belastingplichtige aan aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("SchuldBelastingplichtige", 1,
				20, "PositiefGeheelGetal", driver));

		// In het boekjaar ontvangen rente van de aandeelhouder
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BoekjaarOntvangenRente", 1,
				20, "PositiefGeheelGetal", driver));

		// boekjaar betaalde rente
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("BoekjaarBetaaldeRente", 1, 20,
				"PositiefGeheelGetal", driver));

		if (driver.findElement(By.id("idn26n68gz")).isSelected()) {

			// informele kapitaalstorting

			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecAandeelhouders("BedragInformeleKapitaalStorting", 1, 20, "PositiefGetal", driver));

			// mening informele kapitaal storting
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecAandeelhouders("WaaromInformeleKapitaalstorting", 1, 254, "TextVeld", driver));

			// Naam Uiteindelijke moedermaatschappij
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NaamMoedermaatschappij",
					1, 200, "TextVeld", driver));

			// moeder maatschappij Straatnaam
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecAandeelhouders("MoederMaatschappijStraatnaam", 1, 24, "TextVeld", driver));

			// moeder maatschappij huisnummer
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecAandeelhouders("MoederMaatschappijHuisnummer", 1, 5, "PositiefGetal", driver));

			// moeder maatschappij huisnummer toev
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecAandeelhouders("MoederMaatschappijHuisnummerToev", 1, 4, "TextVeld", driver));

			// moeder maatschappij vestigingsplaats
			ValidatieResultaat.addAll(codebase.TooltipChecker
					.CheckTooltipSpecAandeelhouders("MoederMaatschappijVestigingsplaats", 1, 24, "TextVeld", driver));

			// Rechtspersoon

			if (driver.findElement(By.id("idn26n68h8-no")).isSelected()) {

				ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipSpecAandeelhouders("NaamRechtspersoon", 1,
						200, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker
						.CheckTooltipSpecAandeelhouders("StraatnaamRechtspersoon", 1, 24, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker
						.CheckTooltipSpecAandeelhouders("HuisnummerRechtspersoon", 1, 20, "Positief6", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker
						.CheckTooltipSpecAandeelhouders("ToevHuisnummerRechtspersoon", 1, 4, "TextVeld", driver));
				ValidatieResultaat.addAll(codebase.TooltipChecker
						.CheckTooltipSpecAandeelhouders("VestigingsplaatsRechtspersoon", 1, 24, "TextVeld", driver));

			}

		}

		// als validatieresultaat niet leeg is dan melding genereren.
		// System.out.println("Validatie resultaat: " + ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Specificatie Deelnemingen$")
	public void open_the_form_Specificatie_Deelnemingen() throws Throwable {

		NavigerenObjecten.NavigerenSpecificatie_Deelnemingen(driver).click();

		/*
		 * //nieuwe tab maken JavascriptExecutor js =
		 * (JavascriptExecutor)driver; js.executeScript(
		 * "angular.element(document.body).injector().get('repeatFormService').createNewRepeatForm('vpbspecdeel')"
		 * );
		 */

		// Button New aanklikken
		// driver.findElement(By.xpath("//button[contains(.,'New')]")).click();

	}

	@Then("^i can fill out the form Specificatie Deelnemingen with configId (\\d+)$")
	public void i_can_fill_out_the_form_Specificatie_Deelnemingen_with_configId(int Tcid) throws Throwable {

		String[] invuldata = codebase.SpecificatieDeelnemingenXLS.HaalData(Tcid);

		// if (Tcid == 2) {
		// WebElement mySelectElm =
		// driver.findElement(By.cssSelector("[ng-model='currentRepeatForm']"));
		// Select mySelect = new Select(mySelectElm);
		// mySelect.selectByVisibleText("002 Specificatie Deelnemingen");
		// }

		// algemene vragen
		SpecificatieDeelnemingenObjecten.NaamDeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.NaamDeelneming(driver).sendKeys(invuldata[1]);
		SpecificatieDeelnemingenObjecten.RSINdeelneming(driver).clear();
		SpecificatieDeelnemingenObjecten.RSINdeelneming(driver).sendKeys(invuldata[2]);

		SpecificatieDeelnemingenObjecten.Straatnaam(driver).clear();
		SpecificatieDeelnemingenObjecten.Straatnaam(driver).sendKeys(invuldata[6]);
		SpecificatieDeelnemingenObjecten.Huisnummer(driver).clear();
		SpecificatieDeelnemingenObjecten.Huisnummer(driver).sendKeys(invuldata[7]);

		try {
			int n = Integer.parseInt(invuldata[2].replaceAll("\\.", ""));
			if (!Elfproef.isValidBSN(n)) {
				SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).clear();
				SpecificatieDeelnemingenObjecten.VestigingsplaatsDeelneming(driver).sendKeys(invuldata[3]);
				SpecificatieDeelnemingenObjecten.VestigingsLandDeelneming(driver).sendKeys(invuldata[4]);
			}
		} catch (NumberFormatException e) {
			System.out.println("ingevulde RSIN is geen getal");
		}

		SpecificatieDeelnemingenObjecten.HuisnummerBuitenlandsAdres(driver).clear();
		SpecificatieDeelnemingenObjecten.HuisnummerBuitenlandsAdres(driver).sendKeys(invuldata[8]);

		SpecificatieDeelnemingenObjecten.PercentageAandelenbezit(driver).clear();
		SpecificatieDeelnemingenObjecten.PercentageAandelenbezit(driver).sendKeys(invuldata[5]);
		// Schulden en vorderingen

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

		// Vragen inzake deelnemingen

		// Is de deelneming in het boekjaar gevoegd in en/ of ontvoegd uit een
		// fiscale eenheid met de belastingplichtige?
		if (invuldata[17].equals("ja")) {
			SpecificatieDeelnemingenObjecten.DeelnemingGevoegd_Ja(driver).click();
			SpecificatieDeelnemingenObjecten.Voegingsdatum(driver).sendKeys(invuldata[18]);
			SpecificatieDeelnemingenObjecten.Ontvoegingsdatum(driver).sendKeys(invuldata[19]);
		} else {
			SpecificatieDeelnemingenObjecten.DeelnemingGevoegd_Nee(driver).click();
		}

		// Is de deelneming in het boekjaar verworven of is het belang in de
		// deelneming in het boekjaar vergroot?

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

		} else {
			SpecificatieDeelnemingenObjecten.DeelnemingVerworven_Nee(driver).click();
		}

		// Is de deelneming in het boekjaar vervreemd of is het belang in de
		// deelneming in het boekjaar verkleind?

		if (invuldata[27].equals("ja")) {
			SpecificatieDeelnemingenObjecten.DeelnemingVervreemd_Ja(driver).click();
			Thread.sleep(300);
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
		} else {
			SpecificatieDeelnemingenObjecten.DeelnemingVervreemd_Nee(driver).click();
		}

		if (invuldata[33].equals("ja")) {
			SpecificatieDeelnemingenObjecten.DeelnemingGeliquideerd_Ja(driver).click();
			SpecificatieDeelnemingenObjecten.VereffeningsdatumDeelneming(driver).sendKeys(invuldata[34]);
			SpecificatieDeelnemingenObjecten.LiquidatieVerliesDeelneming(driver).clear();
			SpecificatieDeelnemingenObjecten.LiquidatieVerliesDeelneming(driver).sendKeys(invuldata[35]);
		} else {

			SpecificatieDeelnemingenObjecten.DeelnemingGeliquideerd_Nee(driver).click();
		}

		// nog even op terugkomen. geen keuze if loop geimplementeerd
		SpecificatieDeelnemingenObjecten.WaarderingsvoorschriftArt13_Ja(driver).click();

		// Is de deelneming een als belegging gehouden deelneming niet zijnde
		// een kwalificerende beleggingsdeelneming?

		if (invuldata[37].equals("ja")) {

			SpecificatieDeelnemingenObjecten.DeelnemingNietKwalificerende_Ja(driver).click();

			SpecificatieDeelnemingenObjecten.WaardeEconomischVerkeer(driver).clear();
			SpecificatieDeelnemingenObjecten.WaardeEconomischVerkeer(driver).sendKeys(invuldata[38]);

			if (invuldata[39].equals("ja")) {
				SpecificatieDeelnemingenObjecten.BelangDeelnemingGedaald25Procent_Ja(driver).click();
			} else {
				SpecificatieDeelnemingenObjecten.BelangDeelnemingGedaald25Procent_Nee(driver).click();
			}

			SpecificatieDeelnemingenObjecten.Waarde25ProcentMutatie(driver).clear();
			SpecificatieDeelnemingenObjecten.Waarde25ProcentMutatie(driver).sendKeys(invuldata[38]);
			SpecificatieDeelnemingenObjecten.BedragBruteringVoordeel(driver).clear();
			SpecificatieDeelnemingenObjecten.BedragBruteringVoordeel(driver).sendKeys(invuldata[39]);
		}

		// Verkapt divident radio button - onderin het scherm verschijnen 2
		// verschillende invul tabellen
		if (invuldata[40].equals("ja")) {
			SpecificatieDeelnemingenObjecten.VerkaptDivident_ja(driver).click();
		} else {
			SpecificatieDeelnemingenObjecten.VerkaptDivident_nee(driver).click();
		}

		// beleggingsdeelneming
		if (invuldata[41].equals("ja")) {
			SpecificatieDeelnemingenObjecten.BeleggingsdeelnemingEULidstaat_Ja(driver).click();
			if (invuldata[42].equals("ja")) {
				SpecificatieDeelnemingenObjecten.VerzoektVerrekening_Ja(driver).click();
			} else {
				SpecificatieDeelnemingenObjecten.VerzoektVerrekening_Nee(driver).click();
			}

			if (invuldata[43].equals("ja")) {
				SpecificatieDeelnemingenObjecten.VerzoektAfwijkendeVerrekening_Ja(driver).click();
			} else {
				SpecificatieDeelnemingenObjecten.VerzoektAfwijkendeVerrekening_Nee(driver).click();
			}
		} else {
			SpecificatieDeelnemingenObjecten.BeleggingsdeelnemingEULidstaat_Nee(driver).click();
		}

		// if (invuldata[44].equals("ja")) {
		// SpecificatieDeelnemingenObjecten.Meerdan99Deelnemingen_Ja(driver).click();
		// SpecificatieDeelnemingenObjecten.ToelichtingMeerdan99Deelnemingen(driver).sendKeys(invuldata[45]);
		// } else {
		// SpecificatieDeelnemingenObjecten.Meerdan99Deelnemingen_Nee(driver).click();
		// }

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
			} else {
				SpecificatieDeelnemingenObjecten.DirecteDeelnemingOntgaan_nee(driver).click();
			}

			// Is het uw directe deelneming die zich het voordeel heeft laten
			// ontgaan?

			if (invuldata[60].equals("nee")) {
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
	}

	@When("^open the form Winst en Verlies rekening$")
	public void open_the_form_Winst_en_Verlies_rekening() throws Throwable {

		NavigerenObjecten.NavigerenWinstEnVerliesRekening(driver).click();

	}

	@Then("^i can fill out the form Winst en Verlies rekening from tab \"(.*?)\"$")
	public void i_can_fill_out_the_form_Winst_en_Verlies_rekening_from_tab(String Tab) throws Throwable {

		// bedrijfsopbrengsten

		WinstenVerliesRekeningObjecten.NettoOmzetCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.NettoOmzetCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B", 7, Tab));

		WinstenVerliesRekeningObjecten.NettoOmzetCF(driver).clear();
		WinstenVerliesRekeningObjecten.NettoOmzetCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 7, Tab));

		WinstenVerliesRekeningObjecten.WijzigingVoorraadCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 8, Tab));

		WinstenVerliesRekeningObjecten.WijzigingVoorraadCF(driver).clear();
		WinstenVerliesRekeningObjecten.WijzigingVoorraadCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 8, Tab));

		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 9, Tab));

		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCF(driver).clear();
		WinstenVerliesRekeningObjecten.GeactiveerdeProductieCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 9, Tab));

		WinstenVerliesRekeningObjecten.OverigeOpbrengstenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 10, Tab));

		WinstenVerliesRekeningObjecten.OverigeOpbrengstenProductieCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeOpbrengstenProductieCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 10, Tab));

		// Kosten grond en hulpstoffen

		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 20, Tab));

		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenGrondHulpstoffenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 20, Tab));

		WinstenVerliesRekeningObjecten.KostenUitbesteedCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenUitbesteedCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 21, Tab));

		WinstenVerliesRekeningObjecten.KostenUitbesteedCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenUitbesteedCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 21, Tab));

		// Personeelskosten

		WinstenVerliesRekeningObjecten.LonenSalarissenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.LonenSalarissenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 27, Tab));

		WinstenVerliesRekeningObjecten.LonenSalarissenCF(driver).clear();
		WinstenVerliesRekeningObjecten.LonenSalarissenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 27, Tab));

		WinstenVerliesRekeningObjecten.SocialeLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.SocialeLastenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 28, Tab));

		WinstenVerliesRekeningObjecten.SocialeLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.SocialeLastenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 28, Tab));

		WinstenVerliesRekeningObjecten.PensioenLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.PensioenLastenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 29, Tab));

		WinstenVerliesRekeningObjecten.PensioenLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.PensioenLastenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 29, Tab));

		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 30, Tab));

		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigePersoneelskostenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 30, Tab));

		 WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B",33, Tab));
		 WinstenVerliesRekeningObjecten.OntvangenUitkeringenenLoonsubsidiesCF(driver).sendKeys(WinstVerliesXLS.HaalData("C",33, Tab));

		// Afschrijvingen

		WinstenVerliesRekeningObjecten.GoodWillCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.GoodWillCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B", 39, Tab));

		WinstenVerliesRekeningObjecten.GoodWillCF(driver).clear();
		WinstenVerliesRekeningObjecten.GoodWillCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 39, Tab));

		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 40, Tab));

		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeImmaterieleActivaCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 40, Tab));

		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 41, Tab));

		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCF(driver).clear();
		WinstenVerliesRekeningObjecten.BedrijfsgebouwenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 41, Tab));

		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 42, Tab));

		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCF(driver).clear();
		WinstenVerliesRekeningObjecten.MachinesenInstallatiesCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 42, Tab));

		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 43, Tab));

		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCF(driver).clear();
		WinstenVerliesRekeningObjecten.AndereVasteBedrijfsmiddelenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 43, Tab));

		// Overige waardeverandering van immateriele en materiele vaste activa

		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 49, Tab));

		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeWaardeveranderingCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 49, Tab));

		// Bijzondere waardevermindering van vlottende activa

		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 54, Tab));

		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingVlottendeActivaCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 54, Tab));

		// Overige bedrijfskosten

		WinstenVerliesRekeningObjecten.TransportKostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.TransportKostenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 58, Tab));

		WinstenVerliesRekeningObjecten.TransportKostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.TransportKostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 58, Tab));

		WinstenVerliesRekeningObjecten.HuisvestingkostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.HuisvestingkostenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 59, Tab));

		WinstenVerliesRekeningObjecten.HuisvestingkostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.HuisvestingkostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 59, Tab));

		WinstenVerliesRekeningObjecten.OnderhoudOverigCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OnderhoudOverigCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 60, Tab));

		WinstenVerliesRekeningObjecten.OnderhoudOverigCF(driver).clear();
		WinstenVerliesRekeningObjecten.OnderhoudOverigCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 60, Tab));

		WinstenVerliesRekeningObjecten.VerkoopKostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.VerkoopKostenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 61, Tab));

		WinstenVerliesRekeningObjecten.VerkoopKostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.VerkoopKostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 61, Tab));

		WinstenVerliesRekeningObjecten.AndereKostenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AndereKostenCommercieel(driver).sendKeys(WinstVerliesXLS.HaalData("B", 62, Tab));

		WinstenVerliesRekeningObjecten.AndereKostenCF(driver).clear();
		WinstenVerliesRekeningObjecten.AndereKostenCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 62, Tab));

		// Financiele baten en lasten

		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 73, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordMaatschCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 73, Tab));

		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 74, Tab));

		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCF(driver).clear();
		WinstenVerliesRekeningObjecten.KwijtscheldingswinstCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 74, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 75, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstVordParticipantCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 75, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 76, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstOverigeVordCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 76, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 77, Tab));

		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCF(driver).clear();
		WinstenVerliesRekeningObjecten.OpbrengstBanktegoedCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 77, Tab));

		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 78, Tab));

		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCF(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingVorderingenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 78, Tab));

		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 79, Tab));

		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCF(driver).clear();
		WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 79, Tab));

		WinstenVerliesRekeningObjecten.OntvangenDividendCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenDividendCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 80, Tab));

		WinstenVerliesRekeningObjecten.OntvangenDividendCF(driver).clear();
		WinstenVerliesRekeningObjecten.OntvangenDividendCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 80, Tab));

		// Financiele lasten

		WinstenVerliesRekeningObjecten.KostenParticipantCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenParticipantCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 86, Tab));

		WinstenVerliesRekeningObjecten.KostenParticipantCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenParticipantCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 86, Tab));

		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 87, Tab));

		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 87, Tab));

		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 88, Tab));

		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCF(driver).clear();
		WinstenVerliesRekeningObjecten.KostenSchuldenGroepsmaatschappijenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 88, Tab));

		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("E", 96, Tab));

		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCF(driver).clear();
		WinstenVerliesRekeningObjecten.ResultaatDeelnemingenCF(driver).sendKeys(WinstVerliesXLS.HaalData("F", 96, Tab));

		// Buitengewone bedrijfsbaten

		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 102, Tab));

		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCF(driver).clear();
		WinstenVerliesRekeningObjecten.VoordelenOntvoegingDochterMaatschCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 102, Tab));

		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 103, Tab));

		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneBatenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 103, Tab));

		WinstenVerliesRekeningObjecten.BoekWinstActivaCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.BoekWinstActivaCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 104, Tab));

		WinstenVerliesRekeningObjecten.BoekWinstActivaCF(driver).clear();
		WinstenVerliesRekeningObjecten.BoekWinstActivaCF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 104, Tab));

		// Buitengewone bedrijfslasten

		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 109, Tab));

		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCF(driver).clear();
		WinstenVerliesRekeningObjecten.AfboekingHerinvesteringsReserveCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 109, Tab));

		WinstenVerliesRekeningObjecten.UitkeringenANBICommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.UitkeringenANBICommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 110, Tab));

		WinstenVerliesRekeningObjecten.UitkeringenANBICF(driver).clear();
		WinstenVerliesRekeningObjecten.UitkeringenANBICF(driver).sendKeys(WinstVerliesXLS.HaalData("C", 110, Tab));

		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCommercieel(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCommercieel(driver)
				.sendKeys(WinstVerliesXLS.HaalData("B", 111, Tab));

		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCF(driver).clear();
		WinstenVerliesRekeningObjecten.OverigeBuitenGewoneLastenCF(driver)
				.sendKeys(WinstVerliesXLS.HaalData("C", 111, Tab));

		// WinstenVerliesRekeningObjecten.SaldoFiscWinstBerFiscaal(driver).click();

	}

	@Then("^i can validate the totals for each column from tab \"(.*?)\"$")
	public void i_can_validate_the_totals_for_each_column_from_tab(String Tab) throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// Bedrijfsopbrengsten

		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.NettoOmzetFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 7, Tab)), "D7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.WijzigingVoorraadOnderhWerkFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 8, Tab)), "D8"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.GeactiveerdeProdFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 9, Tab)), "D9"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.OverigeOpbrFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 10, Tab)), "D10"));

		// Totaal Bedrijfsopbrengsten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBedrOpbrCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("E", 13, Tab)), "E13"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBedrOpbrCF(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("F", 13, Tab)), "F13"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalBedrOpbrFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("G", 13, Tab)), "G13"));

		// Kosten grond- en hulpstoffen, uitbesteed werk en dergelijke

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.KostenGrondHulpStFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 20, Tab)), "D20"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.KostenUitbesteedWerkFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 21, Tab)), "D21"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalKostenGrondHulpstCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 22, Tab)), "B22"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalKostenGrondHulpstCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("C", 22, Tab)), "C22"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalKostenGrondHulpstFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 22, Tab)), "D22"));

		// Personeelskosten

		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.LonenSalarissenFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 27, Tab)), "D27"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.SocialeLastenFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 28, Tab)), "D28"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.PensioenLastenFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 29, Tab)), "D29"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OverigePersoneelsKostenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 30, Tab)), "D30"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OntvUitkeringLoonSubsFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 31, Tab)), "D31"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalPersKostenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 32, Tab)), "B32"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalPersKostenCF(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("C", 32, Tab)), "C32"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalPersKostenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 32, Tab)), "D32"));

		// Afschrijvingen

		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.GoodWillFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 39, Tab)), "D39"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OverigeImmaterielActFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 40, Tab)), "D40"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.BedrijfsgebouwenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 41, Tab)), "D41"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.MachinesInstallatiesFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 42, Tab)), "D42"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.AndereVasteActFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 43, Tab)), "D43"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalAfschrijvCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 44, Tab)), "B44"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalAfschrijvCF(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("C", 44, Tab)), "C44"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalAfschrijvFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 44, Tab)), "D44"));

		// Overige waardeveranderingen van immateriele en materiele vaste activa

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OverigeWaardeVeranderingFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 49, Tab)), "D49"));

		// Bijzondere waardevermindering van vlottende activa

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.BijzondereWaardeVerminderingFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 54, Tab)), "D54"));

		// Overige bedrijfskosten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.AutoTransportKostenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 58, Tab)), "D58"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.HuisvestingsKostenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 59, Tab)), "D59"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.onderhoudOverigeMatrActFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 60, Tab)), "D60"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.VerkoopkostenFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 61, Tab)), "D61"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.AndereKostenFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 60, Tab)), "D60"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaaloverigeBedrKostenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 63, Tab)), "B63"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaaloverigeBedrKostenCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("C", 63, Tab)), "C63"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaaloverigeBedrKostenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 63, Tab)), "D63"));

		// Financiele Baten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OpbrengstVordGroepMaatschFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 73, Tab)), "D73"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.KwijtscheldingsWinstFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 74, Tab)), "D74"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OpbrengstVordParticipantFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 75, Tab)), "D75"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OpbrengstOverigeVordFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 76, Tab)), "D76"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OpbrengstBanktegoedFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 77, Tab)), "D77"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.WaardeVeranderingVordFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 78, Tab)), "D78"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.WaardeVeranderingEffectenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 79, Tab)), "D79"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OntvangenDividentFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 80, Tab)), "D80"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaleFinancieleBatenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 81, Tab)), "B81"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaleFinancieleBatenCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("C", 81, Tab)), "C81"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaleFinancieleBatenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 81, Tab)), "D81"));

		// Financiele Lasten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.KostenSchuldenParticipantFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 86, Tab)), "D86"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.KostenSchuldenRentelastenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 87, Tab)), "D87"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.KostenSchuldenGroepsMaatschFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 88, Tab)), "D88"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalFinLastenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 89, Tab)), "B89"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalFinLastenCF(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("C", 89, Tab)), "C89"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.TotaalFinLastenFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 89, Tab)), "D89"));

		// Totaal financiele baten en lasten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalfinancieleBatenLastenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("E", 92, Tab)), "E92"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalfinancieleBatenLastenCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("F", 92, Tab)), "F92"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalfinancieleBatenLastenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 92, Tab)), "G92"));

		// Resultaat uit gewone bedrijfsuitoefening

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.ResultaatGewoneBedrijfsuitoefCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("E", 93, Tab)), "E93"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.ResultaatGewoneBedrijfsuitoefCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("F", 93, Tab)), "F93"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.ResultaatGewoneBedrijfsuitoefFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 93, Tab)), "G93"));

		// Resultaat uit deelnemingen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.ResultaatDeelnemingFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 96, Tab)), "G96"));

		// Buitengewone bedrijfsbaten en lasten ****

		// Buitengewone bedrijfsbaten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.VoordelenOntvoegDochterFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 102, Tab)), "D102"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OverigeBuitenGewBatenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 103, Tab)), "D103"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.BoekwinstActivaFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 104, Tab)), "D104"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBuitenGewBedrijfsBatenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 105, Tab)), "B105"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBuitenGewBedrijfsBatenCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("C", 105, Tab)), "C105"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBuitenGewBedrijfsBatenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 105, Tab)), "D105"));

		// Buitengewone bedrijfslasten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.AfboekenHerinvesteringReserveFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 109, Tab)), "D109"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.UitkeringANBIFiscaal(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("D", 110, Tab)), "D110"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.OverigeBuitengewoneLastenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 111, Tab)), "D111"));

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBuitengewBedrLastenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("B", 112, Tab)), "B112"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBuitengewBedrLastenCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("C", 112, Tab)), "C112"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.TotaalBuitengewBedrLastenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("D", 112, Tab)), "D112"));

		// Buitengewone resultaten

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.BuitenGewoneResultatenCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("E", 115, Tab)), "E115"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.BuitenGewoneResultatenCF(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("F", 115, Tab)), "F115"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.BuitenGewoneResultatenFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 115, Tab)), "G115"));

		// Saldo fiscale winstberekening

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.SaldoFiscWinstBerCommercieel(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("E", 120, Tab)), "E120"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(WinstenVerliesRekeningObjecten.SaldoFiscWinstBerCF(driver).getAttribute("value"),
						Double.parseDouble(WinstVerliesXLS.HaalData("F", 120, Tab)), "F120"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				WinstenVerliesRekeningObjecten.SaldoFiscWinstBerFiscaal(driver).getAttribute("value"),
				Double.parseDouble(WinstVerliesXLS.HaalData("G", 120, Tab)), "G120"));

		System.out.println(ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Balans Activa$")
	public void open_the_form_Balans_Activa() throws Throwable {

		NavigerenObjecten.BalansActiva(driver).click();

	}

	@Then("^i can validate the error messages for the Winst en Verlies rekening form from tab \"(.*?)\"$")
	public void i_can_validate_the_error_messages_for_the_Winst_en_Verlies_rekening_form_from_tab(String arg1)
			throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);", "");

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipVerliesWinst("NettoOmzetFiscaal", 1, 20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("GeactiveerdeProdFiscaal", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipVerliesWinst("OverigeOpbrFiscaal", 1, 20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OpbrengstVordGroepMaatschFiscaal",
				1, 20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("KwijtscheldingsWinstFiscaal", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OpbrengstVordParticipantFiscaal", 1,
				20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OpbrengstOverigeVordFiscaal", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OpbrengstBanktegoedFiscaal", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OntvangenDividentFiscaal", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("VoordelenOntvoegDochterFiscaal", 1,
				20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OverigeBuitenGewBatenFiscaal", 1,
				20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("AfboekenHeringReserveFiscaal", 1,
				20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("UitkeringANBIFiscaal", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesWinst("OverigeBuitengewoneLastenFiscaal",
				1, 20, "PositiefGetal", driver));

		// System.out.println(ValidatieResultaat);
		assertTrue(ValidatieResultaat.isEmpty());
	}

	@Then("^i can fill out the form Balans Activa from tab \"(.*?)\"$")
	public void i_can_fill_out_the_form_Balans_Activa_from_tab(String Tab) throws Throwable {

		
		// uitklappen Immateriële vaste activa
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiIva2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}
		
		
		BalansActivaObjecten.OmschrijvingActiviteit(driver).clear();
		BalansActivaObjecten.OmschrijvingActiviteit(driver).sendKeys(BalansActivaXLS.HaalText(6, Tab));

		String[] DochterMaatsch = codebase.BalansActivaXLS.HaalText(7, Tab);

		if (DochterMaatsch[0].equals("Ja")) {
			BalansActivaObjecten.DochterMaatschappij_Ja(driver).click();
		} else {
			BalansActivaObjecten.DochterMaatschappij_Nee(driver).click();
		}

		String[] BoekjaarAgr = codebase.BalansActivaXLS.HaalText(8, "TC01");

		if (BoekjaarAgr[0].equals("Ja")) {
			BalansActivaObjecten.BoekjaarAgrarische_ja(driver).click();
		} else {
			BalansActivaObjecten.BoekjaarAgrarische_nee(driver).click();
		}

		// goodwill fiscaal

		BalansActivaObjecten.GoodwillAanschaf(driver).clear();
		BalansActivaObjecten.GoodwillAanschaf(driver).sendKeys(BalansActivaXLS.HaalData("B", 16, Tab));

		BalansActivaObjecten.GoodwillCommercieel_1_1(driver).clear();
		BalansActivaObjecten.GoodwillCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 16, Tab));

		BalansActivaObjecten.GoodwillFiscaal_1_1(driver).clear();
		BalansActivaObjecten.GoodwillFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 16, Tab));

		BalansActivaObjecten.GoodwillCommercieel_31_12(driver).clear();
		BalansActivaObjecten.GoodwillCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 16, Tab));

		BalansActivaObjecten.GoodwillCF(driver).clear();
		BalansActivaObjecten.GoodwillCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 16, Tab));

		// Overige immateriele vaste activa
		BalansActivaObjecten.OverigeImmaterieleAanschaf(driver).clear();
		BalansActivaObjecten.OverigeImmaterieleAanschaf(driver).sendKeys(BalansActivaXLS.HaalData("B", 17, Tab));

		BalansActivaObjecten.OverigeImmaterieleCommercieel_1_1(driver).clear();
		BalansActivaObjecten.OverigeImmaterieleCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 17, Tab));

		BalansActivaObjecten.OverigeImmaterieleFiscaal_1_1(driver).clear();
		BalansActivaObjecten.OverigeImmaterieleFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 17, Tab));

		BalansActivaObjecten.OverigeImmaterieleCommercieel_31_12(driver).clear();
		BalansActivaObjecten.OverigeImmaterieleCommercieel_31_12(driver)
				.sendKeys(BalansActivaXLS.HaalData("E", 17, Tab));

		BalansActivaObjecten.OverigeImmaterieleCF(driver).clear();
		BalansActivaObjecten.OverigeImmaterieleCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 17, Tab));

		
		
//		// uitklappen Materiële vaste activa
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiMva2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}
		
		// Gebouwen en terreinen
		BalansActivaObjecten.GebouwenTerreinenCommercieel_1_1(driver).clear();
		BalansActivaObjecten.GebouwenTerreinenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 26, Tab));

		BalansActivaObjecten.GebouwenTerreinenFiscaal_1_1(driver).clear();
		BalansActivaObjecten.GebouwenTerreinenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 26, Tab));

		BalansActivaObjecten.GebouwenTerreinenCommercieel_31_12(driver).clear();
		BalansActivaObjecten.GebouwenTerreinenCommercieel_31_12(driver)
				.sendKeys(BalansActivaXLS.HaalData("E", 26, Tab));

		BalansActivaObjecten.GebouwenTerreinenCF(driver).clear();
		BalansActivaObjecten.GebouwenTerreinenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 26, Tab));

		// Machines en installaties
		BalansActivaObjecten.MachinesCommercieel_1_1(driver).clear();
		BalansActivaObjecten.MachinesCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 27, Tab));

		BalansActivaObjecten.MachinesFiscaal_1_1(driver).clear();
		BalansActivaObjecten.MachinesFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 27, Tab));

		BalansActivaObjecten.MachinesCommercieel_31_12(driver).clear();
		BalansActivaObjecten.MachinesCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 27, Tab));

		BalansActivaObjecten.MachinesCF(driver).clear();
		BalansActivaObjecten.MachinesCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 27, Tab));

		// Andere vaste bedrijfsmiddelen
		BalansActivaObjecten.AndereBedrijfsCommercieel_1_1(driver).clear();
		BalansActivaObjecten.AndereBedrijfsCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 28, Tab));

		BalansActivaObjecten.AndereBedrijfsFiscaal_1_1(driver).clear();
		BalansActivaObjecten.AndereBedrijfsFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 28, Tab));

		BalansActivaObjecten.AndereBedrijfsCommercieel_31_12(driver).clear();
		BalansActivaObjecten.AndereBedrijfsCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 28, Tab));

		BalansActivaObjecten.AndereBedrijfsCF(driver).clear();
		BalansActivaObjecten.AndereBedrijfsCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 28, Tab));

		
		// Financiële vaste activa
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiFva2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}
		
		
		// Deelnemingen

		BalansActivaObjecten.DeelnemingenCommercieel_1_1(driver).clear();
		BalansActivaObjecten.DeelnemingenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 37, Tab));

		BalansActivaObjecten.DeelnemingenFiscaal_1_1(driver).clear();
		BalansActivaObjecten.DeelnemingenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 37, Tab));

		BalansActivaObjecten.DeelnemingenCommercieel_31_12(driver).clear();
		BalansActivaObjecten.DeelnemingenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 37, Tab));

		BalansActivaObjecten.DeelnemingenCF(driver).clear();
		BalansActivaObjecten.DeelnemingenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 37, Tab));

		// Langlopende vorderingen op groepsmaatschappijen

		BalansActivaObjecten.langlopendevordGroepsNominaleWaarde(driver).clear();
		BalansActivaObjecten.langlopendevordGroepsNominaleWaarde(driver)
				.sendKeys(BalansActivaXLS.HaalData("B", 38, Tab));

		BalansActivaObjecten.langlopendevordGroepsCommercieel_1_1(driver).clear();
		BalansActivaObjecten.langlopendevordGroepsCommercieel_1_1(driver)
				.sendKeys(BalansActivaXLS.HaalData("C", 38, Tab));

		BalansActivaObjecten.langlopendevordGroepsFiscaal_1_1(driver).clear();
		BalansActivaObjecten.langlopendevordGroepsFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 38, Tab));

		BalansActivaObjecten.langlopendevordGroepsCommercieel_31_12(driver).clear();
		BalansActivaObjecten.langlopendevordGroepsCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 38, Tab));

		BalansActivaObjecten.langlopendevordGroepsCF(driver).clear();
		BalansActivaObjecten.langlopendevordGroepsCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 38, Tab));

		// Langlopende vorderingen participanten/maatschappijen

		BalansActivaObjecten.langlopendevordPartNominaleWaarde(driver).clear();
		BalansActivaObjecten.langlopendevordPartNominaleWaarde(driver).sendKeys(BalansActivaXLS.HaalData("B", 39, Tab));

		BalansActivaObjecten.langlopendevordPartCommercieel_1_1(driver).clear();
		BalansActivaObjecten.langlopendevordPartCommercieel_1_1(driver)
				.sendKeys(BalansActivaXLS.HaalData("C", 39, Tab));

		BalansActivaObjecten.langlopendevordPartFiscaal_1_1(driver).clear();
		BalansActivaObjecten.langlopendevordPartFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 39, Tab));

		BalansActivaObjecten.langlopendevordPartCommercieel_31_12(driver).clear();
		BalansActivaObjecten.langlopendevordPartCommercieel_31_12(driver)
				.sendKeys(BalansActivaXLS.HaalData("E", 39, Tab));

		BalansActivaObjecten.langlopendevordPartCF(driver).clear();
		BalansActivaObjecten.langlopendevordPartCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 39, Tab));

		// Overige financiele vaste activa

		BalansActivaObjecten.OverigeFinActivaNominaleWaarde(driver).clear();
		BalansActivaObjecten.OverigeFinActivaNominaleWaarde(driver).sendKeys(BalansActivaXLS.HaalData("B", 40, Tab));

		BalansActivaObjecten.OverigeFinActivaCommercieel_1_1(driver).clear();
		BalansActivaObjecten.OverigeFinActivaCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 40, Tab));

		BalansActivaObjecten.OverigeFinActivaFiscaal_1_1(driver).clear();
		BalansActivaObjecten.OverigeFinActivaFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 40, Tab));

		BalansActivaObjecten.OverigeFinActivaCommercieel_31_12(driver).clear();
		BalansActivaObjecten.OverigeFinActivaCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 40, Tab));

		BalansActivaObjecten.OverigeFinActivaCF(driver).clear();
		BalansActivaObjecten.OverigeFinActivaCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 40, Tab));

		// Voorraden, excl onderhanden werk

	
		// Voorraden uitklappen
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiVoo2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}
						
		BalansActivaObjecten.VoorradenExlCommercieel_1_1(driver).clear();
		BalansActivaObjecten.VoorradenExlCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 48, Tab));

		BalansActivaObjecten.VoorradenExlFiscaal_1_1(driver).clear();
		BalansActivaObjecten.VoorradenExlFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 48, Tab));

		BalansActivaObjecten.VoorradenExlCommercieel_31_12(driver).clear();
		BalansActivaObjecten.VoorradenExlCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 48, Tab));

		BalansActivaObjecten.VoorradenExlCF(driver).clear();
		BalansActivaObjecten.VoorradenExlCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 48, Tab));

		// Onderhanden werk

		BalansActivaObjecten.OnderhandenCommercieel_1_1(driver).clear();
		BalansActivaObjecten.OnderhandenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 49, Tab));

		BalansActivaObjecten.OnderhandenFiscaal_1_1(driver).clear();
		BalansActivaObjecten.OnderhandenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 49, Tab));

		BalansActivaObjecten.OnderhandenCommercieel_31_12(driver).clear();
		BalansActivaObjecten.OnderhandenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 49, Tab));

		BalansActivaObjecten.OnderhandenCF(driver).clear();
		BalansActivaObjecten.OnderhandenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 49, Tab));

		// Handelsdebiteuren

		// Voorraden uitklappen
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiVor2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}		
				
		BalansActivaObjecten.HandelsdebiteurenNominale(driver).clear();
		BalansActivaObjecten.HandelsdebiteurenNominale(driver).sendKeys(BalansActivaXLS.HaalData("B", 57, Tab));

		BalansActivaObjecten.HandelsdebiteurenCommericeel_1_1(driver).clear();
		BalansActivaObjecten.HandelsdebiteurenCommericeel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 57, Tab));

		BalansActivaObjecten.HandelsdebiteurenFiscaal_1_1(driver).clear();
		BalansActivaObjecten.HandelsdebiteurenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 57, Tab));

		BalansActivaObjecten.HandelsdebiteurenCommercieel_31_12(driver).clear();
		BalansActivaObjecten.HandelsdebiteurenCommercieel_31_12(driver)
				.sendKeys(BalansActivaXLS.HaalData("E", 57, Tab));

		BalansActivaObjecten.HandelsdebiteurenCF(driver).clear();
		BalansActivaObjecten.HandelsdebiteurenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 57, Tab));

		// Omzetbelasting

		BalansActivaObjecten.OmzetBelastingCommercieel_1_1(driver).clear();
		BalansActivaObjecten.OmzetBelastingCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 58, Tab));

		BalansActivaObjecten.OmzetBelastingFiscaal_1_1(driver).clear();
		BalansActivaObjecten.OmzetBelastingFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 58, Tab));

		BalansActivaObjecten.OmzetBelastingCommercieel_31_12(driver).clear();
		BalansActivaObjecten.OmzetBelastingCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 58, Tab));

		BalansActivaObjecten.OmzetBelastingCF(driver).clear();
		BalansActivaObjecten.OmzetBelastingCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 58, Tab));

		// Kortlopende vorderingen op groepsmaatschappijen

		BalansActivaObjecten.KortVordGroepNominale(driver).clear();
		BalansActivaObjecten.KortVordGroepNominale(driver).sendKeys(BalansActivaXLS.HaalData("B", 59, Tab));

		BalansActivaObjecten.KortVordGroepCommercieel_1_1(driver).clear();
		BalansActivaObjecten.KortVordGroepCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 59, Tab));

		BalansActivaObjecten.KortVordGroepFiscaal_1_1(driver).clear();
		BalansActivaObjecten.KortVordGroepFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 59, Tab));

		BalansActivaObjecten.KortVordGroepCommercieel_31_12(driver).clear();
		BalansActivaObjecten.KortVordGroepCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 59, Tab));

		BalansActivaObjecten.KortVordGroepCF(driver).clear();
		BalansActivaObjecten.KortVordGroepCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 59, Tab));

		// Kortlopende vorderingen participanten/ maatschappijen

		BalansActivaObjecten.KortVordPartNominaal(driver).clear();
		BalansActivaObjecten.KortVordPartNominaal(driver).sendKeys(BalansActivaXLS.HaalData("B", 60, Tab));

		BalansActivaObjecten.KortVordPartCommercieel_1_1(driver).clear();
		BalansActivaObjecten.KortVordPartCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 60, Tab));

		BalansActivaObjecten.KortVordPartFiscaal_1_1(driver).clear();
		BalansActivaObjecten.KortVordPartFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 60, Tab));

		BalansActivaObjecten.KortVordPartCommercieel_31_12(driver).clear();
		BalansActivaObjecten.KortVordPartCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 60, Tab));

		BalansActivaObjecten.KortVordPartCF(driver).clear();
		BalansActivaObjecten.KortVordPartCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 60, Tab));

		// Overige vorderingen

		BalansActivaObjecten.OverigeVordCommercieel_1_1(driver).clear();
		BalansActivaObjecten.OverigeVordCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 61, Tab));

		BalansActivaObjecten.OverigeVordFiscaal_1_1(driver).clear();
		BalansActivaObjecten.OverigeVordFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 61, Tab));

		BalansActivaObjecten.OverigeVordCommercieel_31_12(driver).clear();
		BalansActivaObjecten.OverigeVordCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 61, Tab));

		BalansActivaObjecten.OverigeVordCF(driver).clear();
		BalansActivaObjecten.OverigeVordCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 61, Tab));

		// Effecten
		
		BalansActivaObjecten.EffectenCommercieel_1_1(driver).clear();
		BalansActivaObjecten.EffectenCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 67, Tab));

		BalansActivaObjecten.EffectenFiscaal_1_1(driver).clear();
		BalansActivaObjecten.EffectenFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 67, Tab));

		BalansActivaObjecten.EffectenCommercieel_31_12(driver).clear();
		BalansActivaObjecten.EffectenCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 67, Tab));

		BalansActivaObjecten.EffectenCF(driver).clear();
		BalansActivaObjecten.EffectenCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 67, Tab));

		// liquide middelen

		BalansActivaObjecten.LiquideCommercieel_1_1(driver).clear();
		BalansActivaObjecten.LiquideCommercieel_1_1(driver).sendKeys(BalansActivaXLS.HaalData("C", 72, Tab));

		BalansActivaObjecten.LiquideFiscaal_1_1(driver).clear();
		BalansActivaObjecten.LiquideFiscaal_1_1(driver).sendKeys(BalansActivaXLS.HaalData("D", 72, Tab));

		BalansActivaObjecten.LiquideCommercieel_31_12(driver).clear();
		BalansActivaObjecten.LiquideCommercieel_31_12(driver).sendKeys(BalansActivaXLS.HaalData("E", 72, Tab));

		BalansActivaObjecten.LiquideCF(driver).clear();
		BalansActivaObjecten.LiquideCF(driver).sendKeys(BalansActivaXLS.HaalData("F", 72, Tab));

		// toelichting balans

		BalansActivaObjecten.Toelichtingbalans(driver).clear();
		BalansActivaObjecten.Toelichtingbalans(driver).sendKeys(BalansActivaXLS.HaalText(80, "TC01"));

	}

	@Then("^i can validate the error messages for the Balans Passiva form from tab \"(.*?)\"$")
	public void i_can_validate_the_error_messages_for_the_Balans_Passiva_form_from_tab(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);", "");

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("GestortOpgevraagdFiscaal31_12", 1,
				20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipBalansPassiva("AgioFiscaal31_12", 1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipBalansPassiva("KostenegalisatiereserveFiscaal31_12", 1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("HeringsreserveFiscaal31_12", 1, 20,
				"PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipBalansPassiva("OverigeFiscaleReservesFiscaal31_12", 1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("OverigeVoorzieningFiscaal31_12", 1,
				20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipBalansPassiva("ConverteerbareleningenFiscaal31_12", 1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("SchuldenKredietInstFiscaal31_12",
				1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("ObligatiesFiscaal31_12", 1, 20,
				"PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipBalansPassiva("LanglopendeSchuldenGrMaatschFiscaal31_12", 1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva(
				"LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12", 1, 20, "PositiefGetal", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("OverigeLangLopendeSchFiscaal31_12",
				1, 20, "PositiefGetal", driver));

		// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansPassiva("LanglopendeSchuldenFiscaal31_12",
		// 1, 20, "PositiefGetal", driver));

		System.out.println(ValidatieResultaat);
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@Then("^i can validate the error messages for the Balans Activa form from tab \"(.*?)\"$")
	public void i_can_validate_the_error_messages_for_the_Balans_Activa_form_from_tab(String Tab) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);", "");

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("NaamOnderneming",
		// 1, 200, "TextVeld", driver));
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipBalansActiva("OmschrijvingActiviteit", 1, 70, "TextVeld", driver));

		// goodwill fiscaal

		// aanschaf voortbr kosten
		// Fiscaal 31-12
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("GoodwillFiscaal_31_12", 1, 20,
				"PositiefGetal", driver));

		// overige immateriele vaste activa

		// aanschaf voortbr kosten
		// Fiscaal 31-12
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("OverigeImmaterieleFiscaal_31_12", 1,
				20, "PositiefGetal", driver));

		// Gebouwen en terreinen

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("GebouwenTerreinenFiscaal_31_12", 1,
				20, "PositiefGetal", driver));

		// Machines en installaties
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("MachinesFiscaal_31_12", 1, 20,
				"PositiefGetal", driver));

		// Andere vaste bedrijfsmiddelen
		// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("AndereBedrijfsFiscaal_31_12",
		// 1, 20,"PositiefGetal", driver));

		// Langlopende vorderingen op groepsmaatschappijen

		// nominaal
		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipBalansActiva("langlopendevordGroepsNominaleWaarde", 1, 20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("langlopendevordPartNominaleWaarde",
				1, 20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("OverigeFinActivaNominaleWaarde", 1,
				20, "PositiefGetal", driver));

		// Loze click
		BalansActivaObjecten.DeelnemingenFiscaal_31_12(driver).click();

		// Fiscaal 31-12
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("langlopendevordGroepsFiscaal_31_12",
				1, 20, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("langlopendevordPartFiscaal_31_12",
				1, 20, "PositiefGetal", driver));

		// Overige financi�le vaste activa
		// Nominale waarde
		// Fiscaal 31-12

		// voorraden

		// Voorraden, excl onderhanden werk

		// Onderhanden werk

		// Vorderingen

		// Handelsdebiteuren
		// Nominale waarde

		// scroll down

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("HandelsdebiteurenNominale", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("KortVordGroepNominale", 1, 20,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("KortVordPartNominaal", 1, 20,
				"PositiefGetal", driver));

		// loze click
		BalansActivaObjecten.OverigeVordFiscaal_31_12(driver).click();

		// Fiscaal 31-12

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("HandelsdebiteurenFiscaal_31_12", 1,
				20, "PositiefGetal", driver));

		// Kortlopende vorderingen op groepsmaatschappijen

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("KortVordGroepFiscaal_31_12", 1, 20,
				"PositiefGetal", driver));

		// Kortlopende vorderingen participanten/ maatschappijen

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("KortVordPartFiscaal_31_12", 1, 20,
				"PositiefGetal", driver));

		// Overige vorderingen

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("OverigeVordFiscaal_31_12", 1, 20,
				"PositiefGetal", driver));

		// Effecten

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipBalansActiva("EffectenFiscaal_31_12", 1, 20,
				"PositiefGetal", driver));

		// Liquide middelen

		// Toelichting balans activa

		// System.out.println("Validatie resultaat: " + ValidatieResultaat);
		// driver.quit();

		assertTrue(ValidatieResultaat.isEmpty());

	}

	@Then("^i can validate the totals for Balans Activa from tab \"(.*?)\"$")
	public void i_can_validate_the_totals_for_Balans_Activa_from_tab(String Tab) throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// Immateriele vaste activa

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.ImmaterieleVasteActivaCommercieel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("C", 13, Tab)), "C13"));

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.ImmaterieleVasteActivaFiscaal_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("D", 13, Tab)), "D13"));

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.ImmaterieleVasteActivaCommercieel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("E", 13, Tab)), "E13"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.ImmaterieleVasteActivaCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 13, Tab)), "F13"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.ImmaterieleVasteActivaFiscaal_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 13, Tab)), "G13"));

		// Goodwill fiscaal
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.GoodwillFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 16, Tab)), "G16"));

		// Overige immateriele vaste activa
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.OverigeImmaterieleFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 17, Tab)), "G17"));

		// Totaal immateriele vaste activa
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalImmaterieleVasteActivaCommercieel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("C", 18, Tab)), "C18"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalImmaterieleVasteActivaFiscaal_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("D", 18, Tab)), "D18"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalImmaterieleVasteActivaCommercieel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("E", 18, Tab)), "E18"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalImmaterieleVasteActivaCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 18, Tab)), "F18"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalImmaterieleVasteActivaFiscaal_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 18, Tab)), "G18"));

		// Gebouwen en terreinen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.GebouwenTerreinenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 26, Tab)), "G26"));

		// Machines en installaties
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.MachinesFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 27, Tab)), "G27"));

		// Andere vaste bedrijfsmiddelen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.AndereBedrijfsFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 28, Tab)), "G28"));

		// Totaal materiele vaste activa

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalMaterieleVasteActivaCommercieel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("C", 29, Tab)), "C29"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalMaterieleVasteActivaFiscaal_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("D", 29, Tab)), "D29"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalMaterieleVasteActivaCommercieel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("E", 29, Tab)), "E29"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalMaterieleVasteActivaCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 29, Tab)), "F29"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalMaterieleVasteActivaFiscaal_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 29, Tab)), "G18"));

		// Financiele vaste activa

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.FinancieleVasteActivaCommercieel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("C", 34, Tab)), "C34"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.FinancieleVasteActivaFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 34, Tab)), "D34"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.FinancieleVasteActivaCommercieel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("E", 34, Tab)), "E34"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.FinancieleVasteActivaCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 34, Tab)), "F34"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.FinancieleVasteActivaFiscaal_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 34, Tab)), "G34"));

		// Deelnemingen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.DeelnemingenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 37, Tab)), "G37"));

		// Langlopende vorderingen op groepsmaatschappijen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.langlopendevordGroepsFiscaal_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 38, Tab)), "G38"));

		// Langlopende vorderingen participanten/maatschappijen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.langlopendevordPartFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 39, Tab)), "G39"));

		// Overige financiele vaste activa
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.OverigeFinActivaFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 40, Tab)), "G40"));

		// Totaal financiele vaste activa
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalFinVasteActivaCommercieel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("C", 41, Tab)), "C41"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalFinVasteActivaFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 41, Tab)), "D41"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalFinVasteActivaCommercieel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("E", 41, Tab)), "E41"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.TotaalFinVasteActivaCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 41, Tab)), "F41"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalFinVasteActivaFiscaal_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("G", 41, Tab)), "G41"));

		// Voorraden
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VoorradenCommercieel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("C", 45, Tab)), "C45"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VoorradenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 45, Tab)), "D45"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.VoorradenCommercieel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("E", 45, Tab)), "E45"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VoorradenCF(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("F", 45, Tab)), "F45"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VoorradenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 45, Tab)), "G45"));

		// Voorraden, excl onderhanden werk
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.VoorradenExlFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 48, Tab)), "G48"));

		// Onderhanden werk
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.OnderhandenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 49, Tab)), "G49"));

		// Totaal voorraden
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVoorradenCommercieel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("C", 50, Tab)), "C50"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVoorradenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 50, Tab)), "D50"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVoorradenCommercieel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("E", 50, Tab)), "E50"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.TotaalVoorradenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 50, Tab)), "F50"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVoorradenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 50, Tab)), "G50"));

		// Vorderingen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.VorderingenCommercieel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("C", 54, Tab)), "C54"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VorderingenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 54, Tab)), "G54"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.VorderingenCommercieel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("E", 54, Tab)), "E54"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VorderingenCF(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("F", 54, Tab)), "F54"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.VorderingenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 54, Tab)), "G54"));

		// Handelsdebiteuren
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.HandelsdebiteurenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 57, Tab)), "G57"));

		// Omzetbelasting
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.OmzetBelastingFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 58, Tab)), "G58"));

		// Kortlopende vorderingen op groepsmaatschappijen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.KortVordGroepFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 59, Tab)), "G59"));

		// Kortlopende vorderingen participanten/ maatschappijen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.KortVordPartFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 60, Tab)), "G60"));

		// Overige vorderingen
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.OverigeVordFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 61, Tab)), "G61"));

		// Totaal vorderingen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVorderingenCommercieel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("C", 62, Tab)), "C62"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVorderingenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 62, Tab)), "D62"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansActivaObjecten.TotaalVorderingenCommercieel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("E", 62, Tab)), "E62"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.TotaalVorderingenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("F", 62, Tab)), "F62"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalVorderingenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 62, Tab)), "G62"));

		// Effecten
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.EffectenFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 67, Tab)), "G67"));

		// Liquide middelen
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.LiquideFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 72, Tab)), "G72"));

		// Totaal activa
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalActivaCommercieel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("C", 77, Tab)), "C77"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansActivaObjecten.TotaalActivaFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("D", 77, Tab)), "D77"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalActivaCommercieel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("E", 77, Tab)), "E77"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BalansActivaObjecten.TotaalActivaCF(driver).getAttribute("value"),
				Double.parseDouble(BalansActivaXLS.HaalData("F", 77, Tab)), "F77"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansActivaObjecten.TotaalActivaFiscaal_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansActivaXLS.HaalData("G", 77, Tab)), "G77"));

		System.out.println(ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Balans Passiva$")
	public void open_the_form_Balans_Passiva() throws Throwable {
		NavigerenObjecten.BalansPassiva(driver).click();
	}

	@Then("^i can fill out the form Balans Passiva from tab \"(.*?)\"$")
	public void i_can_fill_out_the_form_Balans_Passiva_from_tab(String Tab) throws Throwable {

		// Gestort en opgevraagd kapitaal

		// uitklappen Ondernemingsvermogen
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBPGiOnv2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}
				
		BalansPassivaObjecten.GestortOpgevraagdCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.GestortOpgevraagdCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 9, Tab));

		BalansPassivaObjecten.GestortOpgevraagdFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.GestortOpgevraagdFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 9, Tab));

		BalansPassivaObjecten.GestortOpgevraagdCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.GestortOpgevraagdCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 9, Tab));

		BalansPassivaObjecten.GestortOpgevraagdCF(driver).clear();
		BalansPassivaObjecten.GestortOpgevraagdCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 9, Tab));

		// Informeel kapitaal

		BalansPassivaObjecten.InformeelKapitaalCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.InformeelKapitaalCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 10, Tab));

		BalansPassivaObjecten.InformeelKapitaalFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.InformeelKapitaalFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 10, Tab));

		BalansPassivaObjecten.InformeelKapitaalCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.InformeelKapitaalCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 10, Tab));

		BalansPassivaObjecten.InformeelKapitaalCF(driver).clear();
		BalansPassivaObjecten.InformeelKapitaalCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 10, Tab));

		// Agio

		BalansPassivaObjecten.AgioCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.AgioCommercieeel_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("B", 11, Tab));

		BalansPassivaObjecten.AgioFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.AgioFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C", 11, Tab));

		BalansPassivaObjecten.AgioCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.AgioCommercieeel_31_12(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("D", 11, Tab));

		BalansPassivaObjecten.AgioCF(driver).clear();
		BalansPassivaObjecten.AgioCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 11, Tab));

		// Winstreserve

		BalansPassivaObjecten.WinstReserveCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.WinstReserveCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 12, Tab));

		BalansPassivaObjecten.WinstReserveFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.WinstReserveFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 12, Tab));

		BalansPassivaObjecten.WinstReserveCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.WinstReserveCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 12, Tab));

		BalansPassivaObjecten.WinstReserveCF(driver).clear();
		BalansPassivaObjecten.WinstReserveCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 12, Tab));

		// Kostenegalisatiereserve

		BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 13, Tab));

		BalansPassivaObjecten.KostenegalisatiereserveFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.KostenegalisatiereserveFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 13, Tab));

		BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.KostenegalisatiereserveCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 13, Tab));

		BalansPassivaObjecten.KostenegalisatiereserveCF(driver).clear();
		BalansPassivaObjecten.KostenegalisatiereserveCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 13, Tab));

		// Heringsreserve

		BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 14, Tab));

		BalansPassivaObjecten.HerinvesteringsreserveFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.HerinvesteringsreserveFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 14, Tab));

		BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.HerinvesteringsreserveCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 14, Tab));

		BalansPassivaObjecten.HerinvesteringsreserveCF(driver).clear();
		BalansPassivaObjecten.HerinvesteringsreserveCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 14, Tab));

		// Belaste compartimenteringsreserve

		BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 15, Tab));

		BalansPassivaObjecten.CompartimenteringsreserveFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.CompartimenteringsreserveFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 15, Tab));

		BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.CompartimenteringsreserveCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 15, Tab));

		BalansPassivaObjecten.CompartimenteringsreserveCF(driver).clear();
		BalansPassivaObjecten.CompartimenteringsreserveCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 15, Tab));

		// Overige fiscale reserves

		BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 16, Tab));

		BalansPassivaObjecten.OverigeFiscaleReservesFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.OverigeFiscaleReservesFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 16, Tab));

		BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.OverigeFiscaleReservesCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 16, Tab));

		BalansPassivaObjecten.OverigeFiscaleReservesCF(driver).clear();
		BalansPassivaObjecten.OverigeFiscaleReservesCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 16, Tab));

		// Garantievoorziening

		// uitklappen Voorzieningen
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiVoz2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}		
		
		BalansPassivaObjecten.GarantieVoorzieningCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.GarantieVoorzieningCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 25, Tab));

		BalansPassivaObjecten.GarantieVoorzieningFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.GarantieVoorzieningFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 25, Tab));

		BalansPassivaObjecten.GarantieVoorzieningCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.GarantieVoorzieningCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 25, Tab));

		BalansPassivaObjecten.GarantieVoorzieningCF(driver).clear();
		BalansPassivaObjecten.GarantieVoorzieningCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 25, Tab));

		// Voorziening voor lijfrenten, pensioen en stamrecht

		BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 26, Tab));

		BalansPassivaObjecten.VoorzieningLijfrenteFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.VoorzieningLijfrenteFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 26, Tab));

		BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.VoorzieningLijfrenteCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 26, Tab));

		BalansPassivaObjecten.VoorzieningLijfrenteCF(driver).clear();
		BalansPassivaObjecten.VoorzieningLijfrenteCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 26, Tab));

		// Overige voorzieningen

		BalansPassivaObjecten.OverigeVoorzieningCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.OverigeVoorzieningCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 27, Tab));

		BalansPassivaObjecten.OverigeVoorzieningFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.OverigeVoorzieningFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 27, Tab));

		BalansPassivaObjecten.OverigeVoorzieningCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.OverigeVoorzieningCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 27, Tab));

		BalansPassivaObjecten.OverigeVoorzieningCF(driver).clear();
		BalansPassivaObjecten.OverigeVoorzieningCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 27, Tab));

		// Converteerbare leningen

		// uitklappen Voorzieningen
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiLls2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}	
		
		BalansPassivaObjecten.ConverteerbareleningenCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.ConverteerbareleningenCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 36, Tab));

		BalansPassivaObjecten.ConverteerbareleningenFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.ConverteerbareleningenFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 36, Tab));

		BalansPassivaObjecten.ConverteerbareleningenCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.ConverteerbareleningenCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 36, Tab));

		BalansPassivaObjecten.ConverteerbareleningenCF(driver).clear();
		BalansPassivaObjecten.ConverteerbareleningenCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 36, Tab));

		// Schulden aan kredietinstellingen

		BalansPassivaObjecten.SchuldenKredietInstCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.SchuldenKredietInstCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 37, Tab));

		BalansPassivaObjecten.SchuldenKredietInstFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.SchuldenKredietInstFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 37, Tab));

		BalansPassivaObjecten.SchuldenKredietInstCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.SchuldenKredietInstCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 37, Tab));

		BalansPassivaObjecten.SchuldenKredietInstCF(driver).clear();
		BalansPassivaObjecten.SchuldenKredietInstCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 37, Tab));

		// Obligaties

		BalansPassivaObjecten.ObligatiesCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.ObligatiesCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 38, Tab));

		BalansPassivaObjecten.ObligatiesFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.ObligatiesFiscaal_1_1(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("C", 38, Tab));

		BalansPassivaObjecten.ObligatiesCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.ObligatiesCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 38, Tab));

		BalansPassivaObjecten.ObligatiesCF(driver).clear();
		BalansPassivaObjecten.ObligatiesCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 38, Tab));

		// Langlopende schulden groepsmaatschappijen

		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 39, Tab));

		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 39, Tab));

		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 39, Tab));

		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCF(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenGrMaatschCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 39, Tab));

		// Langlopende schulden participanten/maatschappijen waarin wordt
		// deelgenomen

		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 40, Tab));

		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 40, Tab));

		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 40, Tab));

		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCF(driver).clear();
		BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 40, Tab));

		// Overige langlopende schulden

		BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 41, Tab));

		BalansPassivaObjecten.OverigeLangLopendeSchFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.OverigeLangLopendeSchFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 41, Tab));

		BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.OverigeLangLopendeSchCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 41, Tab));

		BalansPassivaObjecten.OverigeLangLopendeSchCF(driver).clear();
		BalansPassivaObjecten.OverigeLangLopendeSchCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 41, Tab));

		// Schulden aan leveranciers en handelskredieten

		
		// uitklappen Voorzieningen
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiKls2Hide']")).click();
		} catch (Exception e) {
			System.out.println("element is al uitgeklapt");
		}			
		
		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 49, Tab));

		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 49, Tab));

		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 49, Tab));

		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCF(driver).clear();
		BalansPassivaObjecten.SchuldenLeveranciersHandelsKrCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 49, Tab));

		// Omzetbelasting

		BalansPassivaObjecten.OmzetbelastingCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.OmzetbelastingCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 50, Tab));

		BalansPassivaObjecten.OmzetbelastingFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.OmzetbelastingFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 50, Tab));

		BalansPassivaObjecten.OmzetbelastingCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.OmzetbelastingCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 50, Tab));

		BalansPassivaObjecten.OmzetbelastingCF(driver).clear();
		BalansPassivaObjecten.OmzetbelastingCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 50, Tab));

		// Loonheffingen

		BalansPassivaObjecten.LoonheffingenCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.LoonheffingenCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 51, Tab));

		BalansPassivaObjecten.LoonheffingenFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.LoonheffingenFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 51, Tab));

		BalansPassivaObjecten.LoonheffingenCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.LoonheffingenCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 51, Tab));

		BalansPassivaObjecten.LoonheffingenCF(driver).clear();
		BalansPassivaObjecten.LoonheffingenCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 51, Tab));

		// Kortlopende schulden groepsmaatschappijen

		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 52, Tab));

		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 52, Tab));

		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 52, Tab));

		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCF(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 52, Tab));

		// Kortlopende schulden op participanten/maatschappijen waarin wordt
		// deelgenomen

		BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 53, Tab));

		BalansPassivaObjecten.KortlopendeSchuldParticiantFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldParticiantFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 53, Tab));

		BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldParticiantCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 53, Tab));

		BalansPassivaObjecten.KortlopendeSchuldParticiantCF(driver).clear();
		BalansPassivaObjecten.KortlopendeSchuldParticiantCF(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("E", 53, Tab));

		// Overige kortlopende schulden

		BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_1_1(driver).clear();
		BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("B", 54, Tab));

		BalansPassivaObjecten.OverigeKortlSchuldFiscaal_1_1(driver).clear();
		BalansPassivaObjecten.OverigeKortlSchuldFiscaal_1_1(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("C", 54, Tab));

		BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_31_12(driver).clear();
		BalansPassivaObjecten.OverigeKortlSchuldCommercieeel_31_12(driver)
				.sendKeys(codebase.BalansPassivaXLS.HaalData("D", 54, Tab));

		BalansPassivaObjecten.OverigeKortlSchuldCF(driver).clear();
		BalansPassivaObjecten.OverigeKortlSchuldCF(driver).sendKeys(codebase.BalansPassivaXLS.HaalData("E", 54, Tab));

		BalansPassivaObjecten.ToelichtingBalansPassiva(driver).clear();
		BalansPassivaObjecten.ToelichtingBalansPassiva(driver).sendKeys(codebase.BalansPassivaXLS.HaalText(62, Tab));

	}

	@Then("^i can validate the totals for Balans Passiva from tab \"(.*?)\"$")
	public void i_can_validate_the_totals_for_Balans_Passiva_from_tab(String Tab) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// Ondernemingsvermogen

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OndernemingsvermogenCommercieeel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("B", 7, Tab)), "B7"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 7, Tab)), "C7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OndernemingsvermogenCommercieeel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("D", 7, Tab)), "D7"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 7, Tab)), "E7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OndernemingsvermogenFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 7, Tab)), "F7"));

		// Gestort en opgevraagd kapitaal
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.GestortOpgevraagdFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 9, Tab)), "F9"));

		// Informeel kapitaal
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.InformeelKapitaalFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 10, Tab)), "F10"));

		// Agio
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.AgioFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 11, Tab)), "F11"));

		// Winstreserve
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.WinstReserveFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 12, Tab)), "F12"));

		// Kostenegalisatiereserve
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KostenegalisatiereserveFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 13, Tab)), "F13"));

		// Heringsreserve
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.HerinvesteringsreserveFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 14, Tab)), "F14"));

		// Belaste compartimenteringsreserve
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.CompartimenteringsreserveFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 15, Tab)), "F15"));

		// Overige fiscale reserves
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OverigeFiscaleReservesFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 16, Tab)), "F16"));

		// Eigen vermogen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OndernemingsvermogenCommercieeel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("B", 7, Tab)), "B7"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 7, Tab)), "C7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OndernemingsvermogenCommercieeel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("D", 7, Tab)), "D7"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.OndernemingsvermogenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 7, Tab)), "E7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OndernemingsvermogenFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 7, Tab)), "F7"));

		// Voorzieningen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCommercieeel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("B", 22, Tab)), "B22"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 22, Tab)), "C22"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCommercieeel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("D", 22, Tab)), "D22"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 22, Tab)), "E22"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 22, Tab)), "F22"));

		// Garantievoorziening

		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.GarantieVoorzieningFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 25, Tab)), "F25"));

		// Voorziening voor lijfrenten, pensioen en stamrecht
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.VoorzieningLijfrenteFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 26, Tab)), "F26"));

		// Overige voorzieningen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.OverigeVoorzieningFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 27, Tab)), "F27"));

		// Totaal voorzieningen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCommercieeel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("B", 28, Tab)), "B28"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 28, Tab)), "C28"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCommercieeel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("D", 28, Tab)), "D28"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 28, Tab)), "E28"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.VoorzieningenFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 28, Tab)), "F28"));

		// Langlopende schulden
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.LanglopendeSchuldenCommercieeel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("B", 33, Tab)), "B33"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 33, Tab)), "C33"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.LanglopendeSchuldenCommercieeel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("D", 33, Tab)), "D33"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 33, Tab)), "E33"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 33, Tab)), "F33"));

		// Converteerbare leningen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.ConverteerbareleningenFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 36, Tab)), "F36"));

		// Schulden aan kredietinstellingen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.SchuldenKredietInstFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 37, Tab)), "F37"));

		// Obligaties
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.ObligatiesFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 38, Tab)), "F38"));

		// Langlopende schulden groepsmaatschappijen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.LanglopendeSchuldenGrMaatschFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 39, Tab)), "F39"));

		// Langlopende schulden participanten/maatschappijen waarin wordt
		// deelgenomen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenPartMaatschDeelnemingFiscaal31_12(driver)
						.getAttribute("value"), Double.parseDouble(BalansPassivaXLS.HaalData("F", 40, Tab)), "F40"));

		// Overige langlopende schulden
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.OverigeLangLopendeSchFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 41, Tab)), "F41"));

		// Totaal langlopende schulden

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.LanglopendeSchuldenCommercieeel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("B", 42, Tab)), "B42"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 42, Tab)), "C42"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.LanglopendeSchuldenCommercieeel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("D", 42, Tab)), "D42"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 42, Tab)), "E42"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.LanglopendeSchuldenFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 42, Tab)), "F42"));

		// Kortlopende schulden

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KortLopendeSchuldCommercieeel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("B", 46, Tab)), "B46"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 46, Tab)), "C46"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KortLopendeSchuldCommercieeel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("D", 46, Tab)), "D46"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 46, Tab)), "E46"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 46, Tab)), "F46"));

		// Schulden aan leveranciers en handelskredieten
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.SchuldenLeveranciersHandelsKrFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 49, Tab)), "F49"));

		// Omzetbelasting
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.OmzetbelastingFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 50, Tab)), "F50"));

		// Loonheffingen
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.LoonheffingenFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 51, Tab)), "F51"));

		// Kortlopende schulden groepsmaatschappijen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KortlopendeSchuldGroepsmaatschFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 52, Tab)), "F52"));

		// Kortlopende schulden op participanten/maatschappijen waarin wordt
		// deelgenomen
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KortlopendeSchuldParticiantFiscaal31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("F", 53, Tab)), "F53"));

		// Overige kortlopende schulden
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.OverigeKortlSchuldFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 54, Tab)), "F54"));

		// Totaal kortlopende schulden

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KortLopendeSchuldCommercieeel_1_1(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("B", 55, Tab)), "B55"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 55, Tab)), "F55"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				BalansPassivaObjecten.KortLopendeSchuldCommercieeel_31_12(driver).getAttribute("value"),
				Double.parseDouble(BalansPassivaXLS.HaalData("D", 55, Tab)), "D55"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 55, Tab)), "E55"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.KortLopendeSchuldFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 55, Tab)), "F55"));

		// Totaal passiva

		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaCommercieeel_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("B", 59, Tab)), "B59"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaFiscaal_1_1(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("C", 59, Tab)), "C59"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaCommercieeel_31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("D", 59, Tab)), "D59"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaCF(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("E", 59, Tab)), "E59"));
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(BalansPassivaObjecten.TotaalPassivaFiscaal31_12(driver).getAttribute("value"),
						Double.parseDouble(BalansPassivaXLS.HaalData("F", 59, Tab)), "F59"));

		// System.out.println(ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Investeringsaftrek$")
	public void open_the_form_Investeringsaftrek() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		NavigerenObjecten.Investeringsaftrek(driver).click();

	}

	@Then("^i can fill out the form Investeringsaftrek with config (\\d+)$")
	public void i_can_fill_out_the_form_Investeringsaftrek_with_config(int TcId) throws Throwable {

		String[] invuldata = codebase.InvesteringsAftrekXLS.HaalData(TcId);

		InvesteringsaftrekObjecten.OmschrijvingBedrijfsmiddel(driver).clear();
		InvesteringsaftrekObjecten.OmschrijvingBedrijfsmiddel(driver).sendKeys(invuldata[1]);

		InvesteringsaftrekObjecten.DatumInvestering(driver).sendKeys(invuldata[2]);
		InvesteringsaftrekObjecten.DatumIngebruikname(driver).sendKeys(invuldata[3]);

		InvesteringsaftrekObjecten.Investeringsbedrag(driver).clear();
		InvesteringsaftrekObjecten.Investeringsbedrag(driver).sendKeys(invuldata[4]);

		InvesteringsaftrekObjecten.BedragBetaaldBoekjaar(driver).clear();
		InvesteringsaftrekObjecten.BedragBetaaldBoekjaar(driver).sendKeys(invuldata[5]);

		if (invuldata[7].equals("ja")) {
			InvesteringsaftrekObjecten.energieInvesteringsAftrek_ja(driver).click();

		} else {
			InvesteringsaftrekObjecten.energieInvesteringsAftrek_nee(driver).click();
		}

		if (invuldata[8].equals("ja")) {
			InvesteringsaftrekObjecten.MeldingsnummerAftrek(driver).clear();
			InvesteringsaftrekObjecten.MeldingsnummerAftrek(driver).sendKeys(invuldata[4]);

			InvesteringsaftrekObjecten.MilleuInvesteringsAftrek_ja(driver).click();
			InvesteringsaftrekObjecten.MilleuCategorie(driver).sendKeys(invuldata[10]);
			WebElement mySelectElm = InvesteringsaftrekObjecten.MilleuCategorie(driver);
			Select mySelect = new Select(mySelectElm);
			mySelect.selectByVisibleText(invuldata[10]);
		} else {
			InvesteringsaftrekObjecten.MilleuInvesteringsAftrek_nee(driver).click();
		}

		InvesteringsaftrekObjecten.AandelingInvestering(driver).sendKeys(invuldata[11]);

		if (invuldata[16].equals("ja")) {
			InvesteringsaftrekObjecten.CaribischeDeel_Ja(driver).click();
			InvesteringsaftrekObjecten.AftrekKleinschalig(driver).sendKeys(invuldata[17]);
		} else {
			InvesteringsaftrekObjecten.CaribischeDeel_Nee(driver).click();
		}

		// driver.quit();

	}

	@Then("^i can validate the error messages for the Investeringsaftrek form$")
	public void i_can_validate_the_error_messages_for_the_Investeringsaftrek_form() throws Throwable {
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// Omschrijving bedrijfsmiddel
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInvesteringsRegeling("OmschrijvingBedrijfsmiddel",
				1, 70, "TextVeld", driver));

		// Investeringsbedrag
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInvesteringsRegeling("Investeringsbedrag", 1, 20,
				"GeheelGetal", driver));

		// Bedrag betaald in boekjaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInvesteringsRegeling("BedragBetaaldBoekjaar", 1,
				20, "GeheelGetal", driver));

		// Is er sprake van energie- of milieuaftrek?

		if (driver.findElement(By.id("idmilieuaftrek")).isSelected()) {

			System.out.println("milleuaftrek");

			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInvesteringsRegeling("MeldingsnummerAftrek",
					1, 20, "Meldingsnummer", driver));
		} else {
			System.out.println("not selected");
		}

		// Investeringsaftrek energie/milieu dit boekjaar
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInvesteringsRegeling(
				"InvesteringsaftrekEnergieMilieu", 1, 20, "PositiefGeheelGetal", driver));

		// Vond de investering plaats in het Caribische deel van het Koninkrijk
		// Nederland?

		if (pageObjects.InvesteringsaftrekObjecten.CaribischeDeel_Ja(driver).isSelected()) {
			ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInvesteringsRegeling("AftrekKleinschalig", 1,
					20, "PositiefGeheelGetal", driver));
		}

		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Objectvrijstelling$")
	public void open_the_form_Objectvrijstelling() throws Throwable {
		NavigerenObjecten.Objectvrijstelling(driver).click();

	}

	@Then("^i can fill out the form Objectvrijstelling from (\\d+)$")
	public void i_can_fill_out_the_form_Objectvrijstelling_from(int TCID) throws Throwable {

		String[] invuldata = codebase.ObjectvrijstellingXLS.HaalText(TCID);

		if (TCID == 2) {
			WebElement mySelectElm = driver.findElement(By.cssSelector("[ng-model='currentRepeatForm']"));
			Select mySelect = new Select(mySelectElm);
			mySelect.selectByVisibleText("002 Objectvrijstelling");
		}
		// ObjectvrijstellingObjecten.ObjectvrijstellingNaam(driver).clear();
		// ObjectvrijstellingObjecten.ObjectvrijstellingNaam(driver).sendKeys(invuldata[1]);

		ObjectvrijstellingObjecten.VestigingslandOnderneming(driver).sendKeys(invuldata[2]);

		ObjectvrijstellingObjecten.BuitenlandseOndernemingswinst(driver).clear();
		ObjectvrijstellingObjecten.BuitenlandseOndernemingswinst(driver).sendKeys(invuldata[3]);

		ObjectvrijstellingObjecten.Intehalenverliezen(driver).clear();
		ObjectvrijstellingObjecten.Intehalenverliezen(driver).sendKeys(invuldata[4]);

		ObjectvrijstellingObjecten.Stakingsverlies(driver).clear();
		ObjectvrijstellingObjecten.Stakingsverlies(driver).sendKeys(invuldata[5]);

		ObjectvrijstellingObjecten.ObjectvrijstellingBuitenlandseOndernemingswinst(driver).clear();
		ObjectvrijstellingObjecten.ObjectvrijstellingBuitenlandseOndernemingswinst(driver).sendKeys(invuldata[6]);

		// ObjectvrijstellingObjecten.CumulatiefSaldo(driver).clear();
		// ObjectvrijstellingObjecten.CumulatiefSaldo(driver).sendKeys(invuldata[7]);

		// extra click om lostfocus event van cumulatiefsaldo te triggeren en
		// hiermee de waarde op te slaan
		ObjectvrijstellingObjecten.BuitenlandseOndernemingswinst(driver).click();

	}

	@Then("^i can validate the error messages for the formulier Objectvrijstelling$")
	public void i_can_validate_the_error_messages_for_the_formulier_Objectvrijstelling() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		ValidatieResultaat.addAll(codebase.TooltipChecker
				.CheckTooltipObjectVrijstelling("BuitenlandseOndernemingswinst", 1, 70, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipObjectVrijstelling("Intehalenverliezen", 1, 70,
				"PositiefGeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipObjectVrijstelling("Stakingsverlies", 1, 70,
				"GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipObjectVrijstelling(
				"ObjectvrijstellingBuitenlandseOndernemingswinst", 1, 70, "GeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipObjectVrijstelling("CumulatiefSaldo", 1, 70,
				"GeheelGetal", driver));

		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());
	}

	@When("^open the form Innovatiebox$")
	public void open_the_form_Innovatiebox() throws Throwable {
		NavigerenObjecten.Innovatiebox(driver).click();

	}

	@Then("^i can fill out the form Innovatiebox from (\\d+)$")
	public void i_can_fill_out_the_form_Innovatiebox_from(int configId) throws Throwable {

		String[] invuldata = codebase.InnovatieboxXLS.HaalData(configId);

		InnovatieboxObjecten.Omschrijving(driver).clear();
		InnovatieboxObjecten.Omschrijving(driver).sendKeys(invuldata[1]);

		InnovatieboxObjecten.Voortbrengingkosten(driver).clear();
		InnovatieboxObjecten.Voortbrengingkosten(driver).sendKeys(invuldata[2]);

		if (invuldata[3].equals("ja")) {
			InnovatieboxObjecten.forfaitaireRegeling_Ja(driver).click();
		} else {
			InnovatieboxObjecten.forfaitaireRegeling_Nee(driver).click();
		}

		InnovatieboxObjecten.SaldoDrempelInnovatie(driver).clear();
		InnovatieboxObjecten.SaldoDrempelInnovatie(driver).sendKeys(invuldata[4]);

		InnovatieboxObjecten.InnovatieboxVoortbrengingskosten(driver).clear();
		InnovatieboxObjecten.InnovatieboxVoortbrengingskosten(driver).sendKeys(invuldata[5]);

		InnovatieboxObjecten.InnovatieboxExploitatieverliezen(driver).clear();
		InnovatieboxObjecten.InnovatieboxExploitatieverliezen(driver).sendKeys(invuldata[6]);

		InnovatieboxObjecten.VoordelenOctrooi(driver).clear();
		InnovatieboxObjecten.VoordelenOctrooi(driver).sendKeys(invuldata[7]);

		InnovatieboxObjecten.OvergenomenDrempel(driver).clear();
		InnovatieboxObjecten.OvergenomenDrempel(driver).sendKeys(invuldata[8]);

		InnovatieboxObjecten.InTeLopenVoortbrengingsKosten(driver).clear();
		InnovatieboxObjecten.InTeLopenVoortbrengingsKosten(driver).sendKeys(invuldata[9]);

		InnovatieboxObjecten.GenotenVoordeelOnder(driver).clear();
		InnovatieboxObjecten.GenotenVoordeelOnder(driver).sendKeys(invuldata[10]);

		InnovatieboxObjecten.GenotenVoordeelBoven(driver).clear();
		InnovatieboxObjecten.GenotenVoordeelBoven(driver).sendKeys(invuldata[11]);

		InnovatieboxObjecten.SaldoInTeLopen(driver).clear();
		InnovatieboxObjecten.SaldoInTeLopen(driver).sendKeys(invuldata[12]);

	}

	@Then("^i can validate the error messages for the formulier Innovatiebox$")
	public void i_can_validate_the_error_messages_for_the_formulier_Innovatiebox() throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("Voortbrengingkosten", 1, 10,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("SaldoDrempelInnovatie", 1, 10,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("InnovatieboxVoortbrengingskosten",
				1, 10, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("InnovatieboxExploitatieverliezen",
				1, 10, "PositiefGetal", driver));
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipInnovatieBox("VoordelenOctrooi", 1, 10, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("InTeLopenVoortbrengingsKosten", 1,
				10, "PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("GenotenVoordeelOnder", 1, 10,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipInnovatieBox("GenotenVoordeelBoven", 1, 10,
				"PositiefGetal", driver));
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipInnovatieBox("SaldoInTeLopen", 1, 10, "PositiefGetal", driver));

		// System.out.println("Validatie resultaat: " + ValidatieResultaat);
		driver.quit();

		assertTrue(ValidatieResultaat.isEmpty());
	}

	@When("^open the form Belastbaarbedrag$")
	public void open_the_form_Belastbaarbedrag() throws Throwable {

		NavigerenObjecten.belastbaarbedrag(driver).click();
	}

	@Then("^i can fill out the form Belastbaarbedrag from (\\d+)$")
	public void i_can_fill_out_the_form_Belastbaarbedrag_from(int arg1) throws Throwable {

	}

	@Then("^i can validate the error messages for the formulier Belastbaarbedrag$")
	public void i_can_validate_the_error_messages_for_the_formulier_Belastbaarbedrag() throws Throwable {

	}

	@When("^open the form FiscaleVermogensVergelijking$")
	public void open_the_form_FiscaleVermogensVergelijking() throws Throwable {

		NavigerenObjecten.FiscaleVermogensVergelijking(driver).click();

	}

	@Then("^i can fill out the form FiscaleVermogensVergelijking from \"(.*?)\"$")
	public void i_can_fill_out_the_form_FiscaleVermogensVergelijking_from(String Tab) throws Throwable {

		FiscaleVermogensVergelijkingObjecten.OndernemingsvermogenEindeJaar(driver).clear();
		FiscaleVermogensVergelijkingObjecten.OndernemingsvermogenEindeJaar(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 5, "TC01"));

		FiscaleVermogensVergelijkingObjecten.MutatiesKapitaal(driver).clear();
		FiscaleVermogensVergelijkingObjecten.MutatiesKapitaal(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 6, "TC01"));

		FiscaleVermogensVergelijkingObjecten.OndernemingsvermogenBeginJaar(driver).clear();
		FiscaleVermogensVergelijkingObjecten.OndernemingsvermogenBeginJaar(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 10, "TC01"));

		FiscaleVermogensVergelijkingObjecten.StortingKapitaal(driver).clear();
		FiscaleVermogensVergelijkingObjecten.StortingKapitaal(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 11, "TC01"));

		// if
		// (driver.findElement(By.id("idCWNLCBAanDivOndWinTot")).isSelected()) {
		// // System.out.println("enabled");
		// } else {
		// FiscaleVermogensVergelijkingObjecten.DividentOntwWinstCheckbox(driver).click();
		// }

		FiscaleVermogensVergelijkingObjecten.OmschrijvingUitdeling_1(driver).clear();
		FiscaleVermogensVergelijkingObjecten.OmschrijvingUitdeling_1(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalText("A", 24, "TC01"));

		FiscaleVermogensVergelijkingObjecten.DatumTerbeschikkingstelling_1(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalText("B", 24, "TC01"));

		FiscaleVermogensVergelijkingObjecten.DatumAangifteDividendbelasting_1(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalText("C", 24, "TC01"));

		FiscaleVermogensVergelijkingObjecten.BedragIngehoudenDividendbelasting_1(driver).clear();
		FiscaleVermogensVergelijkingObjecten.BedragIngehoudenDividendbelasting_1(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("D", 24, "TC01"));

		FiscaleVermogensVergelijkingObjecten.BedragWinstuitdeling_1(driver).clear();
		FiscaleVermogensVergelijkingObjecten.BedragWinstuitdeling_1(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 24, "TC01"));

		// regel 2
		// FiscaleVermogensVergelijkingObjecten.OmschrijvingUitdeling_2(driver).clear();
		// FiscaleVermogensVergelijkingObjecten.OmschrijvingUitdeling_2(driver)
		// .sendKeys(FiscaleVermogensvergelijkingXLS.HaalText("A", 25, "TC01"));
		//
		// FiscaleVermogensVergelijkingObjecten.DatumTerbeschikkingstelling_2(driver)
		// .sendKeys(FiscaleVermogensvergelijkingXLS.HaalText("B", 25, "TC01"));
		//
		// FiscaleVermogensVergelijkingObjecten.DatumAangifteDividendbelasting_2(driver)
		// .sendKeys(FiscaleVermogensvergelijkingXLS.HaalText("C", 25, "TC01"));
		//
		// FiscaleVermogensVergelijkingObjecten.BedragIngehoudenDividendbelasting_2(driver).clear();
		// FiscaleVermogensVergelijkingObjecten.BedragIngehoudenDividendbelasting_2(driver)
		// .sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("D", 25, "TC01"));
		//
		// FiscaleVermogensVergelijkingObjecten.BedragWinstuitdeling_2(driver).clear();
		// FiscaleVermogensVergelijkingObjecten.BedragWinstuitdeling_2(driver)
		// .sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 25, "TC01"));

		FiscaleVermogensVergelijkingObjecten.VennootschapsbelastingFiscaalVermogenOnttrokken(driver).clear();
		FiscaleVermogensVergelijkingObjecten.VennootschapsbelastingFiscaalVermogenOnttrokken(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("F", 27, "TC01"));

		FiscaleVermogensVergelijkingObjecten.BuitenlandseBelastingRegeling(driver).clear();
		FiscaleVermogensVergelijkingObjecten.BuitenlandseBelastingRegeling(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("F", 28, "TC01"));

		/*
		 * if (driver.findElement(By.id("idCWNLCBNieAftDeeWinDooCooTot")).
		 * isSelected()) { // System.out.println("enabled"); } else {
		 * FiscaleVermogensVergelijkingObjecten.NietAftrDeelWinstCoopCheckbox(
		 * driver).click(); }
		 */

		FiscaleVermogensVergelijkingObjecten.WinstuitdelingenCooperaties(driver).clear();
		FiscaleVermogensVergelijkingObjecten.WinstuitdelingenCooperaties(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 31, "TC01"));

		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelWinstuitdelingenCooperaties(driver).clear();
		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelWinstuitdelingenCooperaties(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 32, "TC01"));

		FiscaleVermogensVergelijkingObjecten.AndereOpenlijkeVermomdeUitdelingenWinst(driver).clear();
		FiscaleVermogensVergelijkingObjecten.AndereOpenlijkeVermomdeUitdelingenWinst(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("F", 35, "TC01"));

		/*
		 * if
		 * (driver.findElement(By.id("idCWNLCBNieAftDeeBelComTot")).isSelected()
		 * ) { // System.out.println("enabled"); } else {
		 * FiscaleVermogensVergelijkingObjecten.NietAftrDeelCommCheckbox(driver)
		 * .click(); }
		 */

		FiscaleVermogensVergelijkingObjecten.BeloningenCommissarissen(driver).clear();
		FiscaleVermogensVergelijkingObjecten.BeloningenCommissarissen(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 37, "TC01"));

		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelBeloningenCommissarissen(driver).clear();
		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelBeloningenCommissarissen(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 38, "TC01"));

		/*
		 * if
		 * (driver.findElement(By.id("idCWNLCBNieAftDeeTanTot")).isSelected()) {
		 * // System.out.println("enabled"); } else {
		 * FiscaleVermogensVergelijkingObjecten.NietAftrDeelTantiemesCheckbox(
		 * driver).click(); }
		 */

		FiscaleVermogensVergelijkingObjecten.Tantiemes(driver).clear();
		FiscaleVermogensVergelijkingObjecten.Tantiemes(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 42, "TC01"));

		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelTantiemes(driver).clear();
		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelTantiemes(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 43, "TC01"));

		/*
		 * if (driver.findElement(By.id("idCWNLCBNieAftDeeVerVooKapTot")).
		 * isSelected()) { // System.out.println("enabled"); } else {
		 * FiscaleVermogensVergelijkingObjecten.NietAftrDeelKapVerstrCheckbox(
		 * driver).click(); }
		 */

		FiscaleVermogensVergelijkingObjecten.VergoedingenVoorKapitaalverstrekking(driver).clear();
		FiscaleVermogensVergelijkingObjecten.VergoedingenVoorKapitaalverstrekking(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 48, "TC01"));

		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelVergoedingenVooKapitaalverstrekking(driver).clear();
		FiscaleVermogensVergelijkingObjecten.AftrekbaarDeelVergoedingenVooKapitaalverstrekking(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("E", 49, "TC01"));

		FiscaleVermogensVergelijkingObjecten.UitkeringenIngevolgeStatutaireAndereVoorschriften(driver).clear();
		FiscaleVermogensVergelijkingObjecten.UitkeringenIngevolgeStatutaireAndereVoorschriften(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("F", 52, "TC01"));

		FiscaleVermogensVergelijkingObjecten.ResultaatTijdelijkIngekochteAandelenWerknemeropties(driver).clear();
		FiscaleVermogensVergelijkingObjecten.ResultaatTijdelijkIngekochteAandelenWerknemeropties(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("F", 53, "TC01"));

		FiscaleVermogensVergelijkingObjecten.KostenAankoopResterendeAandelenDochtermaatschappijen(driver).clear();
		FiscaleVermogensVergelijkingObjecten.KostenAankoopResterendeAandelenDochtermaatschappijen(driver)
				.sendKeys(FiscaleVermogensvergelijkingXLS.HaalData("F", 54, "TC01"));

	}

	@Then("^i can validate the totals the formulier FiscaleVermogensVergelijking from  \"(.*?)\"$")
	public void i_can_validate_the_totals_the_formulier_FiscaleVermogensVergelijking_from(String Tab) throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.TotaalEindvermogenTerugbetalingen(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 8, Tab)), "F8"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.TotaalBeginvermogenStortingen(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 13, Tab)), "F13"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.Vermogensverschil(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 14, Tab)), "F14"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbareBedragen(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 15, Tab)), "F15"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.SaldoFiscaleWinstberekening(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 16, Tab)), "F16"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.ResultaatWinstVerliesrekening(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 18, Tab)), "F18"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.DividendOnderworpenWinstuitdelingen(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 21, Tab)), "F21"));
		// ValidatieResultaat.addAll(vergelijk.Vergelijk(FiscaleVermogensVergelijkingObjecten.NietAftrekbaarWinstuitdelingenCooperaties(driver).getAttribute("value"),
		// Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F",30,
		// Tab)), "F30"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(
						FiscaleVermogensVergelijkingObjecten.NietAftrekbaarWinstuitdelingenCooperaties_sub(driver)
								.getAttribute("value"),
						Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 33, Tab)), "E33"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(
						FiscaleVermogensVergelijkingObjecten.NietAftrekbaarDeelBeloningenCommissarissen(driver)
								.getAttribute("value"),
						Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 36, Tab)), "F36"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbaarDeelBeloningenCommissarissen_sub(driver)
						.getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 39, Tab)), "E39"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbaarDeelTantiemes(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 41, Tab)), "F41"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbaarDeelTantiemes_sub(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 44, Tab)), "E44"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbaarDeelVergoedingenKapitaalverstrekking(driver)
						.getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 47, Tab)), "F47"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbaarDeelVergoedingenKapitaalverstrekking_sub(driver)
						.getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("E", 50, Tab)), "E50"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				FiscaleVermogensVergelijkingObjecten.NietAftrekbareBedragen(driver).getAttribute("value"),
				Double.parseDouble(FiscaleVermogensvergelijkingXLS.HaalData("F", 56, Tab)), "F56"));

		System.out.println(ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@Then("^i can validate the error messages for the formulier FiscaleVermogensVergelijking from \"(.*?)\"$")
	public void i_can_validate_the_error_messages_for_the_formulier_FiscaleVermogensVergelijking_from(String Tab)
			throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipFiscaleVermogens("NietAftrekbaarWinstuitdelingenCooperaties",
		// 1, 20, "PositiefGetal", driver));

		System.out.println(ValidatieResultaat);
		// driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@When("^open the form Zeescheepvaart$")
	public void open_the_form_Zeescheepvaart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		NavigerenObjecten.WinstuitZeescheepvaart(driver).click();

	}

	@Then("^i can fill out the form Zeescheepvaart from (\\d+)$")
	public void i_can_fill_out_the_form_Zeescheepvaart_from(int Tcid) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Button New aanklikken

		// if (Tcid != 1) {
		// driver.findElement(By.xpath("//button[contains(.,'New')]")).click();
		//
		// WebElement mySelectElm =
		// driver.findElement(By.cssSelector("[ng-model='currentRepeatForm']"));
		// Select mySelect = new Select(mySelectElm);
		// mySelect.selectByVisibleText("00" + Tcid + " Winst uit
		// Zeescheepvaart");

		// }

		String[] invuldata = codebase.ZeescheepvaartXLS.HaalData(Tcid);

		ZeescheepvaartObjecten.NaamSchip(driver).clear();
		ZeescheepvaartObjecten.NaamSchip(driver).sendKeys(invuldata[1]);

		ZeescheepvaartObjecten.NettoTonnageSchip(driver).clear();
		ZeescheepvaartObjecten.NettoTonnageSchip(driver).sendKeys(invuldata[2]);

		ZeescheepvaartObjecten.aantalDagen(driver).clear();
		ZeescheepvaartObjecten.aantalDagen(driver).sendKeys(invuldata[3]);

		ZeescheepvaartObjecten.PercentageDeelnameSchip(driver).clear();
		ZeescheepvaartObjecten.PercentageDeelnameSchip(driver).sendKeys(invuldata[4]);

	}

	@Then("^i can validate the error messages for the formulier Zeescheepvaart$")
	public void i_can_validate_the_error_messages_for_the_formulier_Zeescheepvaart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		ValidatieResultaat
				.addAll(codebase.TooltipChecker.CheckTooltipZeeScheepvaart("NaamSchip", 1, 70, "TextVeld", driver));

		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipZeeScheepvaart("NettoTonnageSchip", 1, 70, "Positief10", driver));

		ValidatieResultaat
				.addAll(codebase.TooltipChecker.CheckTooltipZeeScheepvaart("aantalDagen", 1, 99, "Positief3", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipZeeScheepvaart("PercentageDeelnameSchip", 1, 99,
				"Procent", driver));

		// System.out.println(ValidatieResultaat);
		// driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());
		// driver.quit();

	}

	@When("^open the form Verlies Verrekening$")
	public void open_the_form_Verlies_Verrekening() throws Throwable {

		NavigerenObjecten.VerliesVerrekening(driver).click();

	}

	@Then("^i can fill out the form Verlies Verrekening from \"(.*?)\"$")
	public void i_can_fill_out_the_form_Verlies_Verrekening_from(String TCid) throws Throwable {

		winstVerliesVerrekeningObjecten.VerrekeningVerliesDitBoekjaar(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("C", 7, TCid));

		// Samenstelling te verrekenen verliezen

		// regel 1
		winstVerliesVerrekeningObjecten.RSINMaatschappij(driver).clear();
		winstVerliesVerrekeningObjecten.RSINMaatschappij(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("A", 13, TCid));

		winstVerliesVerrekeningObjecten.VerliesBoekjaar(driver).sendKeys(VerliesVerrekeningXLS.HaalData("B", 13, TCid));
		winstVerliesVerrekeningObjecten.VerrekeningVerliesVorigBoekjaar(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("C", 13, TCid));

		// regel 2
		// winstVerliesVerrekeningObjecten.RSINMaatschappij2(driver).clear();
		// winstVerliesVerrekeningObjecten.RSINMaatschappij2(driver).sendKeys(VerliesVerrekeningXLS.HaalData("A",
		// 14, TCid));
		// winstVerliesVerrekeningObjecten.VerliesBoekjaar2(driver).sendKeys(VerliesVerrekeningXLS.HaalData("B",
		// 14, TCid));
		// winstVerliesVerrekeningObjecten.VerrekeningVerliesVorigBoekjaar2(driver).sendKeys(VerliesVerrekeningXLS.HaalData("C",
		// 14, TCid));

		// Specificatie Carry Forward (voorwaartse verliesverrekening)

		// regel 1
		winstVerliesVerrekeningObjecten.Jaar(driver).sendKeys(VerliesVerrekeningXLS.HaalData("A", 21, TCid));
		winstVerliesVerrekeningObjecten.RestantVerrekenenVerliesBeginBoekjaar(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("B", 21, TCid));
		winstVerliesVerrekeningObjecten.VerrekendVerliesDitBoekjaar(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("C", 21, TCid));

		if (VerliesVerrekeningXLS.HaalData("E", 21, TCid).equals("1")) {
			winstVerliesVerrekeningObjecten.VerliesKwalificeren1_Ja(driver).click();
		} else {
			winstVerliesVerrekeningObjecten.VerliesKwalificeren1_Nee(driver).click();
		}

		// regel 2
		// winstVerliesVerrekeningObjecten.Jaar2(driver).sendKeys(VerliesVerrekeningXLS.HaalData("A",
		// 22, TCid));
		// winstVerliesVerrekeningObjecten.RestantVerrekenenVerliesBeginBoekjaar2(driver).sendKeys(VerliesVerrekeningXLS.HaalData("B",
		// 22, TCid));
		// winstVerliesVerrekeningObjecten.VerrekendVerliesDitBoekjaar2(driver).sendKeys(VerliesVerrekeningXLS.HaalData("C",
		// 22, TCid));
		//
		// if (VerliesVerrekeningXLS.HaalData("E", 22, TCid).equals("1")) {
		// winstVerliesVerrekeningObjecten.VerliesKwalificeren2_Ja(driver).click();
		// }
		// else {
		// winstVerliesVerrekeningObjecten.VerliesKwalificeren2_Nee(driver).click();
		// }

		// Samenstelling te verrekenen verliezen Fiscale Eenheid

		// regel 1
		winstVerliesVerrekeningObjecten.VerrekenenRSINMaatschappij(driver).clear();

		winstVerliesVerrekeningObjecten.VerrekenenRSINMaatschappij(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("A", 28, TCid));

		winstVerliesVerrekeningObjecten.VerrekenenFiscaleEenheidBoekjaarBegin(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalDatum("B", 28, TCid));

		winstVerliesVerrekeningObjecten.VerrekenenFiscaleEenheidBoekjaarEinde(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalDatum("C", 28, TCid));
		winstVerliesVerrekeningObjecten.VerrekenenVerliesEindeBoekjaar(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("D", 28, TCid));
		winstVerliesVerrekeningObjecten.TeVerrekenenVerlies(driver)
				.sendKeys(VerliesVerrekeningXLS.HaalData("E", 28, TCid));

		if (VerliesVerrekeningXLS.HaalData("F", 28, TCid).equals("1")) {
			winstVerliesVerrekeningObjecten.VerliesKwalificeren3_Ja(driver).click();
		} else {
			winstVerliesVerrekeningObjecten.VerliesKwalificeren3_Nee(driver).click();
		}
		// regel 2
		// winstVerliesVerrekeningObjecten.VerrekenenRSINMaatschappij2(driver).clear();
		// winstVerliesVerrekeningObjecten.VerrekenenRSINMaatschappij2(driver)
		// .sendKeys(VerliesVerrekeningXLS.HaalData("A", 29, TCid));
		// winstVerliesVerrekeningObjecten.VerrekenenFiscaleEenheidBoekjaarBegin2(driver)
		// .sendKeys(VerliesVerrekeningXLS.HaalDatum("B", 29, TCid));
		// winstVerliesVerrekeningObjecten.VerrekenenFiscaleEenheidBoekjaarEinde2(driver)
		// .sendKeys(VerliesVerrekeningXLS.HaalDatum("C", 29, TCid));
		// winstVerliesVerrekeningObjecten.VerrekenenVerliesEindeBoekjaar2(driver)
		// .sendKeys(VerliesVerrekeningXLS.HaalData("D", 29, TCid));
		// winstVerliesVerrekeningObjecten.TeVerrekenenVerlies2(driver)
		// .sendKeys(VerliesVerrekeningXLS.HaalData("E", 29, TCid));

		if (VerliesVerrekeningXLS.HaalData("F", 28, TCid).equals("1")) {
			winstVerliesVerrekeningObjecten.VerliesKwalificeren4_Ja(driver).click();
		} else {
			winstVerliesVerrekeningObjecten.VerliesKwalificeren4_Nee(driver).click();
		}

	}

	@Then("^i can validate the error messages for the formulier verliesverrekening$")
	public void i_can_validate_the_error_messages_for_the_formulier_verliesverrekening() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipVerliesVerrekening("RSINMaatschappij", 1, 9, "BSN", driver));
		ValidatieResultaat.addAll(
				codebase.TooltipChecker.CheckTooltipVerliesVerrekening("RSINMaatschappij2", 1, 9, "BSN", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesVerrekening("VerrekenenRSINMaatschappij",
				1, 9, "BSN", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesVerrekening("VerrekenenRSINMaatschappij2",
				1, 9, "BSN", driver));

		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesVerrekening(
				"VerrekeningVerliesVorigBoekjaar", 1, 9, "PositiefGeheelGetal", driver));
		ValidatieResultaat.addAll(codebase.TooltipChecker.CheckTooltipVerliesVerrekening(
				"VerrekeningVerliesVorigBoekjaar2", 1, 9, "PositiefGeheelGetal", driver));

		System.out.println(ValidatieResultaat);

		assertTrue(ValidatieResultaat.isEmpty());
		// driver.quit();

	}

	@Given("^open the form Verlies toelichting overige voorziening$")
	public void open_the_form_Verlies_toelichting_overige_voorziening() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		NavigerenObjecten.toelichtingOverigeVoorzieningen(driver).click();

	}

	@Then("^i can fill out the form toelichting overige voorziening from (\\d+)$")
	public void i_can_fill_out_the_form_toelichting_overige_voorziening_from(int Tcid) throws Throwable {

		// rij 1

		ToelichtingOverigeVoorzieningObjecten.Omschrijving1(driver).clear();
		ToelichtingOverigeVoorzieningObjecten.Omschrijving1(driver)
				.sendKeys(ToelichtingOverigeVoorzXLS.HaalText("B", 2, "ToelichtingOverigeVoorziening"));
		ToelichtingOverigeVoorzieningObjecten.DotatieOverigeVoorziening1(driver)
				.sendKeys(ToelichtingOverigeVoorzXLS.HaalData("C", 2, "ToelichtingOverigeVoorziening"));
		ToelichtingOverigeVoorzieningObjecten.OnttrekkingOverigeVoorziening1(driver)
				.sendKeys(ToelichtingOverigeVoorzXLS.HaalData("D", 2, "ToelichtingOverigeVoorziening"));
		ToelichtingOverigeVoorzieningObjecten.OverigeVoorzieningEindeBoekjaar1(driver)
				.sendKeys(ToelichtingOverigeVoorzXLS.HaalData("E", 2, "ToelichtingOverigeVoorziening"));

		// rij 2
		// ToelichtingOverigeVoorzieningObjecten.Omschrijving2(driver).clear();
		// ToelichtingOverigeVoorzieningObjecten.Omschrijving2(driver).sendKeys(ToelichtingOverigeVoorzXLS.HaalText("B",
		// 3, "ToelichtingOverigeVoorziening"));
		// ToelichtingOverigeVoorzieningObjecten.DotatieOverigeVoorziening2(driver).sendKeys(ToelichtingOverigeVoorzXLS.HaalData("C",
		// 3, "ToelichtingOverigeVoorziening"));
		// ToelichtingOverigeVoorzieningObjecten.OnttrekkingOverigeVoorziening2(driver).sendKeys(ToelichtingOverigeVoorzXLS.HaalData("D",
		// 3, "ToelichtingOverigeVoorziening"));
		// ToelichtingOverigeVoorzieningObjecten.OverigeVoorzieningEindeBoekjaar2(driver).sendKeys(ToelichtingOverigeVoorzXLS.HaalData("E",
		// 3, "ToelichtingOverigeVoorziening"));
	}

	@Given("^open the form Verlies toelichting Materiele vaste activa$")
	public void open_the_form_Verlies_toelichting_Materiele_vaste_activa() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		NavigerenObjecten.ToelichtingMaterieleVasteActiva(driver).click();

	}

	@Then("^i can validate the error messages for the formulier toelichting overige voorziening$")
	public void i_can_validate_the_error_messages_for_the_formulier_toelichting_overige_voorziening() throws Throwable {

	}

	@Then("^i can fill out the form Toelichting Materiele vaste activa \"(.*?)\"$")
	public void i_can_fill_out_the_form_Toelichting_Materiele_vaste_activa(String Tab) throws Throwable {

		String Locatie = "C:\\testdata\\Toelichting materiele vaste activa.xlsx";
		// Gebouwen zonder bodemwaarde

		ToelichtingMaterieleVasteActivaObjecten.GebouwenZonderBodemwaardeAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 6, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenZonderBodemwaardeFiscale3112(driver)
				.sendKeys(LeesXLS.HaalData("C", 6, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenZonderBodemwaardeRestwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("D", 6, Tab, Locatie));

		// Gebouwen in eigen gebruik

		ToelichtingMaterieleVasteActivaObjecten.GebouwenInEigenGebruikAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 9, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenInEigenGebruikFiscale3112(driver)
				.sendKeys(LeesXLS.HaalData("C", 9, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenInEigenGebruikRestwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("D", 9, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenInEigenGebruikBodemwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("E", 9, Tab, Locatie));

		// Gebouwen ter belegging gehouden

		ToelichtingMaterieleVasteActivaObjecten.GebouwenTerBeleggingAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 10, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenTerBeleggingFiscale3112(driver)
				.sendKeys(LeesXLS.HaalData("C", 10, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenTerBeleggingRestwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("D", 10, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenTerBeleggingBodemwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("E", 10, Tab, Locatie));

		// Gebouwen zonder afschrijving
		ToelichtingMaterieleVasteActivaObjecten.GebouwenZonderAfschrijvingAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 11, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.GebouwenZonderAfschrijvingFiscale3112(driver)
				.sendKeys(LeesXLS.HaalData("C", 11, Tab, Locatie));

		// Bedrijfsterreinen

		ToelichtingMaterieleVasteActivaObjecten.BedrijfsterreinenAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 12, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.BedrijfsterreinenFiscale3112(driver)
				.sendKeys(LeesXLS.HaalData("C", 12, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.BedrijfsterreinenRestwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("D", 12, Tab, Locatie));

		// Machines
		ToelichtingMaterieleVasteActivaObjecten.MachinesAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 17, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.MachinesRestwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("D", 17, Tab, Locatie));

		// Andere vaste bedrijfsmiddelen

		ToelichtingMaterieleVasteActivaObjecten.AndereVasteBedrijfsmiddelenAanschaf(driver)
				.sendKeys(LeesXLS.HaalData("B", 18, Tab, Locatie));
		ToelichtingMaterieleVasteActivaObjecten.AndereVasteBedrijfsmiddelenRestwaarde3112(driver)
				.sendKeys(LeesXLS.HaalData("D", 18, Tab, Locatie));

	}

	@Then("^i can validate the error messages for the formulier Toelichting Materiele vaste activa$")
	public void i_can_validate_the_error_messages_for_the_formulier_Toelichting_Materiele_vaste_activa()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^i can validate the totals on the formulier Toelichting Materiele vaste activa from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Toelichting_Materiele_vaste_activa_from(String Tab)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		String Locatie = "C:\\testdata\\Toelichting materiele vaste activa.xlsx";
		ValidatieResultaat.addAll(
				vergelijk.Vergelijk(ToelichtingMaterieleVasteActivaObjecten.Totaal(driver).getAttribute("value"),
						Double.parseDouble(LeesXLS.HaalData("C", 13, Tab, Locatie)), "C13"));

		System.out.println(ValidatieResultaat);
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@Given("^open the form Toelichting garantievoorzieningen$")
	public void open_the_form_Toelichting_garantievoorzieningen() throws Throwable {

		NavigerenObjecten.ToelichtingGarantievoorziening(driver).click();

	}

	@Then("^i can fill out the form Toelichting garantievoorzieningen with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Toelichting_garantievoorzieningen_with(String Tab) throws Throwable {

		String Locatie = "C:\\testdata\\Toelichting garantievoorziening.xlsx";

		// regel 1
		ToelichtingGarantieVoorzieningObjecten.Omschrijving1(driver).clear();
		ToelichtingGarantieVoorzieningObjecten.Omschrijving1(driver).sendKeys(LeesXLS.HaalText("A", 4, Tab, Locatie));
		ToelichtingGarantieVoorzieningObjecten.DotatieGarantieVoorziening1(driver)
				.sendKeys(LeesXLS.HaalData("B", 4, Tab, Locatie));
		ToelichtingGarantieVoorzieningObjecten.OnttrekkingGarantieVoorziening1(driver)
				.sendKeys(LeesXLS.HaalData("C", 4, Tab, Locatie));
		ToelichtingGarantieVoorzieningObjecten.GarantieVoorzieningEindeboekjaar1(driver)
				.sendKeys(LeesXLS.HaalData("D", 4, Tab, Locatie));

		// regel 2
		// ToelichtingGarantieVoorzieningObjecten.Omschrijving2(driver).clear();
		// ToelichtingGarantieVoorzieningObjecten.Omschrijving2(driver).sendKeys(LeesXLS.HaalText("A",
		// 5, Tab, Locatie));
		// ToelichtingGarantieVoorzieningObjecten.DotatieGarantieVoorziening2(driver).sendKeys(LeesXLS.HaalData("B",
		// 5, Tab, Locatie));
		// ToelichtingGarantieVoorzieningObjecten.OnttrekkingGarantieVoorziening2(driver).sendKeys(LeesXLS.HaalData("C",
		// 5, Tab, Locatie));
		// ToelichtingGarantieVoorzieningObjecten.GarantieVoorzieningEindeboekjaar2(driver).sendKeys(LeesXLS.HaalData("D",
		// 5, Tab, Locatie));

	}

	@Then("^i can validate the totals on the formulier Toelichting garantievoorzieningen from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Toelichting_garantievoorzieningen_from(String arg1)
			throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		String Locatie = "C:\\testdata\\Toelichting garantievoorziening.xlsx";
		String Tab = "TC01";

		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(ToelichtingGarantieVoorzieningObjecten.Totaal(driver).getAttribute("value"),
						Double.parseDouble(LeesXLS.HaalData("D", 5, Tab, Locatie)), "D5"));

		System.out.println(ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());

	}

	@Given("^open the form Specificatie Investeringsregelingen$")
	public void open_the_form_Specificatie_Investeringsregelingen() throws Throwable {

		NavigerenObjecten.SpecificatieInvesteringsregelingen(driver).click();

	}

	@Then("^i can fill out the form Specificatie Investeringsregelingen with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Specificatie_Investeringsregelingen_with(String Tcid) throws Throwable {

		String[] invuldata = codebase.investeringsregelingXLS.HaalData(1);

		if (invuldata[0].equals("ja")) {
			InvesteringsregelingenObjecten.GrondslagKostprijs_ja(driver).click();
		} else {
			InvesteringsregelingenObjecten.GrondslagKostprijs_nee(driver).click();
		}

		if (invuldata[1].equals("ja")) {
			InvesteringsregelingenObjecten.BeroepOpOntheffingNaasteVerwanten_ja(driver).click();
		} else {
			InvesteringsregelingenObjecten.BeroepOpOntheffingNaasteVerwanten_nee(driver).click();
		}

		if (invuldata[2].equals("ja")) {
			InvesteringsregelingenObjecten.BeroepOpOntheffingNaasteNalatenschap_ja(driver).click();
		} else {
			InvesteringsregelingenObjecten.BeroepOpOntheffingNaasteNalatenschap_nee(driver).click();
		}

		if (invuldata[3].equals("ja")) {
			InvesteringsregelingenObjecten.InvesteringsAftrek_ja(driver).click();
		} else {
			InvesteringsregelingenObjecten.InvesteringsAftrek_nee(driver).click();
		}

		if (invuldata[4].equals("ja")) {
			InvesteringsregelingenObjecten.DesinvesteringsAftrek_ja(driver).click();
		} else {
			InvesteringsregelingenObjecten.DesinvesteringsAftrek_nee(driver).click();
		}
		if (invuldata[5].equals("ja")) {
			InvesteringsregelingenObjecten.ResearchAndDevelopment_ja(driver).click();

		} else {
			InvesteringsregelingenObjecten.ResearchAndDevelopment_nee(driver).click();
		}

		InvesteringsregelingenObjecten.OmschrijvingBedrijfsmiddel(driver).clear();
		InvesteringsregelingenObjecten.OmschrijvingBedrijfsmiddel(driver).sendKeys(invuldata[6]);
		InvesteringsregelingenObjecten.bedrag(driver).clear();
		InvesteringsregelingenObjecten.bedrag(driver).sendKeys(invuldata[7]);
		InvesteringsregelingenObjecten.TotaalKleinschalig(driver).sendKeys(invuldata[8]);

	}

	@Then("^i can validate the totals on the formulier Specificatie Investeringsregelingen from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Specificatie_Investeringsregelingen_from(String arg1)
			throws Throwable {

	}

	@Given("^open the form Toelichting desinvesteringsbijtelling$")
	public void open_the_form_Toelichting_desinvesteringsbijtelling() throws Throwable {
		NavigerenObjecten.ToelichtingDesinvesteringsbijtelling(driver).click();
	}

	@Then("^i can fill out the form Toelichting desinvesteringsbijtelling with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Toelichting_desinvesteringsbijtelling_with(String Tcid) throws Throwable {

		String[] invuldata = codebase.ToelichtingDesinvesteringsbijtellingXLS.HaalData(1);

		ToelichtingDesinvesteringsbijtellingObjecten.OmschrijvingBedrijfsmiddel(driver).clear();
		ToelichtingDesinvesteringsbijtellingObjecten.OmschrijvingBedrijfsmiddel(driver).sendKeys(invuldata[0]);

		ToelichtingDesinvesteringsbijtellingObjecten.Investeringsbedrag(driver).sendKeys(invuldata[1]);

		WebElement mySelectElm = ToelichtingDesinvesteringsbijtellingObjecten.Investeringsjaar(driver);
		Select mySelect = new Select(mySelectElm);
		mySelect.selectByVisibleText(invuldata[2]);

		ToelichtingDesinvesteringsbijtellingObjecten.PercentageKleinschaligheidsaftrek(driver).sendKeys(invuldata[3]);

		ToelichtingDesinvesteringsbijtellingObjecten.Overdrachtsprijs(driver).sendKeys(invuldata[4]);

		ToelichtingDesinvesteringsbijtellingObjecten.AandeelInvestering(driver).sendKeys(invuldata[5]);
	}

	@Then("^i can validate the totals on the formulier Toelichting desinvesteringsbijtelling from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Toelichting_desinvesteringsbijtelling_from(String arg1)
			throws Throwable {

	}

	@When("^open the form Specificatie Dochtermaatschappij$")
	public void open_the_form_Specificatie_Dochtermaatschappij() throws Throwable {
		NavigerenObjecten.SpecificatieDochtermaatschappij(driver).click();

	}

	@Then("^i can fill out the form Specificatie Dochtermaatschappij with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Specificatie_Dochtermaatschappij_with(String Tc01) throws Throwable {
		String Locatie = "C:\\testdata\\spec dochtermaatschappij.xlsx";
		String Tab = "Tc01";

		SpecificatieDochtermaatschappijObjecten.NaamDochtermaatschappij(driver).clear();
		SpecificatieDochtermaatschappijObjecten.NaamDochtermaatschappij(driver)
				.sendKeys(LeesXLS.HaalText("B", 5, Tab, Locatie));

		SpecificatieDochtermaatschappijObjecten.RSINFiscaalNummer(driver).clear();
		SpecificatieDochtermaatschappijObjecten.RSINFiscaalNummer(driver)
				.sendKeys(LeesXLS.HaalData("B", 6, Tab, Locatie));

		SpecificatieDochtermaatschappijObjecten.ActiviteitenOnderneming(driver).clear();
		SpecificatieDochtermaatschappijObjecten.ActiviteitenOnderneming(driver)
				.sendKeys(LeesXLS.HaalText("B", 7, Tab, Locatie));

		// Uitvouw moment 1
		if (LeesXLS.HaalText("B", 9, Tab, Locatie).equals("ja")) {
			SpecificatieDochtermaatschappijObjecten.dochtermaatschappijGevoegd_ja(driver).click();

			SpecificatieDochtermaatschappijObjecten.WaarderingSchuldBalansDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 13, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.WaarderingVorderingBalansAndereMaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 14, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.BelasteVrijvalSchuldDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 15, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.WaarderingSchuldBalansAndereMaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 16, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.WaarderingVorderingBalansDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 17, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.BelasteVrijvalSchuldAndereMaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 18, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.WaardeEconomischVerkeerDeelnemingDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 19, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.WaarderingDeelnemingDochtermaatschappijBalansMoeder(driver)
					.sendKeys(LeesXLS.HaalData("B", 20, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.FiscaalVermogenDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 21, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten
					.HerwaarderingDeelnemingVoorafgaandeAangifteMoedermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 22, Tab, Locatie));
			SpecificatieDochtermaatschappijObjecten.VermogenssprongMoedermaatschappijVoeging(driver)
					.sendKeys(LeesXLS.HaalData("B", 23, Tab, Locatie));

		} else {
			SpecificatieDochtermaatschappijObjecten.dochtermaatschappijGevoegd_nee(driver).click();
		}

		// Uitvouw moment 2
		if (LeesXLS.HaalText("B", 10, Tab, Locatie).equals("ja")) {
			SpecificatieDochtermaatschappijObjecten.DochtermaatschappijOntvoegd_ja(driver).click();

			// Voor ontvoegde dochtermaatschappij opgeofferd bedrag
			SpecificatieDochtermaatschappijObjecten.VoorOntvoegdeDochtermaatschappijOpgeofferdBedrag(driver)
					.sendKeys(LeesXLS.HaalData("B", 25, Tab, Locatie));
			// Waardering onderlinge vordering ontvoegende dochtermaatschappij
			SpecificatieDochtermaatschappijObjecten.WaarderingOnderlingeVorderingOntvoegendeDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 26, Tab, Locatie));
			// Waardering onderlinge schuld ontvoegende dochtermaatschappij
			SpecificatieDochtermaatschappijObjecten.WaarderingOnderlingeSchuldOntvoegendeDochtermaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 27, Tab, Locatie));
			// Waardering onderlinge vordering van andere maatschappij
			SpecificatieDochtermaatschappijObjecten.WaarderingOnderlingeVorderingAndereMaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 28, Tab, Locatie));
			// Waardering onderlinge schuld van andere maatschappij
			SpecificatieDochtermaatschappijObjecten.WaarderingOnderlingeSchuldAndereMaatschappij(driver)
					.sendKeys(LeesXLS.HaalData("B", 29, Tab, Locatie));
			// Is het tijdstip dat onmiddellijk aan het ontvoegingstijdstip
			// vooraf gaat, sprake van een verplichte herwaardering van
			// vermogensbestanddelen omdat binnen de fiscale eenheid aan of door
			// de ontvoegende dochtermaatschappij een of meer
			// vermogensbestanddelen zijn overgedragen waarvan, op het moment
			// van de overdracht, de waarde in het economisch verkeer hoger was
			// dan de boekwaarde (art. 15ai Wet VPB)?

			if (LeesXLS.HaalText("B", 30, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten.TijdstipOnmiddelijkOntvoegingstijdstip_ja(driver).click();
			} else {
				SpecificatieDochtermaatschappijObjecten.TijdstipOnmiddelijkOntvoegingstijdstip_nee(driver).click();
			}

			// Is het betreffende vermogensbestanddeel nog in bezit van de
			// overnemer?

			if (LeesXLS.HaalText("B", 31, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten.BetreffendeVermogensbestanddeelNogInBezitOvernemer_ja(driver)
						.click();
			} else {
				SpecificatieDochtermaatschappijObjecten.BetreffendeVermogensbestanddeelNogInBezitOvernemer_nee(driver)
						.click();
			}

			// Heeft de overnemer het betreffende vermogensbestanddeel
			// voorafgaand aan de ontvoeging ontvreemd?

			if (LeesXLS.HaalText("B", 32, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten
						.OvernemerBetreffendeVermogensbestanddeelVoorafgaandOntvoegingOntvreemd_ja(driver).click();
			} else {
				SpecificatieDochtermaatschappijObjecten
						.OvernemerBetreffendeVermogensbestanddeelVoorafgaandOntvoegingOntvreemd_nee(driver).click();
			}

			// De waarde in het economisch verkeer op het tijdstip dat
			// onmiddellijk voorafgaat aan het ontvoegingstijdstip van het/de
			// overgedragen vermogensbestandde(e)l(en) dat/die nog in bezit zijn
			// van de overnemer. De waarde in het economisch verkeer dient
			// alleen ingevuld te worden als de belastingplichtige geen gebruik
			// maakt van de tegenbewijsregeling van art. 15ai-2.

			SpecificatieDochtermaatschappijObjecten
					.WaardeEconomischVerkeerOpTijdstipOnmiddellijkVoorafgaatAanOntvoegingstijdstip(driver)
					.sendKeys(LeesXLS.HaalData("B", 33, Tab, Locatie));

			// De waarde in het economisch verkeer van het overgedragen
			// bestanddeel op het tijdstip van de overdracht, verminderd met de
			// in aanmerking te nemen afschrijving.
			SpecificatieDochtermaatschappijObjecten
					.WaardeEconomischVerkeerOvergedragenBestanddeelTijdstipOverdracht(driver)
					.sendKeys(LeesXLS.HaalData("B", 34, Tab, Locatie));
			// De fiscale boekwaarde op het tijdstip dat onmiddellijk voorafgaat
			// aan het ontvoegingstijdstip van het/de overgedragen
			// vermogensbestandde(e)l(en) dat/die nog in bezit is/zijn van de
			// overnemer.
			SpecificatieDochtermaatschappijObjecten
					.FiscaleBoekwaardeOpTijdstipOnmiddellijkVoorafgaatOntvoegingstijdstip(driver)
					.sendKeys(LeesXLS.HaalData("B", 35, Tab, Locatie));
			// Het bedrag dat als gevolg van de overdracht van het/de
			// vermogensbestandde(e)l(en) tot de winst van de fiscale eenheid
			// wordt gerekend.
			SpecificatieDochtermaatschappijObjecten.BedragAlsGevolgVanOverdrachtVanVermogensbestanddenWinst(driver)
					.sendKeys(LeesXLS.HaalData("B", 36, Tab, Locatie));

			// Heeft de overnemer bij de vervreemding van het
			// vermogensbestanddeel een herinvesteringsreserve gevormd?

			if (LeesXLS.HaalText("B", 37, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten
						.OvernemerVervreemdVermogensbestanddeelHerinvesteringsreserve_ja(driver).click();
				;
			} else {
				SpecificatieDochtermaatschappijObjecten
						.OvernemerVervreemdVermogensbestanddeelHerinvesteringsreserve_nee(driver).click();
			}

			// Is de betreffende herinvesteringsreserve al afgeboekt op een
			// vervangend bedrijfsmiddel?
			if (LeesXLS.HaalText("B", 38, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten.BetreffendeHerinvesteringsReserveAfgeboekt_ja(driver).click();
				;
			} else {
				SpecificatieDochtermaatschappijObjecten.BetreffendeHerinvesteringsReserveAfgeboekt_nee(driver).click();
			}

			// De winst van de fiscale eenheid vanwege vrijval door de overnemer
			// gevormde herinvesteringsreserve.

			SpecificatieDochtermaatschappijObjecten.WinstFiscaleEenheidvanwegeVrijval(driver)
					.sendKeys(LeesXLS.HaalData("B", 39, Tab, Locatie));

			// De waarde in het economisch verkeer op het tijdstip dat
			// onmiddellijk voorafgaat aan het ontvoegingstijdstip van het
			// vervangende bedrijfsmiddel.

			SpecificatieDochtermaatschappijObjecten
					.WaardeEconomischVerkeerOpTijdstipOnmiddellijkVoorafgaatAanOntvoegingstijdstip(driver)
					.sendKeys(LeesXLS.HaalData("B", 40, Tab, Locatie));
			// De boekwaarde, op het tijdstip dat onmiddellijk voorafgaat aan
			// het ontvoegingstijdstip, van het vervangende bedrijfsmiddel.

			SpecificatieDochtermaatschappijObjecten.BoekwaardeOpTijdstipOnmiddelijkvoorafgaatOntvoegingsTijdstip(driver)
					.sendKeys(LeesXLS.HaalData("B", 41, Tab, Locatie));

			// Het bedrag zijnde het verschil tussen de waarde in het economisch
			// verkeer en de fiscale boekwaarde van het vervangende
			// bedrijfmiddel op het tijdstip dat onmiddellijk voorafgaat aan het
			// ontvoegingstijdstip. Dit bedrag wordt tot de winst van de fiscale
			// eenheid gerekend.
			SpecificatieDochtermaatschappijObjecten
					.BedragZijndeVerschilWaardeEconomischVerkeerEnFiscaleBoekwaarde(driver)
					.sendKeys(LeesXLS.HaalData("B", 42, Tab, Locatie));

			// Staat op de balans van de ontvoegende dochtermaatschappij een
			// herinvesteringsreserve waarvan het bij die reserve behorende
			// voornemen tot vervanging berust bij een andere

			if (LeesXLS.HaalText("B", 43, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten
						.BalansOntvoegendeDochterMaatschappijHerinvesteringsreserve_ja(driver).click();
				;
			} else {
				SpecificatieDochtermaatschappijObjecten
						.BalansOntvoegendeDochterMaatschappijHerinvesteringsreserve_nee(driver).click();
			}

			// Staat op de balans van een andere maatschappij een
			// herinvesteringsreserve waarvan het bij die reserve behorende
			// voornemen tot vervanging berust bij de ontvoegende
			// dochtermaatschappij?

			if (LeesXLS.HaalText("B", 44, Tab, Locatie).equals("ja")) {
				SpecificatieDochtermaatschappijObjecten
						.BalansAndereMaatschappijHerinvesteringsReserveVoornemen_ja(driver).click();
				;
			} else {
				SpecificatieDochtermaatschappijObjecten
						.BalansAndereMaatschappijHerinvesteringsReserveVoornemen_ja(driver).click();
			}
		}

		// Uitvouw moment 3
		if (LeesXLS.HaalText("B", 11, Tab, Locatie).equals("ja")) {
			SpecificatieDochtermaatschappijObjecten.DochtermaatschappijBeeindigd_ja(driver).click();
		} else {
			SpecificatieDochtermaatschappijObjecten.DochtermaatschappijBeeindigd_nee(driver).click();
		}
	}

	@Then("^i can validate the totals on the formulier Specificatie Dochtermaatschappijbr(\\d+) from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Specificatie_Dochtermaatschappijbr_from(int arg1,
			String arg2) throws Throwable {
	}

	@When("^open the form Berekening Belastbaar Bedrag$")
	public void open_the_form_Berekening_Belastbaar_Bedrag() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		NavigerenObjecten.BerekeningBelastbaarBedrag(driver).click();
	}

	@Then("^i can fill out the form Berekening Belastbaar Bedrag with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Berekening_Belastbaar_Bedrag_with(String Tab) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String Locatie = "C:\\testdata\\Berekening belastbaar bedrag.xlsx";
		Thread.sleep(500);

		// glyphy 1 Kosten en lasten die niet of gedeeltelijk niet aftrekbaar zijn
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiKostLastNieAftHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 1");
		}
		
		
		BerekeningBelastbaarBedragObjecten.NietAftrekbareKostenOmschrijving(driver).clear();
		BerekeningBelastbaarBedragObjecten.NietAftrekbareKostenOmschrijving(driver).sendKeys(LeesXLS.HaalText("A", 8, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.NietAftrekbareKostenBedrag(driver).sendKeys(LeesXLS.HaalData("B", 8, Tab, Locatie));	
		
		BerekeningBelastbaarBedragObjecten.OverigeVanAftrekUitgeslotenAftrekBeperkteKostenOmschrijving(driver).clear();
		BerekeningBelastbaarBedragObjecten.OverigeVanAftrekUitgeslotenAftrekBeperkteKostenOmschrijving(driver).sendKeys(LeesXLS.HaalText("A", 12, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.OverigeVanAftrekUitgeslotenAftrekBeperkteKostenBedrag(driver).sendKeys(LeesXLS.HaalData("B", 12, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.SaldoNietAftrekbareRentenRoyaltys(driver).sendKeys(LeesXLS.HaalData("C", 15, Tab, Locatie));
		
		// glyphy 2 Totaal niet aftrekbare rente
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiNietAftRenteHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 2");
		}
			
		BerekeningBelastbaarBedragObjecten.NietAftrekbareRente(driver).sendKeys(LeesXLS.HaalData("B", 17, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.VergoedingenEnWaardemutaties(driver).sendKeys(LeesXLS.HaalData("B", 18, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.BovenmatigeDeelnemingsrente(driver).sendKeys(LeesXLS.HaalData("B", 19, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.RenteOvernameschulden(driver).sendKeys(LeesXLS.HaalData("B", 20, Tab, Locatie));
		
		// glyphy 3 Vrijgestelde winstbestanddelen, zonder deelnemingsvrijstelling
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiVrWiZoDeHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 3");
		}
		
		BerekeningBelastbaarBedragObjecten.BosbouwLandbouwvrijstelling(driver).sendKeys(LeesXLS.HaalData("B", 27, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.Kwijtscheldingswinst(driver).sendKeys(LeesXLS.HaalData("B", 28, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.WinstAfsplitsingOfJuridischeFusie(driver).sendKeys(LeesXLS.HaalData("B", 29, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.Mobiliteitsprojectvrijstelling(driver).sendKeys(LeesXLS.HaalData("B", 30, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.VrijgesteldeVoordelenOverheidsondernemingen(driver).sendKeys(LeesXLS.HaalData("B", 31, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.OverigeVrijgesteldeWinstbestanddelen(driver).sendKeys(LeesXLS.HaalData("B", 32, Tab, Locatie));
		
		
		BerekeningBelastbaarBedragObjecten.FictievePersoneelskostenInstellingenAlgemeenSociaalBelang(driver).sendKeys(LeesXLS.HaalData("C", 36, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.WinstAnbiBehaaldMetKenbaarFondswervendeActiviteiten(driver).sendKeys(LeesXLS.HaalData("C", 37, Tab, Locatie));
	
		//glyphy 4 Wijzigingen toelaatbare fiscale reserves (onttrekkingen -/- toevoegingen)
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiToelFiscReserHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 4");
		}
		
		BerekeningBelastbaarBedragObjecten.KostenegalisatiereserveToevoeging(driver).sendKeys(LeesXLS.HaalData("B", 43, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.KostenegalisatiereserveOnttrekking(driver).sendKeys(LeesXLS.HaalData("C", 43, Tab, Locatie));
		
		BerekeningBelastbaarBedragObjecten.HerinvesteringsreserveToevoeging(driver).sendKeys(LeesXLS.HaalData("B", 44, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.HerinvesteringsreserveOnttrekking(driver).sendKeys(LeesXLS.HaalData("C", 44, Tab, Locatie));
		
		BerekeningBelastbaarBedragObjecten.BelasteCompartimenteringsreserveToevoeging(driver).sendKeys(LeesXLS.HaalData("B", 45, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.BelasteCompartimenteringsreserveOnttrekking(driver).sendKeys(LeesXLS.HaalData("C", 45, Tab, Locatie));
		
		BerekeningBelastbaarBedragObjecten.OverigeFiscaleReservesToevoeging(driver).sendKeys(LeesXLS.HaalData("B", 46, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.OverigeFiscaleReservesOnttrekking(driver).sendKeys(LeesXLS.HaalData("C", 46, Tab, Locatie));
		
		BerekeningBelastbaarBedragObjecten.NietInAanmerkingTeNemenVoordeelInnovatiebox(driver).sendKeys(LeesXLS.HaalData("D", 49, Tab, Locatie));
		
		//glyphy 5 Saldo deelnemingsvrijstelling

		
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiDeelnemingsVrijstHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 5");
		}
		
		
		BerekeningBelastbaarBedragObjecten.VoordelenUitNietKwalificerendeBeleggingsdeelnemingen(driver).sendKeys(LeesXLS.HaalData("C", 53, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.ToevoegingAanDeWinstVolgensArtikel13cVpb(driver).sendKeys(LeesXLS.HaalData("C", 54, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.NietVrijgesteldVoordeelVolgensArtikel13hVpb(driver).sendKeys(LeesXLS.HaalData("C", 55, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.NietVrijgesteldVoordeelVolgensArtikel13lid17Vpb(driver).sendKeys(LeesXLS.HaalData("C", 56, Tab, Locatie));
	
		
			
		//glyphy 6 Extracomptabele belaste bedragen
		try {
		driver.findElement(By.cssSelector("[num='CWNLBAGiDeelnemingsVrijst1Hide']")).click();
		} catch (Exception e) {
		System.out.println("glyphy 6");
		}
		
		//BerekeningBelastbaarBedragObjecten.BruteringVanVoordelenUitNietKwalificerendeBeleggingsdeelnemingen(driver).sendKeys(LeesXLS.HaalData("B", 58, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.ToevoegingArt13aaLid6Vpb(driver).sendKeys(LeesXLS.HaalData("B", 59, Tab, Locatie));
		
		//glyphy 7 Buitenlandse ondernemingswinsten
		
		try {
		driver.findElement(By.cssSelector("[num='CWNLBAGiBuitOnderwinHide']")).click();
		} catch (Exception e) {
		System.out.println("glyphy 7");
		}
		
		
		BerekeningBelastbaarBedragObjecten.VerliesbruteringLaagbelasteBuitenlandseBeleggingsondernemingen(driver).sendKeys(LeesXLS.HaalData("C", 67, Tab, Locatie));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		//glyphy 8 Aftrekbare giften
				
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiAftGiftenHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 8");
		}
		
		jse.executeScript("window.scrollBy(0,1000)", "");
			
		BerekeningBelastbaarBedragObjecten.GrondslagVPBgiftenCultureleInstellingen(driver).sendKeys(LeesXLS.HaalData("B", 71, Tab, Locatie));
		
		BerekeningBelastbaarBedragObjecten.OverigeGiften(driver).sendKeys(LeesXLS.HaalData("C", 73, Tab, Locatie));
		
		
		//glyphy 9 Aftrekbare, voorheen getemporiseerde, rente
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiAftVoorhGetempRentHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 9");
		}
				
		BerekeningBelastbaarBedragObjecten.BoekjaarTeVerrekenenVerliezenMuvHoudsterverliezen(driver).sendKeys(LeesXLS.HaalData("C", 80, Tab, Locatie));
		
		//glyphy 10 Belastingvermeerdering
				
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiBelVermeerHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 10");
		}
		
		
		BerekeningBelastbaarBedragObjecten.OngedaanMakenHerkapitalisatieGrondslag(driver).sendKeys(LeesXLS.HaalData("B", 94, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.AfkoopPensioenVUTArt23aWetVpBGrondslag(driver).sendKeys(LeesXLS.HaalData("B", 95, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.BeeindigingKredietinstellingBeleggingsinstellingGrondslag(driver).sendKeys(LeesXLS.HaalData("B", 96, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.BeeindigingKredietinstellingBeleggingsinstellingPercentage(driver).sendKeys(LeesXLS.HaalData("C", 96, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.NietVoldoenAanStamrechtvrijstellingGrondslag(driver).sendKeys(LeesXLS.HaalData("B", 97, Tab, Locatie));
				
		
		//glyphy 11 Belastingvermindering
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiBelVerminHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 11");
		}
		
		
		BerekeningBelastbaarBedragObjecten.SaldoBelastingVoorEldersBelast(driver).sendKeys(LeesXLS.HaalData("D", 102, Tab, Locatie));
		
		//glyphy 12 Deelnemingsverrekening niet-kwalificerende beleggingsdeelnemingen
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiBelVermin1Hide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 12");
		}
			
		BerekeningBelastbaarBedragObjecten.BerekendeDeelnemingsverrekeningDitBoekjaar(driver).sendKeys(LeesXLS.HaalData("C", 104, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.VoortTeWentelenDeelnemingsverrekening(driver).sendKeys(LeesXLS.HaalData("C", 105, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.DitBoekjaarTeVerrekenenDeelnemingsverrekening(driver).sendKeys(LeesXLS.HaalData("C", 106, Tab, Locatie));
		
		//glyphy 13 Verrekening belasting buitenlandse ondernemingswinsten
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiBelVermin3Hide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 13");
		}
				
		BerekeningBelastbaarBedragObjecten.BerekendeVerrekeningBuitenlandseOndernemingswinsten(driver).sendKeys(LeesXLS.HaalData("C", 110, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.OverTeBrengenVerrekeningBuitenlandseOndernemingswinsten(driver).sendKeys(LeesXLS.HaalData("C", 111, Tab, Locatie));
		
		
		//glyphy 14 Voorheffingen
		
		try {
			driver.findElement(By.cssSelector("[num='CWNLBAGiVoorhefHide']")).click();
		} catch (Exception e) {
			System.out.println("glyphy 13");
		}
		
		BerekeningBelastbaarBedragObjecten.Dividendbelasting(driver).sendKeys(LeesXLS.HaalData("D", 118, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.Kansspelbelasting(driver).sendKeys(LeesXLS.HaalData("D", 119, Tab, Locatie));
		BerekeningBelastbaarBedragObjecten.ToelichtingOpFiscaleWinstberekening(driver).clear();
		BerekeningBelastbaarBedragObjecten.ToelichtingOpFiscaleWinstberekening(driver).sendKeys(LeesXLS.HaalText("A", 124, Tab, Locatie));
		
	}

	@Then("^i can validate the totals on the formulier Berekening Belastbaar Bedrag from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Berekening_Belastbaar_Bedrag_from(String Tab)
			throws Throwable {
		
		String Locatie = "C:\\testdata\\Berekening belastbaar bedrag.xlsx";
		
		ArrayList<String> ValidatieResultaat = new ArrayList<String>();

		// Ondernemingsvermogen

		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.KostenEnLastenNietOfGedeeltelijkNietAftrekbaar(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 4, Tab,Locatie )), "C4"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalNietAftrekbareRente(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 4, Tab,Locatie )), "C16"));
	
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalBijtellingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 23, Tab,Locatie )), "D23"));
	
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.VrijgesteldeWinstbestanddelenZonderDeelnemingsvrijstelling(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 24, Tab,Locatie )), "D24"));
				
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalVrijgesteldeWinstbestanddelen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("B", 34, Tab,Locatie )), "B34"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalInvesteringsregelingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 38, Tab,Locatie )), "C38"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.WijzigingenToelaatbareFiscaleReserves(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 39, Tab,Locatie )), "C39"));
		
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotalenOnttrekking(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("B", 47, Tab,Locatie )), "B47"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotalenToevoeging(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 47, Tab,Locatie )), "C47"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.SaldoDeelnemingsvrijstelling(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 50, Tab,Locatie )), "D50"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.NettoVoordelenUitDeelnemingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 52, Tab,Locatie )), "C52"));

		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.ExtracomptabeleBelasteBedragen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 57, Tab,Locatie )), "C57"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.LiquidatieverliesVolgensArtikel13dVpb(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 62, Tab,Locatie )), "C62"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.ObjectvrijstellingVoorBuitenlandseOndernemingswinsten(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 66, Tab,Locatie )), "C66"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.AftrekbareGiften(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 68, Tab,Locatie )), "C68"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.BedragAftrekCultureleGiften(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 74, Tab,Locatie )), "C74"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.AftrekbareVoorheenGetemporiseerdeRente(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 78, Tab,Locatie )), "D78"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.BelastbareWinst(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 79, Tab,Locatie )), "D79"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.boekjaarTotaalTeVerrekenenVerliezen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 83, Tab,Locatie )), "D83"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.BelastbaarBedragGrondslagVoorBerekeningBelasting(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 83, Tab,Locatie )), "D83"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.BelastbaarBedragGrondslagVoorBerekeningBelasting(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 89, Tab,Locatie )), "D89"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.BelastingbedragVoorVermeerderingenVerminderingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 90, Tab,Locatie )), "E90"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.Belastingvermeerdering(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 91, Tab,Locatie )), "E91"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.AfkoopPensioenVUTart23aWetVpBPercentage(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 95, Tab,Locatie )), "C95"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.AfkoopPensioenVUTart23aWetVpBVermeerdering(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 95, Tab,Locatie )), "D95"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.BeeindigingKredietinstellingBeleggingsinstellingVermeerdering(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 96, Tab,Locatie )), "D96"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.NietVoldoenAanDeStamrechtvrijstellingPercentage(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 97, Tab,Locatie )), "C97"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.NietVoldoenAanDeStamrechtvrijstellingVermeerdering(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 97, Tab,Locatie )), "D97"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalBelastingvermeerdering(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 98, Tab,Locatie )), "D98"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.SaldoBelastingVoorEldersBelast(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 100, Tab,Locatie )), "E100"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.Belastingvermindering(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 100, Tab,Locatie )), "E100"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.DeelnemingsverrekeningNietKwalificerendeBeleggingsdeelnemingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 103, Tab,Locatie )), "D103"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.VerrekeningBelastingBuitenlandseOndernemingswinsten(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 103, Tab,Locatie )), "D103"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalVerrekeningBelastingBuitenlandseOndernemingswinsten(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("C", 111, Tab,Locatie )), "C111"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalBelastingverminderingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 115, Tab,Locatie )), "D115"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.Belastingbedrag(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 116, Tab,Locatie )), "C116"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.Voorheffingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 117, Tab,Locatie )), "C117"));
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalVoorheffingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 120, Tab,Locatie )), "D120"));		
		
		ValidatieResultaat.addAll(vergelijk.Vergelijk(BerekeningBelastbaarBedragObjecten.TotaalVerschuldigd(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("E", 122, Tab,Locatie )), "E122"));		
		
		
		
		
		assertTrue(ValidatieResultaat.isEmpty());
	}

	@When("^open the form toelichting winst en verliesrekening$")
	public void open_the_form_toelichting_winst_en_verliesrekening() throws Throwable {
		NavigerenObjecten.toelichtingWinstenVerliesRekening(driver).click();

	}

	@Then("^i can fill out the form toelichting winst en verliesrekening with \"(.*?)\"$")
	public void i_can_fill_out_the_form_toelichting_winst_en_verliesrekening_with(String Tab) throws Throwable {

		String Locatie = "C:\\testdata\\toelichting winst en verliesrekening.xlsx";

		toelichtingWinstenVerliesRekeningObjecten.MilieuBedrijfsmiddelenCommercieel3112(driver)
				.sendKeys(LeesXLS.HaalData("B", 5, Tab, Locatie));
		toelichtingWinstenVerliesRekeningObjecten.MilieuBedrijfsmiddelenCFverschillen(driver)
				.sendKeys(LeesXLS.HaalData("C", 5, Tab, Locatie));

		toelichtingWinstenVerliesRekeningObjecten.GebouwenInEigenGebruikCommercieel3112(driver)
				.sendKeys(LeesXLS.HaalData("B", 6, Tab, Locatie));
		toelichtingWinstenVerliesRekeningObjecten.GebouwenInEigenGebruikCFverschillen(driver)
				.sendKeys(LeesXLS.HaalData("C", 6, Tab, Locatie));

		toelichtingWinstenVerliesRekeningObjecten.GebouwenTerBeleggingCommercieel3112(driver)
				.sendKeys(LeesXLS.HaalData("B", 7, Tab, Locatie));
		toelichtingWinstenVerliesRekeningObjecten.GebouwenTerBeleggingCFverschillen(driver)
				.sendKeys(LeesXLS.HaalData("C", 7, Tab, Locatie));

		toelichtingWinstenVerliesRekeningObjecten.BedrijfsterreinenCommercieel3112(driver)
				.sendKeys(LeesXLS.HaalData("B", 8, Tab, Locatie));
		toelichtingWinstenVerliesRekeningObjecten.BedrijfsterreinenCFverschillen(driver)
				.sendKeys(LeesXLS.HaalData("C", 8, Tab, Locatie));

		toelichtingWinstenVerliesRekeningObjecten.OmschrijvingBedrijfsmiddelen(driver).clear();
		toelichtingWinstenVerliesRekeningObjecten.OmschrijvingBedrijfsmiddelen(driver)
				.sendKeys(LeesXLS.HaalText("A", 16, Tab, Locatie));

		toelichtingWinstenVerliesRekeningObjecten.BedragWillekeurigeAfschrijvingen(driver)
				.sendKeys(LeesXLS.HaalData("C", 16, Tab, Locatie));
		toelichtingWinstenVerliesRekeningObjecten.BoekWaardeBedrijfsmiddelWillekeurigeAfschrijving(driver)
				.sendKeys(LeesXLS.HaalData("D", 16, Tab, Locatie));

		toelichtingWinstenVerliesRekeningObjecten.ToelichtingWinstEnVerliesRekening(driver).clear();
		toelichtingWinstenVerliesRekeningObjecten.ToelichtingWinstEnVerliesRekening(driver)
				.sendKeys(LeesXLS.HaalText("A", 19, Tab, Locatie));
	}

	@Then("^i can validate the totals on the formulier toelichting winst en verliesrekening from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_toelichting_winst_en_verliesrekening_from(String arg1)
			throws Throwable {

		ArrayList<String> ValidatieResultaat = new ArrayList<String>();
		String Locatie = "C:\\testdata\\toelichting winst en verliesrekening.xlsx";
		String Tab = "Tc01";

		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(
						toelichtingWinstenVerliesRekeningObjecten.MilieuBedrijfsmiddelenFiscaal3112(driver)
								.getAttribute("value"),
						Double.parseDouble(LeesXLS.HaalData("D", 5, Tab, Locatie)), "D5"));
		ValidatieResultaat
				.addAll(vergelijk.Vergelijk(
						toelichtingWinstenVerliesRekeningObjecten.GebouwenInEigenGebruikFiscaal3112(driver)
								.getAttribute("value"),
						Double.parseDouble(LeesXLS.HaalData("D", 6, Tab, Locatie)), "D6"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				toelichtingWinstenVerliesRekeningObjecten.GebouwenTerBeleggingFiscaal3112(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 7, Tab, Locatie)), "D7"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				toelichtingWinstenVerliesRekeningObjecten.BedrijfsterreinenFiscaal3112(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 8, Tab, Locatie)), "D8"));
		ValidatieResultaat.addAll(vergelijk.Vergelijk(
				toelichtingWinstenVerliesRekeningObjecten.TotaalAfschrijvingen(driver).getAttribute("value"),
				Double.parseDouble(LeesXLS.HaalData("D", 10, Tab, Locatie)), "D10"));

		System.out.println(ValidatieResultaat);
		driver.quit();
		assertTrue(ValidatieResultaat.isEmpty());
	}

	@Given("^open the form Toelichting herinvesteringsreserve$")
	public void open_the_form_Toelichting_herinvesteringsreserve() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		NavigerenObjecten.ToelichtingHerinvesteringsreserve(driver).click();

	}

	@Then("^i can fill out the form Toelichting herinvesteringsreserve with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Toelichting_herinvesteringsreserve_with(String arg1) throws Throwable {

		String[] invuldata = codebase.ToelichtingHerinvesteringsReserveXLS.HaalData(1);

		ToelichtingHerinvesteringsReserveObjecten.Omschrijving(driver).sendKeys(invuldata[1]);
		ToelichtingHerinvesteringsReserveObjecten.JaarVervreemding(driver).sendKeys(invuldata[2]);
		ToelichtingHerinvesteringsReserveObjecten.BoekwinstVervreemd(driver).sendKeys(invuldata[3]);
		ToelichtingHerinvesteringsReserveObjecten.AfschrijvingsPercentage(driver).sendKeys(invuldata[4]);
		ToelichtingHerinvesteringsReserveObjecten.BoekwaardeBedrijfsmiddel(driver).sendKeys(invuldata[5]);

	}

	@Then("^i can validate the totals on the formulier Toelichting herinvesteringsreserve from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_formulier_Toelichting_herinvesteringsreserve_from(String arg1)
			throws Throwable {

	}

	@Given("^open the form Toelichting omzetbelasting$")
	public void open_the_form_Toelichting_omzetbelasting() throws Throwable {
		NavigerenObjecten.ToelichtingOmzetbelasting(driver).click();
	}

	@Then("^i can fill out the form Toelichting omzetbelasting with \"(.*?)\"$")
	public void i_can_fill_out_the_form_Toelichting_omzetbelasting_with(String arg1) throws Throwable {


	}

	@Then("^i can validate the totals on the Toelichting omzetbelasting from \"(.*?)\"$")
	public void i_can_validate_the_totals_on_the_Toelichting_omzetbelasting_from(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
