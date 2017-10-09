package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingMaterieleVasteActivaObjecten {
	private static WebElement element = null;
	
	//Gebouwen zonder bodemwaarde
	public static WebElement GebouwenZonderBodemwaardeAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpb"));
		return element;
	}
	public static WebElement GebouwenZonderBodemwaardeFiscale3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpd"));
		return element;
	}
	public static WebElement GebouwenZonderBodemwaardeRestwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpe"));
		return element;
	}
	
	
	//Gebouwen in eigen gebruik
	public static WebElement GebouwenInEigenGebruikAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpi"));
		return element;
	}
	public static WebElement GebouwenInEigenGebruikFiscale3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpm"));
		return element;
	}
	public static WebElement GebouwenInEigenGebruikRestwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpq"));
		return element;
	}
		
	public static WebElement GebouwenInEigenGebruikBodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzps"));
		return element;
	}
	
	//Gebouwen ter belegging gehouden
	public static WebElement GebouwenTerBeleggingAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpv"));
		return element;
	}
	public static WebElement GebouwenTerBeleggingFiscale3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzpy"));
		return element;
	}
	public static WebElement GebouwenTerBeleggingRestwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq0"));
		return element;
	}
	public static WebElement GebouwenTerBeleggingBodemwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq1"));
		return element;
	}
	
	
	//Gebouwen zonder afschrijving
		
	public static WebElement GebouwenZonderAfschrijvingAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq3"));
		return element;
	}
	public static WebElement GebouwenZonderAfschrijvingFiscale3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq5"));
		return element;
	}
	
	//Bedrijfsterreinen
	
	public static WebElement BedrijfsterreinenAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqa"));
		return element;
	}
	public static WebElement BedrijfsterreinenFiscale3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzq9"));
		return element;
	}
	public static WebElement BedrijfsterreinenRestwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqc"));
		return element;
	}

	//Machines
	
	
	public static WebElement MachinesAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqe"));
		return element;
	}

	public static WebElement MachinesRestwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqg"));
		return element;
	}
	
	//Andere vaste bedrijfsmiddelen
	
	public static WebElement AndereVasteBedrijfsmiddelenAanschaf(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqh"));
		return element;
	}

	public static WebElement AndereVasteBedrijfsmiddelenRestwaarde3112(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzqi"));
		return element;
	}
	
}
