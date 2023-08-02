package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// 넣을 때는 put 메서드 사용, 키는 멤버ID, value는 member
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		//containsKey()라는 메서드를 사용, 아이디가 있으면 true
		if(hashMap.containsKey(memberId)) {
			System.out.println(memberId + " 삭제");
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		// hashMap.keyset() -> 모든 key값이 Set객체로 반환됨
		// 해당 Set객체에 .iterator()메서드를 호출
		// 키값을 가져와서 그에 해당하는 값을 가져와서 출력하도록 한다.
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
