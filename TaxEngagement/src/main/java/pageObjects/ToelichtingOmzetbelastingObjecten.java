package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToelichtingOmzetbelastingObjecten {
	private static WebElement element = null;
	
	//Gebouwen zonder bodemwaarde
	public static WebElement SchuldVorderingOmzetbelastingDitBoekjaarBegin(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmzSchVorCurYear"));
		return element;
	}
	public static WebElement SchuldVorderingOmzetbelastingDitBoekjaarEind(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrc"));
		return element;
	}
	
	public static WebElement SchuldVorderingOmzetbelastingVorigBoekjaarBegin(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmzSchVorPrevYear"));
		return element;
	}
	
	public static WebElement SchuldVorderingOmzetbelastingVorigBoekjaarEind(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrg"));
		return element;
	}
		
	public static WebElement SchuldVorderingOmzetbelastingOudereBoekjarenBegin(WebDriver driver){
		element = driver.findElement(By.id("idCWNLOmzSchVorPreviousYears"));
		return element;
	}
	
	public static WebElement SchuldVorderingOmzetbelastingOudereBoekjarenEind(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzrk"));
		return element;
	}
	
}
