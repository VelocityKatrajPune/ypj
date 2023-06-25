package Logical_Pgms;

public class String_Swap_Even_odd_Index_Char {

	public static void main(String[] args) {
		
		String inp="abcdefgh";  //---> badcgehg
		String oup="";
		for (int i = 0; i < inp.length()-1; i=i+2) {
			oup=oup+inp.charAt(i+1)+inp.charAt(i);
		}
		System.out.println(oup);	
		
	}
	

}
