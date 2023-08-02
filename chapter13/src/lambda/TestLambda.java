package lambda;

public class TestLambda {

	interface PrintString{
		void showString(String str);
	}
	
	public static void main(String[] args) {
		
		PrintString ps1 = s -> System.out.println(s);
		ps1.showString("hello lambda_1");
		
		// 매개변수로 전달하는 람다식
		showMyString(ps1);
		
		// 반환값으로 쓰이는 람다식
		PrintString reStr = returnPrint();
		reStr.showString("hello");
		
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}

}
