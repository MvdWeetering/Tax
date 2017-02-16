package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieAandeelhoudersObjecten {
	private static WebElement element = null;

	public static WebElement NaamAandeelhouder(WebDriver driver){
		element = driver.findElement(By.id("idShareholderName"));
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
	
	     
}
