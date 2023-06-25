package Logical_Pgms;

public class Imp_Factorial_Of_Number {
	public static void main(String[] args) {

		int num = 5;
		int fact = 1; // 5 20 60 120

		// 5432
		for (int i = num; i >= 1; i--) {

			fact = fact * i;
		}
		System.out.println(fact);

	}
}
