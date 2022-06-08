package march30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browser {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome driver", "D:/chromedriver.exe");
		//create instance object.
		WebDriver Driver = new ChromeDriver();
		System.setProperty("WebDriver.gecko Driver", "D:/geckodriver.exe");
		WebDriver Dr=new FirefoxDriver();
		
		

	}

}
