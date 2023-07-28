package inheritance;

public class VIPCustomer extends Customer{
	
	private double saleRatio;
	private int agentID;

	public VIPCustomer(int _id, String _name, int agentID) {
		// TODO Auto-generated constructor stub	
		super(_id, _name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer()생성자 호출");
		
	}

	
	
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}


	@Override
	public int calcPrice(int _price) {
		
		bonusPoint += Math.floor(_price * bonusRatio);
		return (int)(_price * (1 - saleRatio));
	
	}

	public String showCustomerInfo() {
		String a = super.showCustomerInfo() + " 담당 상담원의 번호는 " + agentID + "입니다."; 
		return a;
	}
	


}
