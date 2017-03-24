package codebase;

import java.util.ArrayList;

public class ValidatieChecker {

	public static ArrayList<String> CheckValue(String inputwaarde, int Min, int Max, boolean PosHeelGetal,boolean BSNJa) {
		ArrayList<String> Feedback = new ArrayList<String>();

		if (!PosHeelGetal) {
			{
				try {
					Integer.parseInt(inputwaarde);
					int n = Integer.parseInt(inputwaarde);
					if (n < 0) {
						Feedback.add("Geen positief getal");
					}
				} catch (NumberFormatException e) {
					Feedback.add("Geen positief getal");
				}
			}
		}
		if (inputwaarde.length() > Max) {
			Feedback.add("Te lang");
		}

		if (inputwaarde.length() < Min) {
			Feedback.add("Te Kort");
		}
		if (BSNJa) {

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

		return Feedback;
	}

	public static void main(String[] args) {

		System.out.println(CheckValue("-31000000000000000000", 1, 20, false, false));

	}

}
