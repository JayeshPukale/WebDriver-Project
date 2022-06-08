package april18;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellDataPractise {

	public static void main(String[] args)throws Throwable {
		//read excel path
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		
		//get wb from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		//get sheet from wb
		XSSFSheet ws=wb.getSheetAt(0);
		
		//count no of rows in sheet
		int rc=ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		
		//print second row first cell data
		String username = ws.getRow(1).getCell(0).getStringCellValue();
		
		//print second row second cell data
		String password=ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username+"        "+password);
		fi.close();
		wb.close();

	}

}
