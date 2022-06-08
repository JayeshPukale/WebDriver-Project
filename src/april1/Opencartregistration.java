package april1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencartregistration {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Regist")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Jayesh");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Pukale");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("sonujayesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8208531474");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Jayesh0000");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Jayesh0000");
		driver.findElement(By.name("agree")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(7000);
		driver.close();
	}

}
