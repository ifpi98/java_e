package grade;

import school.Subject;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String GradeEval(int _point) {
//		System.out.println("비전공과목 점수평가");
		
		if(_point >= 90) {
			return "A";
		} else if (_point >= 80) {
			return "B";
		} else if (_point >= 70) {
			return "C";
		} else if (_point >= 55) {
			return "D";
		} else {
			return "F";
		}
		
	}

}
