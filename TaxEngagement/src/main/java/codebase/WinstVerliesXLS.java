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

	public static String HaalData(String Kolom, int Rij, String Tab) {
		
		String resultaat = null;
		int Column=0;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream("C:\\testdata\\Winst en verlies rekening formulier.xlsx");
			
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(Tab);
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
		catch (IllegalStateException g) {
			return "a";
		}
		
		return resultaat;
	}
	
	public static void main(String[] args) {

	System.out.println(WinstVerliesXLS.HaalData("B", 7, "TC02"));

	}
}