package april14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingrowPractice {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		//store table into webelement
		WebElement table=driver.findElement(By.id("customers"));
		
		//count no of rows in a table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		Thread.sleep(5000);
		
		//iterate all rows
		for(int i=1;i<rows.size();i++)
		{
			//get column collection from each row
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(500);
			System.out.println("Row No"+i+"    "+"column size in each row::"+cols.size());
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
