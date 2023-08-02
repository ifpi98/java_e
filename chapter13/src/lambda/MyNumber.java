package lambda;

public interface MyNumber {
	
	// 추상메서드 선언
	// 메서드는 하나만 선언하는 게 좋다. 두개를 선언하면 사용하는 쪽에서 헷갈릴 수 있다.
	
	int getMax(int num1, int num2);

	// int add();
}
