package array;

import java.util.ArrayList;

public class StudentArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		
		students[0] = new Student(1001, "James");
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");

//		for(int i=0; i<students.length;i++) {
//			System.out.println(students[i]);
//			
//		}

		for(int i=0; i<students.length;i++) {
			students[i].showStudentInfo();
			
		}
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "James"));
		list.add(new Student(1002, "Tomas"));
		list.add(new Student(1003, "Edward"));

		System.out.println("ArrayList 방식으로 출력 - 향상된 for문 이용");
		for (Student s : list) {
			s.showStudentInfo();
		}
		
		System.out.println("ArrayList 방식으로 출력 - 일반 for문 이용");
		for (int i = 0; i<list.size();i++) {
			list.get(i).showStudentInfo();
		}
		
		
	}

}
