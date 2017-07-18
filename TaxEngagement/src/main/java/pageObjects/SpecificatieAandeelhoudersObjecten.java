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
	
	@FieldName(name = "Natuurlijkpersoon")
	public static WebElement Natuurlijkpersoon(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLShareholder']"));
		return element;
	}
	
	@FieldName(name = "NatuurlijkpersoonNo")
	public static WebElement Natuurlijkpersoon_nee(WebDriver driver){
	element = driver.findElement(By.cssSelector("[for='idCWNLShareholder-no']"));
	return element;
	
	}
	@FieldName(name = "BSN")
	public static WebElement BSN(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsc"));
		return element;
	}
	@FieldName(name = "Straatnaam")
	public static WebElement Straatnaam(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsg"));
		return element;
	}
	@FieldName(name = "Huisnummer")
	public static WebElement Huisnummer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsi"));
		return element;
	}
	@FieldName(name = "Postcode")
	public static WebElement Postcode(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAandeelhouderPostcode"));
		return element;
	}
	
	@FieldName(name = "HuisnrToev")
	public static WebElement HuisnrToev(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsj"));
		return element;
	}
	
	@FieldName(name = "Woonplaats")
	public static WebElement Woonplaats(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsk"));
		return element;
	}
	@FieldName(name = "Land")
	public static WebElement Land(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsm"));
		return element;
	}
	
	@FieldName(name = "NominalewaardeAandelen")
	public static WebElement NominalewaardeAandelen(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzso"));
		return element;
	}
	@FieldName(name = "NominalewaardePreferente")
	public static WebElement NominalewaardePreferente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsq"));
		return element;
	}
	@FieldName(name = "NominalewaardePrioriteits")
	public static WebElement NominalewaardePrioriteits(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzss"));
		return element;
	}
	@FieldName(name = "PercentageNominaal")
	public static WebElement PercentageNominaal(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsu"));
		return element;
	}
	
	@FieldName(name = "VorderingBelastingplichtige")
	public static WebElement VorderingBelastingplichtige(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsw"));
		return element;
	}
	@FieldName(name = "SchuldBelastingplichtige")
	public static WebElement SchuldBelastingplichtige(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt1"));
		return element;
	}
	
	@FieldName(name = "BoekjaarOntvangenRente")
	public static WebElement BoekjaarOntvangenRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsy"));
		return element;
	}

	@FieldName(name = "BoekjaarBetaaldeRente")
	public static WebElement BoekjaarBetaaldeRente(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt3"));
		return element;
	}
	
	@FieldName(name = "informeleKapitaalstorting")
	public static WebElement informeleKapitaalstorting(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68gz']"));
		return element;
	}

	@FieldName(name = "informeleKapitaalstortingNee")
	public static WebElement informeleKapitaalstortingNee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68gz-no']"));
		return element;
	}
	
	@FieldName(name = "NaamRechtspersoon")
	public static WebElement NaamRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idn26n68ha"));
		return element;
	}
	
	@FieldName(name = "StraatnaamRechtspersoon")
	public static WebElement StraatnaamRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idn26n68hb"));
		return element;
	}
	
	@FieldName(name = "HuisnummerRechtspersoon")
	public static WebElement HuisnummerRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idn26n68hc"));
		return element;
	}
	
	@FieldName(name = "ToevHuisnummerRechtspersoon")
	public static WebElement ToevHuisnummerRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idn26n68hd"));
		return element;
	}
	
	@FieldName(name = "VestigingsplaatsRechtspersoon")
	public static WebElement VestigingsplaatsRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idn26n68he"));
		return element;
	}	
	
	@FieldName(name = "VestigingslandRechtspersoon")
	public static WebElement VestigingslandRechtspersoon(WebDriver driver){
		element = driver.findElement(By.id("idn26n68hf"));
		return element;
	}
     
	@FieldName(name = "BedragInformeleKapitaalStorting")
	public static WebElement BedragInformeleKapitaalStorting(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h0"));
		return element;
	}
	
	@FieldName(name = "WaaromInformeleKapitaalstorting")
	public static WebElement WaaromInformeleKapitaalstorting(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h1"));
		return element;
	}
	
	@FieldName(name = "NaamMoedermaatschappij")
	public static WebElement NaamMoedermaatschappij(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h2"));
		return element;
	}
	
	@FieldName(name = "MoederMaatschappijStraatnaam")
	public static WebElement MoederMaatschappijStraatnaam(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h3"));
		return element;
	}
	
	@FieldName(name = "MoederMaatschappijHuisnummer")
	public static WebElement MoederMaatschappijHuisnummer(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h4"));
		return element;
	}
	
	@FieldName(name = "MoederMaatschappijHuisnummerToev")
	public static WebElement MoederMaatschappijHuisnummerToev(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h5"));
		return element;
	}
	
	@FieldName(name = "MoederMaatschappijVestigingsplaats")
	public static WebElement MoederMaatschappijVestigingsplaats(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h6"));
		return element;
	}
	
	@FieldName(name = "MoederMaatschappijVestigingsland")
	public static WebElement MoederMaatschappijVestigingsland(WebDriver driver){
		element = driver.findElement(By.id("idn26n68h7"));
		return element;
	}
	
	@FieldName(name = "BevoordelingvanAandeelhouderJa")
	public static WebElement BevoordelingvanAandeelhouderJa(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68h8']"));
		return element;
	}
	
	@FieldName(name = "BevoordelingvanAandeelhouderNee")
	public static WebElement BevoordelingvanAandeelhouderNee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68h8-no']"));
		return element;
	}
}
