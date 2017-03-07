package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieAandeelhoudersObjecten {
	private static WebElement element = null;
	

	@FieldName(name = "NaamAandeelhouder")
	public static WebElement NaamAandeelhouder(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzse"));
		return element;
	}
	public static WebElement Natuurlijkpersoon(WebDriver driver){
		element = driver.findElement(By.id("idCWNLShareholder"));
		return element;
	}
		public static WebElement Natuurlijkpersoon_nee(WebDriver driver){
			element = driver.findElement(By.id("idCWNLShareholder-no"));
			return element;
	}
	public static WebElement BSN(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsc"));
		return element;
	}
	public static WebElement Straatnaam(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsg"));
		return element;
	}
	public static WebElement Huisnummer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsi"));
		return element;
	}
	public static WebElement Postcode(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAandeelhouderPostcode"));
		return element;
	}
	public static WebElement HuisnrToev(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsj"));
		return element;
	}
	public static WebElement Woonplaats(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsk"));
		return element;
	}
	public static WebElement Land(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsm"));
		return element;
	}
	public static WebElement NominalewaardeAandelen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzso"));
		return element;
	}
	public static WebElement NominalewaardePreferente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsq"));
		return element;
	}
	public static WebElement NominalewaardePrioriteits(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzss"));
		return element;
	}
	public static WebElement PercentageNominaal(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsu"));
		return element;
	}
	public static WebElement VorderingBelastingplichtige(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsw"));
		return element;
	}
	public static WebElement SchuldBelastingplichtige(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt1"));
		return element;
	}
	public static WebElement BoekjaarOntvangenRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsy"));
		return element;
	}

	public static WebElement BoekjaarBetaaldeRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt3"));
		return element;
	}
	
	public static WebElement informeleKapitaalstorting(WebDriver driver){
		element = driver.findElement(By.id("idn26n68gz"));
		return element;
	}

	public static WebElement informeleKapitaalstortingNee(WebDriver driver){
		element = driver.findElement(By.id("idn26n68gz-no"));
		return element;
	}
	
	public static WebElement NaamRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idtable_TK_NO:0-0"));
		return element;
	}
	public static WebElement StraatnaamRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idtable_TK_NO:0-2"));
		return element;
	}
	public static WebElement HuisnummerRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idtable_TK_NO:0-4"));
		return element;
	}
	public static WebElement ToevHuisnummerRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idtable_TK_NO:0-6"));
		return element;
	}
	public static WebElement VestigingsplaatsRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idtable_TK_NO:0-8"));
		return element;
	}	
	public static WebElement VestigingslandRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idtable_TK_NO:0-10"));
		return element;
	}
     
	public static WebElement BedragInformeleKapitaalStorting(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h0"));
		return element;
	}
	
	public static WebElement WaaromInformeleKapitaalstorting(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h1"));
		return element;
	}
	
	public static WebElement NaamMoedermaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h2"));
		return element;
	}
	public static WebElement MoederMaatschappijStraatnaam(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h3"));
		return element;
	}
	public static WebElement MoederMaatschappijHuisnummer(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h4"));
		return element;
	}
	public static WebElement MoederMaatschappijHuisnummerToev(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h5"));
		return element;
	}
	public static WebElement MoederMaatschappijVestigingsplaats(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h6"));
		return element;
	}
	public static WebElement MoederMaatschappijVestigingsland(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h7"));
		return element;
	}
	public static WebElement BevoordelingvanAandeelhouderJa(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h8"));
		return element;
	}
	public static WebElement BevoordelingvanAandeelhouderNee(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h8-no"));
		return element;
	}
}
