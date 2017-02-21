package codebase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificatieAandeelHoudersXLS {

	private static XSSFWorkbook wb;

	public static String[] HaalData(int RijNummer) {
		
		String[] resultaat = null;
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream("C:\\testdata\\SpecificatieAandeelhoudersTestdata.xlsx");
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("testdata");
			XSSFRow row = sheet.getRow(RijNummer);

			String[] opsommingresultaat; 
			
			opsommingresultaat = new String [18];
			opsommingresultaat[0]= (row.getCell(0).toString());
			opsommingresultaat[1]= (row.getCell(1).toString());
			opsommingresultaat[2]= (row.getCell(2).toString());
			opsommingresultaat[3]= (row.getCell(3).toString());
			opsommingresultaat[4]= (row.getCell(4).toString());
			opsommingresultaat[5]= (row.getCell(5).toString());
			opsommingresultaat[6]= (row.getCell(6).toString());
			opsommingresultaat[7]= (row.getCell(7).toString());
			opsommingresultaat[8]= (row.getCell(8).toString());
			opsommingresultaat[9]= (row.getCell(9).toString());
			opsommingresultaat[10]= (row.getCell(10).toString());
			opsommingresultaat[11]= (row.getCell(11).toString());
			opsommingresultaat[12]= (row.getCell(12).toString());
			opsommingresultaat[13]= (row.getCell(13).toString());
			opsommingresultaat[14]= (row.getCell(14).toString());
			opsommingresultaat[15]= (row.getCell(15).toString());
			opsommingresultaat[16]= (row.getCell(16).toString());
			opsommingresultaat[17]= (row.getCell(17).toString());
			
			resultaat = opsommingresultaat;			

			fis.close();
		} catch (IOException e) {
			System.out.println("Test data file not found");
		}
		return resultaat;
	}

	
	public static void main(String[] args) {
		
		String [] invuldata = HaalData(1);
		System.out.println(invuldata[1]);
		
		
	}
	
	
	
}