package reference;

public class Student {

	int studentID;
	String StudentName;
	
	
	// Subject형을 사용하여 국어과목과 수학과목을 추가하여 선언한다.
	// 이것이 참조자료형이다.
	
	Subject korea;
	Subject math;
	
	// 생성자 추가하기
	public Student() {
		korea = new Subject();
		math = new Subject();
	}

	
	public Student(int id, String name) {
		studentID = id;
		StudentName = name;
		korea = new Subject();
		math = new Subject();
	}

	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}

	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(StudentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
	
	
}
