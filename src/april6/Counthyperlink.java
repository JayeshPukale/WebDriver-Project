package april6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counthyperlink {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(5000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+links.size());
		Thread.sleep(5000);
		for(WebElement each:links)
		{
			Thread.sleep(200);
			System.out.println(each.getAttribute("href"));
		}

	}

}
