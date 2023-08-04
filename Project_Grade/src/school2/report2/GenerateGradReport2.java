package school2.report2;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school2.School2;
import school2.Score2;
import school2.Student2;
import school2.Subject2;
import utils.Define;

public class GenerateGradReport2 {

	School2 school = School2.getInstance();
		
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 | 학번 | 중점과목 | 점수 \n";
	public static final String LINE = "--------------------------\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		// 모든 과목에 대한 학점 산출
		
		ArrayList<Subject2> subjectList = school.getSubjectList();
		for (Subject2 subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		return buffer.toString();
	}

	private void makeFooter(Subject2 subject) {
		buffer.append("\n");
		
		
	}

	private void makeBody(Subject2 subject) {
		ArrayList<Student2> studentList = subject.getStudentList();
		for (int i = 0; i < studentList.size(); i++) {
			Student2 student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName()+"\t");
			buffer.append(" | ");
			getScoreGrade(student, subject.getSubjectId());
			buffer.append("\n");
			buffer.append(LINE);
		}
		
	}

	private void getScoreGrade(Student2 student, int subjectId) {
		ArrayList<Score2> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};
		for(int i = 0; i < scoreList.size(); i++) {
			String grade;
			Score2 score = scoreList.get(i);
			if(score.getSubject().getSubjectId() == majorId) {
				grade = gradeEvaluations[Define.SAB_TYPE].GradeEval(score.getPoint());
			} else {
				grade = gradeEvaluations[Define.AB_TYPE].GradeEval(score.getPoint());
			}
			buffer.append(score.getPoint());
			buffer.append("|");
			buffer.append(grade);
			buffer.append("|");
		}
	}

	private void makeHeader(Subject2 subject) {
		buffer.append(GenerateGradReport2.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradReport2.TITLE);
		buffer.append(GenerateGradReport2.HEADER);
		buffer.append(GenerateGradReport2.LINE);
		
	}
	
	
	
	
	
	
	
	
}
