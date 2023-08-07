package test;

import javax.security.auth.Subject;

import school.Student;
import school2.School2;
import school2.Score2;
import school2.Student2;
import school2.Subject2;
import school2.report2.GenerateGradReport2;
import utils.Define;

public class TestMain2 {

	School2 goodSchool = School2.getInstance();
	Subject2 korean;
	Subject2 math;
	Subject2 bDance;
	
	GenerateGradReport2 gradeReport = new GenerateGradReport2();
	
	public static void main(String[] args) {
		
		TestMain2 test = new TestMain2();

		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
		
	}

	private void createStudent() {
		Student2 st1 = new Student2(181213, "안성원", korean);
		Student2 st2 = new Student2(181518, "오태훈", math);
		Student2 st3 = new Student2(171230, "이동호", korean);
		Student2 st4 = new Student2(171255, "조성욱", korean);
		Student2 st5 = new Student2(171590, "최태평", math);

		goodSchool.addStudent(st1);
		goodSchool.addStudent(st2);
		goodSchool.addStudent(st3);
		goodSchool.addStudent(st4);
		goodSchool.addStudent(st5);
		
		korean.register(st1);
		korean.register(st2);
		korean.register(st3);
		korean.register(st4);
		korean.register(st5);
		
		math.register(st1);
		math.register(st2);
		math.register(st3);
		math.register(st4);
		math.register(st5);
		
		bDance.register(st1);
		bDance.register(st2);
		bDance.register(st3);
		
		addScoreForStudent(st1, korean, 56);
		addScoreForStudent(st1, math, 95);
		addScoreForStudent(st1, bDance, 65);
		addScoreForStudent(st2, korean, 98);
		addScoreForStudent(st2, math, 95);
		addScoreForStudent(st2, bDance, 75);
		addScoreForStudent(st3, korean, 88);
		addScoreForStudent(st3, math, 100);
		addScoreForStudent(st3, bDance, 85);
		addScoreForStudent(st4, korean, 95);
		addScoreForStudent(st4, math, 89);
		addScoreForStudent(st5, korean, 56);
		addScoreForStudent(st5, math, 83);
		
	}

	private void addScoreForStudent(Student2 stu, Subject2 subj, int point) {
		Score2 score = new Score2(stu.getStudentId(), subj, point);
		stu.addSubjectScore(score);
		
	}

	private void createSubject() {
		
		korean = new Subject2("국어", Define.SUBJECT_ID_KOREAN);
		math = new Subject2("수학", Define.SUBJECT_ID_MATH);
		bDance = new Subject2("방송 댄스", Define.SUBJECT_ID_BDANCE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(bDance);
		
	}

}
