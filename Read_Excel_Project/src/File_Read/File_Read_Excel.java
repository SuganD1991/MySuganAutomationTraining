package File_Read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_Read_Excel {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath = ".\\dataFiles\\Book.xlsx";
         FileInputStream inputStream = new FileInputStream(excelFilePath);
         XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
         XSSFSheet sheet = workbook.getSheetAt(0);
         
         int rows = sheet.getLastRowNum();
         int column = sheet.getRow(1).getLastCellNum();
         
         for(int r=0;r<=rows;r++) {
        	 XSSFRow Row = sheet.getRow(r);
        	 for(int c=0;c<column;c++) {
        		 XSSFCell cell = Row.getCell(c);
        		 
        		 switch(cell.getCellType()) {
        		 case STRING: System.out.println(cell.getStringCellValue());break;
        		 case NUMERIC: System.out.println(cell.getNumericCellValue());break;
        		 case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
        		 
        		 }
        		 System.out.print(" | ");
        	 }
        	 
        	 System.out.println();
         }

	}

}
