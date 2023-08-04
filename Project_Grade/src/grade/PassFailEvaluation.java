package grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String GradeEval(int _point) {
//		System.out.println("비전공과목 점수평가");
		
		if(_point >= 70) {
			return "PASS";
		}  else {
			return "FAIL";
		}
		
	}

}
