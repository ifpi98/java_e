package object;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.studentName = name;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (studentID == std.studentID) {
				return true;
			} else {
				return false;
			}
				
		}
		
		return false;
		
	}

	@Override
	public int hashCode() {
		return studentID;
	}

	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentSang);

		if(studentLee == studentLee2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		if(studentLee == studentSang) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		System.out.println(studentLee.toString());
		System.out.println(studentSang.toString());
					
		String[] str1 = {"Hello","Again"};
		String[] str2 = {"Hello","Again"};
		
		if (str1 != null && str1[0].equals(str2[0])) {
		    // 값이 같으므로 이 부분이 실행됩니다.
		    System.out.println("두 문자열은 같습니다.");
		} else {
		    System.out.println("두 문자열은 다릅니다.");
		}
		
		
		System.out.println(studentLee.hashCode());
		System.out.println(studentLee2.hashCode());
		System.out.println(studentSang.hashCode());
		
		System.err.println(System.identityHashCode(studentLee));
		System.err.println(System.identityHashCode(studentSang));
		
		
	}
}
