package arraylist;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> sList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		sList = new ArrayList<Subject>();
	}
	
	public void addSubject(String _subjectName, int _score) {
		sList.add(new Subject(_subjectName, _score));
	}
	
	public int sumScore() {
		
		int sum = 0;
		
		for (int i = 0; i < sList.size(); i++) {
			sum += sList.get(i).score;
		}
		
		return sum;
	}
	
	public void showInfo() {
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println("학생 "+studentName+"님의 "+sList.get(i).subjectName+" 과목의 성적은 "+sList.get(i).score+"점 입니다.");	
		}
		System.out.println("학생 "+studentName+"님의 총점은 "+sumScore()+"점 입니다.");
		
	}
}
