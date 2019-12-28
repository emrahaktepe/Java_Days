package Day61_Excel_Read_Write;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _ExcelReadWrite {
	
	/*
	 		create a custom class that can read and write an excell file
	 		instance variables:	String filePath;
	 							String sheetName;
	 							FileInputStream file;
	 							WorkBook excelFile
	 							Sheet sheet;
	 							Cell cell;
	 							
	 				Actions:	ReadData (int row, int cell)	==> return type String
	 							WriteData (int row, int Cell, setValue)	==>	void	 		
	 */	
		String filePath;
		String sheetName;
		FileInputStream file;
		Workbook excelfile;
		Sheet sheet;
		Cell cell;
		
		public _ExcelReadWrite(String filePath, String sheetName)	{
			this.filePath = filePath;
			this.sheetName = sheetName;
			
			try {
			file = new FileInputStream(filePath);
			excelfile = WorkbookFactory.create(file);
			sheet = excelfile.getSheet(sheetName);
			}	catch	(Exception e)	{
				
			}
			
			
			
		}


		public String readData	(int rowNum, int cellNum) {
			
			String data = "";
			cell = sheet.getRow(rowNum).getCell(cellNum);
			data = cell.toString();
			
			return data;
			
		}

		public void writeData(int rowNum, int cellNum, String setValue) {
			cell = sheet.getRow(rowNum).getCell(cellNum);
			cell.setCellValue(setValue);
		}
}
