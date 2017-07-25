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
			FileInputStream fis = new FileInputStream("C:\\testdata\\TestdataTax.xlsx");
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Spec_aandeelh");
			XSSFRow row = sheet.getRow(RijNummer);

			String[] opsommingresultaat; 
			
			opsommingresultaat = new String [35];
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
			opsommingresultaat[18]= new DataFormatter().formatCellValue(row.getCell(18));
			opsommingresultaat[19]= new DataFormatter().formatCellValue(row.getCell(19));
			opsommingresultaat[20]= new DataFormatter().formatCellValue(row.getCell(20));
			opsommingresultaat[21]= new DataFormatter().formatCellValue(row.getCell(21));
			opsommingresultaat[22]= new DataFormatter().formatCellValue(row.getCell(22));
			opsommingresultaat[23]= new DataFormatter().formatCellValue(row.getCell(23));
			opsommingresultaat[24]= new DataFormatter().formatCellValue(row.getCell(24));
			opsommingresultaat[25]= new DataFormatter().formatCellValue(row.getCell(25));
			opsommingresultaat[26]= new DataFormatter().formatCellValue(row.getCell(26));
			opsommingresultaat[27]= new DataFormatter().formatCellValue(row.getCell(27));
			opsommingresultaat[28]= new DataFormatter().formatCellValue(row.getCell(28));
			opsommingresultaat[29]= new DataFormatter().formatCellValue(row.getCell(29));
			opsommingresultaat[30]= new DataFormatter().formatCellValue(row.getCell(30));
			opsommingresultaat[31]= new DataFormatter().formatCellValue(row.getCell(31));
			opsommingresultaat[32]= new DataFormatter().formatCellValue(row.getCell(32));
			opsommingresultaat[33]= new DataFormatter().formatCellValue(row.getCell(33));
			opsommingresultaat[34]= new DataFormatter().formatCellValue(row.getCell(34));
			
			resultaat = opsommingresultaat;			

			fis.close();
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}
		return resultaat;
	}
			
	public static void main(String[] args) {

		
		String[] invuldata = codebase.SpecificatieAandeelHoudersXLS.HaalData(1);
		
		System.out.println(invuldata[6]);
		
		}
}