package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
		
		int subtract = subtractNum(num1, num2);
		System.out.println(subtract);
		
		int multi = multiplyNum(num1, num2);
		System.out.println(multi);
		
		double divide = divisionNum(num1, num2);
		System.out.println(divide);
		
	}
	
	private static double divisionNum(int num1, int num2) {
		// TODO Auto-generated method stub
		return (double)num1 / num2;
	}

	private static int multiplyNum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	private static int subtractNum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	static int addNum(int _num1, int _num2) {
		return _num1 + _num2;
	}

}
