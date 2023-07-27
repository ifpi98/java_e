package array;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alphabets = new char[26];
		char ch = 'A';
		
//		System.out.println(ch + "," + (int)ch);
		
		for (var i=0; i<26;i++) {
			
			int number = i + 65;
			alphabets[i] = (char)number;
			System.out.println(alphabets[i] + "," + number);
			
		}
		
		
		
	}

}
