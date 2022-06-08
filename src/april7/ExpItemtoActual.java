package april7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpItemtoActual {

	public static void main(String[] args)throws Throwable {
		String expectedItem="books";
		boolean itemExits=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);

		//store listbox into select class
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>Olist=listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		Thread.sleep(5000);
		for(WebElement each:Olist)
		{
			//capture each items
			String actualitems=each.getText();
			Thread.sleep(2000);
			System.out.println(actualitems);
			if(actualitems.equalsIgnoreCase(expectedItem))
			{
				//When ever expecteditems equal to actualitems
				itemExits=true;
				break;
			}
		}
		if(itemExits)
		{
			System.out.println("Item found in listbox::"+expectedItem);
		}
		else
		{
			System.out.println("Item not found in listbox::"+expectedItem);
		}
	}

}
