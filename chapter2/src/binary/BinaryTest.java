package binary;

public class BinaryTest {
    public static void main(String[] args) {

        int num = 10;

        // 이진수
        int bNum2 = 0B1010;
        // 8진수
        int eightNum = 012;
        // 16진수
        int sixteenNum = 0XA;

        String bNum1 = Integer.toString(num,2);
        System.out.println(bNum1);
        System.out.println(bNum2);
        System.out.println(eightNum);
        System.out.println(sixteenNum);
        System.out.println(0B10000101);


    }
}
