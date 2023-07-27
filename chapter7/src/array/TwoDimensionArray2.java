package array;

public class TwoDimensionArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] charArray = new char[13][2];
				
		for(int i = 0; i < charArray.length;i++){
			
			for (int j = 0; j < charArray[i].length; j++) {
				charArray[i][j] = (char)((int)'a' + (i*2) + j);
				System.out.print(charArray[i][j] + " ");
			}
			System.out.println(" ");
		}
		

		char[][] arr = new char[2][13];
	    char input = 'a';
	    
	    for(int j=0;j<arr.length;j++) { 
	    	for(int i=0;i<arr[j].length;i++) {
	            arr[j][i] = input++;
	            System.out.print(arr[j][i]+" ");
	    	}
	    	System.out.println();
	    }
		
	    char[][] charArray2 = new char[13][2];
	    char ch = 'a';
		
		for(int i = 0; i < charArray2.length;i++){
			for (int j = 0; j < charArray2[i].length; j++) {
				charArray2[i][j] = ch;
				System.out.print(charArray[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
		
		
	}

}
