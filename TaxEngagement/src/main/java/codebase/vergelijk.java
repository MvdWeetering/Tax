package codebase;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.util.SystemOutLogger;

public class vergelijk {

	public static ArrayList<String> VergelijkXBRL(String WebWaarden, Double XlsWaarden, String Cel) {

		ArrayList<String> VergelijkResult = new ArrayList<String>();

		String WebText = WebWaarden.toString().replaceAll(",", "");

		double XLSformatter = XlsWaarden;
		DecimalFormat df = new DecimalFormat("###.#");
		String XlsText = df.format(XLSformatter);

		if (!WebText.equals("[" + XlsText + "]")) {
			VergelijkResult.add("Web waarden wijken af van Cel " + Cel + "\r\n");

//			uncomment voor debugdoeleinden
//			System.out.println(XlsText);
//			System.out.println(WebText);
				
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
	public static ArrayList<String> Vergelijk(String WebWaarden, Double XlsWaarden, String Cel) {

		ArrayList<String> VergelijkResult = new ArrayList<String>();

		String WebText = WebWaarden.toString().replaceAll("\\.", "");

		double XLSformatter = XlsWaarden;
		DecimalFormat df = new DecimalFormat("###.#");
		String XlsText = df.format(XLSformatter).toString();
		
	
		if (!WebText.equals(XlsText)) {
			VergelijkResult.add("Web waarden wijken af van Cel " + Cel + "\r\n");
			System.out.println(XlsText);
			System.out.println(WebText);
		}
		return VergelijkResult;
	}
	public static void main(String[] args) throws ParseException, Exception {

		String Tab = "Tc01"; 
		
System.out.println(vergelijk.VergelijkTupple(ReadXML.GetXMLvalue("bd-bedr:LossesToBeSettledTaxEntityThisFinancialYearEnd").toString(), convertDate.changedateformat(VerliesVerrekeningXLS.HaalDatum("C", 28, Tab)), convertDate.changedateformat(VerliesVerrekeningXLS.HaalDatum("C", 29, Tab))));

	}
}
