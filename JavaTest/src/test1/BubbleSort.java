package test1;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] _intArray) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] _intArray) {
		System.out.println("BubbleSort descending");

	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}

}
