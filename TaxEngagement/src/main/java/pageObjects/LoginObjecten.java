package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginObjecten {

	
	private static WebElement element = null;

	public static WebElement UserName(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input.GAQ-1UMBEYC.GAQ-1UMBFYC"));
		return element;
	}

	public static WebElement PassWord(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input.GAQ-1UMBEYC.GAQ-1UMBGYC"));
		return element;
	}
	
	public static WebElement buttonInloggen(WebDriver driver){
		element =  driver.findElement(By.className("GAQ-1UMBKYC"));
		return element;
	}


	
}
