package april20;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScreenshotPractice {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		Thread.sleep(1000);
		
		//take screenshot and store into one variable
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Store screen shot into local system
		FileUtils.copyFile(screen, new File("D://screenshot/homepage.jpg"));
		driver.close();

	}

}
