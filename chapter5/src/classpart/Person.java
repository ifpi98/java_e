package classpart;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int childrenCount;
		
	public Person(int age, String name, boolean isMarried, int childrenCount) {
		super();
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.childrenCount = childrenCount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildrenCount() {
		return childrenCount;
	}
	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}
}
