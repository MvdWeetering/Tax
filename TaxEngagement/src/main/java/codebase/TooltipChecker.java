package codebase;

import pageObjects.*;
import java.util.ArrayList;
import org.openqa.selenium.interactions.Actions;

public class TooltipChecker extends AbstractSteps {

	static Actions action = new Actions(driver);

	static ArrayList<String> ValidatieResultaat = new ArrayList<String>();

	static ArrayList<String> checker = new ArrayList<String>();

	public static ArrayList<String> CheckTooltip(String Naamobject, int lengte, boolean leegJaNee) throws Exception {

		// mous-over naar naamobject
		action.moveToElement(invoke(SpecificatieAandeelhoudersObjecten.class, Naamobject)).build().perform();
		Thread.sleep(800);

		invoke(SpecificatieAandeelhoudersObjecten.class, Naamobject).click();

		// checker
		checker = codebase.ValidatieChecker.CheckValue(invoke(SpecificatieAandeelhoudersObjecten.class, Naamobject).getAttribute("value"), lengte, leegJaNee);

		if (!checker.isEmpty()) {
			if (checker.contains("Te lang")) {
				if (!invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject).getText().contains("[Aantal tekens] Dit veld mag maximaal " + lengte + " karakters bevatten")) {
					ValidatieResultaat.add("Tooltip " + Naamobject + " onjuist: te veel karakters");
				}
				if (checker.contains("Negatief")) {
					if (!invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject).getText().contains("[Negatief] Dit veld moet een positief getal bevatten")) {
						ValidatieResultaat.add("Tooltip " + Naamobject + " onjuist: Negatief getal");
						System.out.println(invoke(SpecificatieAandeelhoudersTooltipObjects.class, Naamobject).getText());
					}
				}
			}
		}
		return ValidatieResultaat;
	}
}
