package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TravelCustomerTest {

	public static void main(String[] args) {
		TravelCustomer tc1 = new TravelCustomer("이순신", 40, 100);
		TravelCustomer tc2 = new TravelCustomer("김유신", 30, 100);
		TravelCustomer tc3 = new TravelCustomer("홍길동", 13, 50);
		
		ArrayList<TravelCustomer> tcList = new ArrayList<TravelCustomer>();
		tcList.add(tc1);
		tcList.add(tc2);
		tcList.add(tc3);
		
		System.out.println(" == 고객 명단 추가된 순서대로 출력 == ");
		
		tcList.stream().map(c->c.getName()).forEach(s->System.out.println(s));

		tcList.stream().map(c->c.toString()).forEach(s->System.out.println(s));
//		for (int i = 0; i < tcList.size(); i++) {
//			System.out.println(tcList.get(i).toString());
//		}
			
		int total = tcList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 비용: "+total);
		
//		int sum = 0;
//
//		for (int i = 0; i < tcList.size(); i++) {
//			sum += tcList.get(i).getPrice();
//		}
//		
//		System.out.println("총 비용: "+sum);
		
		System.out.println(" == 20세 이상 고객 명단 정렬하여 출력 == ");
				
		tcList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
//		
//		ArrayList<String> tcList2 = new ArrayList<String>();
//		
//		for (int i = 0; i < tcList.size(); i++) {
//			if (tcList.get(i).getAge() >= 20) {
//				tcList2.add(tcList.get(i).getName());
//			}
//		}
	}

}
