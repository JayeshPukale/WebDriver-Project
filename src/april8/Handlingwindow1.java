package april8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindow1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://Gmail.com");
		Thread.sleep(5000);
		
		//get parent window id
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		//click on link to open new window
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		//get collection of all window ids
		Set<String>allwins=driver.getWindowHandles();
		System.out.println(allwins);
		
		//iterate all windows
		for(String each:allwins)
		{
			//switch to child windows when parent id not equals to child window
			if(!parent.equals(each))
			{
				//switch to each child window
				String childpagetitles=driver.switchTo().window(each).getTitle();
				System.out.println(childpagetitles);
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("pranga2010@gmail.com");
		Thread.sleep(5000);
		driver.close();
	}

}
