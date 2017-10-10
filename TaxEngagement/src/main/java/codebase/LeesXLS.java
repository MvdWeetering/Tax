package codebase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeesXLS {
	
	private static XSSFWorkbook wb;
	static String Locatie = null;
	
	public static String HaalData(String Kolom, int Rij, String Tab, String Locatie) {
		
		String resultaat = null;
		int Column=0;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream(Locatie);
			
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
			g.printStackTrace();
			return "IllegalStateException";
		}
		
		return resultaat.replaceAll("\\.0","");
	}	

	public static String HaalText(String Kolom, int Rij, String Tab, String Locatie) {
		
		String resultaat = null;
		int Column=0;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream(Locatie);
			
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
			
			resultaat =String.valueOf((row.getCell(Column).getStringCellValue()));		
						
			fis.close();
		} catch (IOException e) {
			return "Test data file not found";
		}
		catch (NullPointerException f) {
			return "Cell has no value";
		}
		catch (IllegalStateException g) {
			g.printStackTrace();
			return "IllegalStateException";
		}
		
		return resultaat.replaceAll("\\.0","");
	}
	
	public static void main(String[] args) {
	Locatie = "C:\\testdata\\Toelichting materiele vaste activa.xlsx";
	System.out.println(LeesXLS.HaalText("A", 1, "TC01", Locatie));

	}
}
