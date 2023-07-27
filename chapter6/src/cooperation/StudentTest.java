package cooperation;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b3217 = new Bus(3217);
//		Bus b2 = new Bus(2);
		Subway s8 = new Subway(8);
//		Subway s2 = new Subway(2);
		Taxi t1 = new Taxi("잘간다 운수");
		
		Student st1 = new Student("James", 5000);
		st1.takeBus(b3217);
		st1.showInfo();
		b3217.showInfo();

		Student st2 = new Student("Thomas", 5000);
		st2.takeSubway(s8);
		st2.showInfo();
		s8.showInfo();
				
		Student st3 = new Student("Edward", 30000);
		st3.takeTaxi(t1);
		st3.showInfo();
		t1.showInfo();

//		Student st4 = new Student("최수진", 100);
//		st4.takeSubway(s2);
			

//		b2.showInfo();
//		s2.showInfo();

//		st4.showInfo();
		
	}

}


