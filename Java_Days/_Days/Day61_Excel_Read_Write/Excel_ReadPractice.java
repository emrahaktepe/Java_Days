package Day61_Excel_Read_Write;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_ReadPractice {
	
	
	public static void main(String[] args) throws Exception{
		
		String filePath = "/Users/ea2/Desktop/TestData.xlsx";
		String sheetName = "Sheet 1";	//Name of the sheet
		
		FileInputStream file = new FileInputStream(filePath);
		
		Workbook excelFile = WorkbookFactory.create(file);
		
		Sheet sheet = excelFile.getSheet(sheetName);	//	gets the specific spreadsheet
		
		Cell cell = sheet.getRow(1).getCell(0);	//	retrieves the specific cell from the spreadsheet
		
		String cellData = cell.getStringCellValue();	//	converts cell's value to String
		
		System.out.println(cellData);
		
		
	}

}
