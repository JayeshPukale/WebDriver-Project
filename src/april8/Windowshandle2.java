package april8;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='allcircle circleone'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='allcircle circletwo'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='railDrishti fa fa-line-chart'])[1]")).click();
		
		//get collection of all windows and store into arraylist class
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		
		//switch to air ticketing window
		driver.switchTo().window(brw.get(3));
		
		//click on check box
		driver.findElement(By.name("ltc")).click();
		Thread.sleep(5000);
		driver.close();

		//switch to hotels window and verify title
		driver.switchTo().window(brw.get(2));
		Thread.sleep(5000);
		String expectedtitle="IRCTC Hotels";
		String actualtitle=driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is matching::"+expectedtitle+"        "+actualtitle);
		}
		else
		{
			System.out.println("Title is Not matching::"+expectedtitle+"            "+actualtitle);
		}
		Thread.sleep(5000);
		driver.close();
	}

}
