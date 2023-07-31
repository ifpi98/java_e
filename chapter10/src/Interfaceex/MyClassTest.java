package Interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		mClass.x();
		mClass.y();
		mClass.myMethod();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
	}

}
