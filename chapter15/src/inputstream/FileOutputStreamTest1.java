package inputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// 생성자 매개변수로 전달한 파일이 경로에 없으면 파일을 생성해준다. (FileOutputStream)
		// 파일 이름뒤에 true값을 추가하면 계속 연결해서 쓴다. (기본값은 false)
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)) {
		
			// 파일에 숫자를 쓰면 문자로 변환해준다.
			fos.write(65); 		// A
			fos.write(66);		// B
			fos.write(67);		// C
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
