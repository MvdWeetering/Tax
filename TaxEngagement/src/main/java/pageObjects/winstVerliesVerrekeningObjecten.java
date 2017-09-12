package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class winstVerliesVerrekeningObjecten {
	private static WebElement element = null;

	@FieldName(name = "VerrekeningVerliesDitBoekjaar")
	public static WebElement VerrekeningVerliesDitBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idVerrVerlDitBoek"));
		return element;
	}

	// regel1
	@FieldName(name = "RSINMaatschappij")
	public static WebElement RSINMaatschappij(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:0-0"));
		return element;
	}

	@FieldName(name = "VerliesBoekjaar")
	public static WebElement VerliesBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:0-2"));
		return element;
	}

	@FieldName(name = "VerrekeningVerliesVorigBoekjaar")
	public static WebElement VerrekeningVerliesVorigBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:0-4"));
		return element;
	}

	// regel2

	@FieldName(name = "RSINMaatschappij2")
	public static WebElement RSINMaatschappij2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:1-0"));
		return element;
	}

	@FieldName(name = "VerliesBoekjaar2")
	public static WebElement VerliesBoekjaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:1-2"));
		return element;
	}

	@FieldName(name = "VerrekeningVerliesVorigBoekjaar2")
	public static WebElement VerrekeningVerliesVorigBoekjaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:1-4"));
		return element;
	}

	@FieldName(name = "RestantVerliesBoekjaar")
	public static WebElement RestantVerliesBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEa:0-6"));
		return element;
	}

	// regel 1

	@FieldName(name = "Jaar")
	public static WebElement Jaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecCarryForward:0-0"));
		return element;
	}

	@FieldName(name = "RestantVerrekenenVerliesBeginBoekjaar")
	public static WebElement RestantVerrekenenVerliesBeginBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecCarryForward:0-2"));
		return element;
	}

	@FieldName(name = "VerrekendVerliesDitBoekjaar")
	public static WebElement VerrekendVerliesDitBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecCarryForward:0-4"));
		return element;
	}

	// radiobuttons
	@FieldName(name = "VerliesKwalificeren1_Ja")
	public static WebElement VerliesKwalificeren1_Ja(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[for='idtableSpecCarryForward:0-8']"));
		return element;
	}

	@FieldName(name = "VerliesKwalificeren1_Nee")
	public static WebElement VerliesKwalificeren1_Nee(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[for='idtableSpecCarryForward:0-8-no']"));
		return element;
	}

	// regel 2

	@FieldName(name = "Jaar2")
	public static WebElement Jaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecCarryForward:1-0"));
		return element;
	}

	@FieldName(name = "RestantVerrekenenVerliesBeginBoekjaar2")
	public static WebElement RestantVerrekenenVerliesBeginBoekjaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecCarryForward:1-2"));
		return element;
	}

	@FieldName(name = "VerrekendVerliesDitBoekjaar2")
	public static WebElement VerrekendVerliesDitBoekjaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSpecCarryForward:1-4"));
		return element;
	}

	// radiobuttons
	@FieldName(name = "VerliesKwalificeren2_Ja")
	public static WebElement VerliesKwalificeren2_Ja(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[for='idtableSpecCarryForward:1-8']"));
		return element;
	}

	@FieldName(name = "VerliesKwalificeren2_Nee")
	public static WebElement VerliesKwalificeren2_Nee(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[for='idtableSpecCarryForward:1-8-no']"));
		return element;
	}

	// regel 1
	@FieldName(name = "VerrekenenRSINMaatschappij")
	public static WebElement VerrekenenRSINMaatschappij(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:0-0"));
		return element;
	}

	@FieldName(name = "VerrekenenFiscaleEenheidBoekjaarBegin")
	public static WebElement VerrekenenFiscaleEenheidBoekjaarBegin(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:0-2"));
		return element;
	}

	@FieldName(name = "VerrekenenFiscaleEenheidBoekjaarEinde")
	public static WebElement VerrekenenFiscaleEenheidBoekjaarEinde(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:0-4"));
		return element;
	}

	@FieldName(name = "VerrekenenVerliesEindeBoekjaar")
	public static WebElement VerrekenenVerliesEindeBoekjaar(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:0-6"));
		return element;
	}

	@FieldName(name = "TeVerrekenenVerlies")
	public static WebElement TeVerrekenenVerlies(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:0-8"));
		return element;
	}

	// radiobuttons
		@FieldName(name = "VerliesKwalificeren3_Ja")
		public static WebElement VerliesKwalificeren3_Ja(WebDriver driver) {
			element = driver.findElement(By.cssSelector("[for='idtableSamenstellVerrVerlFEb:0-10']"));
			return element;
		}

		@FieldName(name = "VerliesKwalificeren3_Nee")
		public static WebElement VerliesKwalificeren3_Nee(WebDriver driver) {
			element = driver.findElement(By.cssSelector("[for='idtableSamenstellVerrVerlFEb:0-10-no']"));
			return element;
		}
	
	// regel 2
	@FieldName(name = "VerrekenenRSINMaatschappij2")
	public static WebElement VerrekenenRSINMaatschappij2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:1-0"));
		return element;
	}

	@FieldName(name = "VerrekenenFiscaleEenheidBoekjaarBegin2")
	public static WebElement VerrekenenFiscaleEenheidBoekjaarBegin2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:1-2"));
		return element;
	}

	@FieldName(name = "VerrekenenFiscaleEenheidBoekjaarEinde2")
	public static WebElement VerrekenenFiscaleEenheidBoekjaarEinde2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:1-4"));
		return element;
	}

	@FieldName(name = "VerrekenenVerliesEindeBoekjaar2")
	public static WebElement VerrekenenVerliesEindeBoekjaar2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:1-6"));
		return element;
	}

	@FieldName(name = "TeVerrekenenVerlies2")
	public static WebElement TeVerrekenenVerlies2(WebDriver driver) {
		element = driver.findElement(By.id("idtableSamenstellVerrVerlFEb:1-8"));
		return element;
	}


	// radiobuttons
		@FieldName(name = "VerliesKwalificeren4_Ja")
		public static WebElement VerliesKwalificeren4_Ja(WebDriver driver) {
			element = driver.findElement(By.cssSelector("[for='idtableSamenstellVerrVerlFEb:1-10']"));
			return element;
		}

		@FieldName(name = "VerliesKwalificeren4_Nee")
		public static WebElement VerliesKwalificeren4_Nee(WebDriver driver) {
			element = driver.findElement(By.cssSelector("[for='idtableSamenstellVerrVerlFEb:1-10-no']"));
			return element;
		}	
	
	
	
}
