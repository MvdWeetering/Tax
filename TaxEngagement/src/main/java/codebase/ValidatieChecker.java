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

	public static void main(String[] args) {
		//System.out.println(CheckValue("123", 10, false));
		
		String A = "[Negatief] Dit veld moet een positief getal bevatten";
		String B = "[Negatief] Dit veld moet een positief getal bevatten";
		
		
		if (A.equals(B)) {
			
			
			System.out.println("zelfde");
		}
		
		
	}

}




