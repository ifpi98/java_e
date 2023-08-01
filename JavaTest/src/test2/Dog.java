package test2;

public class Dog implements Soundable {

	String animalSound = "멍멍";
	
	@Override
	public String sound() {
		return animalSound;
	}

}
