package thisex;

class Order {
	long orderNumber;
	String orderId;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String orderAddress;
	
	public Order(long orderNumber, String orderId, String orderDate, String orderName, String orderProductNumber,
			String orderAddress) {
		this.orderNumber = orderNumber;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.orderProductNumber = orderProductNumber;
		this.orderAddress = orderAddress;
	}
	
	public void showOrder() {
		System.out.println("주문 번호: " + this.orderNumber);
		System.out.println("주문자 아이디: " + this.orderId);
		System.out.println("주문 날짜: " + this.orderDate);
		System.out.println("주문자 이름: " + this.orderName);
		System.out.println("주문 상품 번호: " + this.orderProductNumber);
		System.out.println("배송 주소: " + this.orderAddress);
		
		
	}
		
	
}

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order o1 = new Order(202303120001L, "abc123", "2023년 3월 12일", "홍길순", "PD0345-12",
				"경기도 성남시 중원구 1232번지");
		o1.showOrder();
		
	}

}
