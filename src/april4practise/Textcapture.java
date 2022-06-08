package april4practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textcapture {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page
		String expectedlinkname=driver.findElement(By.linkText("Gmail")).getText();
		String actuallinkname="Gmail";
		if(expectedlinkname.equalsIgnoreCase(actuallinkname))
		{
			System.out.println("Linkname is Matching::"+expectedlinkname+"         "+actuallinkname);	
		}
		else
		{
			System.out.println("Linkname is Not Matching::"+expectedlinkname+"         "+actuallinkname);
		}
		driver.close();
	}

}
