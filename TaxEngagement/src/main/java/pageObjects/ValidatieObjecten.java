package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidatieObjecten {
	private static WebElement element = null;
	
	public static WebElement BeoordelenHuidigeModule(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[@id='content']/div[@class='GOMEOCKDJBD']/div[@class='GOMEOCKDGBD']/div[@class='GOMEOCKDFBD']/div/div[2]/div[@id='main']/div[@class='GOMEOCKDLXC boxFix']/div/div[4]/div[@class='gwt-SplitLayoutPanel GOMEOCKDPXE']/div[4]/div[@class='GOMEOCKDO4']/div[@class='GOMEOCKDAEF']/div[@class='GOMEOCKDIDF cw-ButtonBar']/div[@class='GOMEOCKDMDF GOMEOCKDH3 GOMEOCKDA4 GOMEOCKDF4 GOMEOCKDDBB']/div[@class='GOMEOCKDHDF GOMEOCKDH3 GOMEOCKDA4 GOMEOCKDK3']/div[@class='GOMEOCKDGDF GOMEOCKDPDF']/div[@class='GOMEOCKDH3 GOMEOCKDA4']/button[@class='GOMEOCKDEKD GOMEOCKDABB GOMEOCKDIKD']/div[@class='GOMEOCKDH3 GOMEOCKDG4 GOMEOCKDP3']/div[@class='gwt-HTML GOMEOCKDO3']"));
		return element;
	}	
	public static WebElement BeoordelenHuidigeUser(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[@id='content']/div[@class='GOMEOCKDJBD']/div[@class='GOMEOCKDGBD']/div[1]/div/div[@class='GOMEOCKDN4C GOMEOCKDH3 GOMEOCKDD4 GOMEOCKDF4']/div[@class='GOMEOCKDC4C GOMEOCKDO3']/div[@class='GOMEOCKDM3C GOMEOCKDE4C'][2]/div[@class='GOMEOCKDC3C        GOMEOCKDH3 GOMEOCKDA4 GOMEOCKDG4']/div[@class='GOMEOCKDLGD GOMEOCKDH3']/div[@class='GOMEOCKDMGD GOMEOCKDH3 GOMEOCKDA4 GOMEOCKDG4']/div[@class='GOMEOCKDNGD GOMEOCKDDBB']"));
		return element;
	}	
}




