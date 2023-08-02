package collection;

public class Member implements Comparable<Member> {

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	// 멤버id가 같으면 같은 데이터라고 하자(hashset에서 중복 데이터를 막기 위해서)
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.memberId;
	}

	// 멤버id가 같으면 같은 데이터라고 하자(hashset에서 중복 데이터를 막기 위해서)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if (this.memberId == member.memberId)	return true;
			else return false;
		}
				
		return false;
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
//		return Integer.compare(this.memberId, member.memberId);
		return (this.memberId - member.memberId) * (-1);
	}
	
	
	
	
	
	
}
