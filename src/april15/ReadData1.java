package april15;
import java.io.*;
import java.io.FileReader;

public class ReadData1 {

	public static void main(String[] args)throws Throwable {
		FileReader fr=new FileReader("D://sample.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null)
		{
			Thread.sleep(1000);
			System.out.println(str);
		}
		br.close();
	}
}
