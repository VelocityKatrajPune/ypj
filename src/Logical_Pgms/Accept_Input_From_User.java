package Logical_Pgms;

import java.util.Scanner;

public class Accept_Input_From_User {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter student name: ");
		String name = scan.next(); // to get String data
		System.out.println("student name: "+name);
		
		System.out.println("enter student roll no");
		int rollNo = scan.nextInt(); // to get int data
		System.out.println("student roll no: "+ rollNo);
//		boolean grade = scan.hasNext(); // to get boolean data

	}

}
