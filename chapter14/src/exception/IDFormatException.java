package exception;

public class IDFormatException extends Exception {
	
	// 멤버 변수와 메서드는 이미 제공하고 있으므로 super(message)를 사용하여 예외 메시지를 설정한다.
	// 나중에 getMessage()메서드를 호출하면 메시지 내용을 볼 수 있다.
	
	public IDFormatException (String message) {
		super(message);
	}
	
	
}
