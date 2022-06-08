package april4practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(4000);
		String expectedtitle="google";
		//get title in run time
		String actualtitle=driver.getTitle();
		//verify both titles
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is Matching::"+expectedtitle+"       "+actualtitle);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expectedtitle+"       "+actualtitle);
		}
		driver.close();
			
	}

}
