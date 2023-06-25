package Logical_Pgms;

public class Imp_Reverse_Number_without_String_Function {
	public static void main(String[] args) {
		
		int num=12345;    //54321
		int revNum=0;   // 5
			// 12>0
		while (num>0) 
		{
			int rem=num%10;  // 123%10 = 3
			revNum= revNum*10 + rem;   // 54*10 + rem= 54321
			num=num/10;   //12345/10 = 1234/10=123/10=12
		}
		System.out.println(revNum);	
		
	}

}
