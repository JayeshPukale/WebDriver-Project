package april7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountIteminListbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		
		//store listbox in select class
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		
		//get collection of items in listbox
		List<WebElement>Olist=listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		Thread.sleep(5000);
		for(WebElement each:Olist)
		{
			Thread.sleep(200);
			System.out.println(each.getText());
		}

	}

}
