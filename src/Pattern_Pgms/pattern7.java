package Pattern_Pgms;

public class pattern7 {
	public static void main(String[] args) {
		
		/*  
		 *   
		 *   
		 *   * * * * * 
		 *   * *   * *
		 *   *       *   
		 */

		int row = 3;
		int star = 3;
		int space = -1;

		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			
			for (int j = 1; j <= space; j++) {
                System.out.print(" ");
		      }

			if(i==1) {
				star--;
			}
			
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			
			if(i==1) {
				star++;
			}

			
			System.out.println();
			star--;
			space= space+2;

		}

	}

}
