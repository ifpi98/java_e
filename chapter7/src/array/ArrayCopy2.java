package array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("1권", "유시민");
		bookArray1[1] = new Book("2권", "유삼민");
		bookArray1[2] = new Book("3권", "유사민");

		
		// 깊은 복사를 위해서 객체 생성을 미리해두고
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// 얕은 복사, 주소값을 복사한다.
		// 1번 배열의 값이 변경되면, 2번 배열의 값도 변경된다.
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		
		// 깊은 복사를 위해 값을 직접 넣어준다.
		for (int i = 0; i<bookArray1.length;i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
				
		System.out.println("=======bookArray2=======");
	
		// 1번 배열의 값이 바뀌었지만, 2번 배열의 값은 그대로 있다.
		bookArray1[0].setBookName("4권");
		bookArray1[0].setAuthor("유오민");
		
		
		for (int i = 0 ; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			bookArray2[i].showBookInfo();
//			System.out.println(bookArray1);
//			System.out.println(bookArray2);
		}
		
		
	}

}
