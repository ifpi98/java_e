package school;

import java.util.ArrayList;

public class School {

	public ArrayList<Student> studentList = new ArrayList<>();
	public ArrayList<Subject> subjectList = new ArrayList<>();
	
	// 2단계 - 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static School instance = new School();
	
	// 1단계 - 생성자를 private로 만들기
	private School() {}

	// 3단계 - 외부에서 참조할 수 있는 public 메소드 만들기
	// 객체를 생성하지 않고 그냥 사용하기 위해서 이 메서드를 static으로 선언
	public static School getInstance() {
		return instance;
	}
}
