package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {

	
	private static WebElement element = null;
	
	public static WebElement NavigerenTax(WebDriver driver){
	   /* 
		String NavUrl = null;
	    NavUrl = "https://eu.casewarecloud.com/nl-se-develop/webapps/#Files?viewkey=CustomBundle9&filter=NL+Tax+Engagement&entityId=-1";
	    driver.get(NavUrl);
		return element;
	    */
		
		//element =  driver.findElement(By.xpath("/html/body/div[@class='GOMEOCKDICD']/div[@class='GOMEOCKDECD speechBubbleWidget GOMEOCKDHCD']/div/div[@class='GOMEOCKDEJD']/div[@class='GOMEOCKDDJD'][1]/div[@class='GOMEOCKDCJD'][11]/a[@class='gwt-Anchor']/div[@class='gwt-Label']"));
		
		element = driver.findElement(By.linkText("NL Tax Engagement"));
		
		
		return element;
	}
	
	public static WebElement NavigerenAlgemeneVragen(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Algemene Vragen"));
		return element;
	}
	
	public static WebElement NavigerenAlgemeneGegevens(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Algemene Gegevens"));
		return element;
	}
	public static WebElement NavigerenSpecificatieAandeelhouders(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Specificatie Aandeelhouders"));
		return element;
	}
	
	public static WebElement NavigerenSpecificatie_Deelnemingen(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Specificatie Deelnemingen"));
		return element;
	}
	
	public static WebElement NavigerenToelichting_Balans(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Toelichting balans"));
		return element;
	}
	
	public static WebElement ClickCloud(WebDriver driver){
	    element = driver.findElement(By.className(("GAQ-1UMBA5C")));
		return element;
	}
	public static WebElement Zoekveld(WebDriver driver){
	    WebElement parent = driver.findElement(By.id("main"));
	    element = parent.findElement(By.cssSelector("[class='gwt-TextBox GAQ-1UMBFDD']"));
		return element;
	}
	public static WebElement NavigerenWinstEnVerliesRekening(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Winst- en verliesrekening"));
		return element;
	}
	
	public static WebElement BalansActiva(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Balans: Activa"));
		return element;
	}
	
	
	
	
}
