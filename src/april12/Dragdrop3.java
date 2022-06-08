package april12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop3 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		int x=dst.getLocation().getX();
		int y=dst.getLocation().getY();
		System.out.println(x+"        "+y);
		ac.dragAndDropBy(src, x, y).perform();
	}

}
