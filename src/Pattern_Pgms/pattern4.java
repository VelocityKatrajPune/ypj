package Pattern_Pgms;

public class pattern4 {
	public static void main(String[] args) {
		
		/*  
		 *     * * *
		 *       * *
		 *         *    
		 */

		int row = 3;
		int star = 3;
		int space = 0;

		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= space; j++) {
                System.out.print(" ");
		      }

			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}

			
			System.out.println();
			star--;
			space++;

		}

	}

}
