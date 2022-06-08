package april6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectListbox {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		//store listbox into select class
		Select bdaylistbox=new Select(driver.findElement(By.id("day")));
		Select monthlistbox=new Select(driver.findElement(By.id("month")));
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		
		//verify listbox is single or multiple selection
		Boolean value = yearlistbox.isMultiple();
		System.out.println(value);
		
		//select item in three listbox
		bdaylistbox.selectByValue("20");
		Thread.sleep(200);
		monthlistbox.selectByVisibleText("May");
		Thread.sleep(200);
		yearlistbox.selectByIndex(29);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
	}

}
