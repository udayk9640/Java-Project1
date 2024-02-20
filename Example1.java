import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;



public class Example1 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Uday Kiran\\Documents\\ppshot1.JPG");
		FileReader f2 = new FileReader(f1);
		BufferedReader f3 = new BufferedReader(f2);
		String a =" ";
	FileInputStream f3 = new FileInputStream(f1);
	FileOutputStream f4 = new FileOutputStream("C:\\Users\\Uday Kiran\\Documents\\ppshot1-Copy.JPG");
		while((a = f3.readLine())!= null) {
			char ch [] = a.toCharArray();
			for(char i: ch) {
			System.out.println(i+"-");
			}
		}

	}
}
