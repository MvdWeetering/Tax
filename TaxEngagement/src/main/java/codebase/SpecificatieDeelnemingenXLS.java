package codebase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpecificatieDeelnemingenXLS {

	private static XSSFWorkbook wb;

	public static String[] HaalData(int RijNummer) {
		
		String[] resultaat = null;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream("C:\\testdata\\TestdataTax.xlsx");
			RijNummer = RijNummer + 1; 
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Spec_deelneming");
			XSSFRow row = sheet.getRow(RijNummer);

			String[] opsommingresultaat; 
			
			opsommingresultaat = new String [61];
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
			opsommingresultaat[35]= new DataFormatter().formatCellValue(row.getCell(35));
			opsommingresultaat[36]= new DataFormatter().formatCellValue(row.getCell(36));
			opsommingresultaat[37]= new DataFormatter().formatCellValue(row.getCell(37));
			opsommingresultaat[38]= new DataFormatter().formatCellValue(row.getCell(38));
			opsommingresultaat[39]= new DataFormatter().formatCellValue(row.getCell(39));
			opsommingresultaat[40]= new DataFormatter().formatCellValue(row.getCell(40));
			opsommingresultaat[41]= new DataFormatter().formatCellValue(row.getCell(41));
			opsommingresultaat[42]= new DataFormatter().formatCellValue(row.getCell(42));
			opsommingresultaat[43]= new DataFormatter().formatCellValue(row.getCell(43));
			opsommingresultaat[44]= new DataFormatter().formatCellValue(row.getCell(44));
			opsommingresultaat[45]= new DataFormatter().formatCellValue(row.getCell(45));
			opsommingresultaat[46]= new DataFormatter().formatCellValue(row.getCell(46));
			opsommingresultaat[47]= new DataFormatter().formatCellValue(row.getCell(47));
			opsommingresultaat[48]= new DataFormatter().formatCellValue(row.getCell(48));
			opsommingresultaat[49]= new DataFormatter().formatCellValue(row.getCell(49));
			opsommingresultaat[50]= new DataFormatter().formatCellValue(row.getCell(50));
			opsommingresultaat[51]= new DataFormatter().formatCellValue(row.getCell(51));
			opsommingresultaat[52]= new DataFormatter().formatCellValue(row.getCell(52));
			opsommingresultaat[53]= new DataFormatter().formatCellValue(row.getCell(53));
			opsommingresultaat[54]= new DataFormatter().formatCellValue(row.getCell(54));
			opsommingresultaat[55]= new DataFormatter().formatCellValue(row.getCell(55));
			opsommingresultaat[56]= new DataFormatter().formatCellValue(row.getCell(56));
			opsommingresultaat[57]= new DataFormatter().formatCellValue(row.getCell(57));
			opsommingresultaat[58]= new DataFormatter().formatCellValue(row.getCell(58));
			opsommingresultaat[59]= new DataFormatter().formatCellValue(row.getCell(59));
			opsommingresultaat[60]= new DataFormatter().formatCellValue(row.getCell(60));
									
			
			resultaat = opsommingresultaat;			

			fis.close();
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}
		return resultaat;
	}
	
	public static void main(String[] args) {

		
		String[] invuldata = codebase.SpecificatieDeelnemingenXLS.HaalData(2);
		
		System.out.println(invuldata[27]);
		
		
	}
}