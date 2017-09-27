package codebase;

import java.text.DecimalFormat;
import java.util.ArrayList;

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
}
