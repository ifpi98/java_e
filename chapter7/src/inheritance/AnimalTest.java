package inheritance;

class Animal{

	String className;
	
	public Animal() {
		this.className = this.getClass().getSimpleName();
	}
	
	public void move() {
		System.out.println(className + "이 움직입니다.");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println(className + "이 걷습니다.");
	}
	
	public void readBook() {
		System.out.println(className + "이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println(className + "이 달립니다.");
	}
	
	public void hunting() {
		System.out.println(className + "사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println(className + "이 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println(className + "하늘을 날아 갑니다.");
	}
	
}


public class AnimalTest {
	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
				
		Animal ani = new Animal();
		test.moveAnimal(ani);
		
		Human human = new Human();
		test.moveAnimal(human);
		
		Tiger tiger = new Tiger();
		test.moveAnimal(tiger);
		
		Eagle eagle = new Eagle();
		test.moveAnimal(eagle);
		
		
	}
	
	public void moveAnimal(Animal _animal) {
		
		if(_animal instanceof Human) {
			Human human = (Human) _animal;		// 명시적 형변환, 하위클래스의 형(Human)으로 변환함
			human.readBook();
		} else if (_animal instanceof Tiger) {
			Tiger tiger = (Tiger) _animal;		// 명시적 형변환, 하위클래스의 형(Human)으로 변환함
			tiger.hunting();
		} else if (_animal instanceof Eagle) {
			Eagle eagle = (Eagle) _animal;		// 명시적 형변환, 하위클래스의 형(Human)으로 변환함
			eagle.flying();
		} else {
			_animal.move();
		}
		
	}

}
