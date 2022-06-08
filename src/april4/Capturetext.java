package april4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturetext {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(4000);
		//capture gmail text in google page
		String expectedlinkname=driver.findElement(By.linkText("Gmail")).getText();
		String actuallinkname ="Gmail";
		if(actuallinkname.equalsIgnoreCase(actuallinkname))
		{
		System.out.println("Linkname is Matching::"+expectedlinkname+"        "+actuallinkname);
		
		}
		else
		{
			System.out.println("Linkname is not Matching::"+expectedlinkname+"        "+actuallinkname);
		}
		driver.close();
	}

}
