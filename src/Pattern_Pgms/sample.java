package Pattern_Pgms;

import java.util.Arrays;

public class sample {

	public static void main(String[] args) {

		String ar[] = new String[5];
		ar[0] = "sanjay";
		ar[1] = "shubham";
		ar[2] = "vikas";
		ar[3] = "ganesh";
		ar[4] = "santosh";

		System.out.println("-----before sorting--------");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		System.out.println("-----------after sorting--------");

		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

	}

}
