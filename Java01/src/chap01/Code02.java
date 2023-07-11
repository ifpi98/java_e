package chap01;

public class Code02 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer();
		sb2.append("World");
		StringBuffer sb3 = new StringBuffer(20);
		sb3.append("Java Programming is created by James Gosling");
		System.out.println(sb1);		// 처음부터 Hello가 추가됨 (16 + 5) = 21
		System.out.println(sb2);		// 16인 상태에서 World가 추가됨 (추가된 내용이 16을 넘지 않으면 16을 유지함)
		System.out.println(sb3);		// 처음에는 20인데, 44가 들어왔으니 44가 되었음.
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
	}
	
}
