package april18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteCellData {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		Workbook wb=new WorkbookFactory().create(fi);
		Sheet ws=wb.getSheet("Login");
		Row row=ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println(rc+"      "+cc);
		for(int i=1;i<=rc;i++)
		{
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			String password=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"             "+password);
			ws.getRow(i).createCell(2).setCellValue("I am Automation Tester");
			
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("D://Dummyyy.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		

	}

}
