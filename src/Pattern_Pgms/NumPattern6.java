package Pattern_Pgms;

public class NumPattern6 {
 	public static void main(String[] args) {
		
		/*  
		 *         1 
		 *       2 1 
		 *     3 2 1   
		 */

		int row = 3;
		int col = 1;
		int space=2;
		

		for (int i = 1; i <= row; i++) {
    
			 int count=3;
			
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
				count--;
			}
			
			for (int k = 1; k <= col; k++) {
				
				System.out.print(count);
				count--;
			}

			
			System.out.println();
			space--;
			col++;
			
			

		}

	}

}
