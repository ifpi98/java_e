package object;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		Integer i1 = 100;
		Integer i2 = 100;
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		
		
	}

}
