package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificatieAandeelhoudersTooltipObjects {
	
	private static WebElement element = null;
	
	public static WebElement VorderingbelastingplichtigeOpaandeelhouder (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsw-popover"));
		return element;
	}
	public static WebElement SchuldbelastingplichtigeOpaandeelhouder (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt1-popover"));
		return element;
	}
	public static WebElement BoekjaarOntvangenRente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzsy-popover"));
		return element;
	}	
	public static WebElement BoekjaarBetaaldeRente (WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzt3-popover"));
		return element;
	}
	
	
	
}
