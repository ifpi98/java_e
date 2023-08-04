package school2;

import java.util.ArrayList;

public class School2 {

	private static School2 instance = new School2();
	private static String SCHOOL_NAME = "Good School";
	private ArrayList<Student2> studentList = new ArrayList<Student2>();
	private ArrayList<Subject2> subjectList = new ArrayList<Subject2>();
	
	private School2() {}

	public ArrayList<Student2> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student2> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject2> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject2> subjectList) {
		this.subjectList = subjectList;
	}

	public static School2 getInstance() {
		return instance;
	}

	public static String getSCHOOL_NAME() {
		return SCHOOL_NAME;
	}
	
	public void addStudent(Student2 _student) {
		studentList.add(_student);
	}
	
	public void addSubject(Subject2 _subject) {
		subjectList.add(_subject);
	}
	
	
}
