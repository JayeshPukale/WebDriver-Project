package april12;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		
		//configure Object Robot Class
		Robot r=new Robot();
		Thread.sleep(5000);
		
		//Press down arrow for two times

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		
		//click Enter Button in Keyboard
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//get collection of windows
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='feature__chapter__button']//span[@class='laptop-desktop-only'][normalize-space()='Create an account']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		

	}

}
