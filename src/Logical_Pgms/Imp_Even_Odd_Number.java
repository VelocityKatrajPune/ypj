package Logical_Pgms;

import java.util.Scanner;

public class Imp_Even_Odd_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter no: ");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}
		
		
		
	}

}
