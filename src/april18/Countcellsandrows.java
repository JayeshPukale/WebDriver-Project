package april18;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Countcellsandrows {

	public static void main(String[] args)throws Throwable {
		//read path of excel file
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		
		//get wb from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		//get sheet from workbook
		XSSFSheet ws=wb.getSheet("Login");
		
		//get first row from sheet
		XSSFRow row=ws.getRow(0);
		
		//count no of rows in sheet
		int rc=ws.getLastRowNum();
		
		//count no of cells in first row
		int cc=row.getLastCellNum();
		System.out.println("No of rows are::"+rc+"      "+"No of cells in first row::"+cc);
		fi.close();
		wb.close();
		
		

	}

}
