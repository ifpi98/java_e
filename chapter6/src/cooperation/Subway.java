package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	int fee;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		passengerCount = 0;
		money = 0;
		fee = 1350;
	}

	public void showInfo() {
		System.out.println("지하철 " + this.lineNumber + "호선의 승객은 " + this.passengerCount + "명이고, 수입은 " + this.money + "입니다.");
	}
	
	public void take() {
		this.money = this.money + this.fee; 
		this.passengerCount++;
	}
	
	
	
}
