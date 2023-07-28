package arraylist;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sLee = new Student(1001, "Lee");
		Student sKim = new Student(1002, "Kim");
		
		sLee.addSubject("국어", 100);
		sLee.addSubject("수학", 90);

		sKim.addSubject("국어", 100);
		sKim.addSubject("수학", 90);
		sKim.addSubject("영어", 80);
				
		sLee.showInfo();
		sKim.showInfo(); 
		
	}

}
