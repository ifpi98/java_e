package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 멤버id를 기준으로 삭제
	public boolean removeMember(int memberId) {

		Iterator<Member> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		
		//		for (int i = 0 ; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if (tempId == memberId) {
//				arrayList.remove(i);
//				System.out.println(member.getMemberName() + " 정보를 삭제하였습니다.");
//				return true;
//			}
//		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void insertMember(int _number, Member _member) {

		arrayList.add(_number-1, _member);
		System.out.println(_member.getMemberName() + " 회원님의 정보를 " + (_number) + "번째에 삽입하였습니다." );
		
	}
	
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
//		System.out.println(arrayList);
	}
	
}
