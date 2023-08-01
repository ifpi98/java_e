package test2;

public class Cat implements Soundable {

	String animalSound = "야옹";
		
	@Override
	public String sound() {
		return animalSound;
	}

}
