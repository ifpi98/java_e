package inheritance;

public class GoldCustomer extends Customer {

	private double saleRatio;
	
	public GoldCustomer() {
		// TODO Auto-generated constructor stub
	}
	
	public GoldCustomer(int _id, String _name) {
		// TODO Auto-generated constructor stub	
		super(_id, _name);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}
		
	
	@Override
	public int calcPrice(int _price) {
		
		bonusPoint += Math.floor(_price * bonusRatio);
		return (int)(_price * (1 - saleRatio));
	
	}

}
