package april4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrent1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		String expectedprotocol="https://";
		//get url in runtime
		String actualprotocol=driver.getCurrentUrl();
		if(actualprotocol.startsWith(expectedprotocol))
		{
			System.out.println("Url is Secured::"+expectedprotocol+"    "+actualprotocol);
		}
		else
		{
			System.out.println("Url is Not Secured::"+expectedprotocol+"        "+actualprotocol);
		}
		driver.close();
	}

}
