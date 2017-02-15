package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlgemeneGegevensObjecten {
	
	private static WebElement element = null;

	public static WebElement HandelsnaamOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5o"));
		return element;
	}
	
	public static WebElement RSIN(WebDriver driver){
		element = driver.findElement(By.id("idcontextIdentifier"));
		return element;
	}
	
	public static WebElement BoekjaarBegin(WebDriver driver){
		element = driver.findElement(By.id("idcontextStartDate"));
		return element;
	}
	public static WebElement BoekjaarEind(WebDriver driver){
		element = driver.findElement(By.id("idcontextEndDate"));
		return element;
	}
	public static WebElement StandpuntExplicieteUitspraak_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzez"));
		return element;
	}
	public static WebElement StandpuntExplicieteUitspraak_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzez-no"));
		return element;
	}
	public static WebElement AangifteFiscaleEenheid_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz68"));
		return element;
	}
	public static WebElement AangifteFiscaleEenheid_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz68-no"));
		return element;
	}
	public static WebElement FunctioneleValuta_Ja(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz65"));
		return element;
	}
	public static WebElement FunctioneleValuta_Nee(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz65-no"));
		return element;
	}
	public static WebElement Beconnummer(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5r"));
		return element;
	}
	public static WebElement Clientgroep(WebDriver driver){
		element = driver.findElement(By.id("idCWNLClientgroep"));
		return element;
	}
	public static WebElement Aanhef(WebDriver driver){
		element = driver.findElement(By.id("idCWNLAanhef"));
		return element;
	}
	public static WebElement VoorlettersContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5s"));
		return element;
	}
	public static WebElement TussenvoegselContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5u"));
		return element;
	}
	public static WebElement AchternaamContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5v"));
		return element;
	}
	public static WebElement TelefoonnummerContact(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz5w"));
		return element;
	}
	public static WebElement Straatnaam(WebDriver driver){
		element = driver.findElement(By.id("idCWNLConsulentStraatnaam"));
		return element;
	}
	public static WebElement Huisnummer(WebDriver driver){
		element = driver.findElement(By.id("idCWNLConsulentHuisnummer"));
		return element;
	}
	public static WebElement Postcode(WebDriver driver){
		element = driver.findElement(By.id("idCWNLConsulentPostcode"));
		return element;
	}
	public static WebElement HuisnummerToevoeging(WebDriver driver){
		element = driver.findElement(By.id("idCWNLConsulentHuisnummertoevoeging"));
		return element;
	}
	public static WebElement Plaats(WebDriver driver){
		element = driver.findElement(By.id("idCWNLConsulentPlaats"));
		return element;
	}
	public static WebElement VoorlettersOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6a"));
		return element;
	}
	public static WebElement TussenvoegselOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6c"));
		return element;
	}
	public static WebElement AchternaamOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6d"));
		return element;
	}
	public static WebElement FunctieOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6f"));
		return element;
	}
	public static WebElement TelefoonnummerOndertekenaar(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tz6h"));
		return element;
	}
	public static WebElement Toelichtingverzoek(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzf0"));
		return element;
	}
	
	
	
	
}
