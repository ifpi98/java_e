package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("전소민");
		treeSet.add("하하");
		treeSet.add("송지효");
				
		for(String str : treeSet) {
			System.out.println(str);
		}
		System.out.println();
		
		treeSet.add("유재석");
		treeSet.add("전소민");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		System.out.println();
		
		
	}

}
