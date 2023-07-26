package binary;

public class DoubleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dNum = 3.14;
		System.out.println(dNum);
		
		// 자바의 기본은 double, float을 쓰고 싶다면 식별자 f를 넣어야 함
		float fNum = 3.14f;
		System.out.println(fNum);
		
		
		boolean isMarried = true;
		System.out.println(isMarried);
		
		//자료형 추론
		
		var num = 10;
		System.out.println(num);
		
		num = 11;
		// int는 넣을 수 있음
		// double은 넣을 수 없어 에러가 남
//		num = 3.14;
		
		// 상수
		final int MAX_MUM = 100;
		final float PI = 3.14f;
		System.out.println(MAX_MUM);
		// 상수로 선언된 변수는 값을 변경하려 시도하면 오류가 생긴다.
//		MAX_MUM = 99;
		
		
	}

}
