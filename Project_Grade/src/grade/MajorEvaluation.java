package grade;

import school.Subject;

public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String GradeEval(int _point) {
//		System.out.println("전공과목 점수평가");
		
		if(_point >= 95) {
			return "S";
		} else if (_point >= 90) {
			return "A";
		} else if (_point >= 80) {
			return "B";
		} else if (_point >= 70) {
			return "C";
		} else if (_point >= 60) {
			return "D";
		} else {
			return "F";
		}
		
	}

}
