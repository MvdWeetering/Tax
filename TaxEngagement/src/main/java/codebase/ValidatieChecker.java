package codebase;

import java.util.ArrayList;

public class ValidatieChecker {

	public static ArrayList<String> CheckValue(String inputwaarde, int Min, int Max, String SoortValidatie) {
		ArrayList<String> Feedback = new ArrayList<String>();

		//Textveld
		if (SoortValidatie.equals("TextVeld")) {
		
			}
		// Geheel getal
		if (SoortValidatie.equals("GeheelGetal")) {
			{
				try {
					float n = Float.valueOf(inputwaarde);

					if (n == Math.round(n)) {
						//Feedback.add("GeheelGetal");
					} else {
						Feedback.add("Geheel Getal");
					}
				} catch (NumberFormatException e) {
					Feedback.add("Geen Getal");
				}
			}
		}

		// Positief getal
		if (SoortValidatie.equals("PositiefGetal")) {
			{
				try {
					float n = Float.valueOf(inputwaarde);

					if (n < 0) {
						Feedback.add("Geen positief getal");
					}
					else {
						//Feedback.add("Positief getal");
					}
				} catch (NumberFormatException e) {
					Feedback.add("GeenGetal");
				}
			}
		}
		
		
		// Positief geheel getal
		if (SoortValidatie.equals("PositiefGeheelGetal")) {
			{
				try {
					float n = Float.valueOf(inputwaarde);
					if (n == Math.round(n) &&  n > 0) {
						//Feedback.add("PositiefGeheelGetal");
					}
					
					else {
						Feedback.add("Geen Positief Geheel Getal");
					}
				} catch (NumberFormatException e) {
					Feedback.add("GeenGetal");
				}
			}
		}
		
		// Lengte checkers
		if (inputwaarde.length() > Max) {
			Feedback.add("Te lang");
		}

		if (inputwaarde.length() < Min) {
			Feedback.add("Te Kort");
		}

		// BSN check
		if (SoortValidatie.equals("BSN")) {

			try {
				Integer.parseInt(inputwaarde);
				int n = Integer.parseInt(inputwaarde);
				if (!Elfproef.isValidBSN(n)) {
					Feedback.add("BSN");
				}
			} catch (NumberFormatException e) {
				Feedback.add("BSN");
			}
		}

		// 4 Cijfers
		if (SoortValidatie.equals("4cijfers")) {
			if (!inputwaarde.matches("\\d{4}")) {
			System.out.println("4Cijfers");
			}
		}
		
		if (SoortValidatie.equals("Procent")) {
			if (!inputwaarde.matches("(\\d|\\d{2}|\\d{3})[.]\\d{2}")) {
				Feedback.add("Procent");
			}
		}
		
		if (SoortValidatie.equals("Positief6")) {
			
			if (!inputwaarde.matches("[0-9]{6}")) {
				Feedback.add("Positief6");
			}
		}
		
		if (SoortValidatie.equals("Positief10")) {
			
			try {
				
				Long n = Long.parseLong(inputwaarde);
				Long max = Long.parseLong("9999999999");
				
				if (n < 0 || n > max) {
					Feedback.add("Positief10");
				}
								
			} catch (NumberFormatException e) {
				Feedback.add("Positief10");
			}
		}
		
		if (SoortValidatie.equals("Positief3")) {
			
			try {
				
				Long n = Long.parseLong(inputwaarde);
				Long max = Long.parseLong("999");
				
				if (n < 0 || n > max) {
					Feedback.add("Positief3");
				}
								
			} catch (NumberFormatException e) {
				Feedback.add("Positief3");
			}
		}		
	
		return Feedback;
	}

	public static void main(String[] args) {
		System.out.println(CheckValue("1000", 1, 99, "Positief3"));

	}
}
