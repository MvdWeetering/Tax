package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import codebase.Inloggen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import pageObjects.*;

public class Steps {

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
	
	@Then("^i can fill out the form Algemene Vragen$")
	public void i_can_fill_out_the_form_Algemene_Vragen() throws Throwable {

		AlgemeneVragenObjecten.vraag1_yes(driver).click();
		AlgemeneVragenObjecten.vraag2_yes(driver).click();
		AlgemeneVragenObjecten.vraag3_yes(driver).click();
		AlgemeneVragenObjecten.vraag4_yes(driver).click();
		AlgemeneVragenObjecten.vraag5_yes(driver).click();
		AlgemeneVragenObjecten.vraag6_yes(driver).click();
		AlgemeneVragenObjecten.vraag7_yes(driver).click();
		AlgemeneVragenObjecten.vraag8_yes(driver).click();
		AlgemeneVragenObjecten.vraag9_yes(driver).click();
		AlgemeneVragenObjecten.vraag10_yes(driver).click();
		AlgemeneVragenObjecten.vraag11_yes(driver).click();
		AlgemeneVragenObjecten.vraag12_yes(driver).click();
		AlgemeneVragenObjecten.vraag13_yes(driver).click();
		AlgemeneVragenObjecten.vraag14_yes(driver).click();
		AlgemeneVragenObjecten.vraag15_yes(driver).click();
		AlgemeneVragenObjecten.Toelichting(driver).clear();
		AlgemeneVragenObjecten.Toelichting(driver).sendKeys("regel 1");

		Thread.sleep(1500);

		AlgemeneVragenObjecten.vraag1_no(driver).click();
		AlgemeneVragenObjecten.vraag2_no(driver).click();
		AlgemeneVragenObjecten.vraag3_no(driver).click();
		AlgemeneVragenObjecten.vraag4_no(driver).click();
		AlgemeneVragenObjecten.vraag5_no(driver).click();
		AlgemeneVragenObjecten.vraag6_no(driver).click();
		AlgemeneVragenObjecten.vraag7_no(driver).click();
		AlgemeneVragenObjecten.vraag8_no(driver).click();
		AlgemeneVragenObjecten.vraag9_no(driver).click();
		AlgemeneVragenObjecten.vraag10_no(driver).click();
		AlgemeneVragenObjecten.vraag11_no(driver).click();
		AlgemeneVragenObjecten.vraag12_no(driver).click();
		AlgemeneVragenObjecten.vraag13_no(driver).click();
		AlgemeneVragenObjecten.vraag14_no(driver).click();
		AlgemeneVragenObjecten.vraag15_no(driver).click();
		AlgemeneVragenObjecten.Toelichting(driver).clear();
		AlgemeneVragenObjecten.Toelichting(driver).sendKeys("regel 2");

	}
	
	@When("^open the form Algemene Gegevens$")
	public void open_the_form_Algemene_Gegevens() throws Throwable {

		NavigerenObjecten.NavigerenAlgemeneGegevens(driver).click();
				
	}

	@Then("^i can fill out the form Algemene Gegevens$")
	public void i_can_fill_out_the_form_Algemene_Gegevens() throws Throwable {
		AlgemeneGegevensObjecten.HandelsnaamOnderneming(driver).clear();
		AlgemeneGegevensObjecten.HandelsnaamOnderneming(driver).sendKeys("Handelsnaam onderneming");
		AlgemeneGegevensObjecten.RSIN(driver).clear();
		AlgemeneGegevensObjecten.RSIN(driver).sendKeys("RSIN");
		AlgemeneGegevensObjecten.BoekjaarBegin(driver).sendKeys("01-01-2016");
		AlgemeneGegevensObjecten.BoekjaarEind(driver).sendKeys("31-12-2016");
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
	
}
