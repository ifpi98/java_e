package decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6711562255407257275L;
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("Lee", "Manager");
		try (FileOutputStream fos = new FileOutputStream("serial.out"); ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try (FileInputStream fis = new FileInputStream("serial.out"); ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Object obj = ois.readObject();
			
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
