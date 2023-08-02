package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int sumVal  = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		System.out.println();
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		System.out.println();
		// 스트림을 별도의 변수로 저장해도 재사용 불가
		// 필요하면 다시 스트림을 생성해서 사용해야 한다.
		
		int count =(int) Arrays.stream(arr).count();
		System.out.println(count);
		System.out.println();
		

	}

}
