package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 새로운 회원 인스턴스 생성
		
		Member memberLee = new Member (1001, "이지원");
		Member memberSon = new Member (1002, "손민국");
		Member memberPark = new Member (1003, "박서연");
		Member memberHong = new Member (1004, "홍길동");
		
		// 리스트에 회원 추가
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberHong.getMemberId());

		// 홍길동을 3번째 자리에 인서트되도록 하는 메서드를 만들어보자.
		memberArrayList.insertMember(3, memberHong);
		memberArrayList.showAllMember();
		

		
		
	}

}
