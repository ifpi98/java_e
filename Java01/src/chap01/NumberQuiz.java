package chap01;

import java.util.Random;
import java.util.Scanner;

public class NumberQuiz {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rand1 = new Random();
		
		int quizNumber = rand1.nextInt(100);
		int tryCount = 0;
		boolean status = true;
		
		System.out.println("컴퓨터가 1부터 100사이의 하나의 정수를 선택했습니다.");
		System.out.println("***** 컴퓨터가 선택한 수를 맞춰 보세요. *****");
		System.out.println("-------------------------------------");
		
		while(status) {
			System.out.print("1부터 100사이의 값을 입력하세요 : ");
			int typingNumber = scanner.nextInt();
			tryCount++;
			
			if(typingNumber>quizNumber) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (typingNumber<quizNumber) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (typingNumber == quizNumber) {
				System.out.println("컴퓨터가 선택한 수를 맞췄습니다.");
				System.out.println("시도 횟수는 " + tryCount + "회입니다.");
				status = false;
			} else {
				System.out.println("논리적인 오류가 발생했습니다.");
			}
		}
		
		
	}

}
