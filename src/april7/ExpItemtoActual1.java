package april7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpItemtoActual1 {

	public static void main(String[] args)throws Throwable {
		String expectedItem="books";
		Boolean itemExits=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("");
		Thread.sleep(5000);

		//store listbox into Select Class
		Select listbox=new Select(driver.findElement(By.id("")));
		List<WebElement>Olist=listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		Thread.sleep(5000);
		for(WebElement each:Olist)
		{
			//capture each items
			String actualItems=each.getText();
			Thread.sleep(5000);
			System.out.println(actualItems);
			if(actualItems.equalsIgnoreCase(expectedItem))
			{
				//when ever expecteditem equal to actualitems
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


