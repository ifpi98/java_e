package chap02;

import java.io.IOException;

public class Code01 {
	public static void main(String[] args) {
		
//		System.out.print("Enter one character : ");
//		int x;
//		try {
//			// 입력한 줄(Line)을 읽어들여라.
//			x = System.in.read();
//			// 입력한 값을 숫자로 출력
//			System.out.println("You entered " + x);
//			// 입력한 값을 문자로 출력 
//			System.out.println("You entered " + ((char)x));
//		} catch (IOException e) {
//			// 빨간 메시지(오류나 예외 메세지)말고 일반 메시지의 형태로 해당 메시지를 출력해줘.
//			e.printStackTrace();
//		}
		
		int x;
		try {
			// 읽어들인 문자가 없다. (-1)의 의미
			while( (x = System.in.read()) != -1) {
				System.out.println( (char)x );
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		
	}
}

// 97 소문자 a, 65 대문자 A