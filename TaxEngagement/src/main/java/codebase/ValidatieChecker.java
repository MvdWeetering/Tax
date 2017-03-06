package codebase;

import java.util.ArrayList;

import pageObjects.SpecificatieAandeelhoudersObjecten;

public class ValidatieChecker {

	public static ArrayList<String> CheckValue(String inputwaarde, int Max, boolean NegAllowed) {
		ArrayList<String> Feedback = new ArrayList<String>();
		
		if (!NegAllowed) { 
			if (inputwaarde.contains("-")) {
				Feedback.add("Negatief");
			}
		}
		if (inputwaarde.length() > Max) {
			Feedback.add("Te lang");
		}
		return Feedback;
	}
}




