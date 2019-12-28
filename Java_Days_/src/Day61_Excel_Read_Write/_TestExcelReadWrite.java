package Day61_Excel_Read_Write;

public class _TestExcelReadWrite {

	public static void main(String[] args) {
		
		String path = "/Users/ea2/Desktop/TestData.xlsx";
		String sheetName = "Sheet 1";
		
		_ExcelReadWrite	obj = new _ExcelReadWrite(path, sheetName);
		
		String data1 = obj.readData(3, 0);
		System.out.println(data1);
		
		obj.writeData(3, 0, "Abuzer");
        
        String data2 =  obj.readData(3, 0);
        System.out.println( data2 );
		
	}
	
}
