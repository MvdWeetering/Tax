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
		//WebElement Parentelement = driver.findElement(By.className("GOMEOCKDEJD"));
		//WebElement Childelement = Parentelement.findElement(By.className("GOMEOCKDCJD"));
		
		element =  driver.findElement(By.xpath("/html/body/div[@class='GOMEOCKDICD']/div[@class='GOMEOCKDECD speechBubbleWidget GOMEOCKDHCD']/div/div[@class='GOMEOCKDEJD']/div[@class='GOMEOCKDDJD'][1]/div[@class='GOMEOCKDCJD'][11]/a[@class='gwt-Anchor']/div[@class='gwt-Label']"));
				
		return element;
	}
	
	public static WebElement NavigerenAlgemeneVragen(WebDriver driver){
	    element = driver.findElement(By.linkText("Algemene Vragen"));
		return element;
	}
	
	public static WebElement ClickCloud(WebDriver driver){
	    element = driver.findElement(By.className(("GOMEOCKDB3C")));
		return element;
	}
	
}
