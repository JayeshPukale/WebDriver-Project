package april20;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDateTime {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//create java time stamp
		Date date = new Date();
		DateFormat df=new SimpleDateFormat("yyyy_MM_dd hh_mm_ss");
		String datef=df.format(date);
		
		//take screenshot and store into one variable
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//store screenshot into local system
		FileUtils.copyFile(screen, new File("D://screenshot/"+datef+"       "+"homepage.png"));
		driver.close();
		
		
		
		
		
		
		

	}

}
