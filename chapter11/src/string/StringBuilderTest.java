package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		
		System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));
		System.out.println(buffer);
		System.out.println(buffer.toString());
		System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer.toString()));
	}
	

}
