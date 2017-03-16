package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlgemeneGegevensTooltipObjects {
	
	private static WebElement element = null;
	
	@FieldName(name = "RSIN")
	public static WebElement RSIN(WebDriver driver){
		element = driver.findElement(By.id("idcontextIdentifier-popover"));
		return element;
	}
}
