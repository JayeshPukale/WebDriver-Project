package april13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1practice {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Launch URL
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(4000);
		
		//print title and length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		//print url and length of url
		String strurl=js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		
		//print domain name
		String srdomain=js.executeScript("return document.domain").toString();
		System.out.println(srdomain);
		System.out.println(srdomain.length());
		driver.close();
		

	}

}
