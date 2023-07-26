package hiding;


class BirthDay {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		if (month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}				
		} else {
			this.day = day;	
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay day = new BirthDay();
//		day.month = 2;
		day.setMonth(2);
//		day.year = 2022;
		day.setYear(2022);
//		day.day = 30;
		day.setDay(30);
		
		
	}

}
