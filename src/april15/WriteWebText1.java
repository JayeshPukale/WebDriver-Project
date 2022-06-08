package april15;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteWebText1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		File f = new File("D://primus1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		String para1 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		String para2 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.close();
		
		

	}

}
