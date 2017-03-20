package codebase;

import java.util.ArrayList;

public class ValidatieChecker {

	public static ArrayList<String> CheckValue(String inputwaarde, int Min, int Max, boolean NegAllowed, boolean BSNJa) {
		ArrayList<String> Feedback = new ArrayList<String>();
		
		if (!NegAllowed) { 
			if (inputwaarde.contains("-")) {
				Feedback.add("Negatief");
			}
		}
		if (inputwaarde.length() > Max) {
			Feedback.add("Te lang");
		}
	
		if (inputwaarde.length() < Min) {
		Feedback.add("Te Kort");
		}
		if (BSNJa) {
			Feedback.add("BSN");
		}
		return Feedback;
	}

public static void main(String[] args) {
	
	
	System.out.println(CheckValue("Vrdst", 6, 20, true, false));
	
	
}



}




