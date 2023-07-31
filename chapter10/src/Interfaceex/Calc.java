package Interfaceex;

public interface Calc {
	
	// 인터페이스에 선언한 변수는 모두 컴파일 과정에서 값이 변하지 않는 상수로 자동 변환된다.
	// public static Final예약어를 쓰지 않아도 무조건 상수를 인식한다.
	
	double PI = 3.14;
	int ERROR = -999999999;

	// 인터페이스에선 public abstract를 적지 않아도 된다.
	
	int add(int num1, int num2); 
	int substract(int num1, int num2);
	int times(int num1, int num2); 
	int divide(int num1, int num2);
	int square(int num);
		
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}

	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	static int total(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		myStaticMethod();
		return sum;
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다."); 
		
	}
	
}
