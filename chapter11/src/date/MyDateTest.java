package date;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof MyDate) {
			MyDate mD1 = (MyDate)obj;
			if(this.day == mD1.day && this.month == mD1.month && this.year == mD1.year) {
				return true;
			} 	
		}
		
		return false;
				
	}

	@Override
	public int hashCode() {
		int sum = 0;
		sum += year * 10000;
		sum += month * 100;
		sum += day;
		
		return sum;
	}
	
	
}

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate date1 = new MyDate(18, 9, 2004);
		MyDate date2 = new MyDate(18, 9, 2004);
		
		System.out.println(date1.equals(date2));
	
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
		
	}

}
