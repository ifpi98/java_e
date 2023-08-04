package school2;

import java.util.ArrayList;

//import school2.Score2;

public class Student2 {

	private int studentId;
	private Subject2 majorSubject;
	private String studentName;
	
	private ArrayList<Score2> scoreList = new ArrayList<Score2>();

	public Student2(int studentId, String studentName, Subject2 majorSubject) {
		this.studentId = studentId;
		this.majorSubject = majorSubject;
		this.studentName = studentName;
	}
	
	public void addSubjectScore(Score2 score) {
		scoreList.add(score);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject2 getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject2 majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ArrayList<Score2> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score2> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
