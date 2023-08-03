package inputstream;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

//		FileInputStream fis = null;
		FileReader fis = null;
		
		try {
//			fis = new FileInputStream("input.txt");
			fis = new FileReader("input.txt");
			
			int i;
			
			// 파일의 끝이 나오면 -1로 나오기 때문에 해당 위치까지 반복 실행			
			// 한글을 읽지 못함. 1byte문자를 읽을 수 있다.
			while((i = fis.read()) != -1) {
				System.out.print((char)i);	
			}
						
					
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
			System.out.println("end");
		}
		
	}

}
