package april15;
import java.io.*;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("D://LoginData.txt");
		BufferedReader br = new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null)
		{
			//split notepad data into array collection
			String login[]=str.split(",");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com");
			Thread.sleep(4000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(5000);
			String expected = "dashboard";
			String actual = driver.getCurrentUrl();
			if(actual.contains(expected))
			{
				System.out.println("Login success::"+expected+"     "+actual);
			}
			else
			{
				System.out.println("Login fail::"+expected+"      "+actual);
			}
			driver.close();
			
			
		}

	}

}
