package april11;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		
		//create object for Actions class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		
		//mouse to fashions
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		
		//mouse to All links and click
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		
		

	}

}
