package april19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPercentagePractice {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi=new FileInputStream("D://Calculation.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet ws=wb.getSheet("Intrest");
		int rc=ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.calculator.net/percent-calculator.html");
			Thread.sleep(5000);
			
			if(wb.getSheet("Intrest").getRow(i).getCell(0).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata1=(int)wb.getSheet("Intrest").getRow(i).getCell(0).getNumericCellValue();
				String percentage = String.valueOf(celldata1);
				if(wb.getSheet("Intrest").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					
				
					int celldata2=(int)wb.getSheet("Intrest").getRow(i).getCell(1).getNumericCellValue();
				String amount=String.valueOf(celldata2);
				
				driver.findElement(By.name("cpar1")).sendKeys(percentage);
				driver.findElement(By.name("cpar2")).sendKeys(amount);
				driver.findElement(By.xpath("(//input[@value='Calculate'])[1]")).click();
				Thread.sleep(1000);
				
				String results=driver.findElement(By.xpath("//p[@class='verybigtext']")).getText();
				ws.getRow(i).createCell(2).setCellValue(results);
				System.out.println(percentage+"      "+amount+"      "+results);
			}
		}
			driver.close();
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("D://CalculationResults1.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}

}
