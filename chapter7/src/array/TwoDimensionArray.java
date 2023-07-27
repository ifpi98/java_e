package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				{1,2,3},
				{4,5,6}
			};

		System.out.println("행의 수: " + arr.length);
		
		for (var i=0; i < arr.length; i++) {
			System.out.println(i + "행의 열의 수" + arr[i].length);
			
			for (var j=0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			

		}
		
	}

}
