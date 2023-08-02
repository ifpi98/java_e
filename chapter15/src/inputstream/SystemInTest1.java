package inputstream;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		int i = 0;
		
		try {
			i = System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println((char)i);
	}

}
