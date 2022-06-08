package march31;

import java.sql.DriverPropertyInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommand {

	public static void main(String[] args) throws Throwable {
		// Create instance object.
		System.setProperty("WebDriver.chromedriver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//launch url
		driver.get("http://google.com");
		//suspend tool for five seconds.
		Thread.sleep(5000);
		driver.close();

	}

}
