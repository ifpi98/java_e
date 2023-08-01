package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// object클래스의 getClass() 메서드 이용
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		// 클래스 파일 이름을 Class변수에 직접 대입하기
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// class.forName("클래스 이름") 메서드 사용하기
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		
	}

}
