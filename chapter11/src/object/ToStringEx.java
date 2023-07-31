package object;

class Book {
	int bookNumber;
	String bookTitle;

	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
	

	
	
}



public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(200, "개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		// 이때 호출되는 toString()은 book클래스의 메서드가 아닌 Object메서드이다.
		
		String str = new String("test");
		System.out.println(str);
		
		// String과 integer 클래스의 toString()메서드
		
//		Integer il = new Integer(100);
		Integer il = 100;
		System.out.println(il);
		
		System.out.println(System.identityHashCode(str));
		
	}

}
