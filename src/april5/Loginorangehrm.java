package april5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginorangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		
		//store username textbox into webelement
		WebElement username=driver.findElement(By.cssSelector("#txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		//store password textbox into webelement
		WebElement password=driver.findElement(By.cssSelector("#txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#btnLogin")).submit();
		Thread.sleep(2000);
		
		String expected="dashboard";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Login Success::"+expected+"      "+actual);
		}
		else
		{
			//capture error message
			String errormessage=driver.findElement(By.cssSelector("#spanMessage")).getTagName();
			System.out.println(errormessage+"         "+expected+"         "+actual);
		}
		Thread.sleep(5000);
		driver.close();

	}

}
