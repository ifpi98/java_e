package school;

import java.util.ArrayList;

public class Student {

	public int studentId;
	public	String studentName;
	public	Subject major;
	public	ArrayList<Score> scoreList;
	
	public Student(int studentId, String studentName, Subject major) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
		scoreList = new ArrayList<>();
	}

}
