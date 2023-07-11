package chap02;

import java.io.FileInputStream;
import java.io.IOException;

public class Code02 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data1.txt");
			//	한글자씩 출력하고 싶을 때
			//	System.out.println( (char)fis.read() );
			//	System.out.println( (char)fis.read() );
			int x;
			while ( (x= fis.read()) != -1)
				System.out.print( (char)x );
			
		} catch (IOException e){
			System.out.println(e);
		}

		// 예외에 관계없이 아래의 내용은 무조건 처리할 것
		finally {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				}
		}
//		System.out.println("main end");
		
	}
}
