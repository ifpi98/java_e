package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {

	public int subjectId;
	public	String subjectName;
	public int gradeType;
	public ArrayList<Student> studentList;

	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE;
		studentList = new ArrayList<>();
	}
	
	public Subject(int subjectId, String subjectName, int _gradeType) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = _gradeType;
		studentList = new ArrayList<>();
	}
	
	public void changeToGradeType (Subject _subject) {
		if(_subject.gradeType == Define.AB_TYPE) {
			_subject.gradeType = Define.SAB_TYPE;	
		} else {
			_subject.gradeType = Define.AB_TYPE;
		}
		
	}
	
}
