package school;

import java.util.ArrayList;

public class Subject {

	public int subjectId;
	public	String subjectName;
	public int gradeType;
	public ArrayList<Student> studentList;

	public Subject(int subjectId, String subjectName, int gradeType) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = gradeType;
		studentList = new ArrayList<>();
	}
	
	
	
}
