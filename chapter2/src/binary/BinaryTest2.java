package binary;

public class BinaryTest2 {
    public static void main(String[] args) {
        // 2진수 5
        int num1 = 0B00000000000000000000000000000101;
        int num2 = 0B11111111111111111111111111111010;
        int num3 = 0B11111111111111111111111111111010 + 1;
        int sum = num1 + num3;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(sum);
    }
}
