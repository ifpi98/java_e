package chap01;

public class MemberService {
	
	// 로그인하기
	public boolean login(String _id, String _password) {
		String id = _id;
		String password = _password;
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	// 로그 아웃하기
	public void logout(String _id) {
		String id = _id;
				
		System.out.println("로그아웃 되었습니다.");
	}
	
}
