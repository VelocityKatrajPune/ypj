package Logical_Pgms;

public class sample11 {

	
	public static void main(String[] args) {
		
		String str1="  abc  xyz lmn abc1 xyz abc2 abc3";
		
		String[] ar = str1.split(" ");
		
		System.out.println(ar.length-1);
		
		
		int count=0;
		for (int i = 0; i <=str1.length()-1; i++) {
			char s1 = str1.charAt(i);
			if(s1==' ') {
				count++;
			}
		}
			
		
		System.out.println(count);
		
	}
}
