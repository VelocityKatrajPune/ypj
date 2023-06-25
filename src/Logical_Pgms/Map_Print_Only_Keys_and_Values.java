package Logical_Pgms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_Print_Only_Keys_and_Values {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc1", 1);
		map.put("abc2", 2);
		map.put("abc3", 3);
		map.put("abc4", 4);

		System.out.println("------Printing All Keys--------");
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("------printing all values---------");
		
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
	}
}