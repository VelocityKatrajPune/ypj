package Pattern_Pgms;

public class pattern11 {
	public static void main(String[] args) {
		
		/*     
		 *   * * *  
		 *     * *  	   
		 *       *
		 *     * *
		 *   * * *
		 */
		
		

		int row = 5 ;
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
			if(i<=2){
				  star--;
				  space++;
				}
			else {
				star++;
				space--;
			}
		}

	}

}
