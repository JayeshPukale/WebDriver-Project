package april15;
import java.io.*;
import java.io.File;
import java.io.FileWriter;

public class WriteText {

	public static void main(String[] args)throws Throwable {
		//Create new file
		File f = new File("D://sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am learning selenium");
		bw.newLine();
		bw.write("I am learning Manual");
		bw.newLine();
		bw.write("I am learning Testing tools");
		bw.flush();
		bw.close();
		

	}

}
