package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 1000;
		System.out.println(iNum);
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);

		float fNum = 0.9f;
		int num1 = (int)dNum + (int)fNum; 		// 3
		int num2 = (int)(dNum+fNum);		// 4
		
		System.out.println(num1);
		System.out.println(num2);
		
		
	}

}
