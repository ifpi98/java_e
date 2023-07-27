package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus _bus) {
		if(this.money < _bus.fee) {
			System.out.println(this.studentName + "님, 잔액이 부족합니다.");
		} else {
			this.money = this.money - _bus.fee;
			_bus.take();
			System.out.println(this.studentName + "님이 버스를 탑니다.");
		}
		
	}
	
	public void takeSubway(Subway _subway) {
		if(this.money < _subway.fee) {
			System.out.println(this.studentName + "님, 잔액이 부족합니다.");
		} else {
			this.money = this.money - _subway.fee;
			_subway.take();
			System.out.println(this.studentName + "님이 지하철을 탑니다.");
		}
		
	}
	
	public void takeTaxi(Taxi _taxi) {
		if(this.money < _taxi.fee) {
			System.out.println(this.studentName + "님, 잔액이 부족합니다.");
		} else {
			this.money = this.money - _taxi.fee;
			_taxi.take();
			System.out.println(this.studentName + "님이 택시를 탑니다.");
		}
		
	}
	
	public void showInfo() {
		System.out.println(this.studentName + "님, 잔액은 " + this.money + "원입니다.");
	}



}
