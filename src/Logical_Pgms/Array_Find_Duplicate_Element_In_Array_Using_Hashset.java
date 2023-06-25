package Logical_Pgms;
import java.util.HashSet;
public class Array_Find_Duplicate_Element_In_Array_Using_Hashset {
	public static void main(String[] args) {

		String[] arr = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java" };
		HashSet<String> set = new HashSet<String>();
		System.out.println("Duplicate Elements In array");
		for (String str : arr) {
			if (!set.add(str)) {
				System.out.println(str);
			}
		}

	}

}
