package codebase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpecificatieAandeelHoudersXLS {

	private static XSSFWorkbook wb;

	public static String[] HaalData(int RijNummer) {
		
		String[] resultaat = null;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream("C:\\testdata\\SpecificatieAandeelhoudersTestdata.xlsx");
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Spec_aandeelh");
			XSSFRow row = sheet.getRow(RijNummer);

			String[] opsommingresultaat; 
			
			opsommingresultaat = new String [18];
			opsommingresultaat[0]= new DataFormatter().formatCellValue(row.getCell(0));
			opsommingresultaat[1]= new DataFormatter().formatCellValue(row.getCell(1));
			opsommingresultaat[2]= new DataFormatter().formatCellValue(row.getCell(2));
			opsommingresultaat[3]= new DataFormatter().formatCellValue(row.getCell(3));
			opsommingresultaat[4]= new DataFormatter().formatCellValue(row.getCell(4));
			opsommingresultaat[5]= new DataFormatter().formatCellValue(row.getCell(5));
			opsommingresultaat[6]= new DataFormatter().formatCellValue(row.getCell(6));
			opsommingresultaat[7]= new DataFormatter().formatCellValue(row.getCell(7));
			opsommingresultaat[8]= new DataFormatter().formatCellValue(row.getCell(8));
			opsommingresultaat[9]= new DataFormatter().formatCellValue(row.getCell(9));
			opsommingresultaat[10]= new DataFormatter().formatCellValue(row.getCell(10));
			opsommingresultaat[11]= new DataFormatter().formatCellValue(row.getCell(11));
			opsommingresultaat[12]= new DataFormatter().formatCellValue(row.getCell(12));
			opsommingresultaat[13]= new DataFormatter().formatCellValue(row.getCell(13));
			opsommingresultaat[14]= new DataFormatter().formatCellValue(row.getCell(14));
			opsommingresultaat[15]= new DataFormatter().formatCellValue(row.getCell(15));
			opsommingresultaat[16]= new DataFormatter().formatCellValue(row.getCell(16));
			opsommingresultaat[17]= new DataFormatter().formatCellValue(row.getCell(17));
			
			resultaat = opsommingresultaat;			

			fis.close();
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}
		return resultaat;
	}
			
	public static void main(String[] args) {

		
		String[] invuldata = codebase.SpecificatieAandeelHoudersXLS.HaalData(1);
		
		System.out.println(invuldata[3]);
		
		}
}