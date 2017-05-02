package codebase;

import pageObjects.*;
import java.util.ArrayList;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TooltipChecker extends AbstractSteps {

	static ArrayList<String> TooltipResult = new ArrayList<String>();
	static ArrayList<String> checker = new ArrayList<String>();

	public static ArrayList<String> CheckTooltipSpecAandeelhouders(String Naamobject, int Minlengte, int Maxlengte, boolean PosHeelGetal, boolean BSNJa, WebDriver driver) throws Exception {
		Actions action = new Actions(driver);
		TooltipResult.clear();
		Thread.sleep(600);
		// mous-over naar naamobject
		action.moveToElement(invoke(SpecificatieAandeelhoudersObjecten.class, Naamobject, driver)).build().perform();
	
		invoke(SpecificatieAandeelhoudersObjecten.class, Naamobject, driver).click();

		// checker
		checker.clear();
		checker = codebase.ValidatieChecker.CheckValue(invoke(SpecificatieAandeelhoudersObjecten.class, Naamobject, driver).getAttribute("value"), Minlengte, Maxlengte, PosHeelGetal, BSNJa);
		if (!checker.isEmpty()) {
			try {
				WebElement elem = invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver);
				// Null indicates: expected tooltip text balloon is missing
				if (elem == null) {
					TooltipResult.add("Tooltip ontbreekt voor element " + Naamobject);
					System.out.println("Tooltip ontbreekt voor element:" + Naamobject);
				} 
				
				else {
						if (checker.contains("BSN")) {
							if (!invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText().contains("[11 Proef] Dit veld voldoet niet aan de 11 proef of bevat geen 9 cijfers")) {
								TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[11 Proef] Dit veld voldoet niet aan de 11 proef of bevat geen 9 cijfers \r\n");
							}
						}
						else {
							if (checker.contains("Te lang")) {
									if (!invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText().contains("[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten")) {
										TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten\" \r\n");
										System.out.println(Naamobject);
										System.out.println("gelezen:" + invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText());
										System.out.println("verwacht:[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten \r\n");
									}
									
							}
								
							if (checker.contains("Geen positief getal")) {
										if (!invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText().contains("[Negatief] Dit veld moet een positief getal bevatten")) {
											TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Negatief] Dit veld moet een positief getal bevatten\" \r\n ");
											System.out.println(Naamobject);
											System.out.println("gelezen:" +invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText());
											System.out.println("verwacht:[Negatief] Dit veld moet een positief getal bevatten \r\n ");
										}
							}
								
							if (checker.contains("Te Kort")) {
									if (!invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText().contains("[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten")) {
										TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten\" \r\n");
										System.out.println(Naamobject);
										System.out.println("gelezen:" +invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject, driver).getText());
										System.out.println("verwacht:[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten \r\n");
									}
							}
					}
				}
			}
			 catch (NoSuchElementException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				System.out.println("no element found");
			 }
		}
		return TooltipResult;

		
	}
	
	public static ArrayList<String> CheckTooltipAlgemeneGegevens(String Naamobject, int Minlengte, int Maxlengte, boolean PosHeelGetal, boolean BSNJa, WebDriver driver) throws Exception {
		Actions action = new Actions(driver);
		TooltipResult.clear();
		Thread.sleep(600);
		// mous-over naar naamobject
		action.moveToElement(invoke(AlgemeneGegevensObjecten.class, Naamobject, driver)).build().perform();
	
		invoke(AlgemeneGegevensObjecten.class, Naamobject, driver).click();

		// checker
		checker.clear();
		checker = codebase.ValidatieChecker.CheckValue(invoke(AlgemeneGegevensObjecten.class, Naamobject, driver).getAttribute("value"), Minlengte, Maxlengte, PosHeelGetal, BSNJa);
		if (!checker.isEmpty()) {
			try {
				WebElement elem = invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver);
				// Null indicates: expected tooltip text balloon is missing
				if (elem == null) {
					TooltipResult.add("Tooltip ontbreekt voor element " + Naamobject);
					System.out.println("Tooltip ontbreekt voor element:" + Naamobject);
				} 
				
				else {
						if (checker.contains("BSN")) {
							if (!invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText().contains("[11 Proef] Dit veld voldoet niet aan de 11 proef of bevat geen 9 cijfers")) {
								TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[11 Proef] Dit veld voldoet niet aan de 11 proef of bevat geen 9 cijfers \r\n");
							}
						}
						else {
							if (checker.contains("Te lang")) {
									if (!invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText().contains("[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten")) {
										TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten\" \r\n");
										System.out.println(Naamobject);
										System.out.println("gelezen:" + invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText());
										System.out.println("verwacht:[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten \r\n");
									}
									
							}
								
							if (checker.contains("Geen positief getal")) {
										if (!invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText().contains("[Negatief] Dit veld moet een positief getal bevatten")) {
											TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Negatief] Dit veld moet een positief getal bevatten\" \r\n ");
											System.out.println(Naamobject);
											System.out.println("gelezen:" +invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText());
											System.out.println("verwacht:[Negatief] Dit veld moet een positief getal bevatten \r\n ");
										}
							}
								
							if (checker.contains("Te Kort")) {
									if (!invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText().contains("[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten")) {
										TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten\" \r\n");
										System.out.println(Naamobject);
										System.out.println("gelezen:" +invoke(AlgemeneGegevensTooltipObjects.class, Naamobject, driver).getText());
										System.out.println("verwacht:[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten \r\n");
									}
							}
					}
				}
			}
			 catch (NoSuchElementException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				System.out.println("no element found");
			 }
		}
		return TooltipResult;
	}
	public static ArrayList<String> CheckTooltipToelichtingBalans(String Naamobject, int Minlengte, int Maxlengte, boolean PosHeelGetal, boolean BSNJa, WebDriver driver) throws Exception {
		Actions action = new Actions(driver);
		TooltipResult.clear();
		Thread.sleep(600);
		// mous-over naar naamobject
		action.moveToElement(invoke(ToelichtingBalansObjecten.class, Naamobject, driver)).build().perform();
	
		invoke(ToelichtingBalansObjecten.class, Naamobject, driver).click();

		// checker
		checker.clear();
		checker = codebase.ValidatieChecker.CheckValue(invoke(ToelichtingBalansObjecten.class, Naamobject, driver).getAttribute("value"), Minlengte, Maxlengte, PosHeelGetal, BSNJa);
		if (!checker.isEmpty()) {
			try {
				WebElement elem = invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver);
				// Null indicates: expected tooltip text balloon is missing
				if (elem == null) {
					TooltipResult.add("Tooltip ontbreekt voor element " + Naamobject);
					System.out.println("Tooltip ontbreekt voor element:" + Naamobject);
				} 
				
				else {
						if (checker.contains("BSN")) {
							if (!invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText().contains("[11 Proef] Dit veld voldoet niet aan de 11 proef of bevat geen 9 cijfers")) {
								TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[11 Proef] Dit veld voldoet niet aan de 11 proef of bevat geen 9 cijfers \r\n");
							}
						}
						else {
							if (checker.contains("Te lang")) {
									if (!invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText().contains("[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten")) {
										TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten\" \r\n");
										System.out.println(Naamobject);
										System.out.println("gelezen:" + invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText());
										System.out.println("verwacht:[Aantal karakters] Dit veld mag maximaal " + Maxlengte + " karakters bevatten \r\n");
									}
									
							}
								
							if (checker.contains("Geen positief getal")) {
										if (!invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText().contains("[Negatief] Dit veld moet een positief getal bevatten")) {
											TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Negatief] Dit veld moet een positief getal bevatten\" \r\n ");
											System.out.println(Naamobject);
											System.out.println("gelezen:" +invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText());
											System.out.println("verwacht:[Negatief] Dit veld moet een positief getal bevatten \r\n ");
										}
							}
								
							if (checker.contains("Te Kort")) {
									if (!invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText().contains("[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten")) {
										TooltipResult.add("Tooltip " + Naamobject + " onjuist: verwachte text was: \"[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten\" \r\n");
										System.out.println(Naamobject);
										System.out.println("gelezen:" +invoke(ToelichtingBalansTooltipObjecten.class, Naamobject, driver).getText());
										System.out.println("verwacht:[Aantal karakters] Dit veld moet minimaal " + Minlengte + " karakters bevatten \r\n");
									}
							}
					}
				}
			}
			 catch (NoSuchElementException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				System.out.println("no element found");
			 }
		}
		return TooltipResult;

		
	}
}
