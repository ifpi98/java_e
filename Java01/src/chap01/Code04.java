package chap01;

public class Code04 {
	public static void main(String[] args) {
	
		// 절대값이므로 3.5
		System.out.println("1. " + Math.abs(-3.5));

		// -3.5 이상인 가장 작은 정수 -3
		System.out.println("2. " + Math.ceil(-3.5));
		
		// -3.5 이하인 가장 큰 정수 -4
		System.out.println("3. " + Math.floor(-3.5));
		
		// 큰 수 6.7
		System.out.println("4. " + Math.max(2.7, 6.7));
		
		// 작은 수 -5.5
		System.out.println("5. " + Math.min(-3.5, -5.5));
		
		// 2의 10승 1024
		System.out.println("6. " + Math.pow(2,10));
		
		// 3.7을 반올림 4
		System.out.println("7. " + Math.round(3.7));
		
		// 3.1을 반올림 3
		System.out.println("8. " + Math.round(3.1));
		
		// 25의 제곱근 5
		System.out.println("9. " + Math.sqrt(25));
		
		
	}
}
