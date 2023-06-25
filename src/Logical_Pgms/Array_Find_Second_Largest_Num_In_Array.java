package Logical_Pgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Array_Find_Second_Largest_Num_In_Array {
	public static void main(String[] args) {

		int ar[] = { 10, 20, 30, 40, 60, 40, 50, 60, 80, 100 };

		TreeSet tr = new TreeSet();

		for (int num : ar) {
			tr.add(num);
		}

		ArrayList al = new ArrayList(tr);

		System.out.println("2nd highest num: " + al.get(al.size() - 2));

		System.out.println("2nd lowest num: " + al.get(1));

	}
}