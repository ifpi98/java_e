package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	int fee;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		this.passengerCount = 0;
		this.money = 0;	
		this.fee = 1250;
	}
	
	public void showInfo() {
		System.out.println("버스 " + this.busNumber + "번의 승객은 " + this.passengerCount + "명이고, 수입은 " + this.money + "입니다.");
	}
	
	public void take() {
		this.money = this.money + this.fee; 
		this.passengerCount++;
	}
	

}
