package codebase;

import java.math.BigInteger;
import java.util.ArrayList;

public class ValidatieChecker {

	public static ArrayList<String> CheckValue(String inputwaarde, int Min, int Max, String SoortValidatie) {
		ArrayList<String> Feedback = new ArrayList<String>();
		if (inputwaarde.contains(".")) {

			inputwaarde = inputwaarde.replaceAll("\\.", "");

		}

		// Textveld
		if (SoortValidatie.equals("TextVeld")) {

		}
		// Geheel getal
		if (SoortValidatie.equals("GeheelGetal")) {
			{
				try {
					double n = Double.valueOf(inputwaarde);

					if (n == Math.round(n)) {
						// Feedback.add("GeheelGetal");
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
					double n = Double.valueOf(inputwaarde);

					if (n < 0) {
						Feedback.add("Geen positief getal");
					} else {
						// Feedback.add("Positief getal");
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

		
		//BECON
		
		if (SoortValidatie.equals("BECON")) {
			try {
				Integer.parseInt(inputwaarde);
				int n = Integer.parseInt(inputwaarde);
				if (!Elfproef.isValidBecon(n)) {
					Feedback.add("BECON");
				}
			} catch (NumberFormatException e) {
				Feedback.add("BECON");
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
		// Positief geheel getal
		if (SoortValidatie.equals("PositiefGeheelGetal")) {

			{
				try {
					Double n = Double.valueOf(inputwaarde);
					if (n != Math.round(n) || n < 0) {
						Feedback.add("Geen Positief Geheel Getal");
					}
				} catch (NumberFormatException e) {
					Feedback.add("GeenGetal");
				}
			}
		}

		
		if (SoortValidatie.equals("Meldingsnummer")) {

			if (!inputwaarde.matches("[ME][0-9]{9}")) {
			
				Feedback.add("Meldingsnummer");
			}
		}
			
		return Feedback;
	}

	public static void main(String[] args) {

		System.out.println(CheckValue("396631", 1, 21, "BECON"));

	}
}
