package inheritance;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cus1 = new VIPCustomer(10000, "김비프", 12345);
		Customer cus2 = new GoldCustomer(10001, "이골드");
		Customer cus3 = new GoldCustomer(10002, "박금");
		Customer cus4 = new Customer(10003, "최실버");
		Customer cus5 = new Customer(10004, "안은");
		
		ArrayList<Customer> cList = new ArrayList<Customer>();
		cList.add(cus1);
		cList.add(cus2);
		cList.add(cus3);
		cList.add(cus4);
		cList.add(cus5);
		
//		for (int i = 0; i < cList.size(); i++) {
//			System.out.println(cList.get(i).showCustomerInfo()); 
//		}
		
		for (Customer cus : cList) {
			System.out.println(cus.showCustomerInfo());
		}
		
		
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).customerName + "님이 지불할 금액은 "+ cList.get(i).calcPrice(10000)+"원입니다.");
			System.out.println(cList.get(i).showCustomerInfo());
		}
		
//		Customer cus1 = new Customer(10010, "강호동");
////		cus1.setCustomerID(10010);
////		cus1.setCustomerName("강호동");
//		cus1.bonusPoint = 1000;
//		System.out.println(cus1.showCustomerInfo());
//		
//		System.out.println(cus1.calcPrice(5000)+"원입니다.");
//		System.out.println(cus1.showCustomerInfo());
//		
//		Customer cus2 = new VIPCustomer(10020,"김종국",12354);
////		cus2.setCustomerID(10020);
////		cus2.setCustomerName("김종국");
//		cus2.bonusPoint = 10000;
//		System.out.println(cus2.showCustomerInfo());
//		System.out.println(cus2.customerName + "님이 지불할 금액은 " + cus2.calcPrice(5000)+"원입니다.");
//		System.out.println(cus2.showCustomerInfo());
//		
//		Customer cus3 = new GoldCustomer(10020,"박창인");
//		cus3.bonusPoint = 5000;
//		System.out.println(cus3.showCustomerInfo());
//		System.out.println(cus3.customerName + "님이 지불할 금액은 " + cus3.calcPrice(5000)+"원입니다.");
//		System.out.println(cus3.showCustomerInfo());
		
		
		
		
		
		
		
	}

}
