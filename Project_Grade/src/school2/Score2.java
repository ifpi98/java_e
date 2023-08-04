package school2;

public class Score2 {
	
	private int studentId;
	private Subject2 subject;
	private int point;
	
	public Score2(int studentId, Subject2 subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject2 getSubject() {
		return subject;
	}

	public void setSubject(Subject2 subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Score2 [학번=" + studentId + ", 과목=" + subject + ", 점수=" + point + "]";
	}
	
	

}
