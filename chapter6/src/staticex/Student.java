package staticex;

public class Student {

	int studentID;
	String studentName;
	private static int serialNum = 10000;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
	
	
	
}
