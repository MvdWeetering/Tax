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
		
		element =  driver.findElement(By.xpath("/html/body/div[@class='GOMEOCKDICD']/div[@class='GOMEOCKDECD speechBubbleWidget GOMEOCKDHCD']/div/div[@class='GOMEOCKDEJD']/div[@class='GOMEOCKDDJD'][1]/div[@class='GOMEOCKDCJD'][11]/a[@class='gwt-Anchor']/div[@class='gwt-Label']"));
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
	    element = driver.findElement(By.className(("GOMEOCKDB3C")));
		return element;
	}
	public static WebElement Zoekveld(WebDriver driver){
	    element = driver.findElement(By.xpath("/html/body/div[@id='content']/div[@class='GOMEOCKDJBD']/div[@class='GOMEOCKDGBD']/div[@class='GOMEOCKDFBD']/div/div[2]/div[@id='main']/div[@class='GOMEOCKDLXC boxFix']/div/div[4]/div[@class='gwt-SplitLayoutPanel GOMEOCKDPXE']/div[4]/div[@class='GOMEOCKDO4']/div[@class='GOMEOCKDAEF']/div[@class='GOMEOCKDIDF cw-ButtonBar']/div[@class='GOMEOCKDMDF GOMEOCKDH3 GOMEOCKDA4 GOMEOCKDF4 GOMEOCKDDBB']/div[@class='GOMEOCKDDDF GOMEOCKDK3']/div[@class='GOMEOCKDEBD GOMEOCKDH3']/div[@class='GOMEOCKDBBD GOMEOCKDCBD GOMEOCKDH3 GOMEOCKDA4']/div[@class='GOMEOCKDPAD']/input[@class='gwt-TextBox GOMEOCKDOAD']"));
		return element;
	}
}
