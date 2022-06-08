package april4practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProtocol {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://facebool.com");
		String expectedprotocol="https://";
		//get Url in run time
		String actualprotocol=driver.getCurrentUrl();
		if(actualprotocol.startsWith(expectedprotocol))
		{
			System.out.println("Url is secured::"+expectedprotocol+"         "+actualprotocol);
		}
		else
		{
			System.out.println("Url is Not secured::"+expectedprotocol+"           "+actualprotocol);
		}
		driver.close();
	}

}
