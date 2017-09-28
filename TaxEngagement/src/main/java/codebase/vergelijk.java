package codebase;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;

public class vergelijk {

	public static ArrayList<String> Vergelijk(String WebWaarden, Double XlsWaarden, String Cel) {

		ArrayList<String> VergelijkResult = new ArrayList<String>();

		String WebText = WebWaarden.toString().replaceAll(",", "");

		double XLSformatter = XlsWaarden;
		DecimalFormat df = new DecimalFormat("###.#");
		String XlsText = df.format(XLSformatter);

		if (!WebText.equals("[" + XlsText + "]")) {
			VergelijkResult.add("Web waarden wijken af van Cel " + Cel + "\r\n");
		}
		return VergelijkResult;
	}

	public static ArrayList<String> VergelijkTupple(String XMLValue, String XlsWaarden1, String XlsWaarden2) {

		ArrayList<String> VergelijkResult = new ArrayList<String>();
		ArrayList<String> XLScompare = new ArrayList<String>();

		XLScompare.add(XlsWaarden1);
		XLScompare.add(XlsWaarden2);

		String XMLWaarden = XMLValue.toString();
		String XLSText = XLScompare.toString();

		if (!XMLWaarden.equals(XLSText)) {
			VergelijkResult.add("\r\n" + "XML waarden wijken af: " + XMLValue + "\r\n" + "Er werd verwacht:" + XLSText + "\r\n");
		}

		return VergelijkResult;

	}

	public static void main(String[] args) {

		System.out.println(VergelijkTupple("[1, 2]", "1", "2"));

	}
}
