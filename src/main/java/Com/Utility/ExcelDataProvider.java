package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException
	{
		String pathexcel ="C:\\Users\\ACER\\eclipse-workspace\\First_FrameWork\\xl.1.xlsx";
		
		FileInputStream fis1 = new FileInputStream(pathexcel);
		
		wb = new XSSFWorkbook(fis1) ;
	}
	public String getStringData(String sheetname, int row, int cell)
	{
	 return	wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
