package Pattern_Pgms;

import java.util.Arrays;

public class sample1 {

	public static void main(String[] args) {		
		int ar1[]=new int [5];
		ar1[0]=10;
		ar1[1]=25;
		ar1[2]=30;
		ar1[3]=20;
		ar1[4]=15;
		
		System.out.println("------beFore sorting------");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		Arrays.sort(ar1);
		
		System.out.println("------after sorting------");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		 System.out.println("------descending order------");
		 for (int i = ar1.length-1; i >=0; i--) {
		 System.out.println(ar1[i]);
		 }
		
		
		 
		
		
		
		
		
		
		
		
	}

}
