package april22;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFiles {

	public static void main(String[] args)throws Throwable {
		Properties p = new Properties();
		//load property file
		p.load(new FileInputStream("Repository.properties"));
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(p.getProperty("objmyAccount"))).click();
		driver.findElement(By.xpath(p.getProperty("objregister"))).click();
		driver.findElement(By.xpath(p.getProperty("objfname"))).sendKeys(p.getProperty("Enterfname"));
		driver.findElement(By.xpath(p.getProperty("objlname"))).sendKeys(p.getProperty("Enterlname"));
		driver.findElement(By.xpath(p.getProperty("objemail"))).sendKeys(p.getProperty("Enteremail"));
		driver.findElement(By.xpath(p.getProperty("objphone"))).sendKeys(p.getProperty("Enterphone"));
		driver.findElement(By.xpath(p.getProperty("objpass"))).sendKeys(p.getProperty("Enterpass"));
		driver.findElement(By.xpath(p.getProperty("objcpass"))).sendKeys(p.getProperty("Entercpass"));
		driver.findElement(By.xpath(p.getProperty("objtick"))).click();
		driver.findElement(By.xpath(p.getProperty("objcbox"))).click();
		driver.findElement(By.xpath(p.getProperty("objcontinuebtn"))).click();
		
		
		

	}

}
