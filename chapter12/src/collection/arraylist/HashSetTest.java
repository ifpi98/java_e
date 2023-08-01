package collection.arraylist;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("송지효1");
		hashSet.add("송지효2");
		hashSet.add("송지효3");
		hashSet.add("송지효4");
		hashSet.add("송지효5");
		
		System.out.println(hashSet);
		
		boolean b1 = hashSet.add("송지효5");
		System.out.println(b1);
		System.out.println(hashSet);
		
		boolean b2 = hashSet.add("송지효6");
		System.out.println(b2);
		System.out.println(hashSet);
	}

}
