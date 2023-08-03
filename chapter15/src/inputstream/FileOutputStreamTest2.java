package inputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {

		
		try(FileOutputStream fos = new FileOutputStream("output1.txt",false)) {
			
			byte[] alphabet = new byte[26];
//			char letter = 'A';
			byte data = 65;
			
			for (int i = 0; i < alphabet.length; i++) {
				
				alphabet[i] = data;
				data++;
			}
			
//			fos.write(alphabet);
			
			fos.write(alphabet,2,10);
			// 배열의 3번째 위치부터 10개만 넣고 싶다면
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");

	}

}
