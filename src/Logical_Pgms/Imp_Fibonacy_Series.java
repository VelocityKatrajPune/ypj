package Logical_Pgms;

public class Imp_Fibonacy_Series {
	public static void main(String[] args) {

		int n = 10;
		int temp1 = 0;
		int temp2 = 1;
		System.out.print("Fist " + n + " Elements: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(temp1 + " +");
			int sum = temp1 + temp2;
			temp1 = temp2;
			temp2 = sum;

		}

	}
}
