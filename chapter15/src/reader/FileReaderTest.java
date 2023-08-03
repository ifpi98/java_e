package reader;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("reader.txt")){
			
			int str;
			
			while((str=fr.read()) != -1 ) {
				System.out.print((char)str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
