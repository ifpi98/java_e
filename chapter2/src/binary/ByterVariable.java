package binary;


public class ByterVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte -128 ~ 127
		
		byte bdata = -128;		
		System.out.println(bdata);
		
		byte bdata1 = 127;
		System.out.println(bdata1);
		
		int num = 1234567890;
		int num3 = 1234567890;
		
		// 자바는 모든 정수값을 int로 처리하기 때문에
		// 숫자를 long으로 처리하라고 컴파일러에게 알려줘야 한다.
		// 식별자 L을 붙이면 데이터를 8byte로 저장하라는 것을 알려준다.
		
		long num2 = 12345678901L;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println((long) num + num3);
		
		short sVal = 10;
		byte bVal = 20;
		
		System.out.println(sVal + bVal);
		// int로 계산하고, int로 저장함
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char) ch2);
		
		int ch3 = -67;
		System.out.println((char) ch3);
		
		char ch4 = 68;
		System.out.println(ch4);
		
	}

}
