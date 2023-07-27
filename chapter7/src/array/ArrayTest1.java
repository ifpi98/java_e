package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		for (int i=0; i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		double total = 1.0;
		for(int i=0; i < size; i++) {
			total *= num[i];
		}
		
		System.out.println(total);
	}

}
