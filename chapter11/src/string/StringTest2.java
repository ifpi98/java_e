package string;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(System.identityHashCode(androidStr));
		
		System.out.println(System.identityHashCode(javaStr.concat(androidStr)));
		System.out.println(System.identityHashCode(javaStr + androidStr));
	}

}
