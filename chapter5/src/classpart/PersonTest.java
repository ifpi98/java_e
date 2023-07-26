package classpart;

public class PersonTest {
	public static void main(String[] args) {

		Person personJames = new Person(40, "James", true, 3);
		System.out.println(personJames.getAge());
		System.out.println(personJames.getName());
		System.out.println(personJames.isMarried());
		System.out.println(personJames.getChildrenCount());
				
		
	}

}
