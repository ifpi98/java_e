package thisex;

class Birthday {
	int day;
	int month;
	int year;

	public void setYear(int year) {
		// 여기에서의 this는 멤버변수에 있는 year를 말한다.
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);		
	}

}

public class ThisExample {
	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		System.out.println(b1);
		b1.printThis();
		
	}
}
