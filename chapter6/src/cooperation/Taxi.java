package cooperation;

public class Taxi {
	
	String taxiName;
	int passengerCount;
	int money;
	int fee;
	
	public Taxi(String _taxiName) {
		this.taxiName = _taxiName;
		this.passengerCount = 0;
		this.money = 0;	
		this.fee = 10000;
	}
	
	public void showInfo() {
		System.out.println(this.taxiName + " 택시 수입은 " + this.money + "입니다.");
	}
	
	public void take() {
		this.money = this.money + this.fee; 
		this.passengerCount++;
	}
	

}
