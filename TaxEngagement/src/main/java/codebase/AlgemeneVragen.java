package codebase;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import codebase.Inloggen;
import pageObjects.AlgemeneVragenObjecten;
import pageObjects.NavigerenObjecten;

public class AlgemeneVragen {

	public static void main(String[] args) throws InterruptedException {
			
		InvullenVragen("Test Jonathan");
		
	}

	public static boolean InvullenVragen(String Project) throws InterruptedException {
	
	WebDriver driver = Inloggen.LoginWithCredentials("michel.van.de.weetering@caseweare.nl","Welkom01");
		
	Thread.sleep(5000);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    String oldTab = driver.getWindowHandle();
    
    driver.findElement(By.linkText(Project)).click();
    
        
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
    newTab.remove(oldTab);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    driver.switchTo().window(newTab.get(0));
    
    Thread.sleep(3500);
    
    NavigerenObjecten.NavigerenAlgemeneVragen(driver).click();
    Thread.sleep(1500);
    
    AlgemeneVragenObjecten.vraag1_yes(driver).click();
    AlgemeneVragenObjecten.vraag2_yes(driver).click();
    AlgemeneVragenObjecten.vraag3_yes(driver).click();
    AlgemeneVragenObjecten.vraag4_yes(driver).click();
    AlgemeneVragenObjecten.vraag5_yes(driver).click();
    AlgemeneVragenObjecten.vraag6_yes(driver).click();
    AlgemeneVragenObjecten.vraag7_yes(driver).click();
    AlgemeneVragenObjecten.vraag8_yes(driver).click();
    AlgemeneVragenObjecten.vraag9_yes(driver).click();
    AlgemeneVragenObjecten.vraag10_yes(driver).click();
    AlgemeneVragenObjecten.vraag11_yes(driver).click();
    AlgemeneVragenObjecten.vraag12_yes(driver).click();
    AlgemeneVragenObjecten.vraag13_yes(driver).click();
    AlgemeneVragenObjecten.vraag14_yes(driver).click();
    AlgemeneVragenObjecten.vraag15_yes(driver).click();
    AlgemeneVragenObjecten.Toelichting(driver).sendKeys("en weer terug");
    
    Thread.sleep(1500);
    
    AlgemeneVragenObjecten.vraag1_no(driver).click();
    AlgemeneVragenObjecten.vraag2_no(driver).click();
    AlgemeneVragenObjecten.vraag3_no(driver).click();
    AlgemeneVragenObjecten.vraag4_no(driver).click();
    AlgemeneVragenObjecten.vraag5_no(driver).click();
    AlgemeneVragenObjecten.vraag6_no(driver).click();
    AlgemeneVragenObjecten.vraag7_no(driver).click();
    AlgemeneVragenObjecten.vraag8_no(driver).click();
    AlgemeneVragenObjecten.vraag9_no(driver).click();
    AlgemeneVragenObjecten.vraag10_no(driver).click();
    AlgemeneVragenObjecten.vraag11_no(driver).click();
    AlgemeneVragenObjecten.vraag12_no(driver).click();
    AlgemeneVragenObjecten.vraag13_no(driver).click();
    AlgemeneVragenObjecten.vraag14_no(driver).click();
    AlgemeneVragenObjecten.vraag15_no(driver).click();
    AlgemeneVragenObjecten.Toelichting(driver).clear();
    AlgemeneVragenObjecten.Toelichting(driver).sendKeys("WHIEEEEEEEE !!!!");
    
    return false;
    
	}
}
