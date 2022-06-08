package april22;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookProperties {

	public static void main(String[] args) throws Throwable{
		Properties p = new Properties();
		//load property file
		p.load(new FileInputStream("D:\\Testing Tools\\automation testing\\WebDriver\\Facebook.properties"));
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("Objcna"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("Objfname"))).sendKeys(p.getProperty("Enterfname"));
		driver.findElement(By.xpath(p.getProperty("Objsname"))).sendKeys(p.getProperty("Entersname"));
		driver.findElement(By.xpath(p.getProperty("Objemail"))).sendKeys(p.getProperty("Enteremail"));
		driver.findElement(By.xpath(p.getProperty("Objpass"))).sendKeys(p.getProperty("Enterpass"));
		driver.findElement(By.xpath(p.getProperty("Objdate"))).sendKeys(p.getProperty("Selectdate"));
		driver.findElement(By.xpath(p.getProperty("Objmonth"))).sendKeys(p.getProperty("Selectmaonth"));
		driver.findElement(By.xpath(p.getProperty("Objyear"))).sendKeys(p.getProperty("Selectyear"));
		driver.findElement(By.xpath(p.getProperty("Objgender"))).click();
		driver.findElement(By.xpath(p.getProperty("Objsignupbtn"))).click();
		
	}

}
