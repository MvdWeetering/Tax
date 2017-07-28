package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiscaleVermogensVergelijksTooltipObjecten {

	private static WebElement element = null;
	
	@FieldName(name = "NietAftrekbaarWinstuitdelingenCooperaties")
	public static WebElement NietAftrekbaarWinstuitdelingenCooperaties(WebDriver driver){
		element = driver.findElement(By.id("idxdt9tzed-popover"));
		return element;
	}
	
	
}
