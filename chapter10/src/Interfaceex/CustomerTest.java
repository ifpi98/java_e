package Interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		
		if (seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer.order();	
		}
		
		
		
		
	}

}
