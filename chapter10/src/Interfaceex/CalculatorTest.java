package Interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 5;
		int[] num3 = {1,2,3,4,5};
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		System.out.println(Calc.total(num3));
		System.out.println(calc.square(num1));
		
	}

}
