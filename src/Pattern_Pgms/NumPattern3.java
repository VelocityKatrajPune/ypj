package Pattern_Pgms;

public class NumPattern3 {
	public static void main(String[] args) {
		
		/*  
		 *     1 2 3
		 *     4 5 6
		 *     7 8 9    
		 */

		int row = 3;
		int col = 3;
		
		int count=1;

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= col; j++) {
				System.out.print(count);
				count++;
			}

			System.out.println();

		}

	}

}
