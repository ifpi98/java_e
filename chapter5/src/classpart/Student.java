package classpart;

public class Student {
	
	// 멤버 변수
	int studentID;	//학번
	String studentName;	//학생 이름
	int grade;	// 학년
	String address;	// 사는 곳

	// 클래스 내부에서 멤버 변수를 사용하여 클래스 기능을 구현하는 것을 '멤버 함수' 또는 '메서드'라고 한다.
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	

	
}
