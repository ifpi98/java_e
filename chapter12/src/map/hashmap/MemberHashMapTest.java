package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashMap mHM = new MemberHashMap();
		Member m1 = new Member(1001, "유재석1");
		Member m2 = new Member(1002, "유재석2");
		Member m3 = new Member(1003, "유재석3");
		Member m4 = new Member(1004, "유재석4");
		
		mHM.addMember(m1);
		mHM.addMember(m2);
		mHM.addMember(m3);
		mHM.addMember(m4);
		
		mHM.showAllMember();
		
		mHM.removeMember(1002);
		mHM.showAllMember();
		
	}

}
