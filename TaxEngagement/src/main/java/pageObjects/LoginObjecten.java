package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginObjecten {

	
	private static WebElement element = null;

	public static WebElement UserName(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input.GOMEOCKDEWC.GOMEOCKDFWC"));
		return element;
	}

	public static WebElement PassWord(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input.GOMEOCKDEWC.GOMEOCKDGWC"));
		return element;
	}
	
	public static WebElement buttonInloggen(WebDriver driver){
		element =  driver.findElement(By.cssSelector("button.GOMEOCKDKWC"));
		return element;
	}


	
}
