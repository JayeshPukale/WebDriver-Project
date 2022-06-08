package april5;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofelements {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		Thread.sleep(5000);
		
		//get collection of links in page which are stored into html tag a
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+links.size());
		for(WebElement each:links)
		{
			Thread.sleep(500);
			System.out.println(each.getText());
		}
		
	

	}

}
