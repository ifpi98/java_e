package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeSet mTreeSet = new MemberTreeSet();
		
		Member m1 = new Member(1001, "송지효");
		Member m2 = new Member(1002, "하하");
		Member m3 = new Member(1003, "김종국");
		
		mTreeSet.addMember(m1);
		mTreeSet.addMember(m2);
		mTreeSet.addMember(m3);
		
		mTreeSet.showAllMember();

		Member m4 = new Member(1003, "유재석");
		mTreeSet.addMember(m4);
		mTreeSet.removeMember(1003);
		m4 = new Member(1004, "유재석");
		mTreeSet.addMember(m4);
		mTreeSet.showAllMember();
		
	}

}
