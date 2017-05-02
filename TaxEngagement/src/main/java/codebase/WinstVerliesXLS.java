package codebase;

import java.io.FileInputStream;
import java.io.IOException;

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
			
			resultaat = new DataFormatter().formatCellValue(row.getCell(Column));		

			fis.close();
		} catch (IOException e) {
			return "Test data file not found";
		}
		catch (NullPointerException f) {
			return "Cell has no value";
		}
		
		return resultaat;
	}	
	public static void main(String[] args) {
		
	System.out.println(codebase.WinstVerliesXLS.HaalData("A", 2));
	}
}