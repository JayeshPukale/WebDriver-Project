package april4practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommandss {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(4000);
		//print title of the page and length of title
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print Url of the page and length of Url
		String strUrl=driver.getCurrentUrl();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		driver.close();
	}

}
