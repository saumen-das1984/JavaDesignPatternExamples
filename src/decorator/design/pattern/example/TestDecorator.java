package decorator.design.pattern.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestDecorator {
	public static void main(String[] args) {
		int c;
		InputStream in = null;
		try {
			try {
				in = new LowerCaseInputStream(new FileInputStream("D:\\inventory.txt"));
			} catch (FileNotFoundException fio) {
				System.out.println("ERROR : Please specify corrrect path to file inventory.txt");
			}
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
