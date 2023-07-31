package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("세이노의 가르침");
		shelfQueue.enQueue("문과 남자의 과학 공부");
		shelfQueue.enQueue("비욘드 더 스토리");
		System.out.println(shelfQueue.getSize());		
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
	}

}
