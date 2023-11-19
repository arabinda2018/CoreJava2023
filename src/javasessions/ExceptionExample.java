package javasessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//null pointer exception
//number format exception.
//input missmathc exception.

public class ExceptionExample {
	public FileInputStream testMethod1() {
		File file = new File("C:\\Users\\arabi\\OneDrive\\Desktop\\This and Super Keyword..txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fileInputStream;
	}
	
	
	

	public static void main(String[] args) {
		ExceptionExample instance1 = new ExceptionExample();
		
		//instance1.testMethod1();
	}
}
