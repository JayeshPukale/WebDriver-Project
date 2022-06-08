package april7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalert1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		
		//click on login button without username and password
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		//capture alerttext
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		
		//click ok on alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
	}

}
