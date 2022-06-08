package april14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		//store table into web element
		WebElement table=driver.findElement(By.id("customers"));
		
		//get collection of rows in a table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		Thread.sleep(5000);
		
		//iterate all rows
		for(WebElement eachrow:rows)
		{
			//get collection of columns from each row
			List<WebElement>cols=eachrow.findElements(By.tagName("td"));
			
			//iterate all cells
			for(WebElement eachcell:cols)
			{
				String celldata=eachcell.getText();
				Thread.sleep(2000);
				System.out.println("\n"+celldata);
			}
			System.out.println();
			System.out.println("-----------------------------------------");
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
