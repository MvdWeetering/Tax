package codebase;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WinstVerliesXLS {
	private static XSSFWorkbook wb;

	public static String HaalData(String Kolom, int Rij) {
		
		String resultaat = null;
		int Column=0;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream("C:\\testdata\\Winst en verlies rekening formulier.xlsx");
			
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("TC01");
			XSSFRow row = sheet.getRow(Rij-1);
			
			if (Kolom.equals("A")) {
				Column = 0;
			}
			if (Kolom.equals("B")) {
				Column = 1;
			}
			if (Kolom.equals("C")) {
				Column = 2;
			}
			if (Kolom.equals("D")) {
				Column = 3;
			}
			if (Kolom.equals("E")) {
				Column = 4;
			}
			if (Kolom.equals("F")) {
				Column = 5;
			}
			if (Kolom.equals("G")) {
				Column = 6;
			}
			if (Kolom.equals("H")) {
				Column = 7;
			}
			
			resultaat =String.valueOf((row.getCell(Column).getNumericCellValue()));		
						
			fis.close();
		} catch (IOException e) {
			return "Test data file not found";
		}
		catch (NullPointerException f) {
			return "Cell has no value";
		}
		
		return resultaat;
	}	

		public static ArrayList<String> Vergelijk(String WebWaarden, Double XlsWaarden) {
			
			ArrayList<String> VergelijkResult = new ArrayList<String>();
			
			String WebText = WebWaarden.toString().replaceAll(",", "");
			
			double XLSformatter = XlsWaarden;
			DecimalFormat df = new DecimalFormat("###.#");
			String XlsText = df.format(XLSformatter);
			  
			if (!WebText.equals(XlsText)) {  
				VergelijkResult.add("Waarden niet gelijk");
			}
			return VergelijkResult;
		}

		public static void main(String[] args) {
		/*
		Web = 2,003
		Excel = 2003.0
		*/
			  
		  
		  
	}
}