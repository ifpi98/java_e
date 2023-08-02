package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashSet mHashSet = new MemberHashSet();
		
		Member m1 = new Member(1001, "송지효");
		Member m2 = new Member(1002, "하하");
		Member m3 = new Member(1003, "김종국");
		
		mHashSet.addMember(m1);
		mHashSet.addMember(m2);
		mHashSet.addMember(m3);
		
		mHashSet.showAllMember();

		// ID가 중복된 데이터를 넣지 못하게 하려면 equal과 hashcode 부분을 재정의해야함.
		Member m4 = new Member(1003, "유재석");
		mHashSet.addMember(m4);
		mHashSet.removeMember(1003);
		m4 = new Member(1004, "유재석");
		mHashSet.addMember(m4);
		mHashSet.showAllMember();
		
	}

}
