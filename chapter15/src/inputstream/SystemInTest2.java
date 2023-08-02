package inputstream;

import java.util.Scanner;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

        Scanner scanner = new Scanner(System.in);

        System.out.print("알파벳 문자열을 입력하세요: ");
        
        String input = "";
		
		try {
			input = scanner.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i=0; i < input.length(); i++) {
			System.out.println((char)input.charAt(i));
		
		}


	}

}
