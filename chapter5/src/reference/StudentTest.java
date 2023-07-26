package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentJames = new Student(100, "James");
		studentJames.setKorea("국어", 100);
		studentJames.setMath("수학", 90);
		
		studentJames.showStudentInfo();

		Student studentThomas = new Student(101, "Thomas");
		studentThomas.setKorea("국어", 95);
		studentThomas.setMath("수학", 92);
		
		studentThomas.showStudentInfo();
		
	}

}
