package test;

import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;
import school.School;
import school.Score;
import school.Student;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School school = School.getInstance();
		
		Subject math = new Subject(Define.SUBJECT_ID_MATH, Define.SUBJECT_NAME_MATH, 1);
		Subject korean = new Subject(Define.SUBJECT_ID_KOREAN, Define.SUBJECT_NAME_KOREAN, 1);

		school.subjectList.add(korean);
		school.subjectList.add(math);
				
		Student sAhn = new Student(181213, "안성원", korean);
		Student sOh = new Student(181518, "오태훈", math);
		Student sLee = new Student(121230, "이동호", korean);
		Student sJo = new Student(171255, "조성욱", korean);
		Student sChoi = new Student(171590, "최태평", math);
	
		school.studentList.add(sAhn);
		school.studentList.add(sOh);
		school.studentList.add(sLee);
		school.studentList.add(sJo);
		school.studentList.add(sChoi);

		math.studentList = school.studentList;
		korean.studentList = school.studentList;
						
		Score scAhnM = new Score(sAhn.studentId, math, 95);
		Score scAhnK = new Score(sAhn.studentId, korean, 56);
		sAhn.scoreList.add(scAhnK);
		sAhn.scoreList.add(scAhnM);
		
		Score scOhM = new Score(sOh.studentId, math, 95);
		Score scOhK = new Score(sOh.studentId, korean, 98);
		sOh.scoreList.add(scOhK);
		sOh.scoreList.add(scOhM);
		
		Score scLeeM = new Score(sLee.studentId, math, 100);
		Score scLeeK = new Score(sLee.studentId, korean, 88);
		sLee.scoreList.add(scLeeK);
		sLee.scoreList.add(scLeeM);
		
		Score scJoM = new Score(sJo.studentId, math, 89);
		Score scJoK = new Score(sJo.studentId, korean, 95);
		sJo.scoreList.add(scJoK);
		sJo.scoreList.add(scJoM);
		
		Score scChoiM = new Score(sChoi.studentId, math, 83);
		Score scChoiK = new Score(sChoi.studentId, korean, 56);
		sChoi.scoreList.add(scChoiK);
		sChoi.scoreList.add(scChoiM);
		
		GenerateGradeReport.generateGradeReport();

		
	}

}
