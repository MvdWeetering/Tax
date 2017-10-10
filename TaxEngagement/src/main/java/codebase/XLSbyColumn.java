package codebase;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSbyColumn {
	
	public static ArrayList<String> extractExcelContentByColumnIndex(String SheetName, int columnIndex){
        ArrayList<String> columndata = null;
        try {
            
        	//FileInputStream fis = new FileInputStream("C:\\testdata\\TestdataTax.xlsx");
        	
        	File f = new File("C:\\testbestanden\\XBRL_Test.xlsx");
            FileInputStream ios = new FileInputStream(f);
            XSSFWorkbook workbook = new XSSFWorkbook(ios);
            XSSFSheet sheet = workbook.getSheet(SheetName);
            Iterator<Row> rowIterator = sheet.iterator();
            columndata = new ArrayList<>();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    if(row.getRowNum() > 0){ //To filter column headings
                        if(cell.getColumnIndex() == columnIndex){// To match column index
                            switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_NUMERIC:
                            	
                            	DataFormatter fmt = new DataFormatter();
                            	String valueAsSeenInExcel = fmt.formatCellValue(cell);
                                columndata.add(valueAsSeenInExcel+"");
                                break;
                            case Cell.CELL_TYPE_STRING:
                                columndata.add(cell.getStringCellValue());
                                break;
                            }
                        }
                    }
                }
            }
            ios.close();
           // System.out.println(columndata);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columndata;
    }
	
	
	
	public static void main(String[] args) {
		
	System.out.println(extractExcelContentByColumnIndex("investeringsregeling", 1));
		
		
	}
	
	
}
