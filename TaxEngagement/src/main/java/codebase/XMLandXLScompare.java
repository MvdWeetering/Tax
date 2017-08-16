package codebase;

import java.util.ArrayList;

public class XMLandXLScompare {

	public static ArrayList<String> XMLandXLScheckerArrays(String SheetName, String Tag, int ColumnNr) throws Exception {

		ArrayList<String> CheckerResult = new ArrayList<String>();
		
		ArrayList<String> XMLChecker = new ArrayList<String>();
		ArrayList<String> XSLChecker = new ArrayList<String>();

		XMLChecker = ReadXML.GetXMLvalue(Tag);
		XSLChecker = XLSbyColumn.extractExcelContentByColumnIndex(SheetName, ColumnNr);

		if (!XMLChecker.equals(XSLChecker)) {
			CheckerResult.add(Tag);
			System.out.println("Difference at tag " + Tag);
		}
		return CheckerResult;
	}
	
	
	
}