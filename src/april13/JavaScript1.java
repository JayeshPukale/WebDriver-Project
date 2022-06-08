package april13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Launch URL
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		
		//Print title and length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		//Print url and length of url
		String strurl=js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		
		//Print domain name
		String strdomain=js.executeScript("return document.domain").toString();
		System.out.println(strdomain);
		System.out.println(strdomain.length());
		driver.close();
		

	}

}
