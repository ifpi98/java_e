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
		
		Subject math = new Subject(Define.SUBJECT_ID_MATH, Define.SUBJECT_NAME_MATH);
		Subject korean = new Subject(Define.SUBJECT_ID_KOREAN, Define.SUBJECT_NAME_KOREAN);
		Subject science = new Subject(Define.SUBJECT_ID_SCIENCE, Define.SUBJECT_NAME_SCIENCE);
		Subject bDance = new Subject(Define.SUBJECT_ID_BDANCE, Define.SUBJECT_NAME_BDANCE, Define.PF_TYPE);

		school.subjectList.add(korean);
		school.subjectList.add(math);
		school.subjectList.add(science);
		school.subjectList.add(bDance);
				
		Student sAhn = new Student(181213, "안성원", korean);
		Student sOh = new Student(181518, "오태훈", math);
		Student sLee = new Student(171230, "이동호", korean);
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
		Score scAhnS = new Score(sAhn.studentId, science, 90);
		Score scAhnB = new Score(sAhn.studentId, bDance, 90);
		sAhn.scoreList.add(scAhnM);
		sAhn.scoreList.add(scAhnK);
		sAhn.scoreList.add(scAhnS);
		sAhn.scoreList.add(scAhnB);
						
		Score scOhM = new Score(sOh.studentId, math, 95);
		Score scOhK = new Score(sOh.studentId, korean, 98);
		Score scOhS = new Score(sOh.studentId, science, 80);
		Score scOhB = new Score(sOh.studentId, bDance, 80);
		sOh.scoreList.add(scOhM);
		sOh.scoreList.add(scOhK);
		sOh.scoreList.add(scOhS);
		sOh.scoreList.add(scOhB);
		
		Score scLeeM = new Score(sLee.studentId, math, 100);
		Score scLeeK = new Score(sLee.studentId, korean, 88);
		Score scLeeS = new Score(sLee.studentId, science, 70);
		Score scLeeB = new Score(sLee.studentId, bDance, 70);
		sLee.scoreList.add(scLeeM);
		sLee.scoreList.add(scLeeK);
		sLee.scoreList.add(scLeeS);
		sLee.scoreList.add(scLeeB);
		
		Score scJoM = new Score(sJo.studentId, math, 89);
		Score scJoK = new Score(sJo.studentId, korean, 95);
		Score scJoS = new Score(sJo.studentId, science, 60);
		Score scJoB = new Score(sJo.studentId, bDance, 60);
		sJo.scoreList.add(scJoK);
		sJo.scoreList.add(scJoM);
		sJo.scoreList.add(scJoS);
		sJo.scoreList.add(scJoB);
		
		Score scChoiM = new Score(sChoi.studentId, math, 83);
		Score scChoiK = new Score(sChoi.studentId, korean, 56);
		Score scChoiS = new Score(sChoi.studentId, science, 50);
		Score scChoiB = new Score(sChoi.studentId, bDance, 50);
		sChoi.scoreList.add(scChoiK);
		sChoi.scoreList.add(scChoiM);
		sChoi.scoreList.add(scChoiS);
		sChoi.scoreList.add(scChoiB);
		
		GenerateGradeReport.generateGradeReport();

		
	}

}
