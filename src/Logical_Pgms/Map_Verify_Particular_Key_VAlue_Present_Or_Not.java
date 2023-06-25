package Logical_Pgms;

import java.util.HashMap;

public class Map_Verify_Particular_Key_VAlue_Present_Or_Not {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc1", 1);
		map.put("abc2", 2);
		map.put("abc3", 3);
		map.put("abc4", 4);
		
		System.out.println("Size of map: "+map.size());

		System.out.println(map.containsKey("abc1"));  // true
		System.out.println(map.containsKey("abc"));   //false
		System.out.println(map.containsValue(4));   // true

	}
}
