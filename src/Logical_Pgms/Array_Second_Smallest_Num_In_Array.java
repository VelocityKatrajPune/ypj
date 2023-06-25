package Logical_Pgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Array_Second_Smallest_Num_In_Array {
	public static void main(String[] args) {
		
		int ar[] = { 10, 20, 30, 40, 40, 50, 60 };
		TreeSet tr = new TreeSet();

		for (int str : ar) {
			tr.add(str);
		}
		
		ArrayList al = new ArrayList(tr);
		System.out.println(al);
		System.out.println(al.get(1));

	}
}
