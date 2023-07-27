package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
//		studentJ.serialNum++;
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		System.out.println(Student.getSerialNum());
		
	}

}
