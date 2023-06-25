package Pattern_Pgms;

public class NumPattern5 {
	public static void main(String[] args) {
		
		/*  
		 *         1 
		 *       2 2 
		 *     3 3 3   
		 */

		int row = 3;
		int col = 1;
		int space=2;
		

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= col; k++) {
				System.out.print(i);
			}

			
			System.out.println();
			space--;
			col++;
			
			

		}

	}

}
