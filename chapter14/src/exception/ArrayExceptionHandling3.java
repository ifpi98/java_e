package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ArrayExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileInputStream fis = new FileInputStream("a.txt")) {
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

	
	
}
