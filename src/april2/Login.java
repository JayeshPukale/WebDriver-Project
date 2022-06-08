package april2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
		// creating instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool for 5 seconds.
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='http://primusbank.qedgetech.com']//img")).click();
		Thread.sleep(3000);
		//checking primus bank Home page
		driver.findElement(By.xpath("//img[@id='IMG3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='Corporate Banking.html']//img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='International Banking.html']//img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='aboutus.html']//img")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Home")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Internet BankingFAQ's")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Terms and Conditions")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Disclaimer")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Site Map")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		//checking change password
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='change_password.aspx']//img")).click();
		Thread.sleep(7000);
		driver.close();

		
	}

}
