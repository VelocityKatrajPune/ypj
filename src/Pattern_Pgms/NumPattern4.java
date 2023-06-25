package Pattern_Pgms;

public class NumPattern4 {
	public static void main(String[] args) {
		
		/*  
		 *     1 
		 *     2 2 
		 *     3 3 3   
		 */

		int row = 3;
		int col = 1;
		

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= col; j++) {
				System.out.print(i);
			}

			
			System.out.println();
			col++;
			

		}

	}

}
