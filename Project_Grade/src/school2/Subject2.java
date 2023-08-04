package school2;

import java.util.ArrayList;

import utils.Define;

public class Subject2 {
	
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	private ArrayList<Student2> studentList = new ArrayList<Student2>();

	public Subject2(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	
	public void register(Student2 _st) {
		studentList.add(_st);
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student2> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student2> studentList) {
		this.studentList = studentList;
	}
	
	
}
