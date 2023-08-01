package test1;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] _intArray) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] _intArray) {
		System.out.println("HeapSort descending");

	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}

}
