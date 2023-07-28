package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		InitCustomer();
	}

	public Customer(int _customerID, String _customerName) {
		this.customerName = _customerName;
		this.customerID = _customerID;
		InitCustomer();
	}
	
	public void InitCustomer() {
		this.customerGrade ="SILVER";
		this.bonusRatio = 0.01;
	}
		
	public int calcPrice(int _price) {	
		bonusPoint += Math.floor(_price * bonusRatio);
		return _price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 " + customerGrade + "이며 보너스 포인트는 "+bonusPoint+"입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
