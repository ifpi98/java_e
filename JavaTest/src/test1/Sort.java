package test1;

public interface Sort {

	public void ascending(int[] _intArray);
	public void descending(int[] _intArray);
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
	
}
