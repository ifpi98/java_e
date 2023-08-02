package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B";
		
		StringConCatImpl sCCI = new StringConCatImpl();
		sCCI.makeString(s1, s2);

		StringConcat makeString2 = (s3, s4)->System.out.println(s3 + ", " + s4);
		makeString2.makeString(s1, s2);
		
		
	}

}
