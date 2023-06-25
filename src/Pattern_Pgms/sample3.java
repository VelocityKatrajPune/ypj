package Pattern_Pgms;

public class sample3 {
	
	
	public static void main(String[] args) {
		
		int ar[][]= {{10,20},{30, 40}};
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[1][0]=30;
		ar[1][1]=40;
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
