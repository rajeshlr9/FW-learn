package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataReading   {

	  public Set readexceldata(int rownums) throws IOException
	 
	{
		String File = ".//TestData/Test_Data.xlsx";
	
	FileInputStream fi = new FileInputStream(File);
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet sh = wb.getSheet("Test_Data");
	int rownum = sh.getLastRowNum();
	int colnum = sh.getRow(0).getLastCellNum();
	
	
	//System.out.println(rownum + "    " + colnum );
	
	String id = sh.getRow(rownums).getCell(0).getStringCellValue();
	String pwd = sh.getRow(rownums).getCell(1).getStringCellValue();
	
	String cellheader0 = sh.getRow(0).getCell(0).getStringCellValue();
	String cellheader1 = sh.getRow(0).getCell(1).getStringCellValue();
	
	HashMap hm = new HashMap();
	
	hm.put(cellheader0 , id);
	hm.put(cellheader1, pwd);
		
	
	Set s = new LinkedHashSet();
	
s.add(id);
s.add(pwd);
	
	
	
	
	
	
	return s;
	
	}
	
	
	
	

	
}
