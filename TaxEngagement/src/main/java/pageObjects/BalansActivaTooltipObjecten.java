package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalansActivaTooltipObjecten {
	private static WebElement element = null;

	//Algemeen
	@FieldName(name = "NaamOnderneming")
	public static WebElement NaamOnderneming(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzlh-popover"));
		return element;
	}
	@FieldName(name = "OmschrijvingActiviteit")
	public static WebElement OmschrijvingActiviteit(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzli-popover"));
		return element;
	}
}
