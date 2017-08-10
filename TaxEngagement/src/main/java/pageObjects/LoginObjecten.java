package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginObjecten {

	
	private static WebElement element = null;

	public static WebElement UserName(WebDriver driver){
		element = driver.findElement(By.cssSelector("[type='email']"));
		return element;
	}

	public static WebElement PassWord(WebDriver driver){
		element = driver.findElement(By.cssSelector("[type='password']"));

		return element;
	}
	
	public static WebElement buttonInloggen(WebDriver driver){
		
		
		element =  driver.findElement(By.className("GAQ-1UMBKYC"));
		return element;
	}


	
}
