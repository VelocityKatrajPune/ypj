package Logical_Pgms;

public class Array_Find_Duplicate_Element_In_Array {
public static void main(String[] args) {
	String[] arr = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java", "JSP", "Servlets" };
System.out.println("Duplicate elements in array");
	for (int i = 0; i <= arr.length-1; i++) {
		for (int j = i+1; j <= arr.length-1; j++)
		{
			if(arr[i].equals(arr[j])) {
				System.out.println(arr[i]);
			}
					
		}
	}
	
	
	
	
	
	
}
}
