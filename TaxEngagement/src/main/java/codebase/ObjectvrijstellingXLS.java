package codebase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ObjectvrijstellingXLS {

	private static XSSFWorkbook wb;
	
	public static String[] HaalText(int RijNummer) {
		
		String[] resultaat = null;
		//RijNummer = RijNummer - 1; 
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream("C:\\testdata\\TestdataTax.xlsx");
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Objectvrijstelling");
			XSSFRow row = sheet.getRow(RijNummer);

			String[] opsommingresultaat; 
		
			opsommingresultaat = new String [8];
			opsommingresultaat[0]= new DataFormatter().formatCellValue(row.getCell(0));
			opsommingresultaat[1]= new DataFormatter().formatCellValue(row.getCell(1));
			opsommingresultaat[2]= new DataFormatter().formatCellValue(row.getCell(2));
			opsommingresultaat[3]= new DataFormatter().formatCellValue(row.getCell(3));
			opsommingresultaat[4]= new DataFormatter().formatCellValue(row.getCell(4));
			opsommingresultaat[5]= new DataFormatter().formatCellValue(row.getCell(5));
			opsommingresultaat[6]= new DataFormatter().formatCellValue(row.getCell(6));
			opsommingresultaat[7]= new DataFormatter().formatCellValue(row.getCell(7));
			
			resultaat = opsommingresultaat;		
			fis.close();
		
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}
		
		return resultaat;
		
	}
	public static void main(String[] args) {

		String[] invuldata = codebase.ObjectvrijstellingXLS.HaalText(1);
		System.out.println(invuldata[7]);
		
		}
}
