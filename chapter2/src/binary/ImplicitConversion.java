package binary;

//import org.w3c.dom.ls.LSOutput;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bNum = 10;
		System.out.println(bNum);
		int num = bNum;
		System.out.println(num);
		
		int iNum2 = 20;
		System.out.println(iNum2);
		float fNum = iNum2;
		System.out.println(fNum);
		
		// 연산 중에 자동 변환되는 경우
		double dNum;
		dNum = fNum + iNum2;
		System.out.println(dNum);
	

	}

}
