package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> slist = new ArrayList<String>();
		slist.add("Tomas");
		slist.add("Edward");
		slist.add("Jack");
		
		Stream<String> stream = slist.stream();
		stream.forEach(s->System.out.print(s+" "));
		System.out.println();

		// 스트림은 재사용이 불가능
		// 새롭게 스트림을 만들고, sorted()를 통해 정렬
		slist.stream().sorted().forEach(s->System.out.print(s + " "));

		
		
		
	}

}
