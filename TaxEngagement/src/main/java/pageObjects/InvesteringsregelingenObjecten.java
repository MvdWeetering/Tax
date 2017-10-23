package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvesteringsregelingenObjecten {
	private static WebElement element = null;

	public static WebElement GrondslagKostprijs_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68hx']"));
		return element;
	}
	
	public static WebElement GrondslagKostprijs_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68hx-no']"));
		return element;
	}
	
	public static WebElement BeroepOpOntheffingNaasteVerwanten_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68hy']"));
		return element;
	}
	
	public static WebElement BeroepOpOntheffingNaasteVerwanten_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68hy-no']"));
		return element;
	}
	
	public static WebElement BeroepOpOntheffingNaasteNalatenschap_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68hz']"));
		return element;
	}
	public static WebElement BeroepOpOntheffingNaasteNalatenschap_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idn26n68hz-no']"));
		return element;
	}
	
	public static WebElement InvesteringsAftrek_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLinvestaftr']"));
		return element;
	}
	
	public static WebElement InvesteringsAftrek_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLinvestaftr-no']"));
		return element;
	}
	
	public static WebElement DesinvesteringsAftrek_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLdesinvestbijt']"));
		return element;
	}
	
	public static WebElement DesinvesteringsAftrek_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLdesinvestbijt-no']"));
		return element;
	}
	
	public static WebElement ResearchAndDevelopment_ja(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLrdaftrek']"));
		return element;
	}
	
	public static WebElement ResearchAndDevelopment_nee(WebDriver driver){
		element = driver.findElement(By.cssSelector("[for='idCWNLrdaftrek-no']"));
		return element;
	}
	
	public static WebElement OmschrijvingBedrijfsmiddel(WebDriver driver){
		element = driver.findElement(By.id("idtableSpecSIRRDA:0-1"));
		return element;
	}
	
	public static WebElement TotaalKleinschalig(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzty"));
		return element;
	}
	
	public static WebElement bedrag(WebDriver driver){
		element = driver.findElement(By.id("idtableSpecSIRRDA:0-3"));
		return element;
	}
	
}
