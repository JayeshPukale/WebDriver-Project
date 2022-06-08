package april12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
		
		//get collection of iframes in html page
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+frames.size());
		
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		ac.clickAndHold(src).moveToElement(dst).release().perform();
		
		//click on button link
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		
		

	}

}
