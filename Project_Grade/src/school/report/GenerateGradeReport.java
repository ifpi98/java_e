package school.report;

import grade.BasicEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Student;
import school.Subject;

public class GenerateGradeReport {

	public static void generateGradeReport() {

		School school = School.getInstance();
		BasicEvaluation bEval = new BasicEvaluation();
		MajorEvaluation mEval = new MajorEvaluation();
		
		for (Subject s : school.subjectList) {
			System.out.println("-------------------------------");
			System.out.println(s.subjectName + "수강생 학점");
			System.out.println("이름 | 학번 | 중점과목 | 점수");
			System.out.println("-------------------------------");
			
			for (Student st : school.studentList) {
				System.out.print(st.studentName);
				System.out.print(" | ");
				System.out.print(st.studentId);
				System.out.print(" | ");
				System.out.print(st.major.subjectName);
				System.out.print(" | ");

				int tempPoint = 0;
				for (int i=0; i < st.scoreList.size(); i++) {
					if (st.scoreList.get(i).subject.subjectName == s.subjectName) {
						tempPoint = st.scoreList.get(i).point;
						System.out.print(tempPoint);
					}	
				}
				
				System.out.print("|");
				
				if (st.major == s) {
					System.out.print(mEval.GradeEval(tempPoint));
				} else {
					System.out.print(bEval.GradeEval(tempPoint));
				}
				
				System.out.print("|");
				System.out.println();
				
			}
						
		}

	}
}
