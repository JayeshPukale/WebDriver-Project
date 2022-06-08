package april4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		//print title of the page and length of title
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url of the page and length of url
		String strUrl=driver.getCurrentUrl();
		System.out.println();
		System.out.println();
		driver.quit();
		
		
	}

}
