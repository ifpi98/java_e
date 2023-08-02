package exception;

public class PWFormatTest {

	private String userPW;
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws PasswordException {
		if(userPW == null) {
			throw new PasswordException("패스워드는 null 일 수 없습니다.");
		} else if (userPW.length() < 5) {
			throw new PasswordException("패스워드는 5자 이상으로 쓰세요");
		} else if (userPW.matches("[a-zA-Z]+")) {
			throw new PasswordException("패스워드가 문자열로만 구성되어 있습니다.");
		}

		this.userPW = userPW;
		System.out.println("오류 없음");
	}
	
	public static void main(String[] args) {

		PWFormatTest pwTest = new PWFormatTest();
		String userPW = null;
		try {
			pwTest.setUserPW(userPW);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		String userPW2 = "alsk";
		try {
			pwTest.setUserPW(userPW2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		String userPW3 = "alskassd";
		try {
			pwTest.setUserPW(userPW3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		String userPW4 = "alskas12";
		try {
			pwTest.setUserPW(userPW4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}

}
